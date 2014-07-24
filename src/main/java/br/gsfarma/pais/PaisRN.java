package br.gsfarma.pais;

import java.util.List;

import br.gsfarma.util.DAOFactory;

public class PaisRN {
	
	private PaisDAO paisDAO;
	
	public PaisRN() {
		this.paisDAO = DAOFactory.criarPaisDAO();
	}
	
	public void salvar(Pais pais){
		
		this.paisDAO.salvar(pais);
		
	}
	
	public void excluir(Pais pais){
		
		this.paisDAO.excluir(pais);
		
	}
	
	public List<Pais> listar(){
		
		return this.paisDAO.listar();
	}
	
}
