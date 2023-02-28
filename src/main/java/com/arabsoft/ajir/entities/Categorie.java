package com.arabsoft.ajir.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;

@Entity
@IdClass(IDCategorie.class)
public class Categorie {
	@Id
	private String cod_categ;
	@Id
	private String cod_cat;
	private String lib_cat;
	private Long duree;
	private Long nbr_ech;
	private String typ_cat;
	private Long nbr_paie;
	private String abs_cng;
	private Long prime;
	private String note_rend;
	private Long cod_group;
	private String qualf;
	private Long plafond_grade;
	private String gr_comp;;
	private Long jour_demission;
	private Long quota_pbi;
	private Long quota_pbi_ag;
	private Long quota_ech;
	private Long var1_solution1;
	private Long var1_solution2;
	private Long variante2;
	private Long period_essai;
	private Long id_categorie;
	private String lib_cat_a;
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
	public String getLib_cat() {
		return lib_cat;
	}
	public void setLib_cat(String lib_cat) {
		this.lib_cat = lib_cat;
	}
	public Long getDuree() {
		return duree;
	}
	public void setDuree(Long duree) {
		this.duree = duree;
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
	public Long getNbr_paie() {
		return nbr_paie;
	}
	public void setNbr_paie(Long nbr_paie) {
		this.nbr_paie = nbr_paie;
	}
	public String getAbs_cng() {
		return abs_cng;
	}
	public void setAbs_cng(String abs_cng) {
		this.abs_cng = abs_cng;
	}
	public Long getPrime() {
		return prime;
	}
	public void setPrime(Long prime) {
		this.prime = prime;
	}
	public String getNote_rend() {
		return note_rend;
	}
	public void setNote_rend(String note_rend) {
		this.note_rend = note_rend;
	}
	public Long getCod_group() {
		return cod_group;
	}
	public void setCod_group(Long cod_group) {
		this.cod_group = cod_group;
	}
	public String getQualf() {
		return qualf;
	}
	public void setQualf(String qualf) {
		this.qualf = qualf;
	}
	public Long getPlafond_grade() {
		return plafond_grade;
	}
	public void setPlafond_grade(Long plafond_grade) {
		this.plafond_grade = plafond_grade;
	}
	public String getGr_comp() {
		return gr_comp;
	}
	public void setGr_comp(String gr_comp) {
		this.gr_comp = gr_comp;
	}
	public Long getJour_demission() {
		return jour_demission;
	}
	public void setJour_demission(Long jour_demission) {
		this.jour_demission = jour_demission;
	}
	public Long getQuota_pbi() {
		return quota_pbi;
	}
	public void setQuota_pbi(Long quota_pbi) {
		this.quota_pbi = quota_pbi;
	}
	public Long getQuota_pbi_ag() {
		return quota_pbi_ag;
	}
	public void setQuota_pbi_ag(Long quota_pbi_ag) {
		this.quota_pbi_ag = quota_pbi_ag;
	}
	public Long getQuota_ech() {
		return quota_ech;
	}
	public void setQuota_ech(Long quota_ech) {
		this.quota_ech = quota_ech;
	}
	public Long getVar1_solution1() {
		return var1_solution1;
	}
	public void setVar1_solution1(Long var1_solution1) {
		this.var1_solution1 = var1_solution1;
	}
	public Long getVar1_solution2() {
		return var1_solution2;
	}
	public void setVar1_solution2(Long var1_solution2) {
		this.var1_solution2 = var1_solution2;
	}
	public Long getVariante2() {
		return variante2;
	}
	public void setVariante2(Long variante2) {
		this.variante2 = variante2;
	}
	public Long getPeriod_essai() {
		return period_essai;
	}
	public void setPeriod_essai(Long period_essai) {
		this.period_essai = period_essai;
	}
	public Long getId_categorie() {
		return id_categorie;
	}
	public void setId_categorie(Long id_categorie) {
		this.id_categorie = id_categorie;
	}
	public String getLib_cat_a() {
		return lib_cat_a;
	}
	public void setLib_cat_a(String lib_cat_a) {
		this.lib_cat_a = lib_cat_a;
	}
	public Categorie() {
		super();
	}
	public Categorie(String cod_categ, String cod_cat, String lib_cat, Long duree, Long nbr_ech, String typ_cat,
			Long nbr_paie, String abs_cng, Long prime, String note_rend, Long cod_group, String qualf,
			Long plafond_grade, String gr_comp, Long jour_demission, Long quota_pbi, Long quota_pbi_ag, Long quota_ech,
			Long var1_solution1, Long var1_solution2, Long variante2, Long period_essai, Long id_categorie,
			String lib_cat_a) {
		super();
		this.cod_categ = cod_categ;
		this.cod_cat = cod_cat;
		this.lib_cat = lib_cat;
		this.duree = duree;
		this.nbr_ech = nbr_ech;
		this.typ_cat = typ_cat;
		this.nbr_paie = nbr_paie;
		this.abs_cng = abs_cng;
		this.prime = prime;
		this.note_rend = note_rend;
		this.cod_group = cod_group;
		this.qualf = qualf;
		this.plafond_grade = plafond_grade;
		this.gr_comp = gr_comp;
		this.jour_demission = jour_demission;
		this.quota_pbi = quota_pbi;
		this.quota_pbi_ag = quota_pbi_ag;
		this.quota_ech = quota_ech;
		this.var1_solution1 = var1_solution1;
		this.var1_solution2 = var1_solution2;
		this.variante2 = variante2;
		this.period_essai = period_essai;
		this.id_categorie = id_categorie;
		this.lib_cat_a = lib_cat_a;
	}

}
