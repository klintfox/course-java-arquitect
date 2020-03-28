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

public class LogHandler implements SOAPHandler<SOAPMessageContext> {
	private static final Logger LOG = LoggerFactory.getLogger(LogHandler.class);

	@Override
	public boolean handleMessage(SOAPMessageContext context) {
		Boolean esSalida = (Boolean) context
				.get(MessageContext.MESSAGE_OUTBOUND_PROPERTY);
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		try {
			SOAPMessage soapMessage = context.getMessage();
			soapMessage.writeTo(baos);
			LOG.info("{}=[{}]", esSalida ? "OUT" : "IN",baos.toString());
			
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
