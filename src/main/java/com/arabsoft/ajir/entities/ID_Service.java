package com.arabsoft.ajir.entities;

import java.io.Serializable;

public class ID_Service implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String cod_soc;
	private String cod_serv;
	public String getCod_soc() {
		return cod_soc;
	}
	public void setCod_soc(String cod_soc) {
		this.cod_soc = cod_soc;
	}
	public String getCod_serv() {
		return cod_serv;
	}
	public void setCod_serv(String cod_serv) {
		this.cod_serv = cod_serv;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public ID_Service(String cod_soc, String cod_serv) {
		super();
		this.cod_soc = cod_soc;
		this.cod_serv = cod_serv;
	}
	public ID_Service() {
		super();
	}

}
