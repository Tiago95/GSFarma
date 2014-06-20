package br.gsfarma.usuario;

import java.util.List;

import br.gsfarma.util.DAOFactory;
import br.gsfarma.util.EmailUtil;
import br.gsfarma.util.MensagemUtil;
import br.gsfarma.util.RNException;
import br.gsfarma.util.UtilException;


public class UsuarioRN {
	
	private UsuarioDAO usuarioDAO;
	
	public UsuarioRN(){
		
		this.usuarioDAO = DAOFactory.criarUsuarioDAO();
	}
	
	public Usuario carregar(Integer codigo){
		
		return this.usuarioDAO.carregar(codigo);
				
	}
	
	public Usuario buscarPorLogin(String login){
		
		return this.usuarioDAO.buscarPorLogin(login);
		
	}
	
	public void salvar(Usuario usuario){
		
		Integer codigo = usuario.getCodigo();
		
		if(codigo == null || codigo == 0){	
			
			usuario.setAtivo(true);
			
			this.usuarioDAO.salvar(usuario);			
			
		}else {
			
			
			this.usuarioDAO.atualizar(usuario);
		}
		
	}
	
	public void excluir(Usuario usuario){
				
		this.usuarioDAO.excluir(usuario);
		
	}

	
	public List<Usuario> listar(){
		
		return this.usuarioDAO.listar();
		
	}
	
	
	public void enviarEmailPosCadastramento(Usuario usuario, String senha) throws RNException {
		
		String titulo = MensagemUtil.getMensagem("email_titulo_cadastro_usuario");
		String mensagem = MensagemUtil.getMensagem("email_mensagem_cadastro_usuario", usuario.getNome_contato(), usuario.getEmail(), senha);
		
		try{
			
			EmailUtil emailUtil = new EmailUtil();
			emailUtil.enviarEmail(null, usuario.getEmail(), titulo, mensagem);
			
		}catch (UtilException e){
			
			throw new RNException(e);
			
		}
		
	}
	
}
