package edu.cibertec.jaad.ws.jaxws;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BasicAlumnoServiceClient {
	private static final Logger LOG = LoggerFactory.getLogger(BasicAlumnoServiceClient.class);
	public static void main(String[] args) {
		BasicAlumnoServiceService service = new BasicAlumnoServiceService();
		AlumnoService port = service.getPort(AlumnoService.class);
		LOG.info("Response=[{}]", port.consultar("00000001"));
	}

}
