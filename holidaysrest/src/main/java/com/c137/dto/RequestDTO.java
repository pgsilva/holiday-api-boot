package com.c137.dto;

import java.io.Serializable;

public class RequestDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2796987353333740144L;
	private String sDateInit;
	private String sDateFinish;
	private Integer diasSeguidos;
	
	public String getsDateInit() {
		return sDateInit;
	}
	public void setsDateInit(String sDateInit) {
		this.sDateInit = sDateInit;
	}
	public String getsDateFinish() {
		return sDateFinish;
	}
	public void setsDateFinish(String sDateFinish) {
		this.sDateFinish = sDateFinish;
	}
	public Integer getDiasSeguidos() {
		return diasSeguidos;
	}
	public void setDiasSeguidos(Integer diasSeguidos) {
		this.diasSeguidos = diasSeguidos;
	}
	
	
}
