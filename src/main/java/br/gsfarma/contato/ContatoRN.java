package br.gsfarma.contato;

import java.util.List;

import br.gsfarma.util.DAOFactory;
import br.gsfarma.util.EmailUtil;
import br.gsfarma.util.RNException;
import br.gsfarma.util.UtilException;

public class ContatoRN {
	
	private ContatoDAO contatoDAO;
	
	public ContatoRN(){
		
		this.contatoDAO = DAOFactory.criarContatoDAO();
		
	}

	public Contato carregar(Integer codigo){
		
		return this.contatoDAO.carregar(codigo);
				
	}
	
	public void salvar(Contato contato){
		
			
			this.contatoDAO.salvar(contato);		
		
	}
	
	public void excluir(Contato contato){
				
		this.contatoDAO.excluir(contato);
		
	}

	
	public List<Contato> listar(){
		
		return this.contatoDAO.listar();
		
	}
	
	
	public void enviarEmailPosContato(Contato contato) throws RNException {
		
		try{
			
			EmailUtil emailUtil = new EmailUtil();
			emailUtil.enviarEmail(null, "contato@gsfarma.com.br", contato.getTitulo(), "Esse contato foi feito por: " + contato.getNome() + "\n" + "Email: " + contato.getEmail() + "\n" + "Telefone: " + contato.getTelefone() + "\n\n" + contato.getMensagem());
			
		}catch (UtilException e){
			
			throw new RNException(e);
			
		}
		
	}
	
	public void enviarRetornoContato(Contato contato) throws RNException {
		
		String titulo = br.gsfarma.util.MensagemUtil.getMensagem("email_titulo_retorno_contato");
		String mensagem = br.gsfarma.util.MensagemUtil.getMensagem("email_mensagem_retorno_contato", contato.getNome());
		
		try{
			
			EmailUtil emailUtil = new EmailUtil();
			emailUtil.enviarEmail(null, contato.getEmail(), titulo, mensagem);
			
		}catch (UtilException e){
			
			throw new RNException(e);
			
		}
		
	}
	
}
