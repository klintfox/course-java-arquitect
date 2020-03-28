package edu.cibertec.jaad.rsws.client;

import java.net.URI;
import java.util.List;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.UriBuilder;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.GenericType;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.config.ClientConfig;
import com.sun.jersey.api.client.config.DefaultClientConfig;

import edu.cibertec.jaad.rsws.bean.Programa;

public class RESTClientGet {
	private static final Logger LOG = LoggerFactory.getLogger(RESTClientGet.class);
	public static void main(String[] args) {
		URI location = UriBuilder.fromUri("http://localhost:9090").build();
		ClientConfig config = new DefaultClientConfig();
		Client client = Client.create(config);
		WebResource service = client.resource(location);
		
		String result =	service.path("/programa")
				.path("list")
				.accept(MediaType.APPLICATION_JSON) 
				.get(String.class);
		
		LOG.info("List-JSON:{}",result);
		
		List<Programa> list = service
				.path("/programa")
				.path("list")
				.accept(MediaType.TEXT_XML)
				.get(new GenericType<List<Programa>>(){});
		
		LOG.info("Lista:{}", list);
	}
}
