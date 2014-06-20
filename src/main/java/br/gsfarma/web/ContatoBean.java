package br.gsfarma.web;

import java.io.Serializable;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import br.gsfarma.contato.Contato;
import br.gsfarma.contato.ContatoRN;
import br.gsfarma.util.RNException;

@ManagedBean(name = "contatoBean")
@ViewScoped
public class ContatoBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2509827749873954536L;
	private Contato contato = new Contato();
	private List<Contato> lista;
	
	
	public String salvar(){
		
		FacesContext context = FacesContext.getCurrentInstance();
		
		ContatoRN contatoRN = new ContatoRN();
		contatoRN.salvar(this.contato);
		
		try{
			
			contatoRN.enviarEmailPosContato(this.contato);
			contatoRN.enviarRetornoContato(contato);
			
		}catch (RNException e){
			
			FacesMessage facesMessage = new FacesMessage("Não foi possivel enviar o e-mail de contato. Erro: "
					+ e.getMessage());
			context.addMessage(null, facesMessage);
			
		}	
		
		FacesMessage facesMessage = new FacesMessage("Mensagem enviada com sucesso");				
		context.addMessage(null, facesMessage);
		
		return "contato";
		
	}


	public Contato getContato() {
		return contato;
	}


	public void setContato(Contato contato) {
		this.contato = contato;
	}


	public List<Contato> getLista() {
		return lista;
	}


	public void setLista(List<Contato> lista) {
		this.lista = lista;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((contato == null) ? 0 : contato.hashCode());
		result = prime * result + ((lista == null) ? 0 : lista.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ContatoBean other = (ContatoBean) obj;
		if (contato == null) {
			if (other.contato != null)
				return false;
		} else if (!contato.equals(other.contato))
			return false;
		if (lista == null) {
			if (other.lista != null)
				return false;
		} else if (!lista.equals(other.lista))
			return false;
		return true;
	}	

}
