package br.gsfarma.pais;

import java.util.List;

import org.hibernate.Session;

public class PaisDAOHibernate implements PaisDAO{
	
	private Session session;
	
	public void setSession(Session session) {
		this.session = session;
	}

	@Override
	public void salvar(Pais pais) {

		this.session.save(pais);
		
	}

	@Override
	public void excluir(Pais pais) {

		this.session.delete(pais);
		
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Pais> listar() {
		
		return this.session.createCriteria(Pais.class).list();
		
	}
	
	

}
