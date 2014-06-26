package br.gsfarma.util;

import java.util.Date;
import java.util.Properties;

import javax.mail.Session;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;

public class EmailUtil {
	
	private static final String SERVIDOR_SMTP = "localhost";
	private static final int PORTA_SERVIDOR_SMTP = 25;
	private static final String CONTA_PADRAO = "admin@localhost";
	private static final String SENHA_CONTA_PADRAO = "1234";
	
	public void enviarEmail(String de, String para, String assunto, String mensagem) throws UtilException{		
			
			try{
				
				/*Context initialContext = new InitialContext();
				Context envContext = (Context) initialContext.lookup("java:comp/env");
				Session session = (Session) envContext.lookup("mail/Session");*/
				SimpleEmail email = new SimpleEmail();
				//email.setMailSession(session);
				email.setHostName(EmailUtil.SERVIDOR_SMTP);
				email.setSmtpPort(EmailUtil.PORTA_SERVIDOR_SMTP);
				email.setCharset("iso-8859-1");
				
				if(de != null){
					
					email.setFrom(de);
					
				}else{
					
					//Properties p = session.getProperties();
					//email.setFrom(p.getProperty("mail.smtp.user"));
					email.setFrom("admin@localhost", "teste");
					
				}
				
				email.addTo(para);				
				email.setSubject(assunto);
				email.setMsg(mensagem);
				email.setSentDate(new Date());
				email.send();
				
			}catch (EmailException e){
				
				throw new UtilException(e);
				
			}		
		
	}

}
