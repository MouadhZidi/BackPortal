package com.arabsoft.ajir.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class PRM_MILITAIRE {
	@Id
	  private String cod_mil ;  
	  private String lib_mil  ; 
	  private String lib_mil_a ;
	public String getCod_mil() {
		return cod_mil;
	}
	public void setCod_mil(String cod_mil) {
		this.cod_mil = cod_mil;
	}
	public String getLib_mil() {
		return lib_mil;
	}
	public void setLib_mil(String lib_mil) {
		this.lib_mil = lib_mil;
	}
	public String getLib_mil_a() {
		return lib_mil_a;
	}
	public void setLib_mil_a(String lib_mil_a) {
		this.lib_mil_a = lib_mil_a;
	}
	public PRM_MILITAIRE(String cod_mil, String lib_mil, String lib_mil_a) {
		super();
		this.cod_mil = cod_mil;
		this.lib_mil = lib_mil;
		this.lib_mil_a = lib_mil_a;
	}
	public PRM_MILITAIRE() {
		super();
	}
	  

}
