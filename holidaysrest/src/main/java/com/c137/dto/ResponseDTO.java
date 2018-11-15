package com.c137.dto;

import java.io.Serializable;

public class ResponseDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6885160011235115419L;

	private Integer ttUteis;
	private Integer ttCorridos;
	private Integer ttSabados;
	private Integer ttDomingos;
	private Integer ttFeriados;
	private String errorMsg;
	private Boolean hasError;

	public Integer getTtUteis() {
		return ttUteis;
	}

	public void setTtUteis(Integer ttUteis) {
		this.ttUteis = ttUteis;
	}

	public Integer getTtCorridos() {
		return ttCorridos;
	}

	public void setTtCorridos(Integer ttCorridos) {
		this.ttCorridos = ttCorridos;
	}

	public Integer getTtSabados() {
		return ttSabados;
	}

	public void setTtSabados(Integer ttSabados) {
		this.ttSabados = ttSabados;
	}

	public Integer getTtDomingos() {
		return ttDomingos;
	}

	public void setTtDomingos(Integer ttDomingos) {
		this.ttDomingos = ttDomingos;
	}

	public Integer getTtFeriados() {
		return ttFeriados;
	}

	public void setTtFeriados(Integer ttFeriados) {
		this.ttFeriados = ttFeriados;
	}

	public String getErrorMsg() {
		return errorMsg;
	}

	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}

	public Boolean getHasError() {
		return hasError;
	}

	public void setHasError(Boolean hasError) {
		this.hasError = hasError;
	}

}
