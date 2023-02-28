package com.arabsoft.ajir.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class TYP_ADM_TECH {
	@Id
	 private String adm_tech        ;
	 private String lib_adm_tech    ;
	 private String abrv_adm_tech   ;
	 private String lib_adm_tech_a  ;
	 private String  abrv_adm_tech_a ;
	 private String  typ_adm_tec    ;
	 private String  cod_grad       ;
	 private Long  h_derog        ;
	  private String  cod_cat         ;
	  private String  cod_categ       ;
	  private String cod_fil        ;
	  private String post_organique  ;
	  private String cod_post        ;
	  private String niveau         ;
	  private String droit_vehicul   ;
	public String getAdm_tech() {
		return adm_tech;
	}
	public void setAdm_tech(String adm_tech) {
		this.adm_tech = adm_tech;
	}
	public String getLib_adm_tech() {
		return lib_adm_tech;
	}
	public void setLib_adm_tech(String lib_adm_tech) {
		this.lib_adm_tech = lib_adm_tech;
	}
	public String getAbrv_adm_tech() {
		return abrv_adm_tech;
	}
	public void setAbrv_adm_tech(String abrv_adm_tech) {
		this.abrv_adm_tech = abrv_adm_tech;
	}
	public String getLib_adm_tech_a() {
		return lib_adm_tech_a;
	}
	public void setLib_adm_tech_a(String lib_adm_tech_a) {
		this.lib_adm_tech_a = lib_adm_tech_a;
	}
	public String getAbrv_adm_tech_a() {
		return abrv_adm_tech_a;
	}
	public void setAbrv_adm_tech_a(String abrv_adm_tech_a) {
		this.abrv_adm_tech_a = abrv_adm_tech_a;
	}
	public String getTyp_adm_tec() {
		return typ_adm_tec;
	}
	public void setTyp_adm_tec(String typ_adm_tec) {
		this.typ_adm_tec = typ_adm_tec;
	}
	public String getCod_grad() {
		return cod_grad;
	}
	public void setCod_grad(String cod_grad) {
		this.cod_grad = cod_grad;
	}
	public Long getH_derog() {
		return h_derog;
	}
	public void setH_derog(Long h_derog) {
		this.h_derog = h_derog;
	}
	public String getCod_cat() {
		return cod_cat;
	}
	public void setCod_cat(String cod_cat) {
		this.cod_cat = cod_cat;
	}
	public String getCod_categ() {
		return cod_categ;
	}
	public void setCod_categ(String cod_categ) {
		this.cod_categ = cod_categ;
	}
	public String getCod_fil() {
		return cod_fil;
	}
	public void setCod_fil(String cod_fil) {
		this.cod_fil = cod_fil;
	}
	public String getPost_organique() {
		return post_organique;
	}
	public void setPost_organique(String post_organique) {
		this.post_organique = post_organique;
	}
	public String getCod_post() {
		return cod_post;
	}
	public void setCod_post(String cod_post) {
		this.cod_post = cod_post;
	}
	public String getNiveau() {
		return niveau;
	}
	public void setNiveau(String niveau) {
		this.niveau = niveau;
	}
	public String getDroit_vehicul() {
		return droit_vehicul;
	}
	public void setDroit_vehicul(String droit_vehicul) {
		this.droit_vehicul = droit_vehicul;
	}
	public TYP_ADM_TECH() {
		super();
	}
	public TYP_ADM_TECH(String adm_tech, String lib_adm_tech, String abrv_adm_tech, String lib_adm_tech_a,
			String abrv_adm_tech_a, String typ_adm_tec, String cod_grad, Long h_derog, String cod_cat, String cod_categ,
			String cod_fil, String post_organique, String cod_post, String niveau, String droit_vehicul) {
		super();
		this.adm_tech = adm_tech;
		this.lib_adm_tech = lib_adm_tech;
		this.abrv_adm_tech = abrv_adm_tech;
		this.lib_adm_tech_a = lib_adm_tech_a;
		this.abrv_adm_tech_a = abrv_adm_tech_a;
		this.typ_adm_tec = typ_adm_tec;
		this.cod_grad = cod_grad;
		this.h_derog = h_derog;
		this.cod_cat = cod_cat;
		this.cod_categ = cod_categ;
		this.cod_fil = cod_fil;
		this.post_organique = post_organique;
		this.cod_post = cod_post;
		this.niveau = niveau;
		this.droit_vehicul = droit_vehicul;
	}

}
