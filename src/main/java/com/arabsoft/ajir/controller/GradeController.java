package com.arabsoft.ajir.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.arabsoft.ajir.dao.GradeRep;
import com.arabsoft.ajir.entities.Grade;

@RestController
@CrossOrigin
@RequestMapping("/Grade")
public class GradeController {
@Autowired GradeRep grade;
@GetMapping("/getall")
public List<Grade> getall(){
	
	return grade.findAll();
	
}
@GetMapping("/getallgrade/{cod_categ}/{cod_cat}")
public List<Grade> getgrade(@PathVariable("cod_categ")String cod_categ,@PathVariable("cod_cat")String cod_cat){
	
	return grade.getgrade(cod_categ,cod_cat);
	
}
}
