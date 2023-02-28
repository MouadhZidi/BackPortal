package com.arabsoft.ajir.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="TYPE_PRET")
public class TypePretAb {

	
	
	public String cod_soc;
	public String cod_grp_pret;
	@Id
	public String typ_pret;
	public String abrv_fixe;
	public String lib_pret;
	public String lib_pret_a;
	public Integer taux_int;
	public Integer duree_remb;
	public Integer delai_grace;
	public Integer nbr_tranche;
	public Integer anciennete;
	public String typ_fond;
	public String typ_plafond;
	public Integer indice;
	public Integer taux_coop;
	public Integer nbr_cariere;
	public Integer delai_apres_ret;
	public String typ_ass_pret;
	public String int_fixe;
	public String abreviation;
	public String nat_typ;
	public String ass_pret;
	public String renouv;
	public String abrv_compta;
	public String libre_serv;
	public String typ_int;
	public Integer plafond;
	public String typ_taux;
	public Integer pourcent;
	public Integer dure_renouv;
	public String commission;
	public String chap_debit;
	public String chap_liais;
	public String chap_cred;
	public String cod_oper;
	public String abrv_fixe_int;
	public String cod_fond;
	public String auto_fin;
	public String endettement1;
	public Integer end_taux1;
	public String endettement2;
	public Integer end_taux2;
	public String prt_log;
	public Integer id_type_pret;
	public String getCod_soc() {
		return cod_soc;
	}
	public void setCod_soc(String cod_soc) {
		this.cod_soc = cod_soc;
	}
	public String getCod_grp_pret() {
		return cod_grp_pret;
	}
	public void setCod_grp_pret(String cod_grp_pret) {
		this.cod_grp_pret = cod_grp_pret;
	}
	public String getTyp_pret() {
		return typ_pret;
	}
	public void setTyp_pret(String typ_pret) {
		this.typ_pret = typ_pret;
	}
	public String getAbrv_fixe() {
		return abrv_fixe;
	}
	public void setAbrv_fixe(String abrv_fixe) {
		this.abrv_fixe = abrv_fixe;
	}
	public String getLib_pret() {
		return lib_pret;
	}
	public void setLib_pret(String lib_pret) {
		this.lib_pret = lib_pret;
	}
	public String getLib_pret_a() {
		return lib_pret_a;
	}
	public void setLib_pret_a(String lib_pret_a) {
		this.lib_pret_a = lib_pret_a;
	}
	public Integer getTaux_int() {
		return taux_int;
	}
	public void setTaux_int(Integer taux_int) {
		this.taux_int = taux_int;
	}
	public Integer getDuree_remb() {
		return duree_remb;
	}
	public void setDuree_remb(Integer duree_remb) {
		this.duree_remb = duree_remb;
	}
	public Integer getDelai_grace() {
		return delai_grace;
	}
	public void setDelai_grace(Integer delai_grace) {
		this.delai_grace = delai_grace;
	}
	public Integer getNbr_tranche() {
		return nbr_tranche;
	}
	public void setNbr_tranche(Integer nbr_tranche) {
		this.nbr_tranche = nbr_tranche;
	}
	public Integer getAnciennete() {
		return anciennete;
	}
	public void setAnciennete(Integer anciennete) {
		this.anciennete = anciennete;
	}
	public String getTyp_fond() {
		return typ_fond;
	}
	public void setTyp_fond(String typ_fond) {
		this.typ_fond = typ_fond;
	}
	public String getTyp_plafond() {
		return typ_plafond;
	}
	public void setTyp_plafond(String typ_plafond) {
		this.typ_plafond = typ_plafond;
	}
	public Integer getIndice() {
		return indice;
	}
	public void setIndice(Integer indice) {
		this.indice = indice;
	}
	public Integer getTaux_coop() {
		return taux_coop;
	}
	public void setTaux_coop(Integer taux_coop) {
		this.taux_coop = taux_coop;
	}
	public Integer getNbr_cariere() {
		return nbr_cariere;
	}
	public void setNbr_cariere(Integer nbr_cariere) {
		this.nbr_cariere = nbr_cariere;
	}
	public Integer getDelai_apres_ret() {
		return delai_apres_ret;
	}
	public void setDelai_apres_ret(Integer delai_apres_ret) {
		this.delai_apres_ret = delai_apres_ret;
	}
	public String getTyp_ass_pret() {
		return typ_ass_pret;
	}
	public void setTyp_ass_pret(String typ_ass_pret) {
		this.typ_ass_pret = typ_ass_pret;
	}
	public String getInt_fixe() {
		return int_fixe;
	}
	public void setInt_fixe(String int_fixe) {
		this.int_fixe = int_fixe;
	}
	public String getAbreviation() {
		return abreviation;
	}
	public void setAbreviation(String abreviation) {
		this.abreviation = abreviation;
	}
	public String getNat_typ() {
		return nat_typ;
	}
	public void setNat_typ(String nat_typ) {
		this.nat_typ = nat_typ;
	}
	public String getAss_pret() {
		return ass_pret;
	}
	public void setAss_pret(String ass_pret) {
		this.ass_pret = ass_pret;
	}
	public String getRenouv() {
		return renouv;
	}
	public void setRenouv(String renouv) {
		this.renouv = renouv;
	}
	public String getAbrv_compta() {
		return abrv_compta;
	}
	public void setAbrv_compta(String abrv_compta) {
		this.abrv_compta = abrv_compta;
	}
	public String getLibre_serv() {
		return libre_serv;
	}
	public void setLibre_serv(String libre_serv) {
		this.libre_serv = libre_serv;
	}
	public String getTyp_int() {
		return typ_int;
	}
	public void setTyp_int(String typ_int) {
		this.typ_int = typ_int;
	}
	public Integer getPlafond() {
		return plafond;
	}
	public void setPlafond(Integer plafond) {
		this.plafond = plafond;
	}
	public String getTyp_taux() {
		return typ_taux;
	}
	public void setTyp_taux(String typ_taux) {
		this.typ_taux = typ_taux;
	}
	public Integer getPourcent() {
		return pourcent;
	}
	public void setPourcent(Integer pourcent) {
		this.pourcent = pourcent;
	}
	public Integer getDure_renouv() {
		return dure_renouv;
	}
	public void setDure_renouv(Integer dure_renouv) {
		this.dure_renouv = dure_renouv;
	}
	public String getCommission() {
		return commission;
	}
	public void setCommission(String commission) {
		this.commission = commission;
	}
	public String getChap_debit() {
		return chap_debit;
	}
	public void setChap_debit(String chap_debit) {
		this.chap_debit = chap_debit;
	}
	public String getChap_liais() {
		return chap_liais;
	}
	public void setChap_liais(String chap_liais) {
		this.chap_liais = chap_liais;
	}
	public String getChap_cred() {
		return chap_cred;
	}
	public void setChap_cred(String chap_cred) {
		this.chap_cred = chap_cred;
	}
	public String getCod_oper() {
		return cod_oper;
	}
	public void setCod_oper(String cod_oper) {
		this.cod_oper = cod_oper;
	}
	public String getAbrv_fixe_int() {
		return abrv_fixe_int;
	}
	public void setAbrv_fixe_int(String abrv_fixe_int) {
		this.abrv_fixe_int = abrv_fixe_int;
	}
	public String getCod_fond() {
		return cod_fond;
	}
	public void setCod_fond(String cod_fond) {
		this.cod_fond = cod_fond;
	}
	public String getAuto_fin() {
		return auto_fin;
	}
	public void setAuto_fin(String auto_fin) {
		this.auto_fin = auto_fin;
	}
	public String getEndettement1() {
		return endettement1;
	}
	public void setEndettement1(String endettement1) {
		this.endettement1 = endettement1;
	}
	public Integer getEnd_taux1() {
		return end_taux1;
	}
	public void setEnd_taux1(Integer end_taux1) {
		this.end_taux1 = end_taux1;
	}
	public String getEndettement2() {
		return endettement2;
	}
	public void setEndettement2(String endettement2) {
		this.endettement2 = endettement2;
	}
	public Integer getEnd_taux2() {
		return end_taux2;
	}
	public void setEnd_taux2(Integer end_taux2) {
		this.end_taux2 = end_taux2;
	}
	public String getPrt_log() {
		return prt_log;
	}
	public void setPrt_log(String prt_log) {
		this.prt_log = prt_log;
	}
	public Integer getId_type_pret() {
		return id_type_pret;
	}
	public void setId_type_pret(Integer id_type_pret) {
		this.id_type_pret = id_type_pret;
	}
	public TypePretAb(String cod_soc, String cod_grp_pret, String typ_pret, String abrv_fixe, String lib_pret,
			String lib_pret_a, Integer taux_int, Integer duree_remb, Integer delai_grace, Integer nbr_tranche,
			Integer anciennete, String typ_fond, String typ_plafond, Integer indice, Integer taux_coop,
			Integer nbr_cariere, Integer delai_apres_ret, String typ_ass_pret, String int_fixe, String abreviation,
			String nat_typ, String ass_pret, String renouv, String abrv_compta, String libre_serv, String typ_int,
			Integer plafond, String typ_taux, Integer pourcent, Integer dure_renouv, String commission,
			String chap_debit, String chap_liais, String chap_cred, String cod_oper, String abrv_fixe_int,
			String cod_fond, String auto_fin, String endettement1, Integer end_taux1, String endettement2,
			Integer end_taux2, String prt_log, Integer id_type_pret) {
		super();
		this.cod_soc = cod_soc;
		this.cod_grp_pret = cod_grp_pret;
		this.typ_pret = typ_pret;
		this.abrv_fixe = abrv_fixe;
		this.lib_pret = lib_pret;
		this.lib_pret_a = lib_pret_a;
		this.taux_int = taux_int;
		this.duree_remb = duree_remb;
		this.delai_grace = delai_grace;
		this.nbr_tranche = nbr_tranche;
		this.anciennete = anciennete;
		this.typ_fond = typ_fond;
		this.typ_plafond = typ_plafond;
		this.indice = indice;
		this.taux_coop = taux_coop;
		this.nbr_cariere = nbr_cariere;
		this.delai_apres_ret = delai_apres_ret;
		this.typ_ass_pret = typ_ass_pret;
		this.int_fixe = int_fixe;
		this.abreviation = abreviation;
		this.nat_typ = nat_typ;
		this.ass_pret = ass_pret;
		this.renouv = renouv;
		this.abrv_compta = abrv_compta;
		this.libre_serv = libre_serv;
		this.typ_int = typ_int;
		this.plafond = plafond;
		this.typ_taux = typ_taux;
		this.pourcent = pourcent;
		this.dure_renouv = dure_renouv;
		this.commission = commission;
		this.chap_debit = chap_debit;
		this.chap_liais = chap_liais;
		this.chap_cred = chap_cred;
		this.cod_oper = cod_oper;
		this.abrv_fixe_int = abrv_fixe_int;
		this.cod_fond = cod_fond;
		this.auto_fin = auto_fin;
		this.endettement1 = endettement1;
		this.end_taux1 = end_taux1;
		this.endettement2 = endettement2;
		this.end_taux2 = end_taux2;
		this.prt_log = prt_log;
		this.id_type_pret = id_type_pret;
	}
	public TypePretAb() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
