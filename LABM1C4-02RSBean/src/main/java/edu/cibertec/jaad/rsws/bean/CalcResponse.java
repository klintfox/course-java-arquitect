package edu.cibertec.jaad.rsws.bean;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class CalcResponse {
	private Integer result;

	public CalcResponse(){}
	public CalcResponse(Integer result) {
		super();
		this.result = result;
	}

	public Integer getResult() {
		return result;
	}

	public void setResult(Integer result) {
		this.result = result;
	}
	
}
