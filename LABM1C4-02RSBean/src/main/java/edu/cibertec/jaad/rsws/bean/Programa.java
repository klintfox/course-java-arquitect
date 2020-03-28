package edu.cibertec.jaad.rsws.bean;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Programa {

	private String id;
	private String nombre;
	private Double duracion;
	private Date fechaInicio;
	private Date fechfin;
	
	public Programa(){
		
	}
	
	public Programa(String id, String nombre, Double duracion, Date fechaInicio, Date fechfin) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.duracion = duracion;
		this.fechaInicio = fechaInicio;
		this.fechfin = fechfin;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Double getDuracion() {
		return duracion;
	}
	public void setDuracion(Double duracion) {
		this.duracion = duracion;
	}
	public Date getFechaInicio() {
		return fechaInicio;
	}
	public void setFechaInicio(Date fechaInicio) {
		this.fechaInicio = fechaInicio;
	}
	public Date getFechfin() {
		return fechfin;
	}
	public void setFechfin(Date fechfin) {
		this.fechfin = fechfin;
	}
		
}
