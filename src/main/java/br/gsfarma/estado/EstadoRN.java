package br.gsfarma.estado;

import java.util.List;

import br.gsfarma.util.DAOFactory;

public class EstadoRN {
	
	private EstadoDAO estadoDAO;
	
	public EstadoRN() {
		this.estadoDAO = DAOFactory.criarEstadoDAO();
	}
	
	public void salvar(Estado estado){
		
		this.estadoDAO.salvar(estado);
		
	}
	
	public void excluir(Estado estado){
		
		this.estadoDAO.excluir(estado);
		
	}
	
	public List<Estado> listar(){
		
		return this.estadoDAO.listar();
		
	}

}
