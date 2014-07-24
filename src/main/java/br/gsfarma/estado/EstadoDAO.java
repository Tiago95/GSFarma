package br.gsfarma.estado;

import java.util.List;

public interface EstadoDAO {
	
	public void salvar(Estado estado);
	
	public void excluir(Estado estado);
	
	public List<Estado> listar();

}
