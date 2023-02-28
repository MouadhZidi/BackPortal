package com.arabsoft.ajir.entities;

import java.io.Serializable;

public class IdGrade implements Serializable {
	 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	

	private String cod_categ   ;
	 private String cod_cat     ;
	 private String cod_grad   ;
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
	public String getCod_grad() {
		return cod_grad;
	}
	public void setCod_grad(String cod_grad) {
		this.cod_grad = cod_grad;
	}
	public IdGrade() {
		super();
	}
	public IdGrade(String cod_categ, String cod_cat, String cod_grad) {
		super();
		this.cod_categ = cod_categ;
		this.cod_cat = cod_cat;
		this.cod_grad = cod_grad;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
}
