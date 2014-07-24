package br.gsfarma.cidade;

import java.util.List;

import br.gsfarma.util.DAOFactory;

public class CidadeRN {
	
	private CidadeDAO cidadeDAO;
	
	public CidadeRN() {
		this.cidadeDAO = DAOFactory.criarCidadeDAO();
	}
	
	public void salvar(Cidade cidade){
		
		this.cidadeDAO.salvar(cidade);
		
	}
	
	public void excluir(Cidade cidade){
		
		this.cidadeDAO.excluir(cidade);
		
	}
	
	public List<Cidade> listar(){
		
		return this.cidadeDAO.listar();
		
	}

}
