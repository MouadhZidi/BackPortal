package com.arabsoft.ajir.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
public class POSS_SANCTION {
	
	@Id
	private Long num_sanc;
	
	private String cod_soc;
	private String mat_pers;
	private String cod_nat;
	private String  typ_sanc;
	private String n_doss;
	@JsonFormat(pattern = "dd/MM/yyyy")
	private Date dat_sais;
	@JsonFormat(pattern = "dd/MM/yyyy")
	private Date dat_sanc;
	@JsonFormat(pattern = "dd/MM/yyyy")
	private Date dat_effet;
	private String etat_sanc;
	@JsonFormat(pattern = "dd/MM/yyyy")
	private Date dat_debut;
	@JsonFormat(pattern = "dd/MM/yyyy")
	private Date dat_fin;
	@JsonFormat(pattern = "dd/MM/yyyy")
	private Date dat_retour;
	private Long nbr_jours;
	private String raison;
	private String num_decision;
	private String categ;
	private String cat;
	private String grad;
	private Long ech;
	private String adm_tech;
	private String fonct;
	private String qualf;
	private String serv;
	private Long num_adr;
	private String nvcateg;
	private String nvcat;
	private String nvgrad;
	private Long nvech;
	private String nvadm_tech;
	private String nvserv;
	private Long nvnum_adr;
	private String raison_a;
	private Long nbr_jours_ouv;
	private String aff;
	private String rais_sanc;
	private String cod_ur;
	private String ncod_ur;
	private String cod_class;
	private String ncod_class;
	@JsonFormat(pattern = "dd/MM/yyyy")
	private Date dat_decision;
	private Long arr_position;
	private Long duree_ret_ech;
	private Long niv_sal;
	private Long nniv_sal;
	private Long sanc_num_sanc;
	private Long id_poss_sanction;
	private String cod_user;
	@Column(insertable = false, updatable = false)

	private String lib;
	
	
	
	
	
