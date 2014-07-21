package br.gsfarma.contato;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import br.gsfarma.status.mensagem.StatusMensagem;

@Entity
@Table(name="contato")
public class Contato implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8333439142724359698L;
	
	@Id
	@GeneratedValue
	@Column(name="Cod_Contato")
	private Integer codContato;
	
	@ManyToOne
	@JoinColumn(name="codStatusMensagem")
	private StatusMensagem statusMensagem;
	
	@Column(name="nome")
	private String nome;
	
	@Column(name="email")
	private String email;
	
	@Column(name="telefone")
	private String telefone;
	
	@Column(name="titulo")
	private String titulo;
	
	@Column(name="mensagem")
	private String mensagem;

	public Integer getCodContato() {
		return codContato;
	}

	public void setCodContato(Integer codContato) {
		this.codContato = codContato;
	}

	public StatusMensagem getStatusMensagem() {
		return statusMensagem;
	}

	public void setStatusMensagem(StatusMensagem statusMensagem) {
		this.statusMensagem = statusMensagem;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getMensagem() {
		return mensagem;
	}

	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((codContato == null) ? 0 : codContato.hashCode());
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result
				+ ((mensagem == null) ? 0 : mensagem.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result
				+ ((statusMensagem == null) ? 0 : statusMensagem.hashCode());
		result = prime * result
				+ ((telefone == null) ? 0 : telefone.hashCode());
		result = prime * result + ((titulo == null) ? 0 : titulo.hashCode());
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
		Contato other = (Contato) obj;
		if (codContato == null) {
			if (other.codContato != null)
				return false;
		} else if (!codContato.equals(other.codContato))
			return false;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (mensagem == null) {
			if (other.mensagem != null)
				return false;
		} else if (!mensagem.equals(other.mensagem))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (statusMensagem == null) {
			if (other.statusMensagem != null)
				return false;
		} else if (!statusMensagem.equals(other.statusMensagem))
			return false;
		if (telefone == null) {
			if (other.telefone != null)
				return false;
		} else if (!telefone.equals(other.telefone))
			return false;
		if (titulo == null) {
			if (other.titulo != null)
				return false;
		} else if (!titulo.equals(other.titulo))
			return false;
		return true;
	}	

}
