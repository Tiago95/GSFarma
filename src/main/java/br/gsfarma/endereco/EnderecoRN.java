package br.gsfarma.endereco;

import br.gsfarma.util.DAOFactory;

public class EnderecoRN {
	
	private EnderecoDAO enderecoDAO;
	
	public EnderecoRN(){
		
		this.enderecoDAO = DAOFactory.criarEnderecoDAO();
		
	}
	
	public void salvar(Endereco endereco){
		
		this.enderecoDAO.salvar(endereco);
		
	}

}
