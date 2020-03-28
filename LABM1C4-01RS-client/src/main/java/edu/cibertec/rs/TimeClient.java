package edu.cibertec.rs;

import java.net.URI;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.UriBuilder;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.config.ClientConfig;
import com.sun.jersey.api.client.config.DefaultClientConfig;

public class TimeClient {
	private static final Logger LOG =LoggerFactory.getLogger(TimeClient.class);
	
	public static void main(String[] args) {	
		
		//Dar la ubicacion del Servicio
		URI serviceLocation= UriBuilder.fromUri("http://localhost:8080/timeService/").build() ;

		//Crear Cliente
		ClientConfig config = new DefaultClientConfig();
		Client client = Client.create();
		
		//Recurso a obtener
		WebResource service = client.resource(serviceLocation);
		
		//Invocacion
		String result = service.path("/rest")
						.path("/time")
						.accept(MediaType.TEXT_PLAIN)
						.get(String.class);
		LOG.info("TEXT_PLAIN={}", result);
		
		result = service.path("/rest")
				.path("/time")
				.accept(MediaType.TEXT_XML)
				.get(String.class);
		LOG.info("TEXT_XML={}", result);
		
		
		result = service.path("/rest")
				.path("/time")
				.accept(MediaType.TEXT_HTML)
				.get(String.class);
		LOG.info("TEXT_HTML={}", result);
	}
}
