package com.arabsoft.ajir.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;
@Entity
@Table(name="SERVICE")
public class SERVICE_test {
	private String cod_soc;
	@Id
	private String cod_serv;
	private String ser_cod_serv;
	private String lib_serv;
	private String abr_serv;
	private String type_serv;
	private String lib_serv_a;
	private String abr_serv_a;
	private String type_serv_chef;
	private String dept_anal;
	private String courant;
	private Long ordre;
	private String activite_serv;
	private Long regime_serv;
	private String cod_sect;
	private Long nb_sal;
	private String reg_post;
	private String cod_reg;
	private String pdmm;
	private Long taux_def;
	private String droit_astr;
	private String tel_astr;
	private String org_serv;
	private String prim_adm_para;
	private String prm_mait_chant;
	private String prm_mait_maint;
	private String cod_fonct;
	private String typ_fonct;
	private String mat_pers;
	@JsonFormat(pattern = "dd/MM/yyyy")

	private Date dat_affect;
	private String typ_affect;
	private String cod_lieu_geog;
	private String cod_centre;
	private String cod_etab;
	private String cpt_frais;
	private String serv_cpt;
	private String serv_payeur;
	private Long id_service;
	public String getCod_soc() {
		return cod_soc;
	}
	public void setCod_soc(String cod_soc) {
		this.cod_soc = cod_soc;
	}
	public String getCod_serv() {
		return cod_serv;
	}
	public void setCod_serv(String cod_serv) {
		this.cod_serv = cod_serv;
	}
	public String getSer_cod_serv() {
		return ser_cod_serv;
	}
	public void setSer_cod_serv(String ser_cod_serv) {
		this.ser_cod_serv = ser_cod_serv;
	}
	public String getLib_serv() {
		return lib_serv;
	}
	public void setLib_serv(String lib_serv) {
		this.lib_serv = lib_serv;
	}
	public String getAbr_serv() {
		return abr_serv;
	}
	public void setAbr_serv(String abr_serv) {
		this.abr_serv = abr_serv;
	}
	public String getType_serv() {
		return type_serv;
	}
	public void setType_serv(String type_serv) {
		this.type_serv = type_serv;
	}
	public String getLib_serv_a() {
		return lib_serv_a;
	}
	public void setLib_serv_a(String lib_serv_a) {
		this.lib_serv_a = lib_serv_a;
	}
	public String getAbr_serv_a() {
		return abr_serv_a;
	}
	public void setAbr_serv_a(String abr_serv_a) {
		this.abr_serv_a = abr_serv_a;
	}
	public String getType_serv_chef() {
		return type_serv_chef;
	}
	public void setType_serv_chef(String type_serv_chef) {
		this.type_serv_chef = type_serv_chef;
	}
	public String getDept_anal() {
		return dept_anal;
	}
	public void setDept_anal(String dept_anal) {
		this.dept_anal = dept_anal;
	}
	public String getCourant() {
		return courant;
	}
	public void setCourant(String courant) {
		this.courant = courant;
	}
	public Long getOrdre() {
		return ordre;
	}
	public void setOrdre(Long ordre) {
		this.ordre = ordre;
	}
	public String getActivite_serv() {
		return activite_serv;
	}
	public void setActivite_serv(String activite_serv) {
		this.activite_serv = activite_serv;
	}
	public Long getRegime_serv() {
		return regime_serv;
	}
	public void setRegime_serv(Long regime_serv) {
		this.regime_serv = regime_serv;
	}
	public String getCod_sect() {
		return cod_sect;
	}
	public void setCod_sect(String cod_sect) {
		this.cod_sect = cod_sect;
	}
	public Long getNb_sal() {
		return nb_sal;
	}
	public void setNb_sal(Long nb_sal) {
		this.nb_sal = nb_sal;
	}
	public String getReg_post() {
		return reg_post;
	}
	public void setReg_post(String reg_post) {
		this.reg_post = reg_post;
	}
	public String getCod_reg() {
		return cod_reg;
	}
	public void setCod_reg(String cod_reg) {
		this.cod_reg = cod_reg;
	}
	public String getPdmm() {
		return pdmm;
	}
	public void setPdmm(String pdmm) {
		this.pdmm = pdmm;
	}
	public Long getTaux_def() {
		return taux_def;
	}
	public void setTaux_def(Long taux_def) {
		this.taux_def = taux_def;
	}
	public String getDroit_astr() {
		return droit_astr;
	}
	public void setDroit_astr(String droit_astr) {
		this.droit_astr = droit_astr;
	}
	public String getTel_astr() {
		return tel_astr;
	}
	public void setTel_astr(String tel_astr) {
		this.tel_astr = tel_astr;
	}
	public String getOrg_serv() {
		return org_serv;
	}
	public void setOrg_serv(String org_serv) {
		this.org_serv = org_serv;
	}
	public String getPrim_adm_para() {
		return prim_adm_para;
	}
	public void setPrim_adm_para(String prim_adm_para) {
		this.prim_adm_para = prim_adm_para;
	}
	public String getPrm_mait_chant() {
		return prm_mait_chant;
	}
	public void setPrm_mait_chant(String prm_mait_chant) {
		this.prm_mait_chant = prm_mait_chant;
	}
	public String getPrm_mait_maint() {
		return prm_mait_maint;
	}
	public void setPrm_mait_maint(String prm_mait_maint) {
		this.prm_mait_maint = prm_mait_maint;
	}
	public String getCod_fonct() {
		return cod_fonct;
	}
	public void setCod_fonct(String cod_fonct) {
		this.cod_fonct = cod_fonct;
	}
	public String getTyp_fonct() {
		return typ_fonct;
	}
	public void setTyp_fonct(String typ_fonct) {
		this.typ_fonct = typ_fonct;
	}
	public String getMat_pers() {
		return mat_pers;
	}
	public void setMat_pers(String mat_pers) {
		this.mat_pers = mat_pers;
	}
	public Date getDat_affect() {
		return dat_affect;
	}
	public void setDat_affect(Date dat_affect) {
		this.dat_affect = dat_affect;
	}
	public String getTyp_affect() {
		return typ_affect;
	}
	public void setTyp_affect(String typ_affect) {
		this.typ_affect = typ_affect;
	}
	public String getCod_lieu_geog() {
		return cod_lieu_geog;
	}
	public void setCod_lieu_geog(String cod_lieu_geog) {
		this.cod_lieu_geog = cod_lieu_geog;
	}
	public String getCod_centre() {
		return cod_centre;
	}
	public void setCod_centre(String cod_centre) {
		this.cod_centre = cod_centre;
	}
	public String getCod_etab() {
		return cod_etab;
	}
	public void setCod_etab(String cod_etab) {
		this.cod_etab = cod_etab;
	}
	public String getCpt_frais() {
		return cpt_frais;
	}
	public void setCpt_frais(String cpt_frais) {
		this.cpt_frais = cpt_frais;
	}
	public String getServ_cpt() {
		return serv_cpt;
	}
	public void setServ_cpt(String serv_cpt) {
		this.serv_cpt = serv_cpt;
	}
	public String getServ_payeur() {
		return serv_payeur;
	}
	public void setServ_payeur(String serv_payeur) {
		this.serv_payeur = serv_payeur;
	}
	public Long getId_service() {
		return id_service;
	}
	public void setId_service(Long id_service) {
		this.id_service = id_service;
	}
	public SERVICE_test() {
		super();
	}
	public SERVICE_test(String cod_soc, String cod_serv, String ser_cod_serv, String lib_serv, String abr_serv,
			String type_serv, String lib_serv_a, String abr_serv_a, String type_serv_chef, String dept_anal,
			String courant, Long ordre, String activite_serv, Long regime_serv, String cod_sect, Long nb_sal,
			String reg_post, String cod_reg, String pdmm, Long taux_def, String droit_astr, String tel_astr,
			String org_serv, String prim_adm_para, String prm_mait_chant, String prm_mait_maint, String cod_fonct,
			String typ_fonct, String mat_pers, Date dat_affect, String typ_affect, String cod_lieu_geog,
			String cod_centre, String cod_etab, String cpt_frais, String serv_cpt, String serv_payeur,
			Long id_service) {
		super();
		this.cod_soc = cod_soc;
		this.cod_serv = cod_serv;
		this.ser_cod_serv = ser_cod_serv;
		this.lib_serv = lib_serv;
		this.abr_serv = abr_serv;
		this.type_serv = type_serv;
		this.lib_serv_a = lib_serv_a;
		this.abr_serv_a = abr_serv_a;
		this.type_serv_chef = type_serv_chef;
		this.dept_anal = dept_anal;
		this.courant = courant;
		this.ordre = ordre;
		this.activite_serv = activite_serv;
		this.regime_serv = regime_serv;
		this.cod_sect = cod_sect;
		this.nb_sal = nb_sal;
		this.reg_post = reg_post;
		this.cod_reg = cod_reg;
		this.pdmm = pdmm;
		this.taux_def = taux_def;
		this.droit_astr = droit_astr;
		this.tel_astr = tel_astr;
		this.org_serv = org_serv;
		this.prim_adm_para = prim_adm_para;
		this.prm_mait_chant = prm_mait_chant;
		this.prm_mait_maint = prm_mait_maint;
		this.cod_fonct = cod_fonct;
		this.typ_fonct = typ_fonct;
		this.mat_pers = mat_pers;
		this.dat_affect = dat_affect;
		this.typ_affect = typ_affect;
		this.cod_lieu_geog = cod_lieu_geog;
		this.cod_centre = cod_centre;
		this.cod_etab = cod_etab;
		this.cpt_frais = cpt_frais;
		this.serv_cpt = serv_cpt;
		this.serv_payeur = serv_payeur;
		this.id_service = id_service;
	}

}
