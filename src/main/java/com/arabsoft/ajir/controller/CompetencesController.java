package com.arabsoft.ajir.controller;

import java.util.Date;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.arabsoft.ajir.dao.CompetenceDelRep;
import com.arabsoft.ajir.dao.CompetenceDetRep;
import com.arabsoft.ajir.dao.CompetencePersDelRep;
import com.arabsoft.ajir.dao.CompetencePostTravRep;
import com.arabsoft.ajir.dao.CompetencesReqRep;
import com.arabsoft.ajir.dao.NatCompetanceRep;
import com.arabsoft.ajir.dao.PersonnelPRep;
import com.arabsoft.ajir.dao.PersonnelRep;
import com.arabsoft.ajir.entities.CleCompetencePers;
import com.arabsoft.ajir.entities.Competence;
import com.arabsoft.ajir.entities.CompetenceAndPersObject;
import com.arabsoft.ajir.entities.CompetenceDet;
import com.arabsoft.ajir.entities.CompetencePostTrav;
import com.arabsoft.ajir.entities.CompetencesPers;
import com.arabsoft.ajir.entities.CompetencesReq;
import com.arabsoft.ajir.entities.NatCompetance;
import com.arabsoft.ajir.entities.PersonnelP;





@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/Competence")
public class CompetencesController {

	@Autowired
	CompetenceDetRep competenceDetRep;
	
	@Autowired
	CompetencesReqRep competencesReqRep;
	
	
	@Autowired
	NatCompetanceRep natCompetenceRep;
	
	@Autowired
	PersonnelRep personnelRep;
	
	@Autowired
	PersonnelPRep personnelPRep;
	
	
	
	@CrossOrigin
	@GetMapping("/getcomptence/{matPers}")
	 public List<CompetenceDet> getListCodPretPers(@PathVariable String matPers){
		
		
		
		return competenceDetRep.getCompetenceServ(matPers);
		
		
	}
	
	@CrossOrigin
	@GetMapping("/getcomptencereq/{matPers}/{matPersAgent}")
	 public List<CompetenceDet> getListCompetencesReq(@PathVariable String matPers,@PathVariable String matPersAgent){

		return competenceDetRep.getCompetenceRequise(matPers,matPersAgent);

	}
	
	@CrossOrigin
	@GetMapping("/getlispesonel/{codSoc}/{matPers}")
	 public List<PersonnelP> getListPersonnel(@PathVariable String codSoc,@PathVariable String matPers){

		return personnelPRep.getPersService(codSoc, matPers);

	}
	@CrossOrigin
	@GetMapping("/getcomptencereq/{matPers}")
	 public List<CompetencesReq> getListCompetencesReq(@PathVariable String matPers){

		return competencesReqRep.getCompetenceRequise(matPers);

	}
	
	
	@CrossOrigin
	@GetMapping("/getcomptencereqpers/{matPers}/{matPersAgent}")
	 public List<CompetencesReq> getListCompetencesReqPers(@PathVariable String matPers,@PathVariable String matPersAgent){

		return competencesReqRep.getCompetenceRequisePers(matPers,matPersAgent);

	}
	
	@CrossOrigin
	@GetMapping("/getallcompetence")
	public List<NatCompetance>  getall(){
			return  natCompetenceRep.findAll();
		}
	
	@PostMapping("/addcompetence")
	public void createCompetence(@RequestBody Competence obj){
		
		
		String codNatComp =obj.getCod_nat_comp();
		String codComp =obj.getCod_comp();
		String LibComp =obj.getLib_comp();
	
		competenceDetRep.addCompetense(codNatComp, codComp, LibComp);
	}

	@PostMapping("/addcompetencepers")
	public void createCompetencePers(@RequestBody CompetencesPers obj){
		
		String codSoc = obj.getCod_soc();
		String matPers = obj.getCod_candidat();
		String codNatComp =obj.getCod_nat_comp();
		String codComp =obj.getCod_comp();
		Date dateSaisie =obj.getDat_valid();
		String appreciation =obj.getAppreciation();
		String nivCompet =obj.getCod_niv_comp();



		competenceDetRep.addCompetensePers(codSoc, matPers, codNatComp, codComp, dateSaisie,appreciation,nivCompet);
	}
	
	
	//selet competences
	@Autowired
	CompetencePersDelRep competencePersDelRep;
	
	
	@Transactional
	@DeleteMapping("/delet/{codSoc}/{codCandidat}/{codNatComp}/{codComp}")
	public void delete(@PathVariable String codSoc, @PathVariable String codCandidat, @PathVariable String codNatComp, @PathVariable String codComp) {
		competencePersDelRep.deleteById(new CleCompetencePers(codSoc, codCandidat, codNatComp, codComp));
	    // perform any other deletion or update operations on child tables
	}
	
	@Autowired
	CompetenceDelRep competenceDelRep;

	
	
	
	public void createCompetenceDel( Competence competence){
		
		
		String codNatComp =competence.getCod_nat_comp();
		String codComp =competence.getCod_comp();
		String LibComp =competence.getLib_comp();
	
		competenceDetRep.addCompetense(codNatComp, codComp, LibComp);
	}


	public void createCompetencePersDel( CompetencesPers competencePers){
		
		String codSoc = competencePers.getCod_soc();
		String matPers = competencePers.getCod_candidat();
		String codNatComp =competencePers.getCod_nat_comp();
		String codComp =competencePers.getCod_comp();
		Date dateSaisie =competencePers.getDat_valid();
		String appreciation =competencePers.getAppreciation();
		String nivCompet =competencePers.getCod_niv_comp();


		

		competenceDetRep.addCompetensePers(codSoc, matPers, codNatComp, codComp, dateSaisie,appreciation,nivCompet);
	      
		
		System.out.println("codSoc"+codSoc+"matPers"+matPers+" nat :"+codNatComp +"comp :"+codComp+"date :"+dateSaisie+"app :"+appreciation+"niv :"+nivCompet);

	
	}
	
	
	  @Transactional
	  @PostMapping(value = "/savecompetencepers")
	  public void saveCompetencePersDel(@RequestBody  CompetenceAndPersObject obj) {
		 
	   
			createCompetenceDel(obj.getCompetence());
			createCompetencePersDel(obj.getCompetencePers());
	
		  }
	  @Autowired
		CompetencePostTravRep competencePostTrav;
		
		
	  
	
	  @GetMapping("/getcomptencereqise/{matPers}")
		 public List<CompetencePostTrav> getCompetenceReq(@PathVariable String matPers){
			
			
			
			return competencePostTrav.getCompetenceReq(matPers);
			
			
		}  
	  
	  
	  
}
