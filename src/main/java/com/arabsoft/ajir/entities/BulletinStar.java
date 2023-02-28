package com.arabsoft.ajir.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;

import com.fasterxml.jackson.annotation.JsonFormat;


@Entity
@IdClass(CleBulletinStar.class)
public class BulletinStar {
	
        @Id
		public Integer num_bord_assur;
		public Integer annee_bord;
		public String num_ass;
        @Id
		public Integer num_bult;
		@Id
		public String cod_soc;
		@Id
		public String mat_pers;
		public String cod_prest_star;
		public String cod_prest_bct;
		public String typ_parent_star;
		public String typ_parent_bct;
		@Id
	    @JsonFormat(pattern = "dd/MM/yyyy")
	    public Date dat_soins_star;
	    @JsonFormat(pattern = "dd/MM/yyyy")
	    public Date dat_soins_bct;
		public Integer tot_honor_star;
		public Integer tot_honor_bct;
		public Integer tot_remb_star;
		public Integer tot_a_remb_bct;
		public String cod_etabliss;
		public String num_bord_etablis;
		public Integer tot_bord_etablis;
	    @JsonFormat(pattern = "dd/MM/yyyy")
	    public Date dat_avan_etabliss;
	    @JsonFormat(pattern = "dd/MM/yyyy")
	    public Date dat_avance_agent;
		public Integer mnt_avance_agent;
		public String code_complement;
		@JsonFormat(pattern = "yyyy-MM-dd")
	    public Date dat_validation;
		@JsonFormat(pattern = "yyyy-MM-dd")
	    public Date dat_prise_charge;
		public Integer mnt_caa;
		public Integer mnt_remb_avant;
		public String observ;
		public String sit_decompt;
		public Integer num_bult_bct;
		public Integer mnt_avance_etablis;
		public String nature_bs;
		public String p_charge;
		@JsonFormat(pattern = "yyyy-MM-dd")
	    public Date dat_p_charge;
		public Integer num_p_charge;
		public Integer mnt_etablis_caa;
		public Integer mnt_agent_caa;
		public String proc_judic;
		public Integer num_resume_exced;
		public Integer num_resume_apur;
		public String etat_apur;
		public Integer tot_remb_star_apur;
		public String cod_etabliss_apur;
		public Integer mnt_avance_etablis_apur;
		public Integer mnt_avance_agent_apur;
		public Integer mnt_caa_apur;
		public Integer num_resume_inj;
		@JsonFormat(pattern = "yyyy-MM-dd")
	    public Date dat_resume_inj;
		public String mod_remb_recup;
		public String mode_pay;
		public Integer mnt_inject;
		public String etat_inject;
		public Integer mnt_pcharge;
		public Integer anc_arriere;
		public Integer mnt_arriere;
		public Integer mnt_retenue;
		public Integer mnt_trop;
		public Integer id_bulletin_star;
		public Integer annee_pec;
		public String cod_user;
		public Integer getNum_bord_assur() {
			return num_bord_assur;
		}
		public void setNum_bord_assur(Integer num_bord_assur) {
			this.num_bord_assur = num_bord_assur;
		}
		public Integer getAnnee_bord() {
			return annee_bord;
		}
		public void setAnnee_bord(Integer annee_bord) {
			this.annee_bord = annee_bord;
		}
		public String getNum_ass() {
			return num_ass;
		}
		public void setNum_ass(String num_ass) {
			this.num_ass = num_ass;
		}
		public Integer getNum_bult() {
			return num_bult;
		}
		public void setNum_bult(Integer num_bult) {
			this.num_bult = num_bult;
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
		public String getCod_prest_star() {
			return cod_prest_star;
		}
		public void setCod_prest_star(String cod_prest_star) {
			this.cod_prest_star = cod_prest_star;
		}
		public String getCod_prest_bct() {
			return cod_prest_bct;
		}
		public void setCod_prest_bct(String cod_prest_bct) {
			this.cod_prest_bct = cod_prest_bct;
		}
		public String getTyp_parent_star() {
			return typ_parent_star;
		}
		public void setTyp_parent_star(String typ_parent_star) {
			this.typ_parent_star = typ_parent_star;
		}
		public String getTyp_parent_bct() {
			return typ_parent_bct;
		}
		public void setTyp_parent_bct(String typ_parent_bct) {
			this.typ_parent_bct = typ_parent_bct;
		}
		public Date getDat_soins_star() {
			return dat_soins_star;
		}
		public void setDat_soins_star(Date dat_soins_star) {
			this.dat_soins_star = dat_soins_star;
		}
		public Date getDat_soins_bct() {
			return dat_soins_bct;
		}
		public void setDat_soins_bct(Date dat_soins_bct) {
			this.dat_soins_bct = dat_soins_bct;
		}
		public Integer getTot_honor_star() {
			return tot_honor_star;
		}
		public void setTot_honor_star(Integer tot_honor_star) {
			this.tot_honor_star = tot_honor_star;
		}
		public Integer getTot_honor_bct() {
			return tot_honor_bct;
		}
		public void setTot_honor_bct(Integer tot_honor_bct) {
			this.tot_honor_bct = tot_honor_bct;
		}
		public Integer getTot_remb_star() {
			return tot_remb_star;
		}
		public void setTot_remb_star(Integer tot_remb_star) {
			this.tot_remb_star = tot_remb_star;
		}
		public Integer getTot_a_remb_bct() {
			return tot_a_remb_bct;
		}
		public void setTot_a_remb_bct(Integer tot_a_remb_bct) {
			this.tot_a_remb_bct = tot_a_remb_bct;
		}
		public String getCod_etabliss() {
			return cod_etabliss;
		}
		public void setCod_etabliss(String cod_etabliss) {
			this.cod_etabliss = cod_etabliss;
		}
		public String getNum_bord_etablis() {
			return num_bord_etablis;
		}
		public void setNum_bord_etablis(String num_bord_etablis) {
			this.num_bord_etablis = num_bord_etablis;
		}
		public Integer getTot_bord_etablis() {
			return tot_bord_etablis;
		}
		public void setTot_bord_etablis(Integer tot_bord_etablis) {
			this.tot_bord_etablis = tot_bord_etablis;
		}
		public Date getDat_avan_etabliss() {
			return dat_avan_etabliss;
		}
		public void setDat_avan_etabliss(Date dat_avan_etabliss) {
			this.dat_avan_etabliss = dat_avan_etabliss;
		}
		public Date getDat_avance_agent() {
			return dat_avance_agent;
		}
		public void setDat_avance_agent(Date dat_avance_agent) {
			this.dat_avance_agent = dat_avance_agent;
		}
		public Integer getMnt_avance_agent() {
			return mnt_avance_agent;
		}
		public void setMnt_avance_agent(Integer mnt_avance_agent) {
			this.mnt_avance_agent = mnt_avance_agent;
		}
		public String getCode_complement() {
			return code_complement;
		}
		public void setCode_complement(String code_complement) {
			this.code_complement = code_complement;
		}
		public Date getDat_validation() {
			return dat_validation;
		}
		public void setDat_validation(Date dat_validation) {
			this.dat_validation = dat_validation;
		}
		public Date getDat_prise_charge() {
			return dat_prise_charge;
		}
		public void setDat_prise_charge(Date dat_prise_charge) {
			this.dat_prise_charge = dat_prise_charge;
		}
		public Integer getMnt_caa() {
			return mnt_caa;
		}
		public void setMnt_caa(Integer mnt_caa) {
			this.mnt_caa = mnt_caa;
		}
		public Integer getMnt_remb_avant() {
			return mnt_remb_avant;
		}
		public void setMnt_remb_avant(Integer mnt_remb_avant) {
			this.mnt_remb_avant = mnt_remb_avant;
		}
		public String getObserv() {
			return observ;
		}
		public void setObserv(String observ) {
			this.observ = observ;
		}
		public String getSit_decompt() {
			return sit_decompt;
		}
		public void setSit_decompt(String sit_decompt) {
			this.sit_decompt = sit_decompt;
		}
		public Integer getNum_bult_bct() {
			return num_bult_bct;
		}
		public void setNum_bult_bct(Integer num_bult_bct) {
			this.num_bult_bct = num_bult_bct;
		}
		public Integer getMnt_avance_etablis() {
			return mnt_avance_etablis;
		}
		public void setMnt_avance_etablis(Integer mnt_avance_etablis) {
			this.mnt_avance_etablis = mnt_avance_etablis;
		}
		public String getNature_bs() {
			return nature_bs;
		}
		public void setNature_bs(String nature_bs) {
			this.nature_bs = nature_bs;
		}
		public String getP_charge() {
			return p_charge;
		}
		public void setP_charge(String p_charge) {
			this.p_charge = p_charge;
		}
		public Date getDat_p_charge() {
			return dat_p_charge;
		}
		public void setDat_p_charge(Date dat_p_charge) {
			this.dat_p_charge = dat_p_charge;
		}
		public Integer getNum_p_charge() {
			return num_p_charge;
		}
		public void setNum_p_charge(Integer num_p_charge) {
			this.num_p_charge = num_p_charge;
		}
		public Integer getMnt_etablis_caa() {
			return mnt_etablis_caa;
		}
		public void setMnt_etablis_caa(Integer mnt_etablis_caa) {
			this.mnt_etablis_caa = mnt_etablis_caa;
		}
		public Integer getMnt_agent_caa() {
			return mnt_agent_caa;
		}
		public void setMnt_agent_caa(Integer mnt_agent_caa) {
			this.mnt_agent_caa = mnt_agent_caa;
		}
		public String getProc_judic() {
			return proc_judic;
		}
		public void setProc_judic(String proc_judic) {
			this.proc_judic = proc_judic;
		}
		public Integer getNum_resume_exced() {
			return num_resume_exced;
		}
		public void setNum_resume_exced(Integer num_resume_exced) {
			this.num_resume_exced = num_resume_exced;
		}
		public Integer getNum_resume_apur() {
			return num_resume_apur;
		}
		public void setNum_resume_apur(Integer num_resume_apur) {
			this.num_resume_apur = num_resume_apur;
		}
		public String getEtat_apur() {
			return etat_apur;
		}
		public void setEtat_apur(String etat_apur) {
			this.etat_apur = etat_apur;
		}
		public Integer getTot_remb_star_apur() {
			return tot_remb_star_apur;
		}
		public void setTot_remb_star_apur(Integer tot_remb_star_apur) {
			this.tot_remb_star_apur = tot_remb_star_apur;
		}
		public String getCod_etabliss_apur() {
			return cod_etabliss_apur;
		}
		public void setCod_etabliss_apur(String cod_etabliss_apur) {
			this.cod_etabliss_apur = cod_etabliss_apur;
		}
		public Integer getMnt_avance_etablis_apur() {
			return mnt_avance_etablis_apur;
		}
		public void setMnt_avance_etablis_apur(Integer mnt_avance_etablis_apur) {
			this.mnt_avance_etablis_apur = mnt_avance_etablis_apur;
		}
		public Integer getMnt_avance_agent_apur() {
			return mnt_avance_agent_apur;
		}
		public void setMnt_avance_agent_apur(Integer mnt_avance_agent_apur) {
			this.mnt_avance_agent_apur = mnt_avance_agent_apur;
		}
		public Integer getMnt_caa_apur() {
			return mnt_caa_apur;
		}
		public void setMnt_caa_apur(Integer mnt_caa_apur) {
			this.mnt_caa_apur = mnt_caa_apur;
		}
		public Integer getNum_resume_inj() {
			return num_resume_inj;
		}
		public void setNum_resume_inj(Integer num_resume_inj) {
			this.num_resume_inj = num_resume_inj;
		}
		public Date getDat_resume_inj() {
			return dat_resume_inj;
		}
		public void setDat_resume_inj(Date dat_resume_inj) {
			this.dat_resume_inj = dat_resume_inj;
		}
		public String getMod_remb_recup() {
			return mod_remb_recup;
		}
		public void setMod_remb_recup(String mod_remb_recup) {
			this.mod_remb_recup = mod_remb_recup;
		}
		public String getMode_pay() {
			return mode_pay;
		}
		public void setMode_pay(String mode_pay) {
			this.mode_pay = mode_pay;
		}
		public Integer getMnt_inject() {
			return mnt_inject;
		}
		public void setMnt_inject(Integer mnt_inject) {
			this.mnt_inject = mnt_inject;
		}
		public String getEtat_inject() {
			return etat_inject;
		}
		public void setEtat_inject(String etat_inject) {
			this.etat_inject = etat_inject;
		}
		public Integer getMnt_pcharge() {
			return mnt_pcharge;
		}
		public void setMnt_pcharge(Integer mnt_pcharge) {
			this.mnt_pcharge = mnt_pcharge;
		}
		public Integer getAnc_arriere() {
			return anc_arriere;
		}
		public void setAnc_arriere(Integer anc_arriere) {
			this.anc_arriere = anc_arriere;
		}
		public Integer getMnt_arriere() {
			return mnt_arriere;
		}
		public void setMnt_arriere(Integer mnt_arriere) {
			this.mnt_arriere = mnt_arriere;
		}
		public Integer getMnt_retenue() {
			return mnt_retenue;
		}
		public void setMnt_retenue(Integer mnt_retenue) {
			this.mnt_retenue = mnt_retenue;
		}
		public Integer getMnt_trop() {
			return mnt_trop;
		}
		public void setMnt_trop(Integer mnt_trop) {
			this.mnt_trop = mnt_trop;
		}
		public Integer getId_bulletin_star() {
			return id_bulletin_star;
		}
		public void setId_bulletin_star(Integer id_bulletin_star) {
			this.id_bulletin_star = id_bulletin_star;
		}
		public Integer getAnnee_pec() {
			return annee_pec;
		}
		public void setAnnee_pec(Integer annee_pec) {
			this.annee_pec = annee_pec;
		}
		public String getCod_user() {
			return cod_user;
		}
		public void setCod_user(String cod_user) {
			this.cod_user = cod_user;
		}
		public BulletinStar(Integer num_bord_assur, Integer annee_bord, String num_ass, Integer num_bult,
				String cod_soc, String mat_pers, String cod_prest_star, String cod_prest_bct, String typ_parent_star,
				String typ_parent_bct, Date dat_soins_star, Date dat_soins_bct, Integer tot_honor_star,
				Integer tot_honor_bct, Integer tot_remb_star, Integer tot_a_remb_bct, String cod_etabliss,
				String num_bord_etablis, Integer tot_bord_etablis, Date dat_avan_etabliss, Date dat_avance_agent,
				Integer mnt_avance_agent, String code_complement, Date dat_validation, Date dat_prise_charge,
				Integer mnt_caa, Integer mnt_remb_avant, String observ, String sit_decompt, Integer num_bult_bct,
				Integer mnt_avance_etablis, String nature_bs, String p_charge, Date dat_p_charge, Integer num_p_charge,
				Integer mnt_etablis_caa, Integer mnt_agent_caa, String proc_judic, Integer num_resume_exced,
				Integer num_resume_apur, String etat_apur, Integer tot_remb_star_apur, String cod_etabliss_apur,
				Integer mnt_avance_etablis_apur, Integer mnt_avance_agent_apur, Integer mnt_caa_apur,
				Integer num_resume_inj, Date dat_resume_inj, String mod_remb_recup, String mode_pay, Integer mnt_inject,
				String etat_inject, Integer mnt_pcharge, Integer anc_arriere, Integer mnt_arriere, Integer mnt_retenue,
				Integer mnt_trop, Integer id_bulletin_star, Integer annee_pec, String cod_user) {
			super();
			this.num_bord_assur = num_bord_assur;
			this.annee_bord = annee_bord;
			this.num_ass = num_ass;
			this.num_bult = num_bult;
			this.cod_soc = cod_soc;
			this.mat_pers = mat_pers;
			this.cod_prest_star = cod_prest_star;
			this.cod_prest_bct = cod_prest_bct;
			this.typ_parent_star = typ_parent_star;
			this.typ_parent_bct = typ_parent_bct;
			this.dat_soins_star = dat_soins_star;
			this.dat_soins_bct = dat_soins_bct;
			this.tot_honor_star = tot_honor_star;
			this.tot_honor_bct = tot_honor_bct;
			this.tot_remb_star = tot_remb_star;
			this.tot_a_remb_bct = tot_a_remb_bct;
			this.cod_etabliss = cod_etabliss;
			this.num_bord_etablis = num_bord_etablis;
			this.tot_bord_etablis = tot_bord_etablis;
			this.dat_avan_etabliss = dat_avan_etabliss;
			this.dat_avance_agent = dat_avance_agent;
			this.mnt_avance_agent = mnt_avance_agent;
			this.code_complement = code_complement;
			this.dat_validation = dat_validation;
			this.dat_prise_charge = dat_prise_charge;
			this.mnt_caa = mnt_caa;
			this.mnt_remb_avant = mnt_remb_avant;
			this.observ = observ;
			this.sit_decompt = sit_decompt;
			this.num_bult_bct = num_bult_bct;
			this.mnt_avance_etablis = mnt_avance_etablis;
			this.nature_bs = nature_bs;
			this.p_charge = p_charge;
			this.dat_p_charge = dat_p_charge;
			this.num_p_charge = num_p_charge;
			this.mnt_etablis_caa = mnt_etablis_caa;
			this.mnt_agent_caa = mnt_agent_caa;
			this.proc_judic = proc_judic;
			this.num_resume_exced = num_resume_exced;
			this.num_resume_apur = num_resume_apur;
			this.etat_apur = etat_apur;
			this.tot_remb_star_apur = tot_remb_star_apur;
			this.cod_etabliss_apur = cod_etabliss_apur;
			this.mnt_avance_etablis_apur = mnt_avance_etablis_apur;
			this.mnt_avance_agent_apur = mnt_avance_agent_apur;
			this.mnt_caa_apur = mnt_caa_apur;
			this.num_resume_inj = num_resume_inj;
			this.dat_resume_inj = dat_resume_inj;
			this.mod_remb_recup = mod_remb_recup;
			this.mode_pay = mode_pay;
			this.mnt_inject = mnt_inject;
			this.etat_inject = etat_inject;
			this.mnt_pcharge = mnt_pcharge;
			this.anc_arriere = anc_arriere;
			this.mnt_arriere = mnt_arriere;
			this.mnt_retenue = mnt_retenue;
			this.mnt_trop = mnt_trop;
			this.id_bulletin_star = id_bulletin_star;
			this.annee_pec = annee_pec;
			this.cod_user = cod_user;
		}
		public BulletinStar() {
			super();
			// TODO Auto-generated constructor stub
		}
		
		
		
		
}
