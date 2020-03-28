package edu.cibertec.jaad.ws.jaxws;

import javax.xml.ws.Endpoint;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AlumnoPublisher {

	private static final Logger LOG = LoggerFactory.getLogger(AlumnoPublisher.class);
	
	public static void main(String[] args) {
		Endpoint.publish("http://localhost:9000/alumno", new BasicAlumnoService() );
		LOG.info("Servicio publicado!");
	}
}
