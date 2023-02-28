package com.arabsoft.ajir.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ETAT_PAIE {
	@Id
	private String cod_etat   ;
	private String lib_etat   ;
	private String  lib_etat_a ;
	public String getCod_etat() {
		return cod_etat;
	}
	public void setCod_etat(String cod_etat) {
		this.cod_etat = cod_etat;
	}
	public String getLib_etat() {
		return lib_etat;
	}
	public void setLib_etat(String lib_etat) {
		this.lib_etat = lib_etat;
	}
	public String getLib_etat_a() {
		return lib_etat_a;
	}
	public void setLib_etat_a(String lib_etat_a) {
		this.lib_etat_a = lib_etat_a;
	}
	public ETAT_PAIE() {
		super();
	}
	public ETAT_PAIE(String cod_etat, String lib_etat, String lib_etat_a) {
		super();
		this.cod_etat = cod_etat;
		this.lib_etat = lib_etat;
		this.lib_etat_a = lib_etat_a;
	}}
	
