package com.arabsoft.ajir.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.arabsoft.ajir.dao.PersonnelRep;
import com.arabsoft.ajir.dao.RetardJourne;
import com.arabsoft.ajir.entities.CompetenceDet;
import com.arabsoft.ajir.entities.Personnel;
import com.arabsoft.ajir.entities.RetardJoune;


@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/Retard")
public class RetardController {
	
	
	@Autowired
	RetardJourne retardJourne;
	@Autowired
	PersonnelRep personnelRep;

	
	@CrossOrigin
	@GetMapping("/getretard/{matPers}/{codSoc}")
	 public List<RetardJoune> getListRetard(@PathVariable String matPers,@PathVariable String codSoc){

		return retardJourne.getRetard(matPers, codSoc);
	}
	@CrossOrigin
	@GetMapping("/getretarddate/{matPers}/{codSoc}/{dateSelect}")
	 public List<RetardJoune> getListRetard(@PathVariable String matPers,@PathVariable String codSoc,@PathVariable String dateSelect){
		
		
		return retardJourne.getRetardDate(matPers, codSoc,dateSelect);
				

	}
	@CrossOrigin
	@GetMapping("/getretarddet/{matPers}/{codSoc}/{matPersAgent}")
	 public List<RetardJoune> getListRetardDet(@PathVariable String matPers,@PathVariable String codSoc,@PathVariable String matPersAgent){

		return retardJourne.getRetardDet(matPers, codSoc,matPersAgent);
	}
}
