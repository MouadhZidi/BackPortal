package com.arabsoft.ajir.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.arabsoft.ajir.entities.PAYS;

@Repository
public interface PAYS_DAO extends JpaRepository<PAYS, String> {

}
