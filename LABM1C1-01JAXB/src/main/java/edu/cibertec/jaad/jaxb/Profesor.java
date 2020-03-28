package edu.cibertec.jaad.jaxb;

import java.util.Date;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name="elprofe", namespace="http//cibertec.edu.pe/jaxb/profesor")
@XmlType(propOrder={"fechaIngreso","codigo","apellido"})
//@XmlAccessorType(XmlAccessType.FIELD)
public class Profesor {

//	@XmlElement(name="code")
	private Integer codigo;	
	private String nombre;
	private String apellido;
	private Date FechaIngreso;
	
	@XmlElement(name="code")
	public Integer getCodigo() {
		return codigo;
	}
	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}
	@XmlAttribute 
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public Date getFechaIngreso() {
		return FechaIngreso;
	}
	public void setFechaIngreso(Date fechaIngreso) {
		FechaIngreso = fechaIngreso;
	}

}