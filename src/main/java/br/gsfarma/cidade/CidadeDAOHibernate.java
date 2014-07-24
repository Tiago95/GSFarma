package br.gsfarma.cidade;

import java.util.List;

import org.hibernate.Session;

public class CidadeDAOHibernate implements CidadeDAO{

	private Session session;
	
	public void setSession(Session session){
		
		this.session = session;
		
	}
	
	@Override
	public void salvar(Cidade cidade) {
		
		this.session.save(cidade);
		
	}

	@Override
	public void excluir(Cidade cidade) {


		this.session.delete(cidade);
		
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Cidade> listar() {
		
		return this.session.createCriteria(Cidade.class).list();
		
	}
	
	

}
