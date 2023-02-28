package com.arabsoft.ajir.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.arabsoft.ajir.entities.TypePretAb;


@Repository
public interface TypePretAbDao extends JpaRepository <TypePretAb,String> {
	
	
	@Query(value="select distinct cod_soc, \r\n"
			+ "cod_grp_pret, \r\n"
			+ "typ_pret, \r\n"
			+ "abrv_fixe, \r\n"
			+ "lib_pret, \r\n"
			+ "lib_pret_a, \r\n"
			+ "taux_int, \r\n"
			+ "duree_remb, \r\n"
			+ "delai_grace, \r\n"
			+ "nbr_tranche, \r\n"
			+ "anciennete, \r\n"
			+ "typ_fond, \r\n"
			+ "typ_plafond, \r\n"
			+ "indice, \r\n"
			+ "taux_coop, \r\n"
			+ "nbr_cariere, \r\n"
			+ "delai_apres_ret, \r\n"
			+ "typ_ass_pret, \r\n"
			+ "int_fixe, \r\n"
			+ "abreviation, \r\n"
			+ "nat_typ, \r\n"
			+ "ass_pret, \r\n"
			+ "renouv, \r\n"
			+ "abrv_compta, \r\n"
			+ "libre_serv, \r\n"
			+ "typ_int, \r\n"
			+ "plafond, \r\n"
			+ "typ_taux, \r\n"
			+ "pourcent, \r\n"
			+ "dure_renouv, \r\n"
			+ "commission, \r\n"
			+ "chap_debit, \r\n"
			+ "chap_liais, \r\n"
			+ "chap_cred, \r\n"
			+ "cod_oper, \r\n"
			+ "abrv_fixe_int, \r\n"
			+ "cod_fond, \r\n"
			+ "auto_fin, \r\n"
			+ "endettement1, \r\n"
			+ "end_taux1, \r\n"
			+ "endettement2, \r\n"
			+ "end_taux2, \r\n"
			+ "prt_log, \r\n"
			+ "id_type_pret\r\n"
			+ " from TYPE_PRET t",nativeQuery=true)
	public List <TypePretAb> getTypePret ();
	

}
