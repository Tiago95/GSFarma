package br.gsfarma.faixa.etaria;

import java.util.List;

public interface FaixaEtariaDAO {
	
	public void salvar(FaixaEtaria faixaEtaria);
	
	public void excluir(FaixaEtaria faixaEtaria);
	
	public List<FaixaEtaria> listar();

}
