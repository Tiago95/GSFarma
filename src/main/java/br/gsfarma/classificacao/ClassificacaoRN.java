package br.gsfarma.classificacao;

import java.util.List;

import br.gsfarma.util.DAOFactory;

public class ClassificacaoRN {
	
	private ClassificacaoDAO classificacaoDAO;
	
	public ClassificacaoRN() {
		this.classificacaoDAO = DAOFactory.criarClassificacaoDAO();
	}
	
	public void salvar(Classificacao classificacao){
		this.classificacaoDAO.salvar(classificacao);
	}
	
	public void excluir(Classificacao classificacao){
		this.classificacaoDAO.excluir(classificacao);
	}
	
	public List<Classificacao> listar(){
		return this.classificacaoDAO.listar();
	}
}
