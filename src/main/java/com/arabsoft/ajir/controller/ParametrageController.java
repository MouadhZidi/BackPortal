package com.arabsoft.ajir.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.arabsoft.ajir.dao.InitGrhDao;
import com.arabsoft.ajir.entities.INIT_GRH;

@CrossOrigin("*")
@RestController
@RequestMapping(value="/param")
public class ParametrageController {
	@Autowired
	InitGrhDao grhDao;
	
	
	@GetMapping("/getTokenExp")
	public INIT_GRH getTokenExp() {

		return this.grhDao.getTokenExpiration();
	}

}
