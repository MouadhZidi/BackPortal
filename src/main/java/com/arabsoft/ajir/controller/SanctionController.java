package com.arabsoft.ajir.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.arabsoft.ajir.dao.SanctionDao;
import com.arabsoft.ajir.entities.POSS_SANCTION;
import com.arabsoft.ajir.entities.RetardJoune;

@CrossOrigin("*")
@RestController
@RequestMapping(value = "/sanction")
public class SanctionController {

	
	@Autowired
	SanctionDao sanctionDao;
	@CrossOrigin
	@GetMapping("/getSanc/{matPers}/{codSoc}")
	 public List<POSS_SANCTION> getListRetard(@PathVariable("matPers") String matPers,@PathVariable("codSoc") String codSoc){

		return sanctionDao.getSanction(matPers, codSoc);
	}
	
	
}
