package com.arabsoft.ajir.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
public class PARAM_ORGANISMES {

	
	private String cod_org;
	
	private String  nat_org ;
	private String reserve ;
	private String  fax_org ;
	private String  lib_org ;
	private String  typ_org ;
	private String  agree_org ;
	private String  adr_org   ;
	private String  ident_fsc  ;
	private String  cod_post  ;
	private String tel_org  ;
	private String  email_org  ;
	private String  num_agr ;
	@JsonFormat( pattern = "dd/MM/yyyy")
	private Date  dat_agr   ;
	private String  lib_org_a  ;
	private String  adr_org_a;
	private String  email_org_a ;
	private String  cod_nat_org ;
	private String  gsm ;
	private String  nationalite;
	private String  rib_org ;
	private String  cod_banq ;
	private String  cod_agc  ;
    private String  gerant  ;
    private String  site  ;
    @JsonFormat( pattern = "dd/MM/yyyy")
    private Date  dat_affil  ;
    private String  affil ;
    @JsonFormat( pattern = "dd/MM/yyyy")
    private Date  dat_resil  ;
    private String  lib_bord_pc;
    private String  id_bord_pc ;
    private String typ_plaf ;
    private Long  mnt_plaf ;
    private String abrv_org ;
    @Id
    private Long  id_param_organismes ;
	public String getCod_org() {
		return cod_org;
	}
	public void setCod_org(String cod_org) {
		this.cod_org = cod_org;
	}
	public String getNat_org() {
		return nat_org;
	}
	public void setNat_org(String nat_org) {
		this.nat_org = nat_org;
	}
	public String getReserve() {
		return reserve;
	}
	public void setReserve(String reserve) {
		this.reserve = reserve;
	}
	public String getFax_org() {
		return fax_org;
	}
	public void setFax_org(String fax_org) {
		this.fax_org = fax_org;
	}
	public String getLib_org() {
		return lib_org;
	}
	public void setLib_org(String lib_org) {
		this.lib_org = lib_org;
	}
	public String getTyp_org() {
		return typ_org;
	}
	public void setTyp_org(String typ_org) {
		this.typ_org = typ_org;
	}
	public String getAgree_org() {
		return agree_org;
	}
	public void setAgree_org(String agree_org) {
		this.agree_org = agree_org;
	}
	public String getAdr_org() {
		return adr_org;
	}
	public void setAdr_org(String adr_org) {
		this.adr_org = adr_org;
	}
	public String getIdent_fsc() {
		return ident_fsc;
	}
	public void setIdent_fsc(String ident_fsc) {
		this.ident_fsc = ident_fsc;
	}
	public String getCod_post() {
		return cod_post;
	}
	public void setCod_post(String cod_post) {
		this.cod_post = cod_post;
	}
	public String getTel_org() {
		return tel_org;
	}
	public void setTel_org(String tel_org) {
		this.tel_org = tel_org;
	}
	public String getEmail_org() {
		return email_org;
	}
	public void setEmail_org(String email_org) {
		this.email_org = email_org;
	}
	public String getNum_agr() {
		return num_agr;
	}
	public void setNum_agr(String num_agr) {
		this.num_agr = num_agr;
	}
	public Date getDat_agr() {
		return dat_agr;
	}
	public void setDat_agr(Date dat_agr) {
		this.dat_agr = dat_agr;
	}
	public String getLib_org_a() {
		return lib_org_a;
	}
	public void setLib_org_a(String lib_org_a) {
		this.lib_org_a = lib_org_a;
	}
	public String getAdr_org_a() {
		return adr_org_a;
	}
	public void setAdr_org_a(String adr_org_a) {
		this.adr_org_a = adr_org_a;
	}
	public String getEmail_org_a() {
		return email_org_a;
	}
	public void setEmail_org_a(String email_org_a) {
		this.email_org_a = email_org_a;
	}
	public String getCod_nat_org() {
		return cod_nat_org;
	}
	public void setCod_nat_org(String cod_nat_org) {
		this.cod_nat_org = cod_nat_org;
	}
	public String getGsm() {
		return gsm;
	}
	public void setGsm(String gsm) {
		this.gsm = gsm;
	}
	public String getNationalite() {
		return nationalite;
	}
	public void setNationalite(String nationalite) {
		this.nationalite = nationalite;
	}
	public String getRib_org() {
		return rib_org;
	}
	public void setRib_org(String rib_org) {
		this.rib_org = rib_org;
	}
	public String getCod_banq() {
		return cod_banq;
	}
	public void setCod_banq(String cod_banq) {
		this.cod_banq = cod_banq;
	}
	public String getCod_agc() {
		return cod_agc;
	}
	public void setCod_agc(String cod_agc) {
		this.cod_agc = cod_agc;
	}
	public String getGerant() {
		return gerant;
	}
	public void setGerant(String gerant) {
		this.gerant = gerant;
	}
	public String getSite() {
		return site;
	}
	public void setSite(String site) {
		this.site = site;
	}
	public Date getDat_affil() {
		return dat_affil;
	}
	public void setDat_affil(Date dat_affil) {
		this.dat_affil = dat_affil;
	}
	public String getAffil() {
		return affil;
	}
	public void setAffil(String affil) {
		this.affil = affil;
	}
	public Date getDat_resil() {
		return dat_resil;
	}
	public void setDat_resil(Date dat_resil) {
		this.dat_resil = dat_resil;
	}
	public String getLib_bord_pc() {
		return lib_bord_pc;
	}
	public void setLib_bord_pc(String lib_bord_pc) {
		this.lib_bord_pc = lib_bord_pc;
	}
	public String getId_bord_pc() {
		return id_bord_pc;
	}
	public void setId_bord_pc(String id_bord_pc) {
		this.id_bord_pc = id_bord_pc;
	}
	public String getTyp_plaf() {
		return typ_plaf;
	}
	public void setTyp_plaf(String typ_plaf) {
		this.typ_plaf = typ_plaf;
	}
	public Long getMnt_plaf() {
		return mnt_plaf;
	}
	public void setMnt_plaf(Long mnt_plaf) {
		this.mnt_plaf = mnt_plaf;
	}
	public String getAbrv_org() {
		return abrv_org;
	}
	public void setAbrv_org(String abrv_org) {
		this.abrv_org = abrv_org;
	}
	public Long getId_param_organismes() {
		return id_param_organismes;
	}
	public void setId_param_organismes(Long id_param_organismes) {
		this.id_param_organismes = id_param_organismes;
	}
	public PARAM_ORGANISMES(String cod_org, String nat_org, String reserve, String fax_org, String lib_org,
			String typ_org, String agree_org, String adr_org, String ident_fsc, String cod_post, String tel_org,
			String email_org, String num_agr, Date dat_agr, String lib_org_a, String adr_org_a, String email_org_a,
			String cod_nat_org, String gsm, String nationalite, String rib_org, String cod_banq, String cod_agc,
			String gerant, String site, Date dat_affil, String affil, Date dat_resil, String lib_bord_pc,
			String id_bord_pc, String typ_plaf, Long mnt_plaf, String abrv_org, Long id_param_organismes) {
		super();
		this.cod_org = cod_org;
		this.nat_org = nat_org;
		this.reserve = reserve;
		this.fax_org = fax_org;
		this.lib_org = lib_org;
		this.typ_org = typ_org;
		this.agree_org = agree_org;
		this.adr_org = adr_org;
		this.ident_fsc = ident_fsc;
		this.cod_post = cod_post;
		this.tel_org = tel_org;
		this.email_org = email_org;
		this.num_agr = num_agr;
		this.dat_agr = dat_agr;
		this.lib_org_a = lib_org_a;
		this.adr_org_a = adr_org_a;
		this.email_org_a = email_org_a;
		this.cod_nat_org = cod_nat_org;
		this.gsm = gsm;
		this.nationalite = nationalite;
		this.rib_org = rib_org;
		this.cod_banq = cod_banq;
		this.cod_agc = cod_agc;
		this.gerant = gerant;
		this.site = site;
		this.dat_affil = dat_affil;
		this.affil = affil;
		this.dat_resil = dat_resil;
		this.lib_bord_pc = lib_bord_pc;
		this.id_bord_pc = id_bord_pc;
		this.typ_plaf = typ_plaf;
		this.mnt_plaf = mnt_plaf;
		this.abrv_org = abrv_org;
		this.id_param_organismes = id_param_organismes;
	}
	public PARAM_ORGANISMES() {
		super();
	}
    
    
    
}
