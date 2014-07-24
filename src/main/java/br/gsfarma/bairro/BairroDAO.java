package br.gsfarma.bairro;

import java.util.List;

public interface BairroDAO {
	
	public void salvar(Bairro bairro);
	
	public void excluir(Bairro bairro);

	public List<Bairro> listar();
}
