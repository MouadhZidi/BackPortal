package com.arabsoft.ajir.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.arabsoft.ajir.dao.AdrPers2Dao;
import com.arabsoft.ajir.entities.AdrPers2;

@CrossOrigin("*")
@RestController
@RequestMapping(value = "/adr_pers")
public class Adresse_persController {
	@Autowired 
	AdrPers2Dao adr;
	@PostMapping("/saveadrpers")
	public void save(@RequestBody AdrPers2 adr_pers) {
		adr.save(adr_pers);
		
		
	}


}
