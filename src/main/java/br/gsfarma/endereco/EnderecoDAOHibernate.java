package br.gsfarma.endereco;

import org.hibernate.Session;

public class EnderecoDAOHibernate implements EnderecoDAO{
	
	private Session session;
	
	public void setSession(Session session){
		
		this.session = session;
		
	}

	@Override
	public void salvar(Endereco endereco) {
		
		this.session.save(endereco);

	}

}
