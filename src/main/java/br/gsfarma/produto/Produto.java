package br.gsfarma.produto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="produto")
public class Produto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1563294478063239753L;
	
	@Id
	@GeneratedValue
	@Column(name="cod_produto")
	private Integer codigo;
	
	private String descricao;
	private String categoria;
	private String referencia;
	private Integer cx_embalagem;
	private Float preco_fabrica;
	private Float preco_consumidor;
	private Float preco_venda;
	private Integer quantidade;
	
	public Integer getCodigo() {
		return codigo;
	}
	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public String getReferencia() {
		return referencia;
	}
	public void setReferencia(String referencia) {
		this.referencia = referencia;
	}
	public Integer getCx_embalagem() {
		return cx_embalagem;
	}
	public void setCx_embalagem(Integer cx_embalagem) {
		this.cx_embalagem = cx_embalagem;
	}
	public Float getPreco_fabrica() {
		return preco_fabrica;
	}
	public void setPreco_fabrica(Float preco_fabrica) {
		this.preco_fabrica = preco_fabrica;
	}
	public Float getPreco_consumidor() {
		return preco_consumidor;
	}
	public void setPreco_consumidor(Float preco_consumidor) {
		this.preco_consumidor = preco_consumidor;
	}
	public Float getPreco_venda() {
		return preco_venda;
	}
	public void setPreco_venda(Float preco_venda) {
		this.preco_venda = preco_venda;
	}
	public Integer getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((categoria == null) ? 0 : categoria.hashCode());
		result = prime * result + ((codigo == null) ? 0 : codigo.hashCode());
		result = prime * result
				+ ((cx_embalagem == null) ? 0 : cx_embalagem.hashCode());
		result = prime * result
				+ ((descricao == null) ? 0 : descricao.hashCode());
		result = prime
				* result
				+ ((preco_consumidor == null) ? 0 : preco_consumidor.hashCode());
		result = prime * result
				+ ((preco_fabrica == null) ? 0 : preco_fabrica.hashCode());
		result = prime * result
				+ ((preco_venda == null) ? 0 : preco_venda.hashCode());
		result = prime * result
				+ ((quantidade == null) ? 0 : quantidade.hashCode());
		result = prime * result
				+ ((referencia == null) ? 0 : referencia.hashCode());
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
		Produto other = (Produto) obj;
		if (categoria == null) {
			if (other.categoria != null)
				return false;
		} else if (!categoria.equals(other.categoria))
			return false;
		if (codigo == null) {
			if (other.codigo != null)
				return false;
		} else if (!codigo.equals(other.codigo))
			return false;
		if (cx_embalagem == null) {
			if (other.cx_embalagem != null)
				return false;
		} else if (!cx_embalagem.equals(other.cx_embalagem))
			return false;
		if (descricao == null) {
			if (other.descricao != null)
				return false;
		} else if (!descricao.equals(other.descricao))
			return false;
		if (preco_consumidor == null) {
			if (other.preco_consumidor != null)
				return false;
		} else if (!preco_consumidor.equals(other.preco_consumidor))
			return false;
		if (preco_fabrica == null) {
			if (other.preco_fabrica != null)
				return false;
		} else if (!preco_fabrica.equals(other.preco_fabrica))
			return false;
		if (preco_venda == null) {
			if (other.preco_venda != null)
				return false;
		} else if (!preco_venda.equals(other.preco_venda))
			return false;
		if (quantidade == null) {
			if (other.quantidade != null)
				return false;
		} else if (!quantidade.equals(other.quantidade))
			return false;
		if (referencia == null) {
			if (other.referencia != null)
				return false;
		} else if (!referencia.equals(other.referencia))
			return false;
		return true;
	}

}
