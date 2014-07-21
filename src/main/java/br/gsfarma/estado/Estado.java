package br.gsfarma.estado;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Estado")
public class Estado implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -4709602639365548611L;
	
	@Id
	@GeneratedValue
	@Column(name="Cod_Estado")
	private Integer codEstado;
	
	@Column(name="Nome_Estado")
	private String nomeEstado;

	public Integer getCodEstado() {
		return codEstado;
	}

	public void setCodEstado(Integer codEstado) {
		this.codEstado = codEstado;
	}

	public String getNomeEstado() {
		return nomeEstado;
	}

	public void setNomeEstado(String nomeEstado) {
		this.nomeEstado = nomeEstado;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((codEstado == null) ? 0 : codEstado.hashCode());
		result = prime * result
				+ ((nomeEstado == null) ? 0 : nomeEstado.hashCode());
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
		Estado other = (Estado) obj;
		if (codEstado == null) {
			if (other.codEstado != null)
				return false;
		} else if (!codEstado.equals(other.codEstado))
			return false;
		if (nomeEstado == null) {
			if (other.nomeEstado != null)
				return false;
		} else if (!nomeEstado.equals(other.nomeEstado))
			return false;
		return true;
	}
}
