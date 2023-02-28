package com.arabsoft.ajir.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.arabsoft.ajir.entities.FONCTIONS;

public interface FONCTIONS_DAO extends JpaRepository<FONCTIONS, String> {
	@Query("select f from FONCTIONS f where f.typ_fonct='F'")
	public List<FONCTIONS> getfct();

}
