package br.gsfarma.usuario;

import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

import org.springframework.util.DigestUtils;

import br.gsfarma.endereco.Endereco;
import br.gsfarma.endereco.EnderecoRN;
import br.gsfarma.permissao.Permissao;
import br.gsfarma.util.DAOFactory;
import br.gsfarma.util.EmailUtil;
import br.gsfarma.util.MensagemUtil;
import br.gsfarma.util.RNException;
import br.gsfarma.util.UtilException;


public class UsuarioRN {
	
	private UsuarioDAO usuarioDAO;
	
	private Usuario usuario;
	
	public UsuarioRN(){
		
		this.usuarioDAO = DAOFactory.criarUsuarioDAO();
	}
	
	public Usuario carregar(Integer codigo){
		
		return this.usuarioDAO.carregar(codigo);
				
	}
	
	public Usuario buscarPorLogin(String login){
		
		return this.usuarioDAO.buscarPorLogin(login);
		
	}
	
	public String salvar(Usuario usuario, Endereco endereco, String confirmaSenha, String confirmaEmail){
	
		this.usuario = usuario;
		atribuiPermissao();
		boolean senhaValida = verificaSenha(confirmaSenha);
		
		if(senhaValida == false){
			
			return null;
		}
		
		boolean emailValido = verificaEmail(confirmaEmail);
		
		if(emailValido == false){
			
			return null;
			
		}
		
		criptografarSenha();
		this.usuarioDAO.salvar(this.usuario);
		salvarEndereco(endereco);
		
		try{
			enviarEmailPosCadastramento(this.usuario, confirmaSenha);
		}catch(RNException e){
			FacesContext context = FacesContext.getCurrentInstance();
			FacesMessage facesMessage = new FacesMessage("Não foi possivel enviar o e-mail de cadastro do usuario. Erro: "
					+ e.getMessage());
			context.addMessage(null, facesMessage);
		}
		
		
		return "index";
	}
	
	public void atribuiPermissao(){
		
		Permissao permissaoUsuario = new Permissao();
		permissaoUsuario.setTipoPermissao("ROLE_USUARIO");
		
		this.usuario.getPermissoes().add(permissaoUsuario);
		
	}
	
	public boolean verificaSenha(String senha){
		
		FacesContext context = FacesContext.getCurrentInstance();
		
		if (this.usuario.getSenha() != null && this.usuario.getSenha().trim().length() > 0  && !this.usuario.getSenha().equals(senha)) {
			FacesMessage facesMessage = new FacesMessage("A senha não foi confirmada corretamente");
			context.addMessage(null, facesMessage);
			return false;
		}
		
		return true;
		
	}
	
	public boolean verificaEmail(String email){
		
		FacesContext context = FacesContext.getCurrentInstance();
		
		if (this.usuario.getEmail() != null && this.usuario.getEmail().trim().length() > 0  && !this.usuario.getEmail().equals(email)) {
			FacesMessage facesMessage = new FacesMessage("O email não foi confirmado corretamente");
			context.addMessage(null, facesMessage);
			return false;
		}
		
		return true;
		
	}
	
	public void criptografarSenha(){
		
		String senhaCripto = DigestUtils.md5DigestAsHex(this.usuario.getSenha().getBytes());
		this.usuario.setSenha(senhaCripto);
		
	}
	
	public void salvarEndereco(Endereco endereco){
		
		EnderecoRN enderecoRN = new EnderecoRN();
		enderecoRN.salvar(endereco);
		
	}
	
	public void excluir(Usuario usuario){
				
		this.usuarioDAO.excluir(usuario);
		
	}

	
	public List<Usuario> listar(){
		
		return this.usuarioDAO.listar();
		
	}
	
	
	public void enviarEmailPosCadastramento(Usuario usuario, String senha) throws RNException {
		
		String titulo = MensagemUtil.getMensagem("email_titulo_cadastro_usuario");
		String mensagem = MensagemUtil.getMensagem("email_mensagem_cadastro_usuario", usuario.getNomeComprador(), usuario.getEmail(), senha);
		
		try{
			
			EmailUtil emailUtil = new EmailUtil();
			emailUtil.enviarEmail(null, usuario.getEmail(), titulo, mensagem);
			
		}catch (UtilException e){
			
			throw new RNException(e);
			
		}
		
	}
	
}
