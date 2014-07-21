package br.gsfarma.faixa.etaria;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Entity;

@Entity
@Table(name="Faixa_Etaria")
public class FaixaEtaria implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -4836203399317843781L;
	
	@Id
	@GeneratedValue
	@Column(name="Cod_Faixa_Etaria")
	private Integer codFaixaEtaria;
	
	@Column(name="Descricao")
	private String descricao;

	public Integer getCodFaixaEtaria() {
		return codFaixaEtaria;
	}

	public void setCodFaixaEtaria(Integer codFaixaEtaria) {
		this.codFaixaEtaria = codFaixaEtaria;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((codFaixaEtaria == null) ? 0 : codFaixaEtaria.hashCode());
		result = prime * result
				+ ((descricao == null) ? 0 : descricao.hashCode());
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
		FaixaEtaria other = (FaixaEtaria) obj;
		if (codFaixaEtaria == null) {
			if (other.codFaixaEtaria != null)
				return false;
		} else if (!codFaixaEtaria.equals(other.codFaixaEtaria))
			return false;
		if (descricao == null) {
			if (other.descricao != null)
				return false;
		} else if (!descricao.equals(other.descricao))
			return false;
		return true;
	}
}
