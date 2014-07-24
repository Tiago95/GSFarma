package br.gsfarma.bairro;

import java.util.List;

import br.gsfarma.util.DAOFactory;

public class BairroRN {
	
	private BairroDAO bairroDAO;
	
	public BairroRN() {

		this.bairroDAO = DAOFactory.criarBairroDAO();
		
	}
	
	public void salvar(Bairro bairro){
		
		this.bairroDAO.salvar(bairro);
		
	}
	
	public void excluir(Bairro bairro){
		
		this.bairroDAO.excluir(bairro);
		
	}
	
	public List<Bairro> listar(){
		
		return this.bairroDAO.listar();
		
	}

}
