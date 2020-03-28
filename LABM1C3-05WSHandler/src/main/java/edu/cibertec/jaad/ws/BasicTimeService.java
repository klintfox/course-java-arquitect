package edu.cibertec.jaad.ws;

import java.util.Date;

import javax.jws.WebService;

@WebService(endpointInterface = "edu.cibertec.jaad.ws.TimeService")
public class BasicTimeService 
				implements TimeService{

	public String getTimeAsString() {
		return new Date().toString();
	}

	public long getTimeAsElapsed() {
		return new Date().getTime();
	}

}
