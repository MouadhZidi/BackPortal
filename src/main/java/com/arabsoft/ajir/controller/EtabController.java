package com.arabsoft.ajir.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.arabsoft.ajir.dao.Etablis_PERSdAO;
import com.arabsoft.ajir.entities.ETABLIS_PERS;

@CrossOrigin("*")
@RestController
@RequestMapping(value = "/Etab")
public class EtabController {
	@Autowired Etablis_PERSdAO etab;
	@PostMapping("/saveetab")
	public void save(@RequestBody ETABLIS_PERS e) {
		etab.save(e);
		
		
	}

}
