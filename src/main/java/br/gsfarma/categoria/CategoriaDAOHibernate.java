package br.gsfarma.categoria;

import java.util.List;

import org.hibernate.Session;

public class CategoriaDAOHibernate implements CategoriaDAO{
	
	private Session session;
	
	public void setSession(Session session) {
		this.session = session;
	}

	@Override
	public void salvar(Categoria categoria) {
		this.session.save(categoria);		
	}

	@Override
	public void excluir(Categoria categoria) {
		this.session.delete(categoria);		
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Categoria> listar() {
		return this.session.createCriteria(Categoria.class).list();
	}
}
