package br.gsfarma.estado;

import java.util.ArrayList;
import java.util.List;

import br.gsfarma.util.DAOFactory;

public class EstadoRN {
	
	private EstadoDAO estadoDAO;
	
	public EstadoRN() {
		this.estadoDAO = DAOFactory.criarEstadoDAO();
	}
	
	public Estado salvar(Estado estado){
		
		List<Estado> listaEstados = new ArrayList<Estado>();
		listaEstados = listar();
		
		if(listaEstados.contains(estado)){
			for (Estado estado2 : listaEstados) {
				if(estado2.equals(estado)){
					return estado2;
				}
			}
		}else{
			this.estadoDAO.salvar(estado);
		}	
		
		return estado;
		
	}
	
	public void excluir(Estado estado){
		
		this.estadoDAO.excluir(estado);
		
	}
	
	public List<Estado> listar(){
		
		return this.estadoDAO.listar();
		
	}

}
