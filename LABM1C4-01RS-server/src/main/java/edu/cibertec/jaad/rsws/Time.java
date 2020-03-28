package edu.cibertec.jaad.rsws;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/time")
public interface Time {	
	@GET
	@Produces(MediaType.TEXT_PLAIN)	//Produces te envio ese dato
	String getTimeAsText();
	
	@GET
	@Produces(MediaType.TEXT_HTML)
	String gettimeAsHTML();
	
	@GET
	@Produces(MediaType.TEXT_XML)
	String gettiumeAsXML();
}
