package br.gsfarma.pedido;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import br.gsfarma.itens.ItensPedido;
import br.gsfarma.permissao.Permissao;
import br.gsfarma.produto.Produto;
import br.gsfarma.status.pedido.StatusPedido;
import br.gsfarma.usuario.Usuario;

@Entity
@Table(name="Pedido")
public class Pedido implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8690091216409291248L;
	
	@Id
	@GeneratedValue
	@Column(name="Cod_Pedido")
	private Integer codPedido;

    @ManyToOne
    @JoinColumn(name="Cod_Status_Pedido")
    private StatusPedido statusPedido;
    
    @ManyToOne
    @JoinColumn(name="Cod_Usuario")
    private Usuario usuario;
    
    @ManyToMany
    @JoinTable(name="Itens_Pedido", joinColumns={@JoinColumn(name="Cod_Pedido")},
    inverseJoinColumns={@JoinColumn(name="Cod_Produto")})
    private Collection<Produto> produto;
    
    @Column(name="Data")
    private Date data;
    
    @Column(name="Valor_Total")
    private BigDecimal valorTotal;

	public Integer getCodPedido() {
		return codPedido;
	}

	public void setCodPedido(Integer codPedido) {
		this.codPedido = codPedido;
	}

	public StatusPedido getStatusPedido() {
		return statusPedido;
	}

	public void setStatusPedido(StatusPedido statusPedido) {
		this.statusPedido = statusPedido;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public BigDecimal getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(BigDecimal valorTotal) {
		this.valorTotal = valorTotal;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public Collection<Produto> getProduto() {
		return produto;
	}

	public void setProduto(Collection<Produto> produto) {
		this.produto = produto;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((codPedido == null) ? 0 : codPedido.hashCode());
		result = prime * result + ((data == null) ? 0 : data.hashCode());
		result = prime * result + ((produto == null) ? 0 : produto.hashCode());
		result = prime * result
				+ ((statusPedido == null) ? 0 : statusPedido.hashCode());
		result = prime * result + ((usuario == null) ? 0 : usuario.hashCode());
		result = prime * result
				+ ((valorTotal == null) ? 0 : valorTotal.hashCode());
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
		Pedido other = (Pedido) obj;
		if (codPedido == null) {
			if (other.codPedido != null)
				return false;
		} else if (!codPedido.equals(other.codPedido))
			return false;
		if (data == null) {
			if (other.data != null)
				return false;
		} else if (!data.equals(other.data))
			return false;
		if (produto == null) {
			if (other.produto != null)
				return false;
		} else if (!produto.equals(other.produto))
			return false;
		if (statusPedido == null) {
			if (other.statusPedido != null)
				return false;
		} else if (!statusPedido.equals(other.statusPedido))
			return false;
		if (usuario == null) {
			if (other.usuario != null)
				return false;
		} else if (!usuario.equals(other.usuario))
			return false;
		if (valorTotal == null) {
			if (other.valorTotal != null)
				return false;
		} else if (!valorTotal.equals(other.valorTotal))
			return false;
		return true;
	}
}
