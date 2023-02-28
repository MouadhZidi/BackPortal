package com.arabsoft.ajir.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.arabsoft.ajir.entities.Grade;
import com.arabsoft.ajir.entities.IdGrade;

public interface GradeRep extends JpaRepository<Grade, IdGrade> {
	@Query("select g from Grade g where g.cod_categ=:cod_categ and g.cod_cat=:cod_cat ")
	List<Grade> getgrade(@Param("cod_categ")String cod_categ,@Param("cod_cat")String cod_cat );

}
