package com.arabsoft.ajir.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.arabsoft.ajir.entities.SoldConge;
import com.arabsoft.ajir.entities.SoldCongePK;

public interface GetConge extends JpaRepository<SoldConge, SoldCongePK>{

	@Query("select c from SoldConge c where c.id.cod_soc=:x and c.id.mat_pers=:y ")
	public List<SoldConge> getcongebyid(@Param("x")String codSoc,@Param("y")String mat);
	
	
	@Query("select c from SoldConge c where c.id.cod_soc=:x and c.id.mat_pers=:y and annee_cng=to_number(to_char(sysdate,'yyyy')) ")
	public List<SoldConge> getSoldeConge(@Param("x")String codSoc,@Param("y")String mat);
	@Query(value="select 'Solde actuelle: '||s.annee_cng||' est '|| s.sold_cng from sold_cng s   \r\n"
			+ "where cod_soc =:x and mat_pers =:y\n"
			+ "   and annee_cng =(select max(annee_cng) from sold_cng where \n"
			+ "     cod_soc = s.cod_soc and mat_pers = s.mat_pers)", nativeQuery=true)
	public List<?> lastsoldecng(@Param("x")String codSoc,@Param("y")String mat);
	
	
}
