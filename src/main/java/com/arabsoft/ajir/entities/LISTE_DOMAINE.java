package com.arabsoft.ajir.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class LISTE_DOMAINE {
	@Id
	 private String code_domaine  ;
	private String  lib_domaine  ; 
	private String   lib_domaine_a ;
	public String getCode_domaine() {
		return code_domaine;
	}
	public void setCode_domaine(String code_domaine) {
		this.code_domaine = code_domaine;
	}
	public String getLib_domaine() {
		return lib_domaine;
	}
	public void setLib_domaine(String lib_domaine) {
		this.lib_domaine = lib_domaine;
	}
	public String getLib_domaine_a() {
		return lib_domaine_a;
	}
	public void setLib_domaine_a(String lib_domaine_a) {
		this.lib_domaine_a = lib_domaine_a;
	}
	public LISTE_DOMAINE(String code_domaine, String lib_domaine, String lib_domaine_a) {
		super();
		this.code_domaine = code_domaine;
		this.lib_domaine = lib_domaine;
		this.lib_domaine_a = lib_domaine_a;
	}
	public LISTE_DOMAINE() {
		super();
	}
	

}
