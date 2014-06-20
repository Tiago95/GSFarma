package br.gsfarma.produto;

import java.util.List;

import org.hibernate.Session;

public class ProdutoDAOHibernate implements ProdutoDAO {
	
	private Session session;
	
	public void setSession(Session session){
		
		this.session = session;
		
	}

	public void salvar(Produto produto) {
		
		this.session.saveOrUpdate(produto);

	}

	public void atualizar(Produto produto) {	
		
		this.session.update(produto);

	}

	public void excluir(Produto produto) {

		
		this.session.delete(produto);

	}

	public Produto carregar(Integer codigo) {
		
		return (Produto) this.session.get(Produto.class, codigo);
	}	

	@SuppressWarnings("unchecked")
	public List<Produto> listar() {
		
		return this.session.createCriteria(Produto.class).list();
	}

}
