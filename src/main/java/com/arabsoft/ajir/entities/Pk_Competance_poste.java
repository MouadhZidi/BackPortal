package com.arabsoft.ajir.entities;

import java.io.Serializable;

public class Pk_Competance_poste implements Serializable {
	 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String cod_metier;
	 private String cod_post;
	 private String cod_nat_comp;
	 private String cod_comp;
	public String getCod_metier() {
		return cod_metier;
	}
	public void setCod_metier(String cod_metier) {
		this.cod_metier = cod_metier;
	}
	public String getCod_post() {
		return cod_post;
	}
	public void setCod_post(String cod_post) {
		this.cod_post = cod_post;
	}
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
	public Pk_Competance_poste() {
		super();
	}
	public Pk_Competance_poste(String cod_metier, String cod_post, String cod_nat_comp, String cod_comp) {
		super();
		this.cod_metier = cod_metier;
		this.cod_post = cod_post;
		this.cod_nat_comp = cod_nat_comp;
		this.cod_comp = cod_comp;
	}
	
	 

}
