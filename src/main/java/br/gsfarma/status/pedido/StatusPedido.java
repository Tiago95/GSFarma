package br.gsfarma.status.pedido;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Status_Pedido")
public class StatusPedido implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 7835572580083688720L;
	
	@Id
	@GeneratedValue
	@Column(name="Cod_Status_Pedido")
	private Integer codStatusPedido;
	
	@Column(name="Descricao")
	private String descricao;

	public Integer getCodStatusPedido() {
		return codStatusPedido;
	}

	public void setCodStatusPedido(Integer codStatusPedido) {
		this.codStatusPedido = codStatusPedido;
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
				+ ((codStatusPedido == null) ? 0 : codStatusPedido.hashCode());
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
		StatusPedido other = (StatusPedido) obj;
		if (codStatusPedido == null) {
			if (other.codStatusPedido != null)
				return false;
		} else if (!codStatusPedido.equals(other.codStatusPedido))
			return false;
		if (descricao == null) {
			if (other.descricao != null)
				return false;
		} else if (!descricao.equals(other.descricao))
			return false;
		return true;
	}
}
