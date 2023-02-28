package com.arabsoft.ajir.entities;

import java.io.Serializable;

public class Id_COMPETENCE_PERS implements Serializable {
	 private String cod_soc ;
	 private String cod_candidat  ;
	 private String cod_comp       ;	
	 private String cod_nat_comp  ;
	public String getCod_soc() {
		return cod_soc;
	}
	public void setCod_soc(String cod_soc) {
		this.cod_soc = cod_soc;
	}
	public String getCod_candidat() {
		return cod_candidat;
	}
	public void setCod_candidat(String cod_candidat) {
		this.cod_candidat = cod_candidat;
	}
	public String getCod_comp() {
		return cod_comp;
	}
	public void setCod_comp(String cod_comp) {
		this.cod_comp = cod_comp;
	}
	public String getCod_nat_comp() {
		return cod_nat_comp;
	}
	public void setCod_nat_comp(String cod_nat_comp) {
		this.cod_nat_comp = cod_nat_comp;
	}
	public Id_COMPETENCE_PERS() {
		super();
	}
	public Id_COMPETENCE_PERS(String cod_soc, String cod_candidat, String cod_comp, String cod_nat_comp) {
		super();
		this.cod_soc = cod_soc;
		this.cod_candidat = cod_candidat;
		this.cod_comp = cod_comp;
		this.cod_nat_comp = cod_nat_comp;
	}
	
	 


}
