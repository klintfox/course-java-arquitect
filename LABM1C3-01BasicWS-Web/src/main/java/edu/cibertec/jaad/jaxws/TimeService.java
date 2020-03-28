package edu.cibertec.jaad.jaxws;

import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;

@WebService(wsdlLocation="timeService.wsdl")
public interface TimeService {
	@WebMethod(operationName="timeStr")
	@WebResult(name="timeResponse", partName="partTimeResponse")
	String getTimeAsString();
	
	@WebMethod
	Long getTimeAsElapsed();
}
