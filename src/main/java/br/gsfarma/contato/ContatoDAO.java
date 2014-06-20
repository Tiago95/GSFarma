package br.gsfarma.contato;

import java.util.List;

public interface ContatoDAO {
	
public void salvar(Contato contato);
	
	public void atualizar(Contato contato);
	
	public void excluir(Contato contato);
	
	public Contato carregar(Integer codigo);
	
	public List<Contato> listar();

}
