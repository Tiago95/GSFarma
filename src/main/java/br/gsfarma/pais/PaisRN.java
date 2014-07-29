package br.gsfarma.pais;

import java.util.ArrayList;
import java.util.List;

import br.gsfarma.util.DAOFactory;

public class PaisRN {
	
	private PaisDAO paisDAO;
	
	public PaisRN() {
		this.paisDAO = DAOFactory.criarPaisDAO();
	}
	
	public Pais salvar(Pais pais){
		
		List<Pais> listaPais = new ArrayList<Pais>();
		listaPais = listar();
		
		if(listaPais.contains(pais)){
			for (Pais pais2 : listaPais) {
				if(pais2.equals(pais)){
					return pais2;
				}
			}
		}else{
			this.paisDAO.salvar(pais);
		}	
		
		return pais;
		
	}
	
	public void excluir(Pais pais){
		
		this.paisDAO.excluir(pais);
		
	}
	
	public List<Pais> listar(){
		
		return this.paisDAO.listar();
	}
	
}
