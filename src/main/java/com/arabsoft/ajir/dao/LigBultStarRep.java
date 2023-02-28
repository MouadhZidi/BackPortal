package com.arabsoft.ajir.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.arabsoft.ajir.entities.CleLigBultStar;
import com.arabsoft.ajir.entities.LigBultStar;


@Repository
public interface LigBultStarRep  extends JpaRepository<LigBultStar,CleLigBultStar>{
	
	
	@Query(value="select \r\n"
			+ "num_bord_assur, \r\n"
			+ "annee_bord, \r\n"
			+ "num_lig_bord, \r\n"
			+ "num_ass, \r\n"
			+ "num_bult, \r\n"
			+ "code_complement, \r\n"
			+ "cod_soc, \r\n"
			+ "mat_pers, \r\n"
			+ "cod_etabliss, \r\n"
			+ "num_bord_etablis, \r\n"
			+ "mnt_etablis, \r\n"
			+ "cod_prest_star, \r\n"
			+ "cod_prest_bct, \r\n"
			+ "typ_parent_star, \r\n"
			+ "typ_parent_bct, \r\n"
			+ "dat_soins_star, \r\n"
			+ "dat_soins_bct, \r\n"
			+ "abrv_act_star, \r\n"
			+ "abrv_act_bct, \r\n"
			+ "nbr_unite_eng_star, \r\n"
			+ "nbr_unite_acc_star, \r\n"
			+ "nbr_unite_eng_bct, \r\n"
			+ "nbr_unite_acc_bct, \r\n"
			+ "tot_honor_star, \r\n"
			+ "tot_honor_bct, \r\n"
			+ "tot_remb_star, \r\n"
			+ "tot_a_remb_bct, \r\n"
			+ "reclam_assur, \r\n"
			+ "mnt_caa, \r\n"
			+ "mnt_remb_avant, \r\n"
			+ "mnt_etab_conv, \r\n"
			+ "id_lig_bult_star, \r\n"
			+ "cod_user\r\n"
			+ "\r\n"
			+ "from LIG_BULT_STAR \r\n"
			+ "where cod_soc= :codSoc and mat_pers= :matPers \r\n",nativeQuery=true)
	public List<LigBultStar> getListLigBultStart(@Param("matPers") String matPers,@Param("codSoc") String codSoc);

	@Query(value="select \r\n"
			+ "num_bord_assur, \r\n"
			+ "annee_bord, \r\n"
			+ "num_lig_bord, \r\n"
			+ "num_ass, \r\n"
			+ "num_bult, \r\n"
			+ "code_complement, \r\n"
			+ "cod_soc, \r\n"
			+ "mat_pers, \r\n"
			+ "cod_etabliss, \r\n"
			+ "num_bord_etablis, \r\n"
			+ "mnt_etablis, \r\n"
			+ "cod_prest_star, \r\n"
			+ "cod_prest_bct, \r\n"
			+ "typ_parent_star, \r\n"
			+ "typ_parent_bct, \r\n"
			+ "dat_soins_star, \r\n"
			+ "dat_soins_bct, \r\n"
			+ "abrv_act_star, \r\n"
			+ "abrv_act_bct, \r\n"
			+ "nbr_unite_eng_star, \r\n"
			+ "nbr_unite_acc_star, \r\n"
			+ "nbr_unite_eng_bct, \r\n"
			+ "nbr_unite_acc_bct, \r\n"
			+ "tot_honor_star, \r\n"
			+ "tot_honor_bct, \r\n"
			+ "tot_remb_star, \r\n"
			+ "tot_a_remb_bct, \r\n"
			+ "reclam_assur, \r\n"
			+ "mnt_caa, \r\n"
			+ "mnt_remb_avant, \r\n"
			+ "mnt_etab_conv, \r\n"
			+ "id_lig_bult_star, \r\n"
			+ "cod_user\r\n"
			+ "\r\n"
			+ "from LIG_BULT_STAR \r\n"
			+ "where cod_soc= :codSoc and mat_pers= :matPers and num_bult= :numBult\r\n",nativeQuery=true)
	public List<LigBultStar> getListLigBultStartDet(@Param("matPers") String matPers,@Param("codSoc") String codSoc,@Param("numBult") String numBult);

	
	

}
