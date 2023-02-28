package com.arabsoft.ajir.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.arabsoft.ajir.entities.CATEG;

public interface CATEG_Dao extends JpaRepository<CATEG, String> {
	@Query("select c from CATEG c  ")
	public  List<CATEG> getcateg();

}
