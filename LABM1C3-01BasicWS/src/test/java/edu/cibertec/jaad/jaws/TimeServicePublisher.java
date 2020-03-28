package edu.cibertec.jaad.jaws;

import javax.xml.ws.Endpoint;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import edu.cibertec.jaad.jaxws.SimpleTimeService;

public class TimeServicePublisher {
	private static final Logger LOG = LoggerFactory.getLogger(TimeServicePublisher.class);
	
	public static void main(String[] args) {
		//Servicio: ttp://localhost:8080/timeservice
		//WSDL : http://localhost:8080/timeservice?wsdl
		Endpoint.publish("http://localhost:8080/timeservice", new SimpleTimeService());
		
		LOG.info("Servicio desplegando...");
	}
}
