package com.arabsoft.ajir.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.arabsoft.ajir.dao.PossedeDao;
import com.arabsoft.ajir.entities.POSSEDE;

@CrossOrigin("*")
@RestController
@RequestMapping(value = "PossModp")
public class PossModpController {
	@Autowired 
	PossedeDao poss;
	@PostMapping("/savePossModp")
	public void save(@RequestBody POSSEDE possede) {
		poss.save(possede);
		
		
	}

}
