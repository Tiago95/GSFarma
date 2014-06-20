package br.gsfarma.util;

import br.gsfarma.contato.ContatoDAO;
import br.gsfarma.contato.ContatoDAOHibernate;
import br.gsfarma.produto.ProdutoDAO;
import br.gsfarma.produto.ProdutoDAOHibernate;
import br.gsfarma.usuario.UsuarioDAO;
import br.gsfarma.usuario.UsuarioDAOHibernate;

public class DAOFactory {
	
	public static UsuarioDAO criarUsuarioDAO(){
		
		UsuarioDAOHibernate usuarioDAO = new UsuarioDAOHibernate();
		usuarioDAO.setSession(HibernateUtil.getSessionFactory().getCurrentSession());
		return usuarioDAO;
		
	}
	
	public static ContatoDAO criarContatoDAO(){
		
		ContatoDAOHibernate contatoDAO = new ContatoDAOHibernate();
		contatoDAO.setSession(HibernateUtil.getSessionFactory().getCurrentSession());
		return contatoDAO;
		
	}
	
	public static ProdutoDAO criarProdutoDAO(){		
		
		ProdutoDAOHibernate produtoDAO = new ProdutoDAOHibernate();
		produtoDAO.setSession(HibernateUtil.getSessionFactory().getCurrentSession());
		return produtoDAO;
		
	}
	
}
