package br.gsfarma.permissao;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Permissao")
public class Permissao implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 4315520000937041999L;
	
	@Id
	@GeneratedValue
	@Column(name="Cod_Permissao")
	private Integer codPermissao;
	
	@Column(name="Tipo_Permissao")
	private String tipoPermissao;

	public Integer getCodPermissao() {
		return codPermissao;
	}

	public void setCodPermissao(Integer codPermissao) {
		this.codPermissao = codPermissao;
	}

	public String getTipoPermissao() {
		return tipoPermissao;
	}

	public void setTipoPermissao(String tipoPermissao) {
		this.tipoPermissao = tipoPermissao;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((codPermissao == null) ? 0 : codPermissao.hashCode());
		result = prime * result
				+ ((tipoPermissao == null) ? 0 : tipoPermissao.hashCode());
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
		Permissao other = (Permissao) obj;
		if (codPermissao == null) {
			if (other.codPermissao != null)
				return false;
		} else if (!codPermissao.equals(other.codPermissao))
			return false;
		if (tipoPermissao == null) {
			if (other.tipoPermissao != null)
				return false;
		} else if (!tipoPermissao.equals(other.tipoPermissao))
			return false;
		return true;
	}

}
