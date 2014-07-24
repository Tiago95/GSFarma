package br.gsfarma.bairro;

import java.util.List;

import org.hibernate.Session;

public class BairroDAOHibernate implements BairroDAO{
	
	private Session session;
	
	public void setSession(Session session){
		
		this.session = session;
		
	}

	@Override
	public void salvar(Bairro bairro) {

		this.session.save(bairro);
		
	}

	@Override
	public void excluir(Bairro bairro) {

		this.session.delete(bairro);
		
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Bairro> listar() {
		
		return this.session.createCriteria(Bairro.class).list();
		
	}
	
	

}
