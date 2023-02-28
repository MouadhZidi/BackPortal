package com.arabsoft.ajir.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.arabsoft.ajir.dao.Activite_Fam_Dao;
import com.arabsoft.ajir.dao.ECHELONDao;
import com.arabsoft.ajir.dao.ETAT_PAIE_Dao;
import com.arabsoft.ajir.dao.PAYS_DAO;
import com.arabsoft.ajir.entities.ACTIVITE_FAMILLE;
import com.arabsoft.ajir.entities.ECHELON;
import com.arabsoft.ajir.entities.ETAT_PAIE;
import com.arabsoft.ajir.entities.PAYS;

@RestController
@CrossOrigin("*")
@RequestMapping("/Pays")
public class PaysController {
	@Autowired PAYS_DAO p;
	@Autowired ETAT_PAIE_Dao etatp;
	@Autowired Activite_Fam_Dao act;
@Autowired ECHELONDao ech;
@GetMapping("/getall")
	public List<PAYS> getall(){
		return p.findAll();
	}
	@GetMapping("/getalllibactfam")
	public List<ACTIVITE_FAMILLE> getallactfam(){
		return act.getall();
	}
	@GetMapping("/getalllibetatpaie")
	public List<ETAT_PAIE> getalletatpaie(){
		return etatp.findAll();
	}
	@GetMapping("/getallech")
	public List<ECHELON> getallECHELON(){
		return ech.findAll();
	}
	@GetMapping("/getalllibactfamenfant")
	public List<ACTIVITE_FAMILLE> getallactfamenfant(){
		return act.getallenfant();
	}
	

}
