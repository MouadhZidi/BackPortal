package com.arabsoft.ajir.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.arabsoft.ajir.entities.INIT_GRH;

public interface InitGrhDao extends JpaRepository<INIT_GRH, String> {
	@Query(value="select * from init_grh where lib='EXPIRATION_TOKEN'",nativeQuery = true)
	INIT_GRH getTokenExpiration();
}
