package edu.cibertec.jaad.ws;

import javax.xml.ws.Endpoint;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TimeServicePublisher {
	private static final Logger LOG =
			LoggerFactory.getLogger(TimeServicePublisher.class);
	public static void main(String[] args) {
		
		Endpoint.publish("http://localhost:9876/timeService", 
				new BasicTimeService());
				
		LOG.info("Publish service");
		
	}
	
}
