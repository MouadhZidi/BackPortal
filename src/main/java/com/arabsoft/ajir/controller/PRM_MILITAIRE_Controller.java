package com.arabsoft.ajir.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.arabsoft.ajir.dao.LISTE_DOMAINE_dAO;
import com.arabsoft.ajir.dao.PARAM_NIVEAU_Dao;
import com.arabsoft.ajir.dao.PRM_MILITAIREDao;
import com.arabsoft.ajir.dao.ParamOrganismeDao;
import com.arabsoft.ajir.entities.LISTE_DOMAINE;
import com.arabsoft.ajir.entities.PARAM_NIVEAU;
import com.arabsoft.ajir.entities.PARAM_ORGANISMES;
import com.arabsoft.ajir.entities.PRM_MILITAIRE;

@CrossOrigin("*")
@RestController
@RequestMapping(value = "/PRM_MILITAIRE")
public class PRM_MILITAIRE_Controller {
	@Autowired  PRM_MILITAIREDao dao;
	@Autowired
	PARAM_NIVEAU_Dao niveau_Dao;
	
	@Autowired
	LISTE_DOMAINE_dAO  liste_DOMAINE_dAO;
	@Autowired
	ParamOrganismeDao  organismeDao;
	@GetMapping("/getall")
	List <PRM_MILITAIRE> getall(){
		
		return  dao.findAll();
		
		
	}
	
	@GetMapping("/getallDiplome")
	List <PARAM_NIVEAU> getallDiplome(){
		
		return  niveau_Dao.getDiplome();
		
		
	}
	
	@GetMapping("/getallNiveau")
	List <PARAM_NIVEAU> getallNiveau(){
		
		return  niveau_Dao.getNiveauEtude();
		
		
	}
	
	@GetMapping("/getallSpecialite")
	List <LISTE_DOMAINE> getallSpecialite(){
		
		return  liste_DOMAINE_dAO.findAll();
		
		
	}
	
	@GetMapping("/getallOrganisme")
	List <PARAM_ORGANISMES> getallOrganisme(){
		
		return  organismeDao.findAll();
		
		
	}
	@GetMapping("/getallniv")
	List <PARAM_NIVEAU> getallniv(){
		
		return  niveau_Dao.findAll();
		
		
	}

}
