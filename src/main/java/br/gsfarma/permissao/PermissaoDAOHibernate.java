package br.gsfarma.permissao;

import java.util.List;

import org.hibernate.Session;

public class PermissaoDAOHibernate implements PermissaoDAO{
	
	private Session session;
	
	public void setSession(Session session) {
		this.session = session;
	}

	@Override
	public void salvar(Permissao permissao) {

		this.session.save(permissao);
		
	}

	@Override
	public void excluir(Permissao permissao) {

		this.session.delete(permissao);
		
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Permissao> listar() {
		
		return this.session.createCriteria(Permissao.class).list();
		
	}
	
	

}
