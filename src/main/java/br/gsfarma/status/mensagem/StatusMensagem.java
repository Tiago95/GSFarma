package br.gsfarma.status.mensagem;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Status_Mensagem")
public class StatusMensagem implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6557837188580286956L;
	
	@Id
	@GeneratedValue
	@Column(name="Cod_Status_Mensagem")
	private Integer codStatusMensagem;
	
	@Column(name="Descricao")
	private String descricao;

	public Integer getCodStatusMensagem() {
		return codStatusMensagem;
	}

	public void setCodStatusMensagem(Integer codStatusMensagem) {
		this.codStatusMensagem = codStatusMensagem;
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
				+ ((codStatusMensagem == null) ? 0 : codStatusMensagem
						.hashCode());
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
		StatusMensagem other = (StatusMensagem) obj;
		if (codStatusMensagem == null) {
			if (other.codStatusMensagem != null)
				return false;
		} else if (!codStatusMensagem.equals(other.codStatusMensagem))
			return false;
		if (descricao == null) {
			if (other.descricao != null)
				return false;
		} else if (!descricao.equals(other.descricao))
			return false;
		return true;
	}	

}
