package com.arabsoft.ajir.dao;


import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.arabsoft.ajir.entities.FICHE_EVAL_COMP;
import com.arabsoft.ajir.entities.ID_Service;
import com.arabsoft.ajir.entities.SERVICE;

public interface Servicedao extends JpaRepository<SERVICE, ID_Service> {
	@Query(value="Select cod_soc,\r\n"
			+ "cod_serv,\r\n"
			+ "ser_cod_serv,\r\n"
			+ "lib_serv,\r\n"
			+ "abr_serv,\r\n"
			+ "type_serv,\r\n"
			+ "lib_serv_a,\r\n"
			+ "abr_serv_a,\r\n"
			+ "type_serv_chef,\r\n"
			+ "dept_anal,\r\n"
			+ "courant,\r\n"
			+ "ordre,\r\n"
			+ "activite_serv,\r\n"
			+ "regime_serv,\r\n"
			+ "cod_sect,\r\n"
			+ "nb_sal,\r\n"
			+ "reg_post,\r\n"
			+ "cod_reg,\r\n"
			+ "pdmm,\r\n"
			+ "taux_def,\r\n"
			+ "droit_astr,\r\n"
			+ "tel_astr,\r\n"
			+ "org_serv,\r\n"
			+ "prim_adm_para,\r\n"
			+ "prm_mait_chant,\r\n"
			+ "prm_mait_maint,\r\n"
			+ "cod_fonct,\r\n"
			+ "typ_fonct,\r\n"
			+ "mat_pers,\r\n"
			+ "dat_affect,\r\n"
			+ "typ_affect,\r\n"
			+ "cod_lieu_geog,\r\n"
			+ "cod_centre,\r\n"
			+ "cod_etab,\r\n"
			+ "cpt_frais,\r\n"
			+ "serv_cpt,\r\n"
			+ "serv_payeur,\r\n"
			+ "id_service,\r\n"
			+ "(select get_hierarchie(cod_soc,cod_serv) from dual)  libelleaffect\r\n"
			+ "  from SERVICE where cod_serv=:serv\r\n",nativeQuery=true)
	public List<SERVICE> getall(@Param("serv")String serv);

}
