package edu.cibertec.jaad.ws.jaxws;

import java.util.HashMap;
import java.util.Map;

import javax.jws.WebService;

import edu.cibertec.jaad.ws.bean.Alumno;

@WebService(endpointInterface="edu.cibertec.jaad.ws.jaxws.AlumnoService")
public class BasicAlumnoService implements AlumnoService {

	private static Map<String, Alumno> alumnos = new HashMap<String, Alumno>();
	
	static {
		alumnos.put("00000001", new Alumno("Manuel","Perez",25,"000000"));
		alumnos.put("00000001", new Alumno("Manuel","Perez",25,"000000"));

	}
	
	@Override
	public boolean registrar(Alumno alumno){
		boolean response = false;
		if(!alumnos.containsKey(alumno.getDni())){
			alumnos.put(alumno.getDni(), alumno);
		}
	return response;
	}
	
	@Override
	public Alumno consultar(String dni){
		return alumnos.get(dni);
	}
}
