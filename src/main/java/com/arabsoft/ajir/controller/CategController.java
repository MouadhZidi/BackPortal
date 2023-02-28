package com.arabsoft.ajir.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.arabsoft.ajir.dao.CATEG_Dao;
import com.arabsoft.ajir.entities.CATEG;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/Categ")
public class CategController {
	@Autowired CATEG_Dao categ;
	@GetMapping("getcateg")
	public List<CATEG> getcateg(){
		return  categ.getcateg();
		
		
		
	}

}
