package edu.cibertec.jaad.ws.jaxws;

import javax.jws.HandlerChain;
import javax.jws.WebMethod;
import javax.jws.WebService;

import edu.cibertec.jaad.ws.bean.Alumno;

@WebService
@HandlerChain(file="handler-chain.xml")
public interface AlumnoService {
	@WebMethod
	 boolean registrar(Alumno alumno);
	@WebMethod
	Alumno consultar(String dni);
}
