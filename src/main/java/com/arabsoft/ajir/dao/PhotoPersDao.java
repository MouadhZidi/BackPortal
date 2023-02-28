package com.arabsoft.ajir.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.arabsoft.ajir.entities.Libre_demandeBis;
import com.arabsoft.ajir.entities.PHOTO_PERS;

public interface PhotoPersDao extends JpaRepository<PHOTO_PERS, String>{

	@Query("select a from PHOTO_PERS a where a.mat_pers=:x ")
	 public PHOTO_PERS gettByMat(@Param("x") String mat);
	
}
