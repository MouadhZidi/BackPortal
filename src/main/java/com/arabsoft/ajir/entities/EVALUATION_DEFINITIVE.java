package com.arabsoft.ajir.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;

@Entity
@IdClass(Pk_Evaluation_Definiif.class)
public class EVALUATION_DEFINITIVE {
	@Id
	private String cod_soc ; 
	@Id
	private String mat_pers   ;  
	@Id
	private Long annee  ;      
	private Long taux_real_obj ;
	private Long  taux_app_comp ;
	private Long taux_eval_def ;
	private String  cod_app_def  ; 
	private String  observation ;
	public String getCod_soc() {
		return cod_soc;
	}
	public void setCod_soc(String cod_soc) {
		this.cod_soc = cod_soc;
	}
	public String getMat_pers() {
		return mat_pers;
	}
	public void setMat_pers(String mat_pers) {
		this.mat_pers = mat_pers;
	}
	public Long getAnnee() {
		return annee;
	}
	public void setAnnee(Long annee) {
		this.annee = annee;
	}
	public Long getTaux_real_obj() {
		return taux_real_obj;
	}
	public void setTaux_real_obj(Long taux_real_obj) {
		this.taux_real_obj = taux_real_obj;
	}
	public Long getTaux_app_comp() {
		return taux_app_comp;
	}
	public void setTaux_app_comp(Long taux_app_comp) {
		this.taux_app_comp = taux_app_comp;
	}
	public Long getTaux_eval_def() {
		return taux_eval_def;
	}
	public void setTaux_eval_def(Long taux_eval_def) {
		this.taux_eval_def = taux_eval_def;
	}
	public String getCod_app_def() {
		return cod_app_def;
	}
	public void setCod_app_def(String cod_app_def) {
		this.cod_app_def = cod_app_def;
	}
	public String getObservation() {
		return observation;
	}
	public void setObservation(String observation) {
		this.observation = observation;
	}
	public EVALUATION_DEFINITIVE() {
		super();
	}
	public EVALUATION_DEFINITIVE(String cod_soc, String mat_pers, Long annee, Long taux_real_obj, Long taux_app_comp,
			Long taux_eval_def, String cod_app_def, String observation) {
		super();
		this.cod_soc = cod_soc;
		this.mat_pers = mat_pers;
		this.annee = annee;
		this.taux_real_obj = taux_real_obj;
		this.taux_app_comp = taux_app_comp;
		this.taux_eval_def = taux_eval_def;
		this.cod_app_def = cod_app_def;
		this.observation = observation;
	}
	
	
	
}
