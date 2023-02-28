package com.arabsoft.ajir.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class CATEG {
	@Id
	 private String cod_categ       ;
	 private String lib_categ     ;
	 private Long nbr_ech        ;
	  private String typ_cat        ;
	  private String  lib_categ_a    ;
	  private Long duree          ;
	  private String cod_grad_min   ;
	  private String cod_grad_max   ;
	  private String categ_cod_categ ;
	  private String cod_fil        ;
	  private String regime_trav     ;
	  private String regime_heur     ;
	 private Long vpi             ;
	public String getCod_categ() {
		return cod_categ;
	}
	public void setCod_categ(String cod_categ) {
		this.cod_categ = cod_categ;
	}
	public String getLib_categ() {
		return lib_categ;
	}
	public void setLib_categ(String lib_categ) {
		this.lib_categ = lib_categ;
	}
	public Long getNbr_ech() {
		return nbr_ech;
	}
	public void setNbr_ech(Long nbr_ech) {
		this.nbr_ech = nbr_ech;
	}
	public String getTyp_cat() {
		return typ_cat;
	}
	public void setTyp_cat(String typ_cat) {
		this.typ_cat = typ_cat;
	}
	public String getLib_categ_a() {
		return lib_categ_a;
	}
	public void setLib_categ_a(String lib_categ_a) {
		this.lib_categ_a = lib_categ_a;
	}
	public Long getDuree() {
		return duree;
	}
	public void setDuree(Long duree) {
		this.duree = duree;
	}
	public String getCod_grad_min() {
		return cod_grad_min;
	}
	public void setCod_grad_min(String cod_grad_min) {
		this.cod_grad_min = cod_grad_min;
	}
	public String getCod_grad_max() {
		return cod_grad_max;
	}
	public void setCod_grad_max(String cod_grad_max) {
		this.cod_grad_max = cod_grad_max;
	}
	public String getCateg_cod_categ() {
		return categ_cod_categ;
	}
	public void setCateg_cod_categ(String categ_cod_categ) {
		this.categ_cod_categ = categ_cod_categ;
	}
	public String getCod_fil() {
		return cod_fil;
	}
	public void setCod_fil(String cod_fil) {
		this.cod_fil = cod_fil;
	}
	public String getRegime_trav() {
		return regime_trav;
	}
	public void setRegime_trav(String regime_trav) {
		this.regime_trav = regime_trav;
	}
	public String getRegime_heur() {
		return regime_heur;
	}
	public void setRegime_heur(String regime_heur) {
		this.regime_heur = regime_heur;
	}
	public Long getVpi() {
		return vpi;
	}
	public void setVpi(Long vpi) {
		this.vpi = vpi;
	}
	public CATEG(String cod_categ, String lib_categ, Long nbr_ech, String typ_cat, String lib_categ_a, Long duree,
			String cod_grad_min, String cod_grad_max, String categ_cod_categ, String cod_fil, String regime_trav,
			String regime_heur, Long vpi) {
		super();
		this.cod_categ = cod_categ;
		this.lib_categ = lib_categ;
		this.nbr_ech = nbr_ech;
		this.typ_cat = typ_cat;
		this.lib_categ_a = lib_categ_a;
		this.duree = duree;
		this.cod_grad_min = cod_grad_min;
		this.cod_grad_max = cod_grad_max;
		this.categ_cod_categ = categ_cod_categ;
		this.cod_fil = cod_fil;
		this.regime_trav = regime_trav;
		this.regime_heur = regime_heur;
		this.vpi = vpi;
	}
	public CATEG() {
		super();
	}
	 
	
	

}
