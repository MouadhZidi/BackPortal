package com.arabsoft.ajir.dao;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import org.hibernate.Query;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.arabsoft.ajir.entities.CleCompetencePers;
import com.arabsoft.ajir.entities.CompetencePersDel;


@Repository
public interface CompetencePersDelRep extends JpaRepository<CompetencePersDel,CleCompetencePers>{
	
    void deleteById(CleCompetencePers id);
	

}
