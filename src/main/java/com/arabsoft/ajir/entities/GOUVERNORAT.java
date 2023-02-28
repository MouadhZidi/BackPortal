package com.arabsoft.ajir.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class GOUVERNORAT {
	@Id
	private String cod_gouv   ;
	private String  lib_gouv   ;
	private String lib_gouv_a ;
	public String getCod_gouv() {
		return cod_gouv;
	}
	public void setCod_gouv(String cod_gouv) {
		this.cod_gouv = cod_gouv;
	}
	public String getLib_gouv() {
		return lib_gouv;
	}
	public void setLib_gouv(String lib_gouv) {
		this.lib_gouv = lib_gouv;
	}
	public String getLib_gouv_a() {
		return lib_gouv_a;
	}
	public void setLib_gouv_a(String lib_gouv_a) {
		this.lib_gouv_a = lib_gouv_a;
	}
	public GOUVERNORAT(String cod_gouv, String lib_gouv, String lib_gouv_a) {
		super();
		this.cod_gouv = cod_gouv;
		this.lib_gouv = lib_gouv;
		this.lib_gouv_a = lib_gouv_a;
	}
	public GOUVERNORAT() {
		super();
	}

}
