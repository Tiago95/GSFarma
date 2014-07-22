package br.gsfarma.produto;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import br.gsfarma.categoria.Categoria;
import br.gsfarma.classificacao.Classificacao;
import br.gsfarma.faixa.etaria.FaixaEtaria;
import br.gsfarma.itens.ItensPedido;
import br.gsfarma.pedido.Pedido;

@Entity
@Table(name="Produto")
public class Produto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1563294478063239753L;
	
	@Id
	@GeneratedValue
	@Column(name="Cod_Produto")
	private Integer codProduto;
	
	@ManyToOne
	@JoinColumn(name="Cod_Categoria")
	private Categoria categoria;
	
    @ManyToOne
    @JoinColumn(name="Cod_Faixa_Etaria")
    private FaixaEtaria faixaEtaria;
    
    @ManyToOne
    @JoinColumn(name="Cod_Classificacao")
    private Classificacao classificacao;
    
    @ManyToMany
    @JoinTable(name="Itens_Pedido", joinColumns={@JoinColumn(name="Cod_Produto")},
    inverseJoinColumns={@JoinColumn(name="Cod_Pedido")})
    private Collection<Pedido> pedido;
    
    @Column(name="Apresentacao")
    private String apresentacao;
    
    @Column(name="Referencia")
    private String referencia;
    
    @Column(name="Classe_Terapeutica")
    private String classeTerapeutica;
    
    @Column(name="Indicacoes")
    private String indicacoes;
    
    @Column(name="Preco_Fabrica")
    private BigDecimal precoFabrica;
    
    @Column(name="Preco_Consumidor")
    private BigDecimal precoConsumidor;
    
    @Column(name="Preco_Venda")
    private BigDecimal precoVenda;

	public Integer getCodProduto() {
		return codProduto;
	}

	public void setCodProduto(Integer codProduto) {
		this.codProduto = codProduto;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public FaixaEtaria getFaixaEtaria() {
		return faixaEtaria;
	}

	public void setFaixaEtaria(FaixaEtaria faixaEtaria) {
		this.faixaEtaria = faixaEtaria;
	}

	public Classificacao getClassificacao() {
		return classificacao;
	}

	public void setClassificacao(Classificacao classificacao) {
		this.classificacao = classificacao;
	}

	public String getApresentacao() {
		return apresentacao;
	}

	public void setApresentacao(String apresentacao) {
		this.apresentacao = apresentacao;
	}

	public String getReferencia() {
		return referencia;
	}

	public void setReferencia(String referencia) {
		this.referencia = referencia;
	}

	public String getClasseTerapeutica() {
		return classeTerapeutica;
	}

	public void setClasseTerapeutica(String classeTerapeutica) {
		this.classeTerapeutica = classeTerapeutica;
	}

	public String getIndicacoes() {
		return indicacoes;
	}

	public void setIndicacoes(String indicacoes) {
		this.indicacoes = indicacoes;
	}

	public BigDecimal getPrecoFabrica() {
		return precoFabrica;
	}

	public void setPrecoFabrica(BigDecimal precoFabrica) {
		this.precoFabrica = precoFabrica;
	}

	public BigDecimal getPrecoConsumidor() {
		return precoConsumidor;
	}

	public void setPrecoConsumidor(BigDecimal precoConsumidor) {
		this.precoConsumidor = precoConsumidor;
	}

	public BigDecimal getPrecoVenda() {
		return precoVenda;
	}

	public void setPrecoVenda(BigDecimal precoVenda) {
		this.precoVenda = precoVenda;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((apresentacao == null) ? 0 : apresentacao.hashCode());
		result = prime * result
				+ ((categoria == null) ? 0 : categoria.hashCode());
		result = prime
				* result
				+ ((classeTerapeutica == null) ? 0 : classeTerapeutica
						.hashCode());
		result = prime * result
				+ ((classificacao == null) ? 0 : classificacao.hashCode());
		result = prime * result
				+ ((codProduto == null) ? 0 : codProduto.hashCode());
		result = prime * result
				+ ((faixaEtaria == null) ? 0 : faixaEtaria.hashCode());
		result = prime * result
				+ ((indicacoes == null) ? 0 : indicacoes.hashCode());
		result = prime * result
				+ ((precoConsumidor == null) ? 0 : precoConsumidor.hashCode());
		result = prime * result
				+ ((precoFabrica == null) ? 0 : precoFabrica.hashCode());
		result = prime * result
				+ ((precoVenda == null) ? 0 : precoVenda.hashCode());
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
		if (apresentacao == null) {
			if (other.apresentacao != null)
				return false;
		} else if (!apresentacao.equals(other.apresentacao))
			return false;
		if (categoria == null) {
			if (other.categoria != null)
				return false;
		} else if (!categoria.equals(other.categoria))
			return false;
		if (classeTerapeutica == null) {
			if (other.classeTerapeutica != null)
				return false;
		} else if (!classeTerapeutica.equals(other.classeTerapeutica))
			return false;
		if (classificacao == null) {
			if (other.classificacao != null)
				return false;
		} else if (!classificacao.equals(other.classificacao))
			return false;
		if (codProduto == null) {
			if (other.codProduto != null)
				return false;
		} else if (!codProduto.equals(other.codProduto))
			return false;
		if (faixaEtaria == null) {
			if (other.faixaEtaria != null)
				return false;
		} else if (!faixaEtaria.equals(other.faixaEtaria))
			return false;
		if (indicacoes == null) {
			if (other.indicacoes != null)
				return false;
		} else if (!indicacoes.equals(other.indicacoes))
			return false;
		if (precoConsumidor == null) {
			if (other.precoConsumidor != null)
				return false;
		} else if (!precoConsumidor.equals(other.precoConsumidor))
			return false;
		if (precoFabrica == null) {
			if (other.precoFabrica != null)
				return false;
		} else if (!precoFabrica.equals(other.precoFabrica))
			return false;
		if (precoVenda == null) {
			if (other.precoVenda != null)
				return false;
		} else if (!precoVenda.equals(other.precoVenda))
			return false;
		if (referencia == null) {
			if (other.referencia != null)
				return false;
		} else if (!referencia.equals(other.referencia))
			return false;
		return true;
	}
}
