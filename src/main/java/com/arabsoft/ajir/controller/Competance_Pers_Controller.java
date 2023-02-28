package com.arabsoft.ajir.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.arabsoft.ajir.dao.COMPETENCE_PERS8dAO;
import com.arabsoft.ajir.entities.COMPETENCE_PERS;

@RestController
@CrossOrigin
@RequestMapping("/Competance_reel")
public class Competance_Pers_Controller {
	@Autowired COMPETENCE_PERS8dAO cmp;
	@GetMapping("/get/{mat}")
	List <COMPETENCE_PERS> get(@PathVariable("mat")String mat){
		return cmp.get(mat);}

}
