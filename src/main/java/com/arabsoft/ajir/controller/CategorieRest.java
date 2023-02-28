package com.arabsoft.ajir.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.arabsoft.ajir.dao.CategorieDao;
import com.arabsoft.ajir.entities.Categorie;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/cat")
public class CategorieRest {
	@Autowired CategorieDao cat;
	@GetMapping("/getall/{cod_categ}")
	public List<Categorie> getall(@PathVariable("cod_categ")String x){
		return cat.getcat(x);
	}

}
