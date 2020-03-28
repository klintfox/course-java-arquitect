package edu.cibertec.jaad.ws;

import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TimeServiceClient {
	private static final Logger LOG = LoggerFactory.getLogger(TimeServiceClient.class);
	public static void main(String[] args) throws MalformedURLException {
		
		// Reference the URL
		URL url = new URL("http://localhost:9876/timeService?wsdl");
		
		//Qualified name of the service
		QName qName = new QName("http://ws.jaad.cibertec.edu/", "BasicTimeServiceService");
		
		//Create a factory for the service
		Service service = Service.create(url, qName);
		
		//Get SEI or service port
		TimeService servicePort = service.getPort(TimeService.class);
		
		LOG.info("TimeAsString : "  + servicePort.getTimeAsString());
		
	}
	
}
