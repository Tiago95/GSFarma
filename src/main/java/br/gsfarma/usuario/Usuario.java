package br.gsfarma.usuario;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import br.gsfarma.endereco.Endereco;
import br.gsfarma.permissao.Permissao;

@Entity
@Table(name="Usuario")
public class Usuario implements Serializable {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 7661346846206386994L;

     @Id
     @GeneratedValue
     @Column(name="COD_USUARIO")
     private Integer codUsuario;
	
    @OneToOne
    @PrimaryKeyJoinColumn(name="Cod_Usuario")
    private Endereco endereco;
    
    @ManyToMany
    @JoinTable(name="Usuario_Permissao", joinColumns={@JoinColumn(name="Cod_Usuario")},
    inverseJoinColumns={@JoinColumn(name="Cod_Permissao")})
    private Set<Permissao> permissoes = new HashSet<Permissao>();
    
    @Column(name="CNPJ")
    private String cnpj;
    
    @Column(name="Razao_Social")
    private String razaoSocial;
    
    @Column(name="Nome_Comprador")
    private String nomeComprador;
    
    @Column(name="Telefone_Principal")
    private String telefonePrincipal;
    
    @Column(name="TelefoneCelular")
    private String telefoneCelular;
    
    @Column(name="Telefone_Comercial")
    private String telefoneComercial;
    
    @Column(name="Email")
    private String email;
    
    @Column(name="Senha")
    private String senha;
    
    @Column(name="Ativo")
    private boolean ativo;

	public Integer getCodUsuario() {
		return codUsuario;
	}

	public void setCodUsuario(Integer codUsuario) {
		this.codUsuario = codUsuario;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public Set<Permissao> getPermissoes() {
		return permissoes;
	}

	public void setPermissoes(Set<Permissao> permissoes) {
		this.permissoes = permissoes;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getRazaoSocial() {
		return razaoSocial;
	}

	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}

	public String getNomeComprador() {
		return nomeComprador;
	}

	public void setNomeComprador(String nomeComprador) {
		this.nomeComprador = nomeComprador;
	}

	public String getTelefonePrincipal() {
		return telefonePrincipal;
	}

	public void setTelefonePrincipal(String telefonePrincipal) {
		this.telefonePrincipal = telefonePrincipal;
	}

	public String getTelefoneCelular() {
		return telefoneCelular;
	}

	public void setTelefoneCelular(String telefoneCelular) {
		this.telefoneCelular = telefoneCelular;
	}

	public String getTelefoneComercial() {
		return telefoneComercial;
	}

	public void setTelefoneComercial(String telefoneComercial) {
		this.telefoneComercial = telefoneComercial;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public boolean isAtivo() {
		return ativo;
	}

	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (ativo ? 1231 : 1237);
		result = prime * result + ((cnpj == null) ? 0 : cnpj.hashCode());
		result = prime * result
				+ ((codUsuario == null) ? 0 : codUsuario.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result
				+ ((endereco == null) ? 0 : endereco.hashCode());
		result = prime * result
				+ ((nomeComprador == null) ? 0 : nomeComprador.hashCode());
		result = prime * result
				+ ((permissoes == null) ? 0 : permissoes.hashCode());
		result = prime * result
				+ ((razaoSocial == null) ? 0 : razaoSocial.hashCode());
		result = prime * result + ((senha == null) ? 0 : senha.hashCode());
		result = prime * result
				+ ((telefoneCelular == null) ? 0 : telefoneCelular.hashCode());
		result = prime
				* result
				+ ((telefoneComercial == null) ? 0 : telefoneComercial
						.hashCode());
		result = prime
				* result
				+ ((telefonePrincipal == null) ? 0 : telefonePrincipal
						.hashCode());
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
		Usuario other = (Usuario) obj;
		if (ativo != other.ativo)
			return false;
		if (cnpj == null) {
			if (other.cnpj != null)
				return false;
		} else if (!cnpj.equals(other.cnpj))
			return false;
		if (codUsuario == null) {
			if (other.codUsuario != null)
				return false;
		} else if (!codUsuario.equals(other.codUsuario))
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (endereco == null) {
			if (other.endereco != null)
				return false;
		} else if (!endereco.equals(other.endereco))
			return false;
		if (nomeComprador == null) {
			if (other.nomeComprador != null)
				return false;
		} else if (!nomeComprador.equals(other.nomeComprador))
			return false;
		if (permissoes == null) {
			if (other.permissoes != null)
				return false;
		} else if (!permissoes.equals(other.permissoes))
			return false;
		if (razaoSocial == null) {
			if (other.razaoSocial != null)
				return false;
		} else if (!razaoSocial.equals(other.razaoSocial))
			return false;
		if (senha == null) {
			if (other.senha != null)
				return false;
		} else if (!senha.equals(other.senha))
			return false;
		if (telefoneCelular == null) {
			if (other.telefoneCelular != null)
				return false;
		} else if (!telefoneCelular.equals(other.telefoneCelular))
			return false;
		if (telefoneComercial == null) {
			if (other.telefoneComercial != null)
				return false;
		} else if (!telefoneComercial.equals(other.telefoneComercial))
			return false;
		if (telefonePrincipal == null) {
			if (other.telefonePrincipal != null)
				return false;
		} else if (!telefonePrincipal.equals(other.telefonePrincipal))
			return false;
		return true;
	}
}
