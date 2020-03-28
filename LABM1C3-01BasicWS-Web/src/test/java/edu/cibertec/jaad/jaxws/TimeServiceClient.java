package edu.cibertec.jaad.jaxws;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Map;

import javax.xml.namespace.QName;
import javax.xml.ws.BindingProvider;
import javax.xml.ws.Service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TimeServiceClient {
	private static final Logger LOG = 
			LoggerFactory.getLogger(TimeServiceClient.class);
	public static void main(String[] args) throws MalformedURLException {
		URL url;
		
		url = new File("timeService.wsdl").toURI().toURL();
		url = TimeServiceClient.class.getClassLoader().getResource("timeService.wsdl");
		//url = new URL("http://localhost:8081/timeService?wsdl");
		QName qname = new QName(
				"http://jaxws.jaad.cibertec.edu/", 
				"BasicTimeServiceService");
		Service service = Service.create(url, qname);
		TimeService servicePort = service.getPort(TimeService.class);
		setupIpService((BindingProvider)servicePort);
		String time = servicePort.getTimeAsString();
		LOG.info("Time: " + time);
	}
	
	private static void setupIpService(BindingProvider provider){
		Map<String, Object> map =provider.getRequestContext();
		map.put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, 
				"http://localhost:8081/timeService");
	}
}
