package com.arabsoft.ajir.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.arabsoft.ajir.entities.ID_Nivau_Pers;
import com.arabsoft.ajir.entities.NIVEAU_PERS;
import com.arabsoft.ajir.entities.Niveau_Pers_CV;

public interface NIVEAU_PERS_Dao extends JpaRepository<NIVEAU_PERS, ID_Nivau_Pers>{
	
	
	@Query(value="select max(num_niveau) from NIVEAU_PERS  where  cod_soc =:codSoc and mat_pers =:mat ",nativeQuery=true)
	public Long getmax(@Param("codSoc") String codSoc,@Param("mat") String mat);
	@Query("select n from NIVEAU_PERS n where n.cod_soc=:x and n.mat_pers=:y ")
	public List <NIVEAU_PERS> getnivpers(@Param("x")String cod,@Param("y") String mat);
	@Query(value="delete from NIVEAU_PERS f where f.cod_soc=:cod and f.mat_pers=:mat and f.num_niveau=:num_niv",nativeQuery=true)
	public void deleteCv(@Param("cod")Long num ,@Param("mat") String mat,@Param("num_niv") String num_niv);
}
