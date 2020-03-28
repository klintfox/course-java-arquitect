package edu.cibertec.jaad.jaws;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Map;

import javax.xml.namespace.QName;
import javax.xml.ws.BindingProvider;
import javax.xml.ws.Service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import edu.cibertec.jaad.jaxws.TimeService;

public class TimeServiceClient {
	private static final Logger LOG = LoggerFactory.getLogger(TimeServiceClient.class);
			
		public static void main(String[] args) throws MalformedURLException{
			
//			URL url;
			
			
			URL url = new URL("http://localhost:8443/timeservice?wsdl");
//			url = new File("timeService.wsdl").toURI().toURL();
			QName qname = new QName(
					"http://jaxws.jaad.cibertec.edu/",
					"SimpleTimeServiceService");
			Service service = Service.create(url, qname);
			TimeService servicePort = service.getPort(TimeService.class);
			
			//Configurando la Ip del Servicio
//			setupIpservice((BindingProvider)servicePort);
			
			String time = servicePort.getTimeAsString();		
			LOG.info("TimeAsString:["+ time +"]");
			
			long timeElapsed = servicePort.gettimeAsElapsed();
			LOG.info("TimeAsElapsed:["+ timeElapsed + "]");

		}
		
		private static void setup(){
			System.setProperty("javax.net.debug", "ssl");
			System.setProperty("javax.net.ssl.trustStoreType", "jks");
			System.setProperty("javax.net.ssl.trustStore", "foo.keystore");		
			System.setProperty("javax.net.ssl.trustStorePassword", "cibertec");
			System.setProperty("javax.net.ssl.keyStoreStoreType", "jks");
			System.setProperty("javax.net.ssl.keyStore", "foo.keystore");		
			System.setProperty("javax.net.ssl.keyStorePassword", "cibertec");
		}
		
		//provee accesos
		private static void setupIpservice(BindingProvider provider){
			Map<String, Object> map = provider.getRequestContext();
			map.put(BindingProvider.ENDPOINT_ADDRESS_PROPERTY, 
					"http://localhost:8080/timeservice");
		}
}
