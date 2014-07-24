package br.gsfarma.permissao;

import java.util.List;

public interface PermissaoDAO {
	
	public void salvar(Permissao permissao);
	
	public void excluir(Permissao permissao);
	
	public List<Permissao> listar();

}
