package com.arabsoft.ajir.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.arabsoft.ajir.dao.ActeRep;
import com.arabsoft.ajir.dao.BulletinStarRep;
import com.arabsoft.ajir.dao.BultSoinRep;
import com.arabsoft.ajir.dao.LigBultRep;
import com.arabsoft.ajir.dao.LigBultStarRep;
import com.arabsoft.ajir.entities.BulletinStar;
import com.arabsoft.ajir.entities.BultSoin;
import com.arabsoft.ajir.entities.LigBult;
import com.arabsoft.ajir.entities.LigBultStar;


@CrossOrigin(origins = "*") 
@RestController
@RequestMapping("/bultSoin")
public class BultSoinController {


	
	@Autowired
	BultSoinRep bultSoinRep;
	@Autowired
	LigBultRep ligBultRep;
	
	@Autowired
	ActeRep actRep;
	
	
	@Autowired 
	BulletinStarRep bulletinStarRep;
	
	@Autowired
	LigBultStarRep ligBultStarRep;
	
	
	
	/*
	@PostMapping("/bsoindet")
	public BultSoin getBsoinDet(@RequestBody BultSoin b){
		
		
		
		String codSoc = b.getCod_soc();
		String matPers = b.getMat_pers();
		Integer numSoins = b.getNum_soins();
		
		List<BultSoin> bs = this.bultSoinRep.getBultSoins(codSoc, matPers, numSoins);
		
		
	    for (int i = 0; i <bs.size(); i++) {
	    	if(i==bs.size()-1) {
	        System.out.println(bs.get(i));
	    	bs.get(i).setLigBult(ligBultRep.getLigBult(codSoc, matPers, numSoins));
			bs.get(i).setNumSoinParam(ligBultRep.getNumSoinParam(codSoc, matPers));
			 
	    }
	    }
	    
	    
	    if (!bs.isEmpty()) {
		return  bs.get(bs.size()-1);
	    }
	    else
	    {
	    	return null;
	    }
	    
		
	}*/
	
	@CrossOrigin
	@GetMapping("/bsoindet/{codSoc}/{matPers}/{numSoins}")
	 public List<LigBult> getListCodSoin(@PathVariable String codSoc,@PathVariable String matPers,@PathVariable Integer numSoins){
		
		
		
		return ligBultRep.getLigBult(codSoc, matPers,numSoins);
		
		
	}
	@CrossOrigin
	@GetMapping("/getbultsoinscode/{codSoc}/{matPers}")
	 public List<String> getListCodSoin(@PathVariable String codSoc,@PathVariable String matPers){
		
		
		
		return ligBultRep.getNumSoinParam(codSoc, matPers);
		
		
	}
	
	@CrossOrigin
	@GetMapping("/getbultsoinstar/{matPers}/{codSoc}")
	 public List<BulletinStar> getListBultStar(@PathVariable String matPers,@PathVariable String codSoc){

		return bulletinStarRep.getBulletinStarDet(matPers, codSoc);
	}
	@CrossOrigin
	@GetMapping("/getbultlist/{codSoc}/{matPers}")
	 public List<BultSoin> getListBultDet(@PathVariable String matPers,@PathVariable String codSoc){

		return bultSoinRep.getBultSoinsList(codSoc,matPers);
	}
	
	@CrossOrigin
	@GetMapping("/getligbultstardetlist/{codSoc}/{matPers}/{numSoins}")
	 public List<LigBultStar> getListLigBultStar(@PathVariable String matPers,@PathVariable String codSoc,@PathVariable String numSoins){

		return ligBultStarRep.getListLigBultStartDet(matPers, codSoc,numSoins);
	}
	@CrossOrigin
	@GetMapping("/getligbultstarlist/{codSoc}/{matPers}")
	 public List<LigBultStar> getListLigBultStar(@PathVariable String matPers,@PathVariable String codSoc){

		return ligBultStarRep.getListLigBultStart(matPers, codSoc);
	}
}
