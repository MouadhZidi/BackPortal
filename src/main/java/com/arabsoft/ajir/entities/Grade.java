package com.arabsoft.ajir.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;

@Entity
@IdClass(IdGrade.class)
public class Grade {
	@Id
	 private String cod_categ   ;
	@Id
	 private String cod_cat     ;
	@Id
	 private String cod_grad   ;
	 private String lib_grad  ;
	 private String abrv_grad1  ;
	 private String  abrv_grad2 ;
	 private Long  duree   ;
	  private Long nbr_ech ;
	  private String cod_cat_elect  ;
	  private String note ;
	  private Long cod_group   ;
	  private String cod_cat_rs ;
	  private String cat_resultat_rs ;
	  private String lib_grad_a    ;
	  private Long  mnt_comp ;
	  private String  cod_soc ;
	  private String  typ_cat ;
	  private Long  id_grade        ;
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
	public String getLib_grad() {
		return lib_grad;
	}
	public void setLib_grad(String lib_grad) {
		this.lib_grad = lib_grad;
	}
	public String getAbrv_grad1() {
		return abrv_grad1;
	}
	public void setAbrv_grad1(String abrv_grad1) {
		this.abrv_grad1 = abrv_grad1;
	}
	public String getAbrv_grad2() {
		return abrv_grad2;
	}
	public void setAbrv_grad2(String abrv_grad2) {
		this.abrv_grad2 = abrv_grad2;
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
	public String getCod_cat_elect() {
		return cod_cat_elect;
	}
	public void setCod_cat_elect(String cod_cat_elect) {
		this.cod_cat_elect = cod_cat_elect;
	}
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
	public Long getCod_group() {
		return cod_group;
	}
	public void setCod_group(Long cod_group) {
		this.cod_group = cod_group;
	}
	public String getCod_cat_rs() {
		return cod_cat_rs;
	}
	public void setCod_cat_rs(String cod_cat_rs) {
		this.cod_cat_rs = cod_cat_rs;
	}
	public String getCat_resultat_rs() {
		return cat_resultat_rs;
	}
	public void setCat_resultat_rs(String cat_resultat_rs) {
		this.cat_resultat_rs = cat_resultat_rs;
	}
	public String getLib_grad_a() {
		return lib_grad_a;
	}
	public void setLib_grad_a(String lib_grad_a) {
		this.lib_grad_a = lib_grad_a;
	}
	public Long getMnt_comp() {
		return mnt_comp;
	}
	public void setMnt_comp(Long mnt_comp) {
		this.mnt_comp = mnt_comp;
	}
	public String getCod_soc() {
		return cod_soc;
	}
	public void setCod_soc(String cod_soc) {
		this.cod_soc = cod_soc;
	}
	public String getTyp_cat() {
		return typ_cat;
	}
	public void setTyp_cat(String typ_cat) {
		this.typ_cat = typ_cat;
	}
	public Long getId_grade() {
		return id_grade;
	}
	public void setId_grade(Long id_grade) {
		this.id_grade = id_grade;
	}
	public Grade() {
		super();
	}
	public Grade(String cod_categ, String cod_cat, String cod_grad, String lib_grad, String abrv_grad1,
			String abrv_grad2, Long duree, Long nbr_ech, String cod_cat_elect, String note, Long cod_group,
			String cod_cat_rs, String cat_resultat_rs, String lib_grad_a, Long mnt_comp, String cod_soc, String typ_cat,
			Long id_grade) {
		super();
		this.cod_categ = cod_categ;
		this.cod_cat = cod_cat;
		this.cod_grad = cod_grad;
		this.lib_grad = lib_grad;
		this.abrv_grad1 = abrv_grad1;
		this.abrv_grad2 = abrv_grad2;
		this.duree = duree;
		this.nbr_ech = nbr_ech;
		this.cod_cat_elect = cod_cat_elect;
		this.note = note;
		this.cod_group = cod_group;
		this.cod_cat_rs = cod_cat_rs;
		this.cat_resultat_rs = cat_resultat_rs;
		this.lib_grad_a = lib_grad_a;
		this.mnt_comp = mnt_comp;
		this.cod_soc = cod_soc;
		this.typ_cat = typ_cat;
		this.id_grade = id_grade;
	}
	  

}
