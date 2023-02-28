package com.arabsoft.ajir.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.arabsoft.ajir.entities.EVALUATION_DEFINITIVE;
import com.arabsoft.ajir.entities.Pk_Evaluation_Definiif;
@Repository
public interface Evaluation_Definiif_Dao extends JpaRepository<EVALUATION_DEFINITIVE, Pk_Evaluation_Definiif> {
	@Query(value="  Select t.cod_soc  ,\r\n"
			+ "  t.mat_pers ,\r\n"
			+ "  t.annee  ,\r\n"
			+ "  t.taux_real_obj,\r\n"
			+ "  t.taux_app_comp,\r\n"
			+ "  t.taux_eval_def,\r\n"
			+ "  t.cod_app_def  ,\r\n"
			+ "  t.observation\r\n"
		
			
			+ " from evaluation_definitive t,PARAM_EVAL_DEFINITIVE p where t.cod_app_def = p.cod_app_def  and t.mat_pers=:mat and t.cod_soc=:cod and t.annee=:dat  \r\n"
			+ "",nativeQuery=true)
	public List<EVALUATION_DEFINITIVE> getFicheEvaldef(@Param("mat")String mat,@Param("cod")String cod,@Param("dat") String ann);
	

}
