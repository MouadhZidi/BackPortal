package com.arabsoft.ajir.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.arabsoft.ajir.entities.IdObjectif_Agent;
import com.arabsoft.ajir.entities.NOTES_EVENEMENTS;
import com.arabsoft.ajir.entities.OBJECTIF_AGENT;

public interface Objectif_Agent_Dao extends JpaRepository<OBJECTIF_AGENT, IdObjectif_Agent> {
	@Query(value="  Select o.cod_soc ,\r\n"
			+ "  o.mat_pers,\r\n"
			+ "  o.annee,\r\n"
			+ "  o.num_objectif,\r\n"
			+ "  o.lib_objectif,\r\n"
			+ "  o.appreciation,\r\n"
			+ "  o.comment_recom,\r\n"
			+ "decode(o.appreciation,'0','non apprécié','1','Objectif partiellement atteint','2','Objectif atteint','3','Objectif dépassé') app \r\n"
			
		
			+ "  from OBJECTIF_AGENT o where o.cod_soc =:cod and o.mat_pers =:mat\r\n"
			+ "",nativeQuery=true)
	public List<OBJECTIF_AGENT> getOBJECTIF_AGENT(@Param("cod")String cod,@Param("mat") String mat);
	
	

}
