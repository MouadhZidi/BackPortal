package com.arabsoft.ajir.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.arabsoft.ajir.dao.AFFECTATIONDao;
import com.arabsoft.ajir.dao.CLASSE_ADM_DAO;
import com.arabsoft.ajir.dao.ECHELONDao;
import com.arabsoft.ajir.dao.FILLIERE_Dao;
import com.arabsoft.ajir.dao.FONCTIONS_DAO;
import com.arabsoft.ajir.dao.GOUVERNORAT_DAO;
import com.arabsoft.ajir.dao.LISTE_DOMAINE_dAO;
import com.arabsoft.ajir.dao.Metier_Dao;
import com.arabsoft.ajir.dao.PARAM_NIVEAU_Dao;
import com.arabsoft.ajir.dao.POSTE_TRAV_Dao;
import com.arabsoft.ajir.dao.PRM_LIEU_GEOGRAPHIQUE_Dao;
import com.arabsoft.ajir.dao.TYP_ADM_TECH_Dao;
import com.arabsoft.ajir.entities.AFFECTATION;
import com.arabsoft.ajir.entities.CLASSE_ADM;
import com.arabsoft.ajir.entities.ECHELON;
import com.arabsoft.ajir.entities.FILLIERE;
import com.arabsoft.ajir.entities.FONCTIONS;
import com.arabsoft.ajir.entities.GOUVERNORAT;
import com.arabsoft.ajir.entities.LISTE_DOMAINE;
import com.arabsoft.ajir.entities.METIER;
import com.arabsoft.ajir.entities.PARAM_NIVEAU;
import com.arabsoft.ajir.entities.POSTE_TRAV;
import com.arabsoft.ajir.entities.PRM_LIEU_GEOGRAPHIQUE;
import com.arabsoft.ajir.entities.TYP_ADM_TECH;

@RestController
@CrossOrigin
@RequestMapping("/Lib")
public class LibelleController {
	@Autowired AFFECTATIONDao aff;
	@Autowired PARAM_NIVEAU_Dao niv;
	@Autowired POSTE_TRAV_Dao POST8TRAV8DAO;
	@Autowired Metier_Dao met;
	@Autowired TYP_ADM_TECH_Dao adm;
	@Autowired PRM_LIEU_GEOGRAPHIQUE_Dao PRM_LIEU_GEO;
	@Autowired FILLIERE_Dao FIL;
	@Autowired LISTE_DOMAINE_dAO dom;
	@Autowired GOUVERNORAT_DAO gouv;
	@Autowired CLASSE_ADM_DAO CLASSADM;
	@Autowired FONCTIONS_DAO FCT;

	@Autowired ECHELONDao ech;






	@GetMapping("/getaffectation")
	public List<AFFECTATION>  getallaffectation(){
		return aff.findAll();
	}
	@GetMapping("/getniv")
	public List<PARAM_NIVEAU>  getallniv(){
		return niv.findAll();
	}
	@GetMapping("/getpost_trav")
	public List<POSTE_TRAV>  getallpost_trav(){
		return POST8TRAV8DAO.findAll();
	}
	@GetMapping("/getmetier")
	public List<METIER>  getallmetier(){
		return met.findAll();
	}
	@GetMapping("/gettypeadmtech")
	public List<TYP_ADM_TECH>  getallADM_TECH(){
		return adm.findAll();
	}
	@GetMapping("/getPRM_LIEU_GEOGRAPHIQUE")
	public List<PRM_LIEU_GEOGRAPHIQUE>  getallPRM_LIEU_GEOGRAPHIQUE(){
		return PRM_LIEU_GEO.findAll();
	}
	@GetMapping("/getFiliere")
	public List<FILLIERE>  getallFILLIERE(){
		return FIL.findAll();
	}
	@GetMapping("/getdomaine")
	public List<LISTE_DOMAINE>  getalldomaine(){
		return dom.findAll();
	}
	@GetMapping("/getgouv")
	public List<GOUVERNORAT>  getallgouvernorat(){
		return gouv.findAll();
	}
	@GetMapping("/getclass_adm")
	public List<CLASSE_ADM>  getallclass_adm(){
		return CLASSADM.findAll();
	}
	@GetMapping("/getfct")

	public List<FONCTIONS> getfct(){
		
		return FCT.getfct();

	}
	@GetMapping("/getallech")
	public List<ECHELON> getallECHELON(){
		return ech.findAll();
	}



}
