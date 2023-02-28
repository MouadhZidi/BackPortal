package com.arabsoft.ajir.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.arabsoft.ajir.entities.COMPETENCE_PERS;
import com.arabsoft.ajir.entities.FICHE_EVAL_COMP;
import com.arabsoft.ajir.entities.Id_COMPETENCE_PERS;

public interface COMPETENCE_PERS8dAO extends JpaRepository<COMPETENCE_PERS, Id_COMPETENCE_PERS> {
	@Query(value="  Select t.cod_soc  ,\r\n"
			+ "  t.cod_candidat ,\r\n"
			+ "  t.typ_candidat  ,\r\n"
			+ " l.nom_pers||' '||l.pren_pers libnom ,\r\n"
			
			+ "  t.cod_nat_comp,\r\n"
			+ " t.cod_comp,\r\n"
			+ "  pk_get_lib.GET_COMPETENCE$LIB_COMP(t.cod_nat_comp,t.cod_comp) libcomp ,\r\n"
			+ " t.cod_crit_comp,\r\n"
			+ "  t.val_crit_comp, \r\n"
			+ "  t.dat_valid ,\r\n"
			+ "  t.appreciation  ,\r\n"
			+ "  t.cod_niv_comp  ,\r\n"
			+ "  t.denom  ,\r\n"
			+ "   pk_get_lib.GET_NIVEAU_COM$LIB_NIV_COMP(t.cod_niv_comp) libnivcmp ,\r\n"
			+ " t.div  ,\r\n"
			+ "  t.id_competence_pers  \r\n"
			+ "  from COMPETENCE_PERS t ,personnel l  where t.cod_soc = l.cod_soc  and t.cod_candidat = l.mat_pers   and l.mat_pers =:mat  \r\n"
			+ "",nativeQuery=true)
	public List <COMPETENCE_PERS> get(@Param("mat")String mat);
	

}
