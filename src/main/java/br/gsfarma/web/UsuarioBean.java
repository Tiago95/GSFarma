package br.gsfarma.web;

import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;

import org.springframework.util.DigestUtils;

import br.gsfarma.bairro.Bairro;
import br.gsfarma.cidade.Cidade;
import br.gsfarma.endereco.Endereco;
import br.gsfarma.estado.Estado;
import br.gsfarma.pais.Pais;
import br.gsfarma.permissao.Permissao;
import br.gsfarma.usuario.Usuario;
import br.gsfarma.usuario.UsuarioRN;
import br.gsfarma.util.RNException;



@ManagedBean(name="usuarioBean")
@RequestScoped
public class UsuarioBean {

	private Usuario usuario = new Usuario();
	private Endereco endereco = new Endereco();
	private Bairro bairro = new Bairro();
	private Cidade cidade = new Cidade();
	private Estado estado = new Estado();
	private Pais pais = new Pais();
	private String confirmarSenha;
	private List<Usuario> lista;
	private String destinoSalvar;	
	private String senhaCriptografada;	
	private String permissaoSel;
	private String senhaAntiga;
	private String senhaNova;
	private String numero;
	private String complemento;
	//private String bairro;
	//private String cidade;
	//private String estado;
	//private String pais;
	private String confirma_email;
	private String confirma_senha;
	private String nome_comprador;
	
	public String editar(){
		
		return "cadastro";
		
	}
	
	public String iniciaCadastro(){
		
		return "cadastro";
		
	}
	
	public String salvar(){	
		
		UsuarioRN usuarioRN = new UsuarioRN();	
		return usuarioRN.salvar(this.usuario, this.endereco,
				this.confirma_senha, this.confirma_email,
				this.bairro, this.cidade, this.estado, this.pais);
	
	}
	
	public String excluir(){
		
		
		UsuarioRN usuarioRN = new UsuarioRN();
		usuarioRN.excluir(this.usuario);
		this.lista = null;
		return null;
		
	}
	
	public String ativar(){
		
		if(this.usuario.isAtivo())
			
			this.usuario.setAtivo(false);
			
		else 
			
			this.usuario.setAtivo(true);
		
		
		UsuarioRN usuarioRN = new UsuarioRN();
		//usuarioRN.salvar(this.usuario);
		return null;
		
		
	}
	
	
	public List<Usuario> getLista(){
		
		
		if(this.lista == null){
			
			UsuarioRN usuarioRN = new UsuarioRN();
			this.lista = usuarioRN.listar();
		}
		
		return this.lista;
	}
	
	public String trocarSenha(){
		
		FacesContext context = FacesContext.getCurrentInstance();
		
		String senhaCripto = DigestUtils.md5DigestAsHex(senhaAntiga.getBytes());
		
		this.usuario = getUsuarioLogado();	
		
		if(!senhaCripto.equals(this.usuario.getSenha())){
			
			FacesMessage facesMessage = new FacesMessage("A senha antiga não confere");
			context.addMessage(null, facesMessage);
			return null;
			
			
		}
		
		if(!senhaNova.equals(confirmarSenha)){
			
			FacesMessage facesMessage = new FacesMessage("A senha confirmada não confere");
			context.addMessage(null, facesMessage);
			return null;
			
			
		}	
		
		String senhaCriptoNova = DigestUtils.md5DigestAsHex(senhaNova.getBytes());
		this.usuario.setSenha(senhaCriptoNova);
		
		UsuarioRN usuarioRN = new UsuarioRN();
		//usuarioRN.salvar(this.usuario);
		
		FacesMessage facesMessage = new FacesMessage("Senha alterada com sucesso");
		context.addMessage(null, facesMessage);
		return null;
		
	}
	
	public String getNomeUsuario(){
		
		this.usuario = getUsuarioLogado();
		
		this.nome_comprador = this.usuario.getNomeComprador();
		
		return this.nome_comprador;
		
	}
	
	
	public Usuario getUsuarioLogado() {		
        FacesContext context = FacesContext.getCurrentInstance();
        ExternalContext external = context.getExternalContext();
        String login = external.getRemoteUser();
        
       
            if (login != null) {
            	
                UsuarioRN usuarioRN = new UsuarioRN();
                this.usuario = usuarioRN.buscarPorLogin(login);   
                
            }
        
        return this.usuario;
    }

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public Bairro getBairro() {
		return bairro;
	}

	public void setBairro(Bairro bairro) {
		this.bairro = bairro;
	}

	public Cidade getCidade() {
		return cidade;
	}

	public void setCidade(Cidade cidade) {
		this.cidade = cidade;
	}

	public Estado getEstado() {
		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}

	public Pais getPais() {
		return pais;
	}

	public void setPais(Pais pais) {
		this.pais = pais;
	}

	public String getConfirmarSenha() {
		return confirmarSenha;
	}

	public void setConfirmarSenha(String confirmarSenha) {
		this.confirmarSenha = confirmarSenha;
	}

	public String getDestinoSalvar() {
		return destinoSalvar;
	}

	public void setDestinoSalvar(String destinoSalvar) {
		this.destinoSalvar = destinoSalvar;
	}

	public String getSenhaCriptografada() {
		return senhaCriptografada;
	}

	public void setSenhaCriptografada(String senhaCriptografada) {
		this.senhaCriptografada = senhaCriptografada;
	}

	public String getPermissaoSel() {
		return permissaoSel;
	}

