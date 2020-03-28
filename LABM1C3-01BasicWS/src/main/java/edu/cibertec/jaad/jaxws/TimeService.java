package edu.cibertec.jaad.jaxws;

import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;

@WebService
public interface TimeService {
	
	@WebMethod(operationName="timeAsString")//nombre
	@WebResult(name="timeReponse", partName="partimeResponse") //
	String getTimeAsString();
	
	@WebMethod(operationName="timeAsElapsed")
	Long gettimeAsElapsed();
}