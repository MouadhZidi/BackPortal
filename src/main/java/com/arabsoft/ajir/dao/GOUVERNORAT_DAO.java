package com.arabsoft.ajir.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.arabsoft.ajir.entities.GOUVERNORAT;
@Repository
public interface GOUVERNORAT_DAO extends JpaRepository<GOUVERNORAT, String> {

}
