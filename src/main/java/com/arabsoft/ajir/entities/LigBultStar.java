package com.arabsoft.ajir.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;

import com.fasterxml.jackson.annotation.JsonFormat;


@Entity
@IdClass(CleLigBultStar.class)
public class LigBultStar {

	
	
	@Id
    public Integer num_bord_assur;
	public Integer annee_bord;
	@Id
	public Integer num_lig_bord;
	public String num_ass;
	@Id
	public Integer num_bult;
	public String code_complement;
	@Id
	public String cod_soc;
	@Id
	public String mat_pers;
	public String cod_etabliss;
	public String num_bord_etablis;
	public Integer mnt_etablis;
	public String cod_prest_star;
	public String cod_prest_bct;
	public String typ_parent_star;
	public String typ_parent_bct;
	@Id
    @JsonFormat(pattern = "dd/MM/yyyy")
	public Date dat_soins_star;
    @JsonFormat(pattern = "dd/MM/yyyy")
	public Date dat_soins_bct;
	@Id
	public String abrv_act_star;
	public String abrv_act_bct;
	public Integer nbr_unite_eng_star;
	public Integer nbr_unite_acc_star;
	public Integer nbr_unite_eng_bct;
	public Integer nbr_unite_acc_bct;
	public Integer tot_honor_star;
	public Integer tot_honor_bct;
	public Integer tot_remb_star;
	public Integer tot_a_remb_bct;
	public String reclam_assur;
	public Integer mnt_caa;
	public Integer mnt_remb_avant;
	public Integer mnt_etab_conv;
	public Integer id_lig_bult_star;
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
	public Integer getNum_lig_bord() {
		return num_lig_bord;
	}
	public void setNum_lig_bord(Integer num_lig_bord) {
		this.num_lig_bord = num_lig_bord;
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
	public String getCode_complement() {
		return code_complement;
	}
	public void setCode_complement(String code_complement) {
		this.code_complement = code_complement;
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
	public Integer getMnt_etablis() {
		return mnt_etablis;
	}
	public void setMnt_etablis(Integer mnt_etablis) {
		this.mnt_etablis = mnt_etablis;
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
	public String getAbrv_act_star() {
		return abrv_act_star;
	}
	public void setAbrv_act_star(String abrv_act_star) {
		this.abrv_act_star = abrv_act_star;
	}
	public String getAbrv_act_bct() {
		return abrv_act_bct;
	}
	public void setAbrv_act_bct(String abrv_act_bct) {
		this.abrv_act_bct = abrv_act_bct;
	}
	public Integer getNbr_unite_eng_star() {
		return nbr_unite_eng_star;
	}
	public void setNbr_unite_eng_star(Integer nbr_unite_eng_star) {
		this.nbr_unite_eng_star = nbr_unite_eng_star;
	}
	public Integer getNbr_unite_acc_star() {
		return nbr_unite_acc_star;
	}
	public void setNbr_unite_acc_star(Integer nbr_unite_acc_star) {
		this.nbr_unite_acc_star = nbr_unite_acc_star;
	}
	public Integer getNbr_unite_eng_bct() {
		return nbr_unite_eng_bct;
	}
	public void setNbr_unite_eng_bct(Integer nbr_unite_eng_bct) {
		this.nbr_unite_eng_bct = nbr_unite_eng_bct;
	}
	public Integer getNbr_unite_acc_bct() {
		return nbr_unite_acc_bct;
	}
	public void setNbr_unite_acc_bct(Integer nbr_unite_acc_bct) {
		this.nbr_unite_acc_bct = nbr_unite_acc_bct;
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
	public String getReclam_assur() {
		return reclam_assur;
	}
	public void setReclam_assur(String reclam_assur) {
		this.reclam_assur = reclam_assur;
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
	public Integer getMnt_etab_conv() {
		return mnt_etab_conv;
	}
	public void setMnt_etab_conv(Integer mnt_etab_conv) {
		this.mnt_etab_conv = mnt_etab_conv;
	}
	public Integer getId_lig_bult_star() {
		return id_lig_bult_star;
	}
	public void setId_lig_bult_star(Integer id_lig_bult_star) {
		this.id_lig_bult_star = id_lig_bult_star;
	}
	public String getCod_user() {
		return cod_user;
	}
	public void setCod_user(String cod_user) {
		this.cod_user = cod_user;
	}
	public LigBultStar(Integer num_bord_assur, Integer annee_bord, Integer num_lig_bord, String num_ass,
			Integer num_bult, String code_complement, String cod_soc, String mat_pers, String cod_etabliss,
			String num_bord_etablis, Integer mnt_etablis, String cod_prest_star, String cod_prest_bct,
			String typ_parent_star, String typ_parent_bct, Date dat_soins_star, Date dat_soins_bct,
			String abrv_act_star, String abrv_act_bct, Integer nbr_unite_eng_star, Integer nbr_unite_acc_star,
			Integer nbr_unite_eng_bct, Integer nbr_unite_acc_bct, Integer tot_honor_star, Integer tot_honor_bct,
			Integer tot_remb_star, Integer tot_a_remb_bct, String reclam_assur, Integer mnt_caa, Integer mnt_remb_avant,
			Integer mnt_etab_conv, Integer id_lig_bult_star, String cod_user) {
		super();
		this.num_bord_assur = num_bord_assur;
		this.annee_bord = annee_bord;
		this.num_lig_bord = num_lig_bord;
		this.num_ass = num_ass;
		this.num_bult = num_bult;
		this.code_complement = code_complement;
		this.cod_soc = cod_soc;
		this.mat_pers = mat_pers;
		this.cod_etabliss = cod_etabliss;
		this.num_bord_etablis = num_bord_etablis;
		this.mnt_etablis = mnt_etablis;
		this.cod_prest_star = cod_prest_star;
		this.cod_prest_bct = cod_prest_bct;
		this.typ_parent_star = typ_parent_star;
		this.typ_parent_bct = typ_parent_bct;
		this.dat_soins_star = dat_soins_star;
		this.dat_soins_bct = dat_soins_bct;
		this.abrv_act_star = abrv_act_star;
		this.abrv_act_bct = abrv_act_bct;
		this.nbr_unite_eng_star = nbr_unite_eng_star;
		this.nbr_unite_acc_star = nbr_unite_acc_star;
		this.nbr_unite_eng_bct = nbr_unite_eng_bct;
		this.nbr_unite_acc_bct = nbr_unite_acc_bct;
		this.tot_honor_star = tot_honor_star;
		this.tot_honor_bct = tot_honor_bct;
		this.tot_remb_star = tot_remb_star;
		this.tot_a_remb_bct = tot_a_remb_bct;
		this.reclam_assur = reclam_assur;
		this.mnt_caa = mnt_caa;
		this.mnt_remb_avant = mnt_remb_avant;
		this.mnt_etab_conv = mnt_etab_conv;
		this.id_lig_bult_star = id_lig_bult_star;
		this.cod_user = cod_user;
	}
	public LigBultStar() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
}
