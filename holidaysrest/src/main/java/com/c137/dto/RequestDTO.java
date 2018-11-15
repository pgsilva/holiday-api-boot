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

	@Override
	public String toString() {
		return "RequestDTO [sDateInit=" + sDateInit + ", sDateFinish=" + sDateFinish + ", dateInit=" + dateInit
				+ ", dateFinish=" + dateFinish + "]";
	}

	public RequestDTO(String sDateInit, String sDateFinish, Date dateInit, Date dateFinish) {
		super();
		this.sDateInit = sDateInit;
		this.sDateFinish = sDateFinish;
		this.dateInit = dateInit;
		this.dateFinish = dateFinish;
	}

	public RequestDTO() {
		super();
	}

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

}
