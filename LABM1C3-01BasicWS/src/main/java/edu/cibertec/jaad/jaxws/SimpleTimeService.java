package edu.cibertec.jaad.jaxws;

import java.util.Date;

import javax.jws.WebService;
/**
 * SIB
 * @author Klinux
 *
 */
@WebService(endpointInterface="edu.cibertec.jaad.jaxws.TimeService")
public class SimpleTimeService implements TimeService {

	@Override
	public String getTimeAsString() {		
		return new Date().toString();
	}

	@Override
	public Long gettimeAsElapsed() {
		
		return new Date().getTime();
	}
	
}
