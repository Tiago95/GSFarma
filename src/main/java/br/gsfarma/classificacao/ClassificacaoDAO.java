package br.gsfarma.classificacao;

import java.util.List;

public interface ClassificacaoDAO {
	
	public void salvar(Classificacao classificacao);
	
	public void excluir(Classificacao classificacao);
	
	public List<Classificacao> listar();

}
