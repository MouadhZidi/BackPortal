package com.arabsoft.ajir.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.arabsoft.ajir.entities.CompetencePostTrav;

public interface CompetencePostTravRep  extends JpaRepository<CompetencePostTrav,String>{
	
	
	
	
	@Query(value="select  t.cod_metier, t.cod_post,pk_get_lib.GET_POSTE_TRAV$LIB_POST(t.cod_post) lib_post, cod_nat_comp, cod_comp,pk_get_lib.GET_COMPETENCE$LIB_COMP(t.cod_nat_comp,t.cod_comp) lib_comp\r\n"
			+ ", cod_crit_comp, val_crit_comp, coef_pond, \r\n"
			+ "typ_comp, cod_niv,pk_get_lib.GET_NIVEAU_COM$LIB_NIV_COMP(t.cod_niv)lib_niv_comp, id_competence_poste, courant ,\r\n"
			+ "emploi_competence.get_coef_competence(l.cod_soc,l.mat_pers,l.poste_trav) pourcentage\r\n"
			+ "from competence_poste t ,personnel l,poste_trav p\r\n"
			+ "where  t.cod_metier = p.cod_metier\r\n"
			+ "   and t.cod_post = p.cod_post\r\n"
			+ "   and l.poste_trav = p.cod_post\r\n"
			+ "   and l.cod_soc = l.cod_soc\r\n"
			+ "and l.mat_pers = '10237'",nativeQuery=true)
	public List<CompetencePostTrav> getCompetenceReq(@Param("matPers") String matPers);


}
