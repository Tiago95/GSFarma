package br.gsfarma.bairro;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Entity;

@Entity
@Table(name="Bairro")
public class Bairro implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 4842208389689855423L;

	@Id
	@GeneratedValue
	@Column(name="Cod_Bairro")
	private Integer codBairro;
	
	@Column(name="Nome_Bairro")
	private String nomeBairro;

	public Integer getCodBairro() {
		return codBairro;
	}

	public void setCodBairro(Integer codBairro) {
		this.codBairro = codBairro;
	}

	public String getNomeBairro() {
		return nomeBairro;
	}

	public void setNomeBairro(String nomeBairro) {
		this.nomeBairro = nomeBairro;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((codBairro == null) ? 0 : codBairro.hashCode());
		result = prime * result
				+ ((nomeBairro == null) ? 0 : nomeBairro.hashCode());
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
		Bairro other = (Bairro) obj;
		if (codBairro == null) {
			if (other.codBairro != null)
				return false;
		} else if (!codBairro.equals(other.codBairro))
			return false;
		if (nomeBairro == null) {
			if (other.nomeBairro != null)
				return false;
		} else if (!nomeBairro.equals(other.nomeBairro))
			return false;
		return true;
	}	
}
