package com.arabsoft.ajir.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.arabsoft.ajir.dao.RenseignementPersDAO;
import com.arabsoft.ajir.entities.RenseignementPers;

@CrossOrigin("*")
@RestController
@RequestMapping(value = "/Rens_pers")
public class Rens_persController {
	@Autowired RenseignementPersDAO rens;
	@PostMapping("/saveRens_pers")
	public void save(@RequestBody RenseignementPers r) {
		rens.save(r);
		
		
	}


}
