package com.arabsoft.ajir.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class METIER {
	@Id
	private String cod_metier   ;
	private String lib_metier   ;
	private String  lib_metier_a ;
	private String  descrip   ;
	private String  descrip_a    ;
	private String  cod_axe    ;
	public String getCod_metier() {
		return cod_metier;
	}
	public void setCod_metier(String cod_metier) {
		this.cod_metier = cod_metier;
	}
	public String getLib_metier() {
		return lib_metier;
	}
	public void setLib_metier(String lib_metier) {
		this.lib_metier = lib_metier;
	}
	public String getLib_metier_a() {
		return lib_metier_a;
	}
	public void setLib_metier_a(String lib_metier_a) {
		this.lib_metier_a = lib_metier_a;
	}
	public String getDescrip() {
		return descrip;
	}
	public void setDescrip(String descrip) {
		this.descrip = descrip;
	}
	public String getDescrip_a() {
		return descrip_a;
	}
	public void setDescrip_a(String descrip_a) {
		this.descrip_a = descrip_a;
	}
	public String getCod_axe() {
		return cod_axe;
	}
	public void setCod_axe(String cod_axe) {
		this.cod_axe = cod_axe;
	}
	public METIER() {
		super();
	}
	public METIER(String cod_metier, String lib_metier, String lib_metier_a, String descrip, String descrip_a,
			String cod_axe) {
		super();
		this.cod_metier = cod_metier;
		this.lib_metier = lib_metier;
		this.lib_metier_a = lib_metier_a;
		this.descrip = descrip;
		this.descrip_a = descrip_a;
		this.cod_axe = cod_axe;
	}
	
}
