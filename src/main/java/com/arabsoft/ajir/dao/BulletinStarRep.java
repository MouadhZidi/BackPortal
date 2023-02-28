package com.arabsoft.ajir.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.arabsoft.ajir.entities.BulletinStar;
import com.arabsoft.ajir.entities.CleBulletinStar;


@Repository
public interface BulletinStarRep extends JpaRepository<BulletinStar,CleBulletinStar>{
	
	
	
	@Query(value="select num_bord_assur, annee_bord, \r\n"
			+ "num_ass, num_bult, cod_soc, mat_pers,cod_prest_star, cod_prest_bct, typ_parent_star, \r\n"
			+ "typ_parent_bct, dat_soins_star, dat_soins_bct, tot_honor_star, tot_honor_bct, tot_remb_star, tot_a_remb_bct, cod_etabliss, \r\n"
			+ "num_bord_etablis, tot_bord_etablis, dat_avan_etabliss, dat_avance_agent, \r\n"
			+ "mnt_avance_agent, code_complement, dat_validation, dat_prise_charge, mnt_caa, mnt_remb_avant, observ, sit_decompt, num_bult_bct, mnt_avance_etablis, nature_bs, \r\n"
			+ "p_charge, dat_p_charge, num_p_charge, \r\n"
			+ "mnt_etablis_caa, mnt_agent_caa, proc_judic, num_resume_exced, num_resume_apur, etat_apur, \r\n"
			+ "tot_remb_star_apur, cod_etabliss_apur, mnt_avance_etablis_apur, mnt_avance_agent_apur, mnt_caa_apur, num_resume_inj, \r\n"
			+ "dat_resume_inj, mod_remb_recup, \r\n"
			+ "mode_pay, mnt_inject, etat_inject, mnt_pcharge,anc_arriere, mnt_arriere, mnt_retenue,\r\n"
			+ "mnt_trop, id_bulletin_star,\r\n"
			+ "annee_pec, cod_user from BULLETIN_STAR t\r\n"
			+ "\r\n"
			+ "where mat_pers= :matPers and cod_soc= :codSoc  \r\n"
			+ "\r\n",nativeQuery=true)
	public List<BulletinStar> getBulletinStarDet(@Param("matPers") String matPers,@Param("codSoc") String codSoc);
	

}
