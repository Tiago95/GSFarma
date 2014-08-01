package br.gsfarma.web;

import java.io.Serializable;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import org.primefaces.event.FileUploadEvent;
import org.primefaces.model.UploadedFile;

import br.gsfarma.produto.Produto;
import br.gsfarma.produto.ProdutoRN;

@ManagedBean(name="produtoBean")
@ViewScoped
public class ProdutoBean implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 115612075060736726L;
	private Produto produto = new Produto();
	private List<Produto> lista;
	private UploadedFile arquivo;
	
	
	public List<Produto> getLista(){
		
		
		if(this.lista == null){
			
			ProdutoRN produtoRN = new ProdutoRN();
			this.lista = produtoRN.listar();
		}
		
		return this.lista;
	}

    public void handleFileUpload(FileUploadEvent event) {
        FacesMessage message = new FacesMessage("Succesful", event.getFile().getFileName() + " is uploaded.");
        FacesContext.getCurrentInstance().addMessage(null, message);
    }
	
	public String salvar(){
		
		if(arquivo != null){
			FacesContext context = FacesContext.getCurrentInstance();
			FacesMessage facesMessage = new FacesMessage("O arquivo: "+arquivo.getFileName()+" está aqui!!");
			context.addMessage(null, facesMessage);
		}else{
			FacesContext context = FacesContext.getCurrentInstance();
			FacesMessage facesMessage = new FacesMessage("O arquivo não está aqui!!");
			context.addMessage(null, facesMessage);
		}
		
		return null;
	}

	public Produto getProduto() {
		return produto;
	}


	public void setProduto(Produto produto) {
		this.produto = produto;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}


	public void setLista(List<Produto> lista) {
		this.lista = lista;
	}

	public UploadedFile getArquivo() {
		return arquivo;
	}

	public void setArquivo(UploadedFile arquivo) {
		this.arquivo = arquivo;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((arquivo == null) ? 0 : arquivo.hashCode());
		result = prime * result + ((lista == null) ? 0 : lista.hashCode());
		result = prime * result + ((produto == null) ? 0 : produto.hashCode());
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
		ProdutoBean other = (ProdutoBean) obj;
		if (arquivo == null) {
			if (other.arquivo != null)
				return false;
		} else if (!arquivo.equals(other.arquivo))
			return false;
		if (lista == null) {
			if (other.lista != null)
				return false;
		} else if (!lista.equals(other.lista))
			return false;
		if (produto == null) {
			if (other.produto != null)
				return false;
		} else if (!produto.equals(other.produto))
			return false;
		return true;
	}
}
