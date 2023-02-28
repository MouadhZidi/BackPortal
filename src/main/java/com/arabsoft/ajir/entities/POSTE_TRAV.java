package com.arabsoft.ajir.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class POSTE_TRAV {
	 private String cod_metier  ;
	 @Id
	 private String cod_post     ;
	 private String  post_typ     ;
	 private String  lib_post      ;
	 private String  lib_post_a    ;
	 private String  abrv_post    ;
	 private String  abrv_post_a   ;
	 private String  descrip      ;
	 private String descrip_a     ;
	 private String  sect_activi   ;
	 private String  app_nnp       ;
	 private String dom_trav     ;
	 private String nature_post   ;
	 private String  sect_activi_a ;
	 private String app_nnp_a     ;
	 private String  dom_trav_a   ;
	 private String referentiel   ;
	 private String r_cod_metier  ;
	 private String r_cod_post   ;
	 private String cod_categ    ;
	 private String  cod_cat      ;
	 private String  cod_grad      ;
	 private String cod_fil      ;
	public String getCod_metier() {
		return cod_metier;
	}
	public void setCod_metier(String cod_metier) {
		this.cod_metier = cod_metier;
	}
	public String getCod_post() {
		return cod_post;
	}
	public void setCod_post(String cod_post) {
		this.cod_post = cod_post;
	}
	public String getPost_typ() {
		return post_typ;
	}
	public void setPost_typ(String post_typ) {
		this.post_typ = post_typ;
	}
	public String getLib_post() {
		return lib_post;
	}
	public void setLib_post(String lib_post) {
		this.lib_post = lib_post;
	}
	public String getLib_post_a() {
		return lib_post_a;
	}
	public void setLib_post_a(String lib_post_a) {
		this.lib_post_a = lib_post_a;
	}
	public String getAbrv_post() {
		return abrv_post;
	}
	public void setAbrv_post(String abrv_post) {
		this.abrv_post = abrv_post;
	}
	public String getAbrv_post_a() {
		return abrv_post_a;
	}
	public void setAbrv_post_a(String abrv_post_a) {
		this.abrv_post_a = abrv_post_a;
	}
	public String getDescrip() {
		return descrip;
	}
	public void setDescrip(String descrip) {
		this.descrip = descrip;
	}
	public String getDescrip_a() {
		return descrip_a;
	}
	public void setDescrip_a(String descrip_a) {
		this.descrip_a = descrip_a;
	}
	public String getSect_activi() {
		return sect_activi;
	}
	public void setSect_activi(String sect_activi) {
		this.sect_activi = sect_activi;
	}
	public String getApp_nnp() {
		return app_nnp;
	}
	public void setApp_nnp(String app_nnp) {
		this.app_nnp = app_nnp;
	}
	public String getDom_trav() {
		return dom_trav;
	}
	public void setDom_trav(String dom_trav) {
		this.dom_trav = dom_trav;
	}
	public String getNature_post() {
		return nature_post;
	}
	public void setNature_post(String nature_post) {
		this.nature_post = nature_post;
	}
	public String getSect_activi_a() {
		return sect_activi_a;
	}
	public void setSect_activi_a(String sect_activi_a) {
		this.sect_activi_a = sect_activi_a;
	}
	public String getApp_nnp_a() {
		return app_nnp_a;
	}
	public void setApp_nnp_a(String app_nnp_a) {
		this.app_nnp_a = app_nnp_a;
	}
	public String getDom_trav_a() {
		return dom_trav_a;
	}
	public void setDom_trav_a(String dom_trav_a) {
		this.dom_trav_a = dom_trav_a;
	}
	public String getReferentiel() {
		return referentiel;
	}
	public void setReferentiel(String referentiel) {
		this.referentiel = referentiel;
	}
	public String getR_cod_metier() {
		return r_cod_metier;
	}
	public void setR_cod_metier(String r_cod_metier) {
		this.r_cod_metier = r_cod_metier;
	}
	public String getR_cod_post() {
		return r_cod_post;
	}
	public void setR_cod_post(String r_cod_post) {
		this.r_cod_post = r_cod_post;
	}
	public String getCod_categ() {
		return cod_categ;
	}
	public void setCod_categ(String cod_categ) {
		this.cod_categ = cod_categ;
	}
	public String getCod_cat() {
		return cod_cat;
	}
	public void setCod_cat(String cod_cat) {
		this.cod_cat = cod_cat;
	}
	public String getCod_grad() {
		return cod_grad;
	}
	public void setCod_grad(String cod_grad) {
		this.cod_grad = cod_grad;
	}
	public String getCod_fil() {
		return cod_fil;
	}
	public void setCod_fil(String cod_fil) {
		this.cod_fil = cod_fil;
	}
	public POSTE_TRAV() {
		super();
	}
	public POSTE_TRAV(String cod_metier, String cod_post, String post_typ, String lib_post, String lib_post_a,
			String abrv_post, String abrv_post_a, String descrip, String descrip_a, String sect_activi, String app_nnp,
			String dom_trav, String nature_post, String sect_activi_a, String app_nnp_a, String dom_trav_a,
			String referentiel, String r_cod_metier, String r_cod_post, String cod_categ, String cod_cat,
			String cod_grad, String cod_fil) {
		super();
		this.cod_metier = cod_metier;
		this.cod_post = cod_post;
		this.post_typ = post_typ;
		this.lib_post = lib_post;
		this.lib_post_a = lib_post_a;
		this.abrv_post = abrv_post;
		this.abrv_post_a = abrv_post_a;
		this.descrip = descrip;
		this.descrip_a = descrip_a;
		this.sect_activi = sect_activi;
		this.app_nnp = app_nnp;
		this.dom_trav = dom_trav;
		this.nature_post = nature_post;
		this.sect_activi_a = sect_activi_a;
		this.app_nnp_a = app_nnp_a;
		this.dom_trav_a = dom_trav_a;
		this.referentiel = referentiel;
		this.r_cod_metier = r_cod_metier;
		this.r_cod_post = r_cod_post;
		this.cod_categ = cod_categ;
		this.cod_cat = cod_cat;
		this.cod_grad = cod_grad;
		this.cod_fil = cod_fil;
	}

}
