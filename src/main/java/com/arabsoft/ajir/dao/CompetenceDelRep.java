package com.arabsoft.ajir.dao;

import java.util.Date;
import java.util.Optional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.arabsoft.ajir.entities.CleCompetence;
import com.arabsoft.ajir.entities.CompetenceDel;
import com.arabsoft.ajir.entities.CompetencePersDel;


public interface CompetenceDelRep extends JpaRepository<CompetenceDel,CleCompetence>{
	


	
	Optional<CompetenceDel> findById(CleCompetence id);

	CompetenceDel save(CompetenceDel competence);

	void deleteById(CompetenceDel id);


	  @Modifying
			@Query(value="insert into COMPETENCE (cod_nat_comp, \r\n"
					+ "cod_comp, \r\n"
					+ "lib_comp, \r\n"
					+ "id_competence\r\n"
					+ ") values(:codNatComp,:codComp,:LibComp,(select count(j.id_competence_pers)+1 nbr from COMPETENCE_PERS j) ) \r\n"
					+ "", nativeQuery = true)
		    @Transactional
			public void addCompetense(@Param("codNatComp") String codNatComp,@Param("codComp") String codComp,@Param("LibComp") String LibComp);
		  @Modifying

			@Query(value="insert into COMPETENCE_PERS (cod_soc, \r\n"
					+ "cod_candidat, \r\n"
					+ "typ_candidat, \r\n"
					+ "cod_nat_comp, \r\n"
					+ "cod_comp, \r\n"
					+ "dat_valid, \r\n"
					+ "appreciation, \r\n"
					+ "cod_niv_comp, \r\n"
					+ "id_competence_pers) values(:codSoc,:matPers,'I',:codNatComp,:codComp,:dateSaisie,:appreciation,:nivCompet,(select count(j.id_competence_pers)+1 nbr from COMPETENCE_PERS j) ) \r\n"
					+ "", nativeQuery = true)
		    @Transactional
			public void addCompetensePers(@Param("codSoc") String codSoc,@Param("matPers") String matPers,
					@Param("codNatComp") String codNatComp,@Param("codComp") String codComp,@Param("dateSaisie") Date dateSaisie,@Param("appreciation") String appreciation,@Param("nivCompet") String nivCompet);
			
		


}
