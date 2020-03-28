package edu.cibertec.jaad.rsws;

import java.net.URI;
import java.util.ArrayList;
import java.util.Collection;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

import edu.cibertec.jaad.rsws.bean.Programa;

@Path("/programa")
public class BasicProgramaService implements ProgramaService{
	
	private static Map<String, Programa> programas;
	static{
		programas = new HashMap<String, Programa>();
		programas.put("01", new Programa("01","Java Advance", 50.0, 
					new GregorianCalendar(2016,6,1).getTime(),
					new GregorianCalendar(2016,11,10).getTime()));
		programas.put("02", new Programa("02","Java Arquitect", 70.0, 
				new GregorianCalendar(2016,3,1).getTime(),
				new GregorianCalendar(2016,9,10).getTime()));
	}
	
	@Override
	public List<Programa> getProgramas() {		
		Collection<Programa> collProgramas = programas.values();
		List<Programa> listProgramas = new ArrayList<Programa>();
		for(Iterator<Programa> iterator = collProgramas.iterator();iterator.hasNext();){
			Programa programa = iterator.next();
			listProgramas.add(programa);
		}
		
		return listProgramas;
	}

	@Override
	public Response getprograma(String id) {
		Response.ResponseBuilder rb;
		Programa programa = programas.get(id);
		if(programa !=null){
			rb = Response.status(Response.Status.OK).entity(programa);				
		}else{
			rb = Response.status(Response.Status.NOT_FOUND);
		}
		return rb.build();
	}

	@Override
	public Response createPrograma(Programa programa) {
		programas.put(programa.getId(), programa);
		Response response = Response.created(URI.create(programa.getId())).build();
		return response;
	}

}
