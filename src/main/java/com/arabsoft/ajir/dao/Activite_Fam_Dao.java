package com.arabsoft.ajir.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.arabsoft.ajir.entities.ACTIVITE_FAMILLE;

public interface Activite_Fam_Dao extends JpaRepository<ACTIVITE_FAMILLE, String> {
	@Query("select a from ACTIVITE_FAMILLE a where a.parente_act='C'")
	public List<ACTIVITE_FAMILLE> getall();
	@Query("select a from ACTIVITE_FAMILLE a where a.parente_act='E'")
	public List<ACTIVITE_FAMILLE> getallenfant();}
