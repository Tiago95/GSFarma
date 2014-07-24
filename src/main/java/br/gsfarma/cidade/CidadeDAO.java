package br.gsfarma.cidade;

import java.util.List;

public interface CidadeDAO {
	
	public void salvar(Cidade cidade);
	
	public void excluir(Cidade cidade);
	
	public List<Cidade> listar();

}
