package edu.cibertec.jaad.rsws.server;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.sun.jersey.simple.container.SimpleServerFactory;

public class ProgramaServer {

	private static final Logger LOG = LoggerFactory.getLogger(ProgramaServer.class);
	public static void main(String[] args) {
		try {
			SimpleServerFactory.create("http://localhost:9090");
			LOG.info("Servidor inciado");
		} catch (Exception e) {
			LOG.error("Error al arrancar el servicor", e);
		}
	}
}