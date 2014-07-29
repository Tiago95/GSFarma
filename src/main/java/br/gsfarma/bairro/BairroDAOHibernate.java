package br.gsfarma.bairro;

import java.util.List;

import org.hibernate.Query;
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
	public Bairro listar(Bairro bairro) {
		
		String hql = "select b from Bairro b where b.nomeBairro = :bairro";
		Query consulta = this.session.createQuery(hql);
		consulta.setString("bairro", bairro.getNomeBairro());
		if(consulta.list().isEmpty()){
			return bairro;
		}else{
			return (Bairro) consulta.uniqueResult();
		}		
		
	}	

}
