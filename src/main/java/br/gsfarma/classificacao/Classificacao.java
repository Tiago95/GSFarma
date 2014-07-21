package br.gsfarma.classificacao;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Classificacao")
public class Classificacao implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -810394798554367097L;
	
	@Id
	@GeneratedValue
	@Column(name="Cod_Classificacao")
	private Integer codClassificacao;
	
	@Column(name="Descricao")
	private String descricao;

	public Integer getCodClassificacao() {
		return codClassificacao;
	}

	public void setCodClassificacao(Integer codClassificacao) {
		this.codClassificacao = codClassificacao;
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
		result = prime
				* result
				+ ((codClassificacao == null) ? 0 : codClassificacao.hashCode());
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
		Classificacao other = (Classificacao) obj;
		if (codClassificacao == null) {
			if (other.codClassificacao != null)
				return false;
		} else if (!codClassificacao.equals(other.codClassificacao))
			return false;
		if (descricao == null) {
			if (other.descricao != null)
				return false;
		} else if (!descricao.equals(other.descricao))
			return false;
		return true;
	}
}
