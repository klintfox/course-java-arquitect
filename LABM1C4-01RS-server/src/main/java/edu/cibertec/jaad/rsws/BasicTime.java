package edu.cibertec.jaad.rsws;

import java.util.Date;

import javax.ws.rs.Path;

@Path("/time")
public class BasicTime implements Time{

	@Override
	public String getTimeAsText() {		
		return new Date().toString();
	}

	@Override
	public String gettimeAsHTML() {		
		String result ="<!DOCTYPE HTML>"
				+"<html>"
				+"<body><h1>" + new Date().toString()
				+"</h1></body>"
				+"</html>";
		return result;
	}

	@Override
	public String gettiumeAsXML() {
		String result = "<?xml version=\"1.0\"?>"
				+"<time>"+ new Date().toString() + "</time>";
		return result;
	}

}
