package com.arabsoft.ajir.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.arabsoft.ajir.dao.Objectif_Agent_Dao;
import com.arabsoft.ajir.entities.OBJECTIF_AGENT;

@RestController
@CrossOrigin("*")
@RequestMapping("/OBJECTIF")
public class OBJECTIF_AGENT_Controller {
	@Autowired
	Objectif_Agent_Dao ob;
	@GetMapping("/getobj/{cod}/{mat}")
	List <OBJECTIF_AGENT> getobj(@PathVariable("cod")String cod,@PathVariable("mat")String mat){
 return ob.getOBJECTIF_AGENT(cod, mat);
 }

}