	public void setPermissaoSel(String permissaoSel) {
		this.permissaoSel = permissaoSel;
	}

	public String getSenhaAntiga() {
		return senhaAntiga;
	}

	public void setSenhaAntiga(String senhaAntiga) {
		this.senhaAntiga = senhaAntiga;
	}

	public String getSenhaNova() {
		return senhaNova;
	}

	public void setSenhaNova(String senhaNova) {
		this.senhaNova = senhaNova;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	public String getConfirma_email() {
		return confirma_email;
	}

	public void setConfirma_email(String confirma_email) {
		this.confirma_email = confirma_email;
	}

	public String getConfirma_senha() {
		return confirma_senha;
	}

	public void setConfirma_senha(String confirma_senha) {
		this.confirma_senha = confirma_senha;
	}

	public String getNome_comprador() {
		return nome_comprador;
	}

	public void setNome_comprador(String nome_comprador) {
		this.nome_comprador = nome_comprador;
	}

	public void setLista(List<Usuario> lista) {
		this.lista = lista;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((bairro == null) ? 0 : bairro.hashCode());
		result = prime * result + ((cidade == null) ? 0 : cidade.hashCode());
		result = prime * result
				+ ((complemento == null) ? 0 : complemento.hashCode());
		result = prime * result
				+ ((confirma_email == null) ? 0 : confirma_email.hashCode());
		result = prime * result
				+ ((confirma_senha == null) ? 0 : confirma_senha.hashCode());
		result = prime * result
				+ ((confirmarSenha == null) ? 0 : confirmarSenha.hashCode());
		result = prime * result
				+ ((destinoSalvar == null) ? 0 : destinoSalvar.hashCode());
		result = prime * result
				+ ((endereco == null) ? 0 : endereco.hashCode());
		result = prime * result + ((estado == null) ? 0 : estado.hashCode());
		result = prime * result + ((lista == null) ? 0 : lista.hashCode());
		result = prime * result
				+ ((nome_comprador == null) ? 0 : nome_comprador.hashCode());
		result = prime * result + ((numero == null) ? 0 : numero.hashCode());
		result = prime * result + ((pais == null) ? 0 : pais.hashCode());
		result = prime * result
				+ ((permissaoSel == null) ? 0 : permissaoSel.hashCode());
		result = prime * result
				+ ((senhaAntiga == null) ? 0 : senhaAntiga.hashCode());
		result = prime
				* result
				+ ((senhaCriptografada == null) ? 0 : senhaCriptografada
						.hashCode());
		result = prime * result
				+ ((senhaNova == null) ? 0 : senhaNova.hashCode());
		result = prime * result + ((usuario == null) ? 0 : usuario.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		UsuarioBean other = (UsuarioBean) obj;
		if (bairro == null) {
			if (other.bairro != null)
				return false;
		} else if (!bairro.equals(other.bairro))
			return false;
		if (cidade == null) {
			if (other.cidade != null)
				return false;
		} else if (!cidade.equals(other.cidade))
			return false;
		if (complemento == null) {
			if (other.complemento != null)
				return false;
		} else if (!complemento.equals(other.complemento))
			return false;
		if (confirma_email == null) {
			if (other.confirma_email != null)
				return false;
		} else if (!confirma_email.equals(other.confirma_email))
			return false;
		if (confirma_senha == null) {
			if (other.confirma_senha != null)
				return false;
		} else if (!confirma_senha.equals(other.confirma_senha))
			return false;
		if (confirmarSenha == null) {
			if (other.confirmarSenha != null)
				return false;
		} else if (!confirmarSenha.equals(other.confirmarSenha))
			return false;
		if (destinoSalvar == null) {
			if (other.destinoSalvar != null)
				return false;
		} else if (!destinoSalvar.equals(other.destinoSalvar))
			return false;
		if (endereco == null) {
			if (other.endereco != null)
				return false;
		} else if (!endereco.equals(other.endereco))
			return false;
		if (estado == null) {
			if (other.estado != null)
				return false;
		} else if (!estado.equals(other.estado))
			return false;
		if (lista == null) {
			if (other.lista != null)
				return false;
		} else if (!lista.equals(other.lista))
			return false;
		if (nome_comprador == null) {
			if (other.nome_comprador != null)
				return false;
		} else if (!nome_comprador.equals(other.nome_comprador))
			return false;
		if (numero == null) {
			if (other.numero != null)
				return false;
		} else if (!numero.equals(other.numero))
			return false;
		if (pais == null) {
			if (other.pais != null)
				return false;
		} else if (!pais.equals(other.pais))
			return false;
		if (permissaoSel == null) {
			if (other.permissaoSel != null)
				return false;
		} else if (!permissaoSel.equals(other.permissaoSel))
			return false;
		if (senhaAntiga == null) {
			if (other.senhaAntiga != null)
				return false;
		} else if (!senhaAntiga.equals(other.senhaAntiga))
			return false;
		if (senhaCriptografada == null) {
			if (other.senhaCriptografada != null)
				return false;
		} else if (!senhaCriptografada.equals(other.senhaCriptografada))
			return false;
		if (senhaNova == null) {
			if (other.senhaNova != null)
				return false;
		} else if (!senhaNova.equals(other.senhaNova))
			return false;
		if (usuario == null) {
			if (other.usuario != null)
				return false;
		} else if (!usuario.equals(other.usuario))
			return false;
		return true;
	}


	
	


}
