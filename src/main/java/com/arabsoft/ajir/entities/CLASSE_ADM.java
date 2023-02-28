package com.arabsoft.ajir.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class CLASSE_ADM {
	
	 private String cod_class ;    
	 private String lib_class     ;
	 private String  lib_class_a   ;
	 @Id
	 private Long  jour_demission ;
	 private Long  cod_grad_deb  ;
	 private Long  cod_grad_fin  ;
	  private String cod_cat_class ;
	  private String  dhsup   ;
	private Long  duree_stage   ;
	private String  droit_astr     ;
	public String getCod_class() {
		return cod_class;
	}
	public void setCod_class(String cod_class) {
		this.cod_class = cod_class;
	}
	public String getLib_class() {
		return lib_class;
	}
	public void setLib_class(String lib_class) {
		this.lib_class = lib_class;
	}
	public String getLib_class_a() {
		return lib_class_a;
	}
	public void setLib_class_a(String lib_class_a) {
		this.lib_class_a = lib_class_a;
	}
	public Long getJour_demission() {
		return jour_demission;
	}
	public void setJour_demission(Long jour_demission) {
		this.jour_demission = jour_demission;
	}
	public Long getCod_grad_deb() {
		return cod_grad_deb;
	}
	public void setCod_grad_deb(Long cod_grad_deb) {
		this.cod_grad_deb = cod_grad_deb;
	}
	public Long getCod_grad_fin() {
		return cod_grad_fin;
	}
	public void setCod_grad_fin(Long cod_grad_fin) {
		this.cod_grad_fin = cod_grad_fin;
	}
	public String getCod_cat_class() {
		return cod_cat_class;
	}
	public void setCod_cat_class(String cod_cat_class) {
		this.cod_cat_class = cod_cat_class;
	}
	public String getDhsup() {
		return dhsup;
	}
	public void setDhsup(String dhsup) {
		this.dhsup = dhsup;
	}
	public Long getDuree_stage() {
		return duree_stage;
	}
	public void setDuree_stage(Long duree_stage) {
		this.duree_stage = duree_stage;
	}
	public String getDroit_astr() {
		return droit_astr;
	}
	public void setDroit_astr(String droit_astr) {
		this.droit_astr = droit_astr;
	}
	public CLASSE_ADM() {
		super();
	}
	public CLASSE_ADM(String cod_class, String lib_class, String lib_class_a, Long jour_demission, Long cod_grad_deb,
			Long cod_grad_fin, String cod_cat_class, String dhsup, Long duree_stage, String droit_astr) {
		super();
		this.cod_class = cod_class;
		this.lib_class = lib_class;
		this.lib_class_a = lib_class_a;
		this.jour_demission = jour_demission;
		this.cod_grad_deb = cod_grad_deb;
		this.cod_grad_fin = cod_grad_fin;
		this.cod_cat_class = cod_cat_class;
		this.dhsup = dhsup;
		this.duree_stage = duree_stage;
		this.droit_astr = droit_astr;
	}

}
