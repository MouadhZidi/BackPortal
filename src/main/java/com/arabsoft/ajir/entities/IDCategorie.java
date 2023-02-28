package com.arabsoft.ajir.entities;

import java.io.Serializable;

public class IDCategorie implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String cod_categ;
	private String cod_cat;
	public String getCod_categ() {
		return cod_categ;
	}
	public void setCod_categ(String cod_categ) {
		this.cod_categ = cod_categ;
	}
	public String getCod_cat() {
		return cod_cat;
	}
	public void setCod_cat(String cod_cat) {
		this.cod_cat = cod_cat;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public IDCategorie() {
		super();
	}
	public IDCategorie(String cod_categ, String cod_cat) {
		super();
		this.cod_categ = cod_categ;
		this.cod_cat = cod_cat;
	}
	

}
