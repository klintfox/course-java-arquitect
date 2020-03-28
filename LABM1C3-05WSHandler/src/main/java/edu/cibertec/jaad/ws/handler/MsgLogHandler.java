package edu.cibertec.jaad.ws.handler;

import java.io.ByteArrayOutputStream;
import java.util.Set;

import javax.xml.namespace.QName;
import javax.xml.soap.SOAPMessage;
import javax.xml.ws.handler.MessageContext;
import javax.xml.ws.handler.soap.SOAPHandler;
import javax.xml.ws.handler.soap.SOAPMessageContext;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MsgLogHandler implements SOAPHandler<SOAPMessageContext> {
	private static final Logger LOG = LoggerFactory.getLogger(MsgLogHandler.class);

	@Override
	public boolean handleMessage(SOAPMessageContext context) {
		Boolean esSalida = (Boolean) context
				.get(MessageContext.MESSAGE_OUTBOUND_PROPERTY);		
		try {
						
			LOG.info("MSG-{}", esSalida ? "RESPONSE" : "REQUEST");
			
		} catch (Exception ex) {
			LOG.error("Error al capturar mensaje", ex);
		}

		return true;
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