	public POSS_SANCTION(Long num_sanc, String cod_soc, String mat_pers, String cod_nat, String typ_sanc, String n_doss,
			Date dat_sais, Date dat_sanc, Date dat_effet, String etat_sanc, Date dat_debut, Date dat_fin,
			Date dat_retour, Long nbr_jours, String raison, String num_decision, String categ, String cat, String grad,
			Long ech, String adm_tech, String fonct, String qualf, String serv, Long num_adr, String nvcateg,
			String nvcat, String nvgrad, Long nvech, String nvadm_tech, String nvserv, Long nvnum_adr, String raison_a,
			Long nbr_jours_ouv, String aff, String rais_sanc, String cod_ur, String ncod_ur, String cod_class,
			String ncod_class, Date dat_decision, Long arr_position, Long duree_ret_ech, Long niv_sal, Long nniv_sal,
			Long sanc_num_sanc, Long id_poss_sanction, String cod_user, String lib) {
		super();
		this.num_sanc = num_sanc;
		this.cod_soc = cod_soc;
		this.mat_pers = mat_pers;
		this.cod_nat = cod_nat;
		this.typ_sanc = typ_sanc;
		this.n_doss = n_doss;
		this.dat_sais = dat_sais;
		this.dat_sanc = dat_sanc;
		this.dat_effet = dat_effet;
		this.etat_sanc = etat_sanc;
		this.dat_debut = dat_debut;
		this.dat_fin = dat_fin;
		this.dat_retour = dat_retour;
		this.nbr_jours = nbr_jours;
		this.raison = raison;
		this.num_decision = num_decision;
		this.categ = categ;
		this.cat = cat;
		this.grad = grad;
		this.ech = ech;
		this.adm_tech = adm_tech;
		this.fonct = fonct;
		this.qualf = qualf;
		this.serv = serv;
		this.num_adr = num_adr;
		this.nvcateg = nvcateg;
		this.nvcat = nvcat;
		this.nvgrad = nvgrad;
		this.nvech = nvech;
		this.nvadm_tech = nvadm_tech;
		this.nvserv = nvserv;
		this.nvnum_adr = nvnum_adr;
		this.raison_a = raison_a;
		this.nbr_jours_ouv = nbr_jours_ouv;
		this.aff = aff;
		this.rais_sanc = rais_sanc;
		this.cod_ur = cod_ur;
		this.ncod_ur = ncod_ur;
		this.cod_class = cod_class;
		this.ncod_class = ncod_class;
		this.dat_decision = dat_decision;
		this.arr_position = arr_position;
		this.duree_ret_ech = duree_ret_ech;
		this.niv_sal = niv_sal;
		this.nniv_sal = nniv_sal;
		this.sanc_num_sanc = sanc_num_sanc;
		this.id_poss_sanction = id_poss_sanction;
		this.cod_user = cod_user;
		this.lib = lib;
	}
	public Long getNum_sanc() {
		return num_sanc;
	}
	public void setNum_sanc(Long num_sanc) {
		this.num_sanc = num_sanc;
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
	public String getCod_nat() {
		return cod_nat;
	}
	public void setCod_nat(String cod_nat) {
		this.cod_nat = cod_nat;
	}
	public String getTyp_sanc() {
		return typ_sanc;
	}
	public void setTyp_sanc(String typ_sanc) {
		this.typ_sanc = typ_sanc;
	}
	public String getN_doss() {
		return n_doss;
	}
	public void setN_doss(String n_doss) {
		this.n_doss = n_doss;
	}
	public Date getDat_sais() {
		return dat_sais;
	}
	public void setDat_sais(Date dat_sais) {
		this.dat_sais = dat_sais;
	}
	public Date getDat_sanc() {
		return dat_sanc;
	}
	public void setDat_sanc(Date dat_sanc) {
		this.dat_sanc = dat_sanc;
	}
	public Date getDat_effet() {
		return dat_effet;
	}
	public void setDat_effet(Date dat_effet) {
		this.dat_effet = dat_effet;
	}
	public String getEtat_sanc() {
		return etat_sanc;
	}
	public void setEtat_sanc(String etat_sanc) {
		this.etat_sanc = etat_sanc;
	}
	public Date getDat_debut() {
		return dat_debut;
	}
	public void setDat_debut(Date dat_debut) {
		this.dat_debut = dat_debut;
	}
	public Date getDat_fin() {
		return dat_fin;
	}
	public void setDat_fin(Date dat_fin) {
		this.dat_fin = dat_fin;
	}
	public Date getDat_retour() {
		return dat_retour;
	}
	public void setDat_retour(Date dat_retour) {
		this.dat_retour = dat_retour;
	}
	public Long getNbr_jours() {
		return nbr_jours;
	}
	public void setNbr_jours(Long nbr_jours) {
		this.nbr_jours = nbr_jours;
	}
	public String getRaison() {
		return raison;
	}
	public void setRaison(String raison) {
		this.raison = raison;
	}
	public String getNum_decision() {
		return num_decision;
	}
	public void setNum_decision(String num_decision) {
		this.num_decision = num_decision;
	}
	public String getCateg() {
		return categ;
	}
	public void setCateg(String categ) {
		this.categ = categ;
	}
	public String getCat() {
		return cat;
	}
	public void setCat(String cat) {
		this.cat = cat;
	}
	public String getGrad() {
		return grad;
	}
	public void setGrad(String grad) {
		this.grad = grad;
	}
	public Long getEch() {
		return ech;
	}
	public void setEch(Long ech) {
		this.ech = ech;
	}
	public String getAdm_tech() {
		return adm_tech;
	}
	public void setAdm_tech(String adm_tech) {
		this.adm_tech = adm_tech;
	}
	public String getFonct() {
		return fonct;
	}
	public void setFonct(String fonct) {
		this.fonct = fonct;
	}
	public String getQualf() {
		return qualf;
	}
	public void setQualf(String qualf) {
		this.qualf = qualf;
	}
	public String getServ() {
		return serv;
	}
	public void setServ(String serv) {
		this.serv = serv;
	}
	public Long getNum_adr() {
		return num_adr;
	}
	public void setNum_adr(Long num_adr) {
		this.num_adr = num_adr;
	}
	public String getNvcateg() {
		return nvcateg;
	}
	public void setNvcateg(String nvcateg) {
		this.nvcateg = nvcateg;
	}
	public String getNvcat() {
		return nvcat;
	}
	public void setNvcat(String nvcat) {
		this.nvcat = nvcat;
	}
	public String getNvgrad() {
		return nvgrad;
	}
	public void setNvgrad(String nvgrad) {
		this.nvgrad = nvgrad;
	}
	public Long getNvech() {
		return nvech;
	}
	public void setNvech(Long nvech) {
		this.nvech = nvech;
	}
	public String getNvadm_tech() {
		return nvadm_tech;
	}
	public void setNvadm_tech(String nvadm_tech) {
		this.nvadm_tech = nvadm_tech;
	}
	public String getNvserv() {
		return nvserv;
	}
	public void setNvserv(String nvserv) {
		this.nvserv = nvserv;
	}
	public Long getNvnum_adr() {
		return nvnum_adr;
	}
	public void setNvnum_adr(Long nvnum_adr) {
		this.nvnum_adr = nvnum_adr;
	}
	public String getRaison_a() {
		return raison_a;
	}
	public void setRaison_a(String raison_a) {
		this.raison_a = raison_a;
	}
	public Long getNbr_jours_ouv() {
		return nbr_jours_ouv;
	}
	public void setNbr_jours_ouv(Long nbr_jours_ouv) {
		this.nbr_jours_ouv = nbr_jours_ouv;
	}
	public String getAff() {
		return aff;
	}
	public void setAff(String aff) {
		this.aff = aff;
	}
	public String getRais_sanc() {
		return rais_sanc;
	}
	public void setRais_sanc(String rais_sanc) {
		this.rais_sanc = rais_sanc;
	}
	public String getCod_ur() {
		return cod_ur;
	}
	public void setCod_ur(String cod_ur) {
		this.cod_ur = cod_ur;
	}
	public String getNcod_ur() {
		return ncod_ur;
	}
	public void setNcod_ur(String ncod_ur) {
		this.ncod_ur = ncod_ur;
	}
	public String getCod_class() {
		return cod_class;
	}
	public void setCod_class(String cod_class) {
		this.cod_class = cod_class;
	}
	public String getNcod_class() {
		return ncod_class;
	}
	public void setNcod_class(String ncod_class) {
		this.ncod_class = ncod_class;
	}
	public Date getDat_decision() {
		return dat_decision;
	}
	public void setDat_decision(Date dat_decision) {
		this.dat_decision = dat_decision;
	}
	public Long getArr_position() {
		return arr_position;
	}
	public void setArr_position(Long arr_position) {
		this.arr_position = arr_position;
	}
	public Long getDuree_ret_ech() {
		return duree_ret_ech;
	}
	public void setDuree_ret_ech(Long duree_ret_ech) {
		this.duree_ret_ech = duree_ret_ech;
	}
	public Long getNiv_sal() {
		return niv_sal;
	}
	public void setNiv_sal(Long niv_sal) {
		this.niv_sal = niv_sal;
	}
	public Long getNniv_sal() {
		return nniv_sal;
	}
	public void setNniv_sal(Long nniv_sal) {
		this.nniv_sal = nniv_sal;
	}
	public Long getSanc_num_sanc() {
		return sanc_num_sanc;
	}
	public void setSanc_num_sanc(Long sanc_num_sanc) {
		this.sanc_num_sanc = sanc_num_sanc;
	}
	public Long getId_poss_sanction() {
		return id_poss_sanction;
	}
	public void setId_poss_sanction(Long id_poss_sanction) {
		this.id_poss_sanction = id_poss_sanction;
	}
	public String getCod_user() {
		return cod_user;
	}
	public void setCod_user(String cod_user) {
		this.cod_user = cod_user;
	}
	public String getLib() {
		return lib;
	}
	public void setLib(String lib) {
		this.lib = lib;
	}

	public POSS_SANCTION() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
