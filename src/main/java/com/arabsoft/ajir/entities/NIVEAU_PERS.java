package com.arabsoft.ajir.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;

import com.fasterxml.jackson.annotation.JsonFormat;
@Entity
@IdClass(ID_Nivau_Pers.class)
public class NIVEAU_PERS {
	@Id
	private String cod_soc ;  
	@Id
	private String mat_pers  ;  
	@Id
	 private Long  num_niveau     ;
	  private String  cod_niveau  ;   
	  private String  code_domaine   ;
	  private String code_option  ;  
	  private String  observation  ;  
	  private String  cod_etab   ;    
	  private String  niveau_ent  ;
		@JsonFormat( pattern = "dd/MM/yyyy") 

	  private Date  date_niveau  ;
		@JsonFormat( pattern = "dd/MM/yyyy") 

	  private Date date_fin ;
		@JsonFormat( pattern = "dd/MM/yyyy") 

	  private Date date_deb ;
	  private Long id_niveau_pers ;
	  private String  cod_user    ;
	public NIVEAU_PERS() {
		super();
		// TODO Auto-generated constructor stub
	}
	public NIVEAU_PERS(String cod_soc, String mat_pers, Long num_niveau, String cod_niveau, String code_domaine,
			String code_option, String observation, String cod_etab, String niveau_ent, Date date_niveau, Date date_fin,
			Date date_deb, Long id_niveau_pers, String cod_user) {
		super();
		this.cod_soc = cod_soc;
		this.mat_pers = mat_pers;
		this.num_niveau = num_niveau;
		this.cod_niveau = cod_niveau;
		this.code_domaine = code_domaine;
		this.code_option = code_option;
		this.observation = observation;
		this.cod_etab = cod_etab;
		this.niveau_ent = niveau_ent;
		this.date_niveau = date_niveau;
		this.date_fin = date_fin;
		this.date_deb = date_deb;
		this.id_niveau_pers = id_niveau_pers;
		this.cod_user = cod_user;
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
	public Long getNum_niveau() {
		return num_niveau;
	}
	public void setNum_niveau(Long num_niveau) {
		this.num_niveau = num_niveau;
	}
	public String getCod_niveau() {
		return cod_niveau;
	}
	public void setCod_niveau(String cod_niveau) {
		this.cod_niveau = cod_niveau;
	}
	public String getCode_domaine() {
		return code_domaine;
	}
	public void setCode_domaine(String code_domaine) {
		this.code_domaine = code_domaine;
	}
	public String getCode_option() {
		return code_option;
	}
	public void setCode_option(String code_option) {
		this.code_option = code_option;
	}
	public String getObservation() {
		return observation;
	}
	public void setObservation(String observation) {
		this.observation = observation;
	}
	public String getCod_etab() {
		return cod_etab;
	}
	public void setCod_etab(String cod_etab) {
		this.cod_etab = cod_etab;
	}
	public String getNiveau_ent() {
		return niveau_ent;
	}
	public void setNiveau_ent(String niveau_ent) {
		this.niveau_ent = niveau_ent;
	}
	public Date getDate_niveau() {
		return date_niveau;
	}
	public void setDate_niveau(Date date_niveau) {
		this.date_niveau = date_niveau;
	}
	public Date getDate_fin() {
		return date_fin;
	}
	public void setDate_fin(Date date_fin) {
		this.date_fin = date_fin;
	}
	public Date getDate_deb() {
		return date_deb;
	}
	public void setDate_deb(Date date_deb) {
		this.date_deb = date_deb;
	}
	public Long getId_niveau_pers() {
		return id_niveau_pers;
	}
	public void setId_niveau_pers(Long id_niveau_pers) {
		this.id_niveau_pers = id_niveau_pers;
	}
	public String getCod_user() {
		return cod_user;
	}
	public void setCod_user(String cod_user) {
		this.cod_user = cod_user;
	}

	 
	  
	}
