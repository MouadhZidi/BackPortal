package com.arabsoft.ajir.controller;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.arabsoft.ajir.dao.VALEUR_FICHE_EVALDao;
import com.arabsoft.ajir.entities.VALEUR_FICHE_EVAL;

@RestController
@CrossOrigin("*")
@RequestMapping("/valeurficheeval")
public class ValeurFicheEvalController {
	@Autowired
	VALEUR_FICHE_EVALDao dao;

	@PostMapping("/getvaleurficheeval")
	public List<VALEUR_FICHE_EVAL> getvaleurficheevall(@RequestBody VALEUR_FICHE_EVAL v) {
		String mat_pers=v.getMat_pers();
				String cod_soc=v.getCod_soc();
				String ref_mod=v.getRef_mod();
				String dat_eval=v.getDat_eval();

				
		System.out.println("ssss"+dat_eval);
		

		List <VALEUR_FICHE_EVAL> ss=dao.getFicheEval(mat_pers,cod_soc,ref_mod,dat_eval);
		
		
		
		
		
		return ss;
		
 }
	@PostMapping("/cal")
	public BigDecimal get(@RequestBody VALEUR_FICHE_EVAL v) {
		String mat_pers=v.getMat_pers();
		String cod_soc=v.getCod_soc();
		String ref_mod=v.getRef_mod();
		String dat_eval=v.getDat_eval();
	
	 BigDecimal sum=new BigDecimal(0);
	 BigDecimal cal=new BigDecimal(0);

	 List <VALEUR_FICHE_EVAL> ss=dao.getFicheEval(mat_pers,cod_soc,ref_mod,dat_eval);
	 if(ss.size()>0) {
	 for(int i=0;i<ss.size();i++) {
		BigDecimal nbr=ss.get(i).getNbr_point()!=null   ? new BigDecimal(ss.get(i).getNbr_point().toString()):new BigDecimal(0);
		sum=sum.add((BigDecimal)ss.get(i).getNbr_point());
		
		 cal=sum.multiply(new BigDecimal(100)).divide(new BigDecimal(60),2,BigDecimal.ROUND_DOWN);
		 
		 
	 }
		return cal;}
	 else 
		 return new BigDecimal(0);}

}
