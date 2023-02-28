package com.arabsoft.ajir.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import com.arabsoft.ajir.entities.COMPETENCE_POSTE;


import com.arabsoft.ajir.dao.COMPETENCE_POSTE_Dao;

@RestController
@CrossOrigin("*")
@RequestMapping("/COMPETENCE_POSTE")
public class COMPETENCE_POSTE_Controller {
	@Autowired COMPETENCE_POSTE_Dao cmp;
	
	
	
	@GetMapping("/get/{mat}")
	public List <COMPETENCE_POSTE> get(@PathVariable("mat")String mat){
		return cmp.get(mat);
		
		
		
		
	}

}
