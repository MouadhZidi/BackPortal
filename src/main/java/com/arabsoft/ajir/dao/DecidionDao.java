package com.arabsoft.ajir.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.arabsoft.ajir.entities.Decision;
import com.arabsoft.ajir.entities.DemCng;

public interface DecidionDao extends JpaRepository<Decision, Long>{
	

	
	 @Query(value ="select cod_soc,\r\n"
				+ "num,\r\n"
				+ "nom,\r\n"
				+ "nom_a,\r\n"
				+ "typ_dec,\r\n"
				+ "cod_affect,\r\n"
				+ "id_decision,\r\n"
				+ "nom_rdf\r\n"
				+ " from decision where typ_dec='A'", nativeQuery = true)
		  public List<Decision>   getDecidion();
		

}
