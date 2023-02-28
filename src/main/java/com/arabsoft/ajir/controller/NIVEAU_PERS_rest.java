package com.arabsoft.ajir.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.arabsoft.ajir.dao.NIVEAU_PERS_Dao;
import com.arabsoft.ajir.dao.Niveau_Pers_CvDAO;
import com.arabsoft.ajir.entities.NIVEAU_PERS;
import com.arabsoft.ajir.entities.Niveau_Pers_CV;
import com.arabsoft.ajir.entities.Personnel;

@RestController
@CrossOrigin("*")
@RequestMapping("/NIVEAU_PERS")
public class NIVEAU_PERS_rest {
	@Autowired NIVEAU_PERS_Dao niv;
	@Autowired Niveau_Pers_CvDAO niveau_Pers_CvDAO;

	@GetMapping("/getniv/{cod}/{mat}")
	public List <Niveau_Pers_CV> getniv(@PathVariable("cod")String cod,@PathVariable("mat")String mat){
		return niveau_Pers_CvDAO.getNivPers(cod,mat);}
	
	
	
	@PostMapping("/saveNIVEAU_PERS")
	public void save(@RequestBody List<NIVEAU_PERS> p) {
		for(int i=0;i<p.size();i++) {
		if (niv.getmax(p.get(i).getCod_soc(), p.get(i).getMat_pers())==null)
		{
			p.get(i).setNum_niveau((long)1);

			niv.save(p.get(i));	
		}else {
			p.get(i).setNum_niveau((long) niv.getmax(p.get(i).getCod_soc(), p.get(i).getMat_pers())+ 1);

			niv.save(p.get(i));		
		}
	}
	}
	
	@PostMapping("/AddNewLineCV")
	public void AddNewLineCV(@RequestBody NIVEAU_PERS p) {
		
		if (niv.getmax(p.getCod_soc(), p.getMat_pers())==null)
		{
			p.setNum_niveau((long)1);

			niv.save(p);	
		}else {
			p.setNum_niveau((long) niv.getmax(p.getCod_soc(), p.getMat_pers())+ 1);

			niv.save(p);		
		}
	
	}
	
	
	@PostMapping("/nivpers")
	public List <NIVEAU_PERS> getnivpers(@RequestBody NIVEAU_PERS n){
		String codSoc = n.getCod_soc();
		String matPers = n.getMat_pers();
		return niv.getnivpers(codSoc,matPers);}
	@PostMapping("/updateNiv")
	public void updateCv(@RequestBody NIVEAU_PERS p) {
		niv.save(p)	;}
	
	@DeleteMapping("/{cod}/{mat}/{num_niv}")
	public void deletFam(@PathVariable("cod") Long cod, @PathVariable("mat") String mat, @PathVariable("num_niv") String num_niv) {
		niv.deleteCv(cod, mat,num_niv);
	}
}
