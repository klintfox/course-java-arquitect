package edu.cibertec.jaad.rsws.client;

import java.net.URI;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.List;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.UriBuilder;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.config.ClientConfig;
import com.sun.jersey.api.client.config.DefaultClientConfig;

import edu.cibertec.jaad.rsws.bean.Programa;

public class RESTClientPost {
	private static final Logger LOG = LoggerFactory.getLogger(RESTClientPost.class);
	public static void main(String[] args) {
		URI location = UriBuilder.fromUri("http://localhost:9090").build();
		ClientConfig config = new DefaultClientConfig();
		Client client = Client.create(config);
		WebResource service = client.resource(location);
		
		Programa programa = new Programa("03","Java God", 45.0, 
				new GregorianCalendar(2030,01,01).getTime(),
				new GregorianCalendar(2031,12,31).getTime());
		
		ClientResponse response = service
				.path("programa")
				.path("create")
				.type(MediaType.TEXT_XML)
				.post(ClientResponse.class, programa);
		
		LOG.info("HTTP status=[{}]", response.getStatus());
		LOG.info("HTTP clientstatus=[{}]", response.getClientResponseStatus());
		Iterator<List<String>> iterator = response.getHeaders().values().iterator();
		
		while(iterator.hasNext()){
			LOG.info("HTTP Header:[{}]", iterator.next());
		}
	}
}
