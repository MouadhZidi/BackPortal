package com.arabsoft.ajir.entities;

import java.io.Serializable;

public class Pk_Evaluation_Definiif implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String cod_soc ;      
	private String mat_pers   ;   
	private Long annee  ;
	public String getCod_soc() {
		return cod_soc;
	}
	public void setCod_soc(String cod_soc) {
		this.cod_soc = cod_soc;
	}
	public String getMat_pers() {
		return mat_pers;
	}
	public void setMat_pers(String mat_pers) {
		this.mat_pers = mat_pers;
	}
	public Long getAnnee() {
		return annee;
	}
	public void setAnnee(Long annee) {
		this.annee = annee;
	}
	public Pk_Evaluation_Definiif() {
		super();
	}
	public Pk_Evaluation_Definiif(String cod_soc, String mat_pers, Long annee) {
		super();
		this.cod_soc = cod_soc;
		this.mat_pers = mat_pers;
		this.annee = annee;
	}  
	

}
