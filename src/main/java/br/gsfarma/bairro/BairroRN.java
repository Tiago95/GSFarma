package br.gsfarma.bairro;

import java.util.ArrayList;
import java.util.List;

import com.sun.org.apache.regexp.internal.recompile;

import br.gsfarma.util.DAOFactory;

public class BairroRN {
	
	private BairroDAO bairroDAO;
	
	public BairroRN() {

		this.bairroDAO = DAOFactory.criarBairroDAO();
		
	}
	
	public Bairro salvar(Bairro bairro){
		
		bairro = listar(bairro);
		
		if(bairro.getCodBairro() == null){
			this.bairroDAO.salvar(bairro);
			return bairro;
		}else{
			return bairro;
		}
		
	}
	
	public void excluir(Bairro bairro){
		
		this.bairroDAO.excluir(bairro);
		
	}
	
	public Bairro listar(Bairro bairro){
		
		return this.bairroDAO.listar(bairro);
		
	}

}
