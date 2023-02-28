package com.arabsoft.ajir.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.arabsoft.ajir.entities.Stat_Soldcng;

@Repository
public interface Statsoldcngdao extends JpaRepository<Stat_Soldcng, Long> {
	@Query(value="select s.annee_cng,s.sold_cng,s.cod_soc,s.mat_pers \r\n"
			+ "from SOLD_CNG s \r\n"
			+ "where s.cod_soc = :x\r\n"
			+ "and s.mat_pers =:y  \r\n",nativeQuery = true)
	public List<Stat_Soldcng> getStat_Soldcng(@Param("x")String x,@Param("y")String y);}