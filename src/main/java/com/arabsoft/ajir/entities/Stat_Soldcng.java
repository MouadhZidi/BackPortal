package com.arabsoft.ajir.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Stat_Soldcng {
	private String cod_soc;
	private String  mat_pers;
	private String annee_cng;
	@Id

	private Long sold_cng;
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
	public String getAnnee_cng() {
		return annee_cng;
	}
	public void setAnnee_cng(String annee_cng) {
		this.annee_cng = annee_cng;
	}
	public Long getSold_cng() {
		return sold_cng;
	}
	public void setSold_cng(Long sold_cng) {
		this.sold_cng = sold_cng;
	}
	public Stat_Soldcng() {
		super();
	}
	public Stat_Soldcng(String cod_soc, String mat_pers, String annee_cng, Long sold_cng) {
		super();
		this.cod_soc = cod_soc;
		this.mat_pers = mat_pers;
		this.annee_cng = annee_cng;
		this.sold_cng = sold_cng;
	}
	
	
	
	


	

}
