package br.gsfarma.contato;

import java.util.List;

import org.hibernate.Session;


public class ContatoDAOHibernate implements ContatoDAO {
	
     private Session session;
	
	public void setSession(Session session){
		
		this.session = session;
		
	}

	@Override
	public void salvar(Contato contato) {
		
		this.session.saveOrUpdate(contato);

	}

	@Override
	public void atualizar(Contato contato) {		
		
		this.session.update(contato);

	}

	@Override
	public void excluir(Contato contato) {

		this.session.delete(contato);

	}

	@Override
	public Contato carregar(Integer codigo) {
		
		return (Contato) this.session.get(Contato.class, codigo);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Contato> listar() {
		
		return this.session.createCriteria(Contato.class).list();
	}

}

