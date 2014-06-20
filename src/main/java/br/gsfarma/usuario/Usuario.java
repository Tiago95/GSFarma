package br.gsfarma.usuario;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "usuario")
public class Usuario implements Serializable {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 7661346846206386994L;

	@Id
	@GeneratedValue
	@Column(name  = "codigo")
	private Integer codigo;
	
	private String cnpj;
	private String razao_social;
	private String nome_contato;
	private String tel_principal;
	private String tel_celular;
	private String tel_comercial;
	private String cep;
	private String endereco;
	private String email;
	private String senha;	
	private boolean ativo;
	
	@ElementCollection(targetClass = String.class)
	@JoinTable(
			
	  name="usuario_permissao",
	  uniqueConstraints = {@UniqueConstraint(columnNames = {"usuario","permissao"})},
	  joinColumns = @JoinColumn(name="usuario"))
	
	@Column(name="permissao", length=50)
	private Set<String> permissao = new HashSet<String>();

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getRazao_social() {
		return razao_social;
	}

	public void setRazao_social(String razao_social) {
		this.razao_social = razao_social;
	}

	public String getNome_contato() {
		return nome_contato;
	}

	public void setNome_contato(String nome_contato) {
		this.nome_contato = nome_contato;
	}

	public String getTel_principal() {
		return tel_principal;
	}

	public void setTel_principal(String tel_principal) {
		this.tel_principal = tel_principal;
	}

	public String getTel_celular() {
		return tel_celular;
	}

	public void setTel_celular(String tel_celular) {
		this.tel_celular = tel_celular;
	}

	public String getTel_comercial() {
		return tel_comercial;
	}

	public void setTel_comercial(String tel_comercial) {
		this.tel_comercial = tel_comercial;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
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

	public Set<String> getPermissao() {
		return permissao;
	}

	public void setPermissao(Set<String> permissao) {
		this.permissao = permissao;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (ativo ? 1231 : 1237);
		result = prime * result + ((cep == null) ? 0 : cep.hashCode());
		result = prime * result + ((cnpj == null) ? 0 : cnpj.hashCode());
		result = prime * result + ((codigo == null) ? 0 : codigo.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result
				+ ((endereco == null) ? 0 : endereco.hashCode());
		result = prime * result
				+ ((nome_contato == null) ? 0 : nome_contato.hashCode());
		result = prime * result
				+ ((permissao == null) ? 0 : permissao.hashCode());
		result = prime * result
				+ ((razao_social == null) ? 0 : razao_social.hashCode());
		result = prime * result + ((senha == null) ? 0 : senha.hashCode());
		result = prime * result
				+ ((tel_celular == null) ? 0 : tel_celular.hashCode());
		result = prime * result
				+ ((tel_comercial == null) ? 0 : tel_comercial.hashCode());
		result = prime * result
				+ ((tel_principal == null) ? 0 : tel_principal.hashCode());
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
		if (cep == null) {
			if (other.cep != null)
				return false;
		} else if (!cep.equals(other.cep))
			return false;
		if (cnpj == null) {
			if (other.cnpj != null)
				return false;
		} else if (!cnpj.equals(other.cnpj))
			return false;
		if (codigo == null) {
			if (other.codigo != null)
				return false;
		} else if (!codigo.equals(other.codigo))
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
		if (nome_contato == null) {
			if (other.nome_contato != null)
				return false;
		} else if (!nome_contato.equals(other.nome_contato))
			return false;
		if (permissao == null) {
			if (other.permissao != null)
				return false;
		} else if (!permissao.equals(other.permissao))
			return false;
		if (razao_social == null) {
			if (other.razao_social != null)
				return false;
		} else if (!razao_social.equals(other.razao_social))
			return false;
		if (senha == null) {
			if (other.senha != null)
				return false;
		} else if (!senha.equals(other.senha))
			return false;
		if (tel_celular == null) {
			if (other.tel_celular != null)
				return false;
		} else if (!tel_celular.equals(other.tel_celular))
			return false;
		if (tel_comercial == null) {
			if (other.tel_comercial != null)
				return false;
		} else if (!tel_comercial.equals(other.tel_comercial))
			return false;
		if (tel_principal == null) {
			if (other.tel_principal != null)
				return false;
		} else if (!tel_principal.equals(other.tel_principal))
			return false;
		return true;
	}	

}
