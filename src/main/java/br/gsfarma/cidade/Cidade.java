package br.gsfarma.cidade;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Cidade")
public class Cidade implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -6527208609335003604L;
	
	@Id
	@GeneratedValue
	@Column(name="Cod_Cidade")
	private Integer codCidade;
	
	@Column(name="Nome_Cidade")
	private String nomeCidade;

	public Integer getCodCidade() {
		return codCidade;
	}

	public void setCodCidade(Integer codCidade) {
		this.codCidade = codCidade;
	}

	public String getNomeCidade() {
		return nomeCidade;
	}

	public void setNomeCidade(String nomeCidade) {
		this.nomeCidade = nomeCidade;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((codCidade == null) ? 0 : codCidade.hashCode());
		result = prime * result
				+ ((nomeCidade == null) ? 0 : nomeCidade.hashCode());
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
		Cidade other = (Cidade) obj;
		if (codCidade == null) {
			if (other.codCidade != null)
				return false;
		} else if (!codCidade.equals(other.codCidade))
			return false;
		if (nomeCidade == null) {
			if (other.nomeCidade != null)
				return false;
		} else if (!nomeCidade.equals(other.nomeCidade))
			return false;
		return true;
	}

}
