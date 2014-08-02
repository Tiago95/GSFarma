package br.gsfarma.faixa.etaria;

import java.util.List;

import org.hibernate.Session;

public class FaixaEtariaDAOHibernate implements FaixaEtariaDAO{
	
	private Session session;
	
	public void setSession(Session session) {
		this.session = session;
	}

	@Override
	public void salvar(FaixaEtaria faixaEtaria) {
		this.session.save(faixaEtaria);		
	}

	@Override
	public void excluir(FaixaEtaria faixaEtaria) {
		this.session.delete(faixaEtaria);		
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<FaixaEtaria> listar() {
		return this.session.createCriteria(FaixaEtaria.class).list();
	}
}
