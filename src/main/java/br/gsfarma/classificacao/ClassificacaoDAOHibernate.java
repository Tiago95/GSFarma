package br.gsfarma.classificacao;

import java.util.List;

import org.hibernate.Session;

public class ClassificacaoDAOHibernate implements ClassificacaoDAO{
	
	private Session session;
	
	public void setSession(Session session) {
		this.session = session;
	}

	@Override
	public void salvar(Classificacao classificacao) {
		this.session.save(classificacao);		
	}

	@Override
	public void excluir(Classificacao classificacao) {
		this.session.delete(classificacao);		
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Classificacao> listar() {
		return this.session.createCriteria(Classificacao.class).list();
	}
}
