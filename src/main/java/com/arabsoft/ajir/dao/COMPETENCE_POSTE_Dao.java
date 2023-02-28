package com.arabsoft.ajir.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.arabsoft.ajir.entities.COMPETENCE_POSTE;
import com.arabsoft.ajir.entities.Pk_Competance_poste;

public interface COMPETENCE_POSTE_Dao extends JpaRepository<COMPETENCE_POSTE, Pk_Competance_poste> {
	@Query(value="  Select t.cod_metier  ,\r\n"
			+ "  t.cod_post ,\r\n"
			+ "  t.cod_nat_comp  ,\r\n"
			+ " t.cod_comp ,\r\n"
			
			+ "  t.cod_crit_comp,\r\n"
			+ " t.val_crit_comp,\r\n"
			+ "  t.coef_pond ,\r\n"
			+ " t.typ_comp,\r\n"
			+ "  t.cod_niv, \r\n"
			+ "  t.id_competence_poste ,\r\n"
			+ "  t.courant  ,\r\n"
			+ "  pk_get_lib.GET_POSTE_TRAV$LIB_POST(t.cod_post) LIB_POST ,\r\n"
			+ "  pk_get_lib.GET_COMPETENCE$LIB_COMP(t.cod_nat_comp,t.cod_comp) LIB_COMP ,\r\n"
			+ "  pk_get_lib.GET_NIVEAU_COM$LIB_NIV_COMP(t.cod_niv) LIB_NIV_COMP ,\r\n"
			+ " emploi_competence.get_coef_competence(l.cod_soc,l.mat_pers,l.poste_trav) pourcentage  \r\n"
			
			+ "  from competence_poste t ,personnel l,poste_trav p  where  t.cod_metier = p.cod_metier  and t.cod_post = p.cod_post  and l.poste_trav = p.cod_post and l.cod_soc = l.cod_soc and l.mat_pers = :mat  \r\n"
			+ "",nativeQuery=true)
	public List <COMPETENCE_POSTE> get(@Param("mat")String mat);

}
