package edu.cibertec.jaad.json;

import java.io.File;

import org.codehaus.jackson.map.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class JSONUnmarshall {
	private static final Logger LOG = LoggerFactory.getLogger(JSONUnmarshall.class);
	
	public static void main(String[] args) {
		ObjectMapper mapper = new ObjectMapper();
		try {
			File programaJson= new File("programa.json");
			Programa programa = mapper.readValue(programaJson, Programa.class);
			LOG.info("Datos del programa:");
			LOG.info("Codigo		:"+ programa.getCodigo());
			LOG.info("Nombre		:"+ programa.getNombre());
			LOG.info("FechaInicio	:"+ programa.getFechaInicio());
			LOG.info("FechaFin	:"+ programa.getFechaFin());
			LOG.info("Modulos	:"+ programa.getModulos());
		} catch (Exception e) {
			LOG.error("Error al leer el archivo"+e);
		}
	}
}
