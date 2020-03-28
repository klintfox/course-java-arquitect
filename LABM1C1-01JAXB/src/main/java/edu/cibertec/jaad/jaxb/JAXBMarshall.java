package edu.cibertec.jaad.jaxb;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.util.GregorianCalendar;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class JAXBMarshall {
	
	private static final Logger LOG = LoggerFactory.getLogger(JAXBMarshall.class);
	
	public static void main(String[] args) {
		Profesor profesor = new Profesor();
		profesor.setCodigo(9876);
		profesor.setNombre("Manuel");
		profesor.setApellido("Perez");
		profesor.setFechaIngreso(new GregorianCalendar(2016, 4, 2).getTime());
		
		try {
			File profesorXML = new File("profesor.xml");
			
			JAXBContext jaxbContext = JAXBContext.newInstance(Profesor.class);
			Marshaller marshaller = jaxbContext.createMarshaller(); 
			marshaller .setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			
			marshaller.marshal(profesor, profesorXML);
			ByteArrayOutputStream baos = new ByteArrayOutputStream();
			marshaller.marshal(profesor, baos);
			LOG.info("Salida:\n" + new String(baos.toByteArray()));
			
		} catch (Exception e) {
			LOG.error("Error al generar el archivo", e);
		}
	}
}