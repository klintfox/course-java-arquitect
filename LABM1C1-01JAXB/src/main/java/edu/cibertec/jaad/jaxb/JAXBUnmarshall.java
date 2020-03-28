package edu.cibertec.jaad.jaxb;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class JAXBUnmarshall {
	private static Logger LOG = LoggerFactory.getLogger(JAXBUnmarshall.class);
			
	public static void main(String[] args) {
		try {
			File profesorXML = new File("profesor.xml");
			JAXBContext context = JAXBContext.newInstance(Profesor.class);
			Unmarshaller unmarshaller = context.createUnmarshaller();
			Profesor profesor = (Profesor)unmarshaller.unmarshal(profesorXML);
			
			LOG.info("Datos del profesor:");
			LOG.info("Codigo		:"+ profesor.getCodigo());
			LOG.info("Nombre		:"+ profesor.getNombre());
			LOG.info("Apellido		:"+ profesor.getApellido());
			LOG.info("FechaIngreso	:"+ profesor.getFechaIngreso());
		} catch (Exception e) {
			LOG.error("Error al leer el archivo"+ e);
		}
	}
}