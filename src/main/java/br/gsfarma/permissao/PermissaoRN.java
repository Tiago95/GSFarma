package br.gsfarma.permissao;

import java.util.List;

import br.gsfarma.util.DAOFactory;

public class PermissaoRN {
	
	private PermissaoDAO permissaoDAO;
	
	public PermissaoRN() {
		this.permissaoDAO = DAOFactory.criarPermissao();
	}
	
	public void salvar(Permissao permissao){
		this.permissaoDAO.salvar(permissao);		
	}
	
	public void excluir(Permissao permissao){
		this.permissaoDAO.excluir(permissao);
	}
	
	public List<Permissao> listar(){
		return this.permissaoDAO.listar();
	}

}
