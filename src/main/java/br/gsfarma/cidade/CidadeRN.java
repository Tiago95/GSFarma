package br.gsfarma.cidade;

import java.util.ArrayList;
import java.util.List;

import br.gsfarma.util.DAOFactory;

public class CidadeRN {
	
	private CidadeDAO cidadeDAO;
	
	public CidadeRN() {
		this.cidadeDAO = DAOFactory.criarCidadeDAO();
	}
	
	public Cidade salvar(Cidade cidade){
		
		List<Cidade> listaCidade = new ArrayList<Cidade>();
		listaCidade = listar();
		
		if(listaCidade.contains(cidade)){
			for (Cidade cidade2 : listaCidade) {
				if(cidade2.equals(cidade)){
					return cidade2;
				}
			}
		}else{
			this.cidadeDAO.salvar(cidade);
		}		
		return cidade;		
	}
	
	public void excluir(Cidade cidade){
		
		this.cidadeDAO.excluir(cidade);
		
	}
	
	public List<Cidade> listar(){
		
		return this.cidadeDAO.listar();
		
	}

}
