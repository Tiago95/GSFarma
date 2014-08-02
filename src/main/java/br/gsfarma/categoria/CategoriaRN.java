package br.gsfarma.categoria;

import java.util.List;

import br.gsfarma.util.DAOFactory;

public class CategoriaRN {
	
	private CategoriaDAO categoriaDAO;
	
	public CategoriaRN() {
		this.categoriaDAO = DAOFactory.criarCategoriaDAO();
	}
	
	public void salvar(Categoria categoria){
		this.categoriaDAO.salvar(categoria);
	}
	
	public void excluir(Categoria categoria){
		this.categoriaDAO.excluir(categoria);
	}
	
	public List<Categoria> listar(){
		return this.categoriaDAO.listar();
	}
}
