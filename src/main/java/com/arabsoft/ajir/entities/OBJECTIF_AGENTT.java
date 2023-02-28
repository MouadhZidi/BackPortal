package com.arabsoft.ajir.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
@Entity
@IdClass(IdObjectif_Agent.class)
public class OBJECTIF_AGENTT {
	
	@Id
	 private String cod_soc   ;  
	@Id
	 private String mat_pers ;    
	@Id
	  private Long annee  ;   
	@Id
	  private Long num_objectif  ;
	  private String lib_objectif ;
	  private String appreciation;  
	  private String comment_recom ;
		@Column(insertable = false, updatable = false)

	  private String app;
		
	public OBJECTIF_AGENTT(String cod_soc, String mat_pers, Long annee, Long num_objectif, String lib_objectif,
				String appreciation, String comment_recom, String app) {
			super();
			this.cod_soc = cod_soc;
			this.mat_pers = mat_pers;
			this.annee = annee;
			this.num_objectif = num_objectif;
			this.lib_objectif = lib_objectif;
			this.appreciation = appreciation;
			this.comment_recom = comment_recom;
			this.app = app;
		}
	public String getApp() {
			return app;
		}
		public void setApp(String app) {
			this.app = app;
		}
	public OBJECTIF_AGENTT() {
		super();
	}
	public OBJECTIF_AGENTT(String cod_soc, String mat_pers, Long annee, Long num_objectif, String lib_objectif,
			String appreciation, String comment_recom) {
		super();
		this.cod_soc = cod_soc;
		this.mat_pers = mat_pers;
		this.annee = annee;
		this.num_objectif = num_objectif;
		this.lib_objectif = lib_objectif;
		this.appreciation = appreciation;
		this.comment_recom = comment_recom;
	}
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
	public Long getNum_objectif() {
		return num_objectif;
	}
	public void setNum_objectif(Long num_objectif) {
		this.num_objectif = num_objectif;
	}
	public String getLib_objectif() {
		return lib_objectif;
	}
	public void setLib_objectif(String lib_objectif) {
		this.lib_objectif = lib_objectif;
	}
	public String getAppreciation() {
		return appreciation;
	}
	public void setAppreciation(String appreciation) {
		this.appreciation = appreciation;
	}
	public String getComment_recom() {
		return comment_recom;
	}
	public void setComment_recom(String comment_recom) {
		this.comment_recom = comment_recom;
	}
	  

}
