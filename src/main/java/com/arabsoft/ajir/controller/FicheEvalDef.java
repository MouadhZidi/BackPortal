package com.arabsoft.ajir.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.arabsoft.ajir.dao.Evaluation_Definiif_Dao;
import com.arabsoft.ajir.entities.EVALUATION_DEFINITIVE;

@RestController
@CrossOrigin
@RequestMapping("/FicheEvalDef")
public class FicheEvalDef {
	@Autowired 
	Evaluation_Definiif_Dao dao;
	
	@PostMapping("/FicheEvalDef")
	public List<EVALUATION_DEFINITIVE> getFicheEvaldef(@RequestBody EVALUATION_DEFINITIVE s){
		String mat_pers=s.getMat_pers();
		String cod_soc=s.getCod_soc();
		String annee=s.getAnnee().toString();
		
		return dao.getFicheEvaldef(mat_pers,cod_soc,annee);
		
		
	}

}
