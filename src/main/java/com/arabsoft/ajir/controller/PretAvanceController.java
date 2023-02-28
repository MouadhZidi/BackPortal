package com.arabsoft.ajir.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.arabsoft.ajir.dao.LigPretPers;
import com.arabsoft.ajir.dao.PretPersDetRep;
import com.arabsoft.ajir.dao.TypePretAbDao;
import com.arabsoft.ajir.entities.PretPersDet;
import com.arabsoft.ajir.entities.TypePretAb;



@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/pretAvance")
public class PretAvanceController {

	@Autowired
	private PretPersDetRep pretPersDetRep;

	@Autowired
	private  LigPretPers ligPretPersRep;

	
	
	@Autowired
	private  TypePretAbDao typePretRep;

	
	
	
	@PostMapping("/getpretlig")
	public ResponseEntity<PretPersDet>  getPret(@RequestBody PretPersDet b)  {
		 
		
		
		String codSoc = b.getCod_soc();
		String matPers = b.getMat_pers();
		Long codPret = b.getCod_pret();
		String dateDeb=b.getPrt_dat_deb();
		String typePret=b.getTyp_pret();

		
		PretPersDet pr= this.pretPersDetRep.getPret(codSoc, matPers,codPret,dateDeb,typePret);
		pr.setListCodPret(this.pretPersDetRep.getListCodPret(codSoc, matPers));
		pr.setLigPretPers(ligPretPersRep.getLigPretPers(codSoc, matPers, codPret));
		
		
		
		return ResponseEntity.ok(pr) ;
		
				
		
	}
	

	@CrossOrigin
	@GetMapping("/getpretperscode/{codSoc}/{matPers}")
	 public List<Integer> getListCodPretPers(@PathVariable String codSoc,@PathVariable String matPers){
		
		
		
		return ligPretPersRep.getPretPersCode(codSoc, matPers);
		
		
	}

	
	@CrossOrigin
	@GetMapping("/typepret")
	 public List<TypePretAb> getTypePretList(){
		
		
		
		return typePretRep.getTypePret();
		
		
	}
}
