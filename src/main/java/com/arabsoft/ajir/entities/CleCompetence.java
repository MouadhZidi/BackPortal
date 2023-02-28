package com.arabsoft.ajir.entities;

import java.io.Serializable;

public class CleCompetence implements Serializable {

	public String cod_nat_comp;
	public String cod_comp;
	
	
	public String getCod_nat_comp() {
		return cod_nat_comp;
	}
	public void setCod_nat_comp(String cod_nat_comp) {
		this.cod_nat_comp = cod_nat_comp;
	}
	public String getCod_comp() {
		return cod_comp;
	}
	public void setCod_comp(String cod_comp) {
		this.cod_comp = cod_comp;
	}
	public CleCompetence(String cod_nat_comp, String cod_comp) {
		super();
		this.cod_nat_comp = cod_nat_comp;
		this.cod_comp = cod_comp;
	}
	public CleCompetence() {
		super();
		// TODO Auto-generated constructor stub
	}
	
    
    
    
}
