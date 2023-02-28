package com.arabsoft.ajir.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class PARAM_NIVEAU {
	@Id
	private String cod_niveau ;
	private String  lib_niveau   ;
	private String  typ_niveau  ;
	private String  etude    ;
	private String  cycle  ;
	private String  nat_niveau  ;
	private String code_domaine ;
	private Long  nbr_an       ;
	private String lib_niveau_a ;
	private Long  rang        ;
	public String getCod_niveau() {
		return cod_niveau;
	}
	public void setCod_niveau(String cod_niveau) {
		this.cod_niveau = cod_niveau;
	}
	public String getLib_niveau() {
		return lib_niveau;
	}
	public void setLib_niveau(String lib_niveau) {
		this.lib_niveau = lib_niveau;
	}
	public String getTyp_niveau() {
		return typ_niveau;
	}
	public void setTyp_niveau(String typ_niveau) {
		this.typ_niveau = typ_niveau;
	}
	public String getEtude() {
		return etude;
	}
	public void setEtude(String etude) {
		this.etude = etude;
	}
	public String getCycle() {
		return cycle;
	}
	public void setCycle(String cycle) {
		this.cycle = cycle;
	}
	public String getNat_niveau() {
		return nat_niveau;
	}
	public void setNat_niveau(String nat_niveau) {
		this.nat_niveau = nat_niveau;
	}
	public String getCode_domaine() {
		return code_domaine;
	}
	public void setCode_domaine(String code_domaine) {
		this.code_domaine = code_domaine;
	}
	public Long getNbr_an() {
		return nbr_an;
	}
	public void setNbr_an(Long nbr_an) {
		this.nbr_an = nbr_an;
	}
	public String getLib_niveau_a() {
		return lib_niveau_a;
	}
	public void setLib_niveau_a(String lib_niveau_a) {
		this.lib_niveau_a = lib_niveau_a;
	}
	public Long getRang() {
		return rang;
	}
	public void setRang(Long rang) {
		this.rang = rang;
	}
	public PARAM_NIVEAU() {
		super();
	}
	public PARAM_NIVEAU(String cod_niveau, String lib_niveau, String typ_niveau, String etude, String cycle,
			String nat_niveau, String code_domaine, Long nbr_an, String lib_niveau_a, Long rang) {
		super();
		this.cod_niveau = cod_niveau;
		this.lib_niveau = lib_niveau;
		this.typ_niveau = typ_niveau;
		this.etude = etude;
		this.cycle = cycle;
		this.nat_niveau = nat_niveau;
		this.code_domaine = code_domaine;
		this.nbr_an = nbr_an;
		this.lib_niveau_a = lib_niveau_a;
		this.rang = rang;
	}

}
