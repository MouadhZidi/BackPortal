package com.arabsoft.ajir.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.arabsoft.ajir.entities.PARAM_NIVEAU;

public interface PARAM_NIVEAU_Dao extends JpaRepository<PARAM_NIVEAU, String> {
	
	@Query(value="select * from param_niveau where typ_niveau ='N'",nativeQuery=true)
	public List<PARAM_NIVEAU> getNiveauEtude();
	
	@Query(value="select * from param_niveau where typ_niveau ='D'",nativeQuery=true)
	public List<PARAM_NIVEAU> getDiplome();

}
