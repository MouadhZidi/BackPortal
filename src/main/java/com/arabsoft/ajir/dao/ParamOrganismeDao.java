package com.arabsoft.ajir.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.arabsoft.ajir.entities.PARAM_ORGANISMES;

public interface ParamOrganismeDao extends JpaRepository<PARAM_ORGANISMES, Long> {
	
	
	@Query(value=" select * from param_organismes where nat_org='ETAB_DIP'",nativeQuery = true)
	public List<PARAM_ORGANISMES> getEtab();
}
