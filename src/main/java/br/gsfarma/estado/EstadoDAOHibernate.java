package br.gsfarma.estado;

import java.util.List;

import org.hibernate.Session;

public class EstadoDAOHibernate implements EstadoDAO{

	private Session session;
	
	public void setSession(Session session) {
		this.session = session;
	}
	
	@Override
	public void salvar(Estado estado) {

		this.session.save(estado);
		
	}

	@Override
	public void excluir(Estado estado) {

		this.session.delete(estado);
		
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Estado> listar() {
		
		return this.session.createCriteria(Estado.class).list();
		
	}
	
	

}
