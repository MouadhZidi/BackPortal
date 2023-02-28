package com.arabsoft.ajir.entities;

import java.io.Serializable;



public class IdObjectif_Agent implements Serializable {
	 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String cod_soc   ;    
	 private String mat_pers ;    
	  private Long annee  ;      
	  private Long num_objectif  ;
	public String getCod_soc() {
		return cod_soc;
	}
	public IdObjectif_Agent() {
		super();
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
	public Long getNum_objectif() {
		return num_objectif;
	}
	public void setNum_objectif(Long num_objectif) {
		this.num_objectif = num_objectif;
	}
	public IdObjectif_Agent(String cod_soc, String mat_pers, Long annee, Long num_objectif) {
		super();
		this.cod_soc = cod_soc;
		this.mat_pers = mat_pers;
		this.annee = annee;
		this.num_objectif = num_objectif;
	}
	  
	  
	  

}
