package edu.cibertec.jaad.rsws;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import edu.cibertec.jaad.rsws.bean.Programa;

public interface ProgramaService {
	
	@GET
	@Path("list")
	@Produces({MediaType.TEXT_XML, MediaType.APPLICATION_JSON})
	List<Programa> getProgramas();
	
	@GET
	@Path("/get/{id}")
	Response getprograma(@PathParam("id") String id);
	
	@POST
	@Path("/create")
	@Consumes(MediaType.TEXT_XML)
	Response createPrograma(Programa programa);
}
