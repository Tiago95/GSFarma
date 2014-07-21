package br.gsfarma.pais;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Pais")
public class Pais implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 4689710148443481917L;
	
	@Id
	@GeneratedValue
	@Column(name="Cod_Pais")
	private Integer codPais;
	
	@Column(name="Nome_Pais")
	private String nomePais;

	public Integer getCodPais() {
		return codPais;
	}

	public void setCodPais(Integer codPais) {
		this.codPais = codPais;
	}

	public String getNomePais() {
		return nomePais;
	}

	public void setNomePais(String nomePais) {
		this.nomePais = nomePais;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codPais == null) ? 0 : codPais.hashCode());
		result = prime * result
				+ ((nomePais == null) ? 0 : nomePais.hashCode());
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
		Pais other = (Pais) obj;
		if (codPais == null) {
			if (other.codPais != null)
				return false;
		} else if (!codPais.equals(other.codPais))
			return false;
		if (nomePais == null) {
			if (other.nomePais != null)
				return false;
		} else if (!nomePais.equals(other.nomePais))
			return false;
		return true;
	}

}
