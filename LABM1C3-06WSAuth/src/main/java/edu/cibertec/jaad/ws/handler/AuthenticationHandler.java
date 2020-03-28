package edu.cibertec.jaad.ws.handler;

import java.util.Set;

import javax.xml.namespace.QName;
import javax.xml.soap.SOAPEnvelope;
import javax.xml.soap.SOAPFault;
import javax.xml.soap.SOAPHeader;
import javax.xml.ws.handler.MessageContext;
import javax.xml.ws.handler.soap.SOAPHandler;
import javax.xml.ws.handler.soap.SOAPMessageContext;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class AuthenticationHandler implements SOAPHandler<SOAPMessageContext> {

	private static final Logger LOG = LoggerFactory.getLogger(AuthenticationHandler.class);
	
	@Override
	public boolean handleMessage(SOAPMessageContext context) {
		Boolean isRequest =!(Boolean)context.get(MessageContext.MESSAGE_OUTBOUND_PROPERTY);
		String usuario = "";
		String clave = "";
		try {
			if(isRequest){
				SOAPEnvelope envelope = context.getMessage().getSOAPPart().getEnvelope();
				SOAPHeader header = envelope.getHeader();
				
				//Validamos que tenga el header
				if(header == null || header.hasChildNodes()){
					SOAPFault fault = envelope.getBody().addFault();
					fault.setFaultString("El mensaje no tiene header");
					return false;
				}
				
				//Obtenemos el user y clave
				NodeList nodes = header.getElementsByTagNameNS("http://security/", "*");
				for (int i = 0; i < nodes.getLength(); i++) {
					
					Node node = nodes.item(i);
					
					if(node.getLocalName().equals("users")){
						usuario = node.getTextContent();							
					}
					if(node.getLocalName().equals("clave")){
						clave = node.getTextContent();							
					}
				}
				
				//Validamos las credenciales 
				if(usuario.equals("duke") && clave.equals("java")){
					LOG.info("Autenticacion exitosa");
				}else{
					SOAPFault fault = envelope.getBody().addFault();
					fault.setFaultString("Credenciales incorrectas");
					return false;
				}
			}
		} catch (Exception e) {
			LOG.info("Error al procesar la autenticacion", e);
			return false;
		}
		return false;
	}

	@Override
	public boolean handleFault(SOAPMessageContext context) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void close(MessageContext context) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Set<QName> getHeaders() {
		// TODO Auto-generated method stub
		return null;
	}


}
