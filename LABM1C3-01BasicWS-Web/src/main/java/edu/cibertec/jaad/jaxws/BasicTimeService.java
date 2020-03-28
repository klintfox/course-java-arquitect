package edu.cibertec.jaad.jaxws;

import java.util.Date;

import javax.jws.WebService;

@WebService(endpointInterface="edu.cibertec.jaad.jaxws.TimeService")
public class BasicTimeService implements TimeService{

	@Override
	public String getTimeAsString() {
		return new Date().toString();
	}

	@Override
	public Long getTimeAsElapsed() {
		return new Date().getTime();
	}
	
}
