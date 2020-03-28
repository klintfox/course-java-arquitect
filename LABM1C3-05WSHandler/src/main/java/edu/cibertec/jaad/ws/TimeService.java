package edu.cibertec.jaad.ws;

import javax.jws.HandlerChain;
import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;
import javax.jws.soap.SOAPBinding.Use;

@WebService
@SOAPBinding(style = Style.DOCUMENT, use = Use.LITERAL)
@HandlerChain(file="handler-chain.xml")//  /handler-chain.xml a partir de las clases
public interface TimeService {

    @WebMethod
    public String getTimeAsString();

    @WebMethod
    public long getTimeAsElapsed();
}
