package com.arabsoft.ajir.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class MOTIF_SORT {
	@Id
	 private String cod_motif ;
	 private String lib_motif    ;
	 private String salaire   ;
	 private String avancement    ;
	 private String conge      ;
	 private String type        ;
	 private String etat_act       ;
	 private Long incidence     ;
	 private String assurance      ;
	 private String incide_elect   ;
	 private String nature_motif   ;
	 private String avc_aid       ;
	 private String lib_motif_a    ;
	 private String  typ_impot      ;
	 private String  reserve       ;
	 private Long niv            ;
	 private String cod_mvt       ;
	 private String cod_m          ;
	 private String sexe           ;
	 private Long  del_dem_ret  ;
	 private String av_ap_dt_fin  ;
	 private String  dem_reprise    ;
	 private String cod_mvt_rep    ;
	 private String  cod_typ_depart ;
	 private String  accord_autorit ;
	 private String cod_alert      ;
	 private Long duree_instance ;
	 private Long  niv_prolong    ;
	 private Long  num_decision  ;
	public String getCod_motif() {
		return cod_motif;
	}
	public void setCod_motif(String cod_motif) {
		this.cod_motif = cod_motif;
	}
	public String getLib_motif() {
		return lib_motif;
	}
	public void setLib_motif(String lib_motif) {
		this.lib_motif = lib_motif;
	}
	public String getSalaire() {
		return salaire;
	}
	public void setSalaire(String salaire) {
		this.salaire = salaire;
	}
	public String getAvancement() {
		return avancement;
	}
	public void setAvancement(String avancement) {
		this.avancement = avancement;
	}
	public String getConge() {
		return conge;
	}
	public void setConge(String conge) {
		this.conge = conge;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getEtat_act() {
		return etat_act;
	}
	public void setEtat_act(String etat_act) {
		this.etat_act = etat_act;
	}
	public Long getIncidence() {
		return incidence;
	}
	public void setIncidence(Long incidence) {
		this.incidence = incidence;
	}
	public String getAssurance() {
		return assurance;
	}
	public void setAssurance(String assurance) {
		this.assurance = assurance;
	}
	public String getIncide_elect() {
		return incide_elect;
	}
	public void setIncide_elect(String incide_elect) {
		this.incide_elect = incide_elect;
	}
	public String getNature_motif() {
		return nature_motif;
	}
	public void setNature_motif(String nature_motif) {
		this.nature_motif = nature_motif;
	}
	public String getAvc_aid() {
		return avc_aid;
	}
	public void setAvc_aid(String avc_aid) {
		this.avc_aid = avc_aid;
	}
	public String getLib_motif_a() {
		return lib_motif_a;
	}
	public void setLib_motif_a(String lib_motif_a) {
		this.lib_motif_a = lib_motif_a;
	}
	public String getTyp_impot() {
		return typ_impot;
	}
	public void setTyp_impot(String typ_impot) {
		this.typ_impot = typ_impot;
	}
	public String getReserve() {
		return reserve;
	}
	public void setReserve(String reserve) {
		this.reserve = reserve;
	}
	public Long getNiv() {
		return niv;
	}
	public void setNiv(Long niv) {
		this.niv = niv;
	}
	public String getCod_mvt() {
		return cod_mvt;
	}
	public void setCod_mvt(String cod_mvt) {
		this.cod_mvt = cod_mvt;
	}
	public String getCod_m() {
		return cod_m;
	}
	public void setCod_m(String cod_m) {
		this.cod_m = cod_m;
	}
	public String getSexe() {
		return sexe;
	}
	public void setSexe(String sexe) {
		this.sexe = sexe;
	}
	public Long getDel_dem_ret() {
		return del_dem_ret;
	}
	public void setDel_dem_ret(Long del_dem_ret) {
		this.del_dem_ret = del_dem_ret;
	}
	public String getAv_ap_dt_fin() {
		return av_ap_dt_fin;
	}
	public void setAv_ap_dt_fin(String av_ap_dt_fin) {
		this.av_ap_dt_fin = av_ap_dt_fin;
	}
	public String getDem_reprise() {
		return dem_reprise;
	}
	public void setDem_reprise(String dem_reprise) {
		this.dem_reprise = dem_reprise;
	}
	public String getCod_mvt_rep() {
		return cod_mvt_rep;
	}
	public void setCod_mvt_rep(String cod_mvt_rep) {
		this.cod_mvt_rep = cod_mvt_rep;
	}
	public String getCod_typ_depart() {
		return cod_typ_depart;
	}
	public void setCod_typ_depart(String cod_typ_depart) {
		this.cod_typ_depart = cod_typ_depart;
	}
	public String getAccord_autorit() {
		return accord_autorit;
	}
	public void setAccord_autorit(String accord_autorit) {
		this.accord_autorit = accord_autorit;
	}
	public String getCod_alert() {
		return cod_alert;
	}
	public void setCod_alert(String cod_alert) {
		this.cod_alert = cod_alert;
	}
	public Long getDuree_instance() {
		return duree_instance;
	}
	public void setDuree_instance(Long duree_instance) {
		this.duree_instance = duree_instance;
	}
	public Long getNiv_prolong() {
		return niv_prolong;
	}
	public void setNiv_prolong(Long niv_prolong) {
		this.niv_prolong = niv_prolong;
	}
	public Long getNum_decision() {
		return num_decision;
	}
	public void setNum_decision(Long num_decision) {
		this.num_decision = num_decision;
	}
	public MOTIF_SORT() {
		super();
	}
	public MOTIF_SORT(String cod_motif, String lib_motif, String salaire, String avancement, String conge, String type,
			String etat_act, Long incidence, String assurance, String incide_elect, String nature_motif, String avc_aid,
			String lib_motif_a, String typ_impot, String reserve, Long niv, String cod_mvt, String cod_m, String sexe,
			Long del_dem_ret, String av_ap_dt_fin, String dem_reprise, String cod_mvt_rep, String cod_typ_depart,
			String accord_autorit, String cod_alert, Long duree_instance, Long niv_prolong, Long num_decision) {
		super();
		this.cod_motif = cod_motif;
		this.lib_motif = lib_motif;
		this.salaire = salaire;
		this.avancement = avancement;
		this.conge = conge;
		this.type = type;
		this.etat_act = etat_act;
		this.incidence = incidence;
		this.assurance = assurance;
		this.incide_elect = incide_elect;
		this.nature_motif = nature_motif;
		this.avc_aid = avc_aid;
		this.lib_motif_a = lib_motif_a;
		this.typ_impot = typ_impot;
		this.reserve = reserve;
		this.niv = niv;
		this.cod_mvt = cod_mvt;
		this.cod_m = cod_m;
		this.sexe = sexe;
		this.del_dem_ret = del_dem_ret;
		this.av_ap_dt_fin = av_ap_dt_fin;
		this.dem_reprise = dem_reprise;
		this.cod_mvt_rep = cod_mvt_rep;
		this.cod_typ_depart = cod_typ_depart;
		this.accord_autorit = accord_autorit;
		this.cod_alert = cod_alert;
		this.duree_instance = duree_instance;
		this.niv_prolong = niv_prolong;
		this.num_decision = num_decision;
	}

}
