package br.gsfarma.conversores;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

@FacesConverter(value="conversorCNPJ")
public class ConversorCNPJ implements Converter{

	@Override
	public Object getAsObject(FacesContext arg0, UIComponent arg1, String value) {
		
		String cnpj = value;
        if (value!= null && !value.equals(""))
            cnpj = value.replaceAll("\\.", "").replaceAll("\\-", "").replaceAll("/", "");
        System.out.println(cnpj);

       return cnpj;
	}

	@Override
	public String getAsString(FacesContext arg0, UIComponent arg1, Object value) {
		
		return null;
	}
	
	

}
