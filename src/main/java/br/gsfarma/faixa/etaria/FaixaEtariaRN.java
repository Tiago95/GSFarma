package br.gsfarma.faixa.etaria;

import java.util.List;

import br.gsfarma.util.DAOFactory;

public class FaixaEtariaRN {
	
	private FaixaEtariaDAO faixaEtariaDAO;
	
	public FaixaEtariaRN() {
		this.faixaEtariaDAO = DAOFactory.criarFaixaEtariaDAO();
	}
	
	public void salvar(FaixaEtaria faixaEtaria){
		this.faixaEtariaDAO.salvar(faixaEtaria);
	}
	
	public void excluir(FaixaEtaria faixaEtaria){
		this.faixaEtariaDAO.excluir(faixaEtaria);
	}
	
	public List<FaixaEtaria> listar(){
		return this.faixaEtariaDAO.listar();
	}
}
