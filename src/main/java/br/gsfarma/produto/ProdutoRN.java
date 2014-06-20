package br.gsfarma.produto;

import java.util.List;

import br.gsfarma.util.DAOFactory;

public class ProdutoRN {
	
	private ProdutoDAO produtoDAO;
	
	public ProdutoRN(){
		
		this.produtoDAO = DAOFactory.criarProdutoDAO();
	}
	
	public Produto carregar(Integer codigo){
		
		return this.produtoDAO.carregar(codigo);
				
	}
	
	public void salvar(Produto produto){
		
		this.produtoDAO.salvar(produto);			
			
		
	}
	
	public void excluir(Produto produto){
				
		this.produtoDAO.excluir(produto);
		
	}

	
	public List<Produto> listar(){
		
		return this.produtoDAO.listar();
		
	}	

}
