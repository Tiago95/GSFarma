package br.gsfarma.pais;

import java.util.List;

public interface PaisDAO {
	
	public void salvar(Pais pais);
	
	public void excluir(Pais pais);
	
	public List<Pais> listar();

}
