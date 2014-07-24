package br.gsfarma.util;

import br.gsfarma.bairro.BairroDAO;
import br.gsfarma.bairro.BairroDAOHibernate;
import br.gsfarma.cidade.CidadeDAO;
import br.gsfarma.cidade.CidadeDAOHibernate;
import br.gsfarma.contato.ContatoDAO;
import br.gsfarma.contato.ContatoDAOHibernate;
import br.gsfarma.endereco.EnderecoDAO;
import br.gsfarma.endereco.EnderecoDAOHibernate;
import br.gsfarma.estado.EstadoDAO;
import br.gsfarma.estado.EstadoDAOHibernate;
import br.gsfarma.pais.PaisDAO;
import br.gsfarma.pais.PaisDAOHibernate;
import br.gsfarma.permissao.PermissaoDAO;
import br.gsfarma.permissao.PermissaoDAOHibernate;
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
	
	public static EnderecoDAO criarEnderecoDAO(){
		
		EnderecoDAOHibernate enderecoDAO = new EnderecoDAOHibernate();
		enderecoDAO.setSession(HibernateUtil.getSessionFactory().getCurrentSession());
		return enderecoDAO;
		
	}
	
	public static BairroDAO criarBairroDAO(){
		
		BairroDAOHibernate bairroDAO = new BairroDAOHibernate();
		bairroDAO.setSession(HibernateUtil.getSessionFactory().getCurrentSession());
		return bairroDAO;
		
	}
	
	public static CidadeDAO criarCidadeDAO(){
		
		CidadeDAOHibernate cidadeDAO = new CidadeDAOHibernate();
		cidadeDAO.setSession(HibernateUtil.getSessionFactory().getCurrentSession());
		return cidadeDAO;
		
	}
	
	public static EstadoDAO criarEstadoDAO(){
		
		EstadoDAOHibernate estadoDAO = new EstadoDAOHibernate();
		estadoDAO.setSession(HibernateUtil.getSessionFactory().getCurrentSession());
		return estadoDAO;
		
	}
	
	public static PaisDAO criarPaisDAO(){
		
		PaisDAOHibernate paisDAO = new PaisDAOHibernate();
		paisDAO.setSession(HibernateUtil.getSessionFactory().getCurrentSession());
		return paisDAO;
		
	}
	
	public static PermissaoDAO criarPermissao(){
		
		PermissaoDAOHibernate permissaoDAO = new PermissaoDAOHibernate();
		permissaoDAO.setSession(HibernateUtil.getSessionFactory().getCurrentSession());
		return permissaoDAO;
		
	}
	
}
