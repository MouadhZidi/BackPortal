package com.arabsoft.ajir.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.arabsoft.ajir.entities.Categorie;
import com.arabsoft.ajir.entities.IDCategorie;

public interface CategorieDao extends JpaRepository<Categorie, IDCategorie> {
	@Query("select c from Categorie c where c.cod_categ=:x ")
	public List<Categorie> getcat(@Param("x")String x);
	

}
