package com.arabsoft.ajir.dao;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.arabsoft.ajir.entities.POSS_SANCTION;

@Repository
public interface SanctionDao extends JpaRepository<POSS_SANCTION, Long> {
	
	@Query(value="select num_sanc,\r\n"
			+ "cod_soc,\r\n"
			+ "mat_pers,\r\n"
			+ "cod_nat,\r\n"
			+ "typ_sanc,\r\n"
			+ "n_doss,\r\n"
			+ "dat_sais,\r\n"
			+ "dat_sanc,\r\n"
			+ "dat_effet,\r\n"
			+ "etat_sanc,\r\n"
			+ "dat_debut,\r\n"
			+ "dat_fin,\r\n"
			+ "dat_retour,\r\n"
			+ "nbr_jours,\r\n"
			+ "raison,\r\n"
			+ "num_decision,\r\n"
			+ "categ,\r\n"
			+ "cat,\r\n"
			+ "grad,\r\n"
			+ "ech,\r\n"
			+ "adm_tech,\r\n"
			+ "fonct,\r\n"
			+ "qualf,\r\n"
			+ "serv,\r\n"
			+ "num_adr,\r\n"
			+ "nvcateg,\r\n"
			+ "nvcat,\r\n"
			+ "nvgrad,\r\n"
			+ "nvech,\r\n"
			+ "nvadm_tech,\r\n"
			+ "nvserv,\r\n"
			+ "nvnum_adr,\r\n"
			+ "raison_a,\r\n"
			+ "nbr_jours_ouv,\r\n"
			+ "aff,\r\n"
			+ "rais_sanc,\r\n"
			+ "cod_ur,\r\n"
			+ "ncod_ur,\r\n"
			+ "cod_class,\r\n"
			+ "ncod_class,\r\n"
			+ "dat_decision,\r\n"
			+ "arr_position,\r\n"
			+ "duree_ret_ech,\r\n"
			+ "niv_sal,\r\n"
			+ "nniv_sal,\r\n"
			+ "sanc_num_sanc,\r\n"
			+ "id_poss_sanction,\r\n"
			+ "cod_user,\r\n"
			+ "pk_get_lib.GET_NAT_SANCTI$LIB_NAT(cod_nat,typ_sanc) lib "
			+ "from poss_sanction where mat_pers=:mat and cod_soc=:soc",nativeQuery = true)
	 List<POSS_SANCTION> getSanction(@Param("mat") String mat,@Param("soc") String soc);

}
