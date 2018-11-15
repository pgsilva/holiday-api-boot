package com.c137.dto;

import java.io.Serializable;
import java.sql.Date;

public class RequestDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2796987353333740144L;
	private String sDateInit;
	private String sDateFinish;
	private Date dateInit;
	private Date dateFinish;
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
	public Date getDateInit() {
		return dateInit;
	}
	public void setDateInit(Date dateInit) {
		this.dateInit = dateInit;
	}
	public Date getDateFinish() {
		return dateFinish;
	}
	public void setDateFinish(Date dateFinish) {
		this.dateFinish = dateFinish;
	}
	public Integer getDiasSeguidos() {
		return diasSeguidos;
	}
	public void setDiasSeguidos(Integer diasSeguidos) {
		this.diasSeguidos = diasSeguidos;
	}
	
	
}
