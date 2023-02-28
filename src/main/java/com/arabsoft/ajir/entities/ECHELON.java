package com.arabsoft.ajir.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ECHELON {
	@Id
	private Long cod_ech   ;
	private Long  duree_ech ;
	private String  cod_class ;
	private String lib_ech   ;
	public Long getCod_ech() {
		return cod_ech;
	}
	public void setCod_ech(Long cod_ech) {
		this.cod_ech = cod_ech;
	}
	public Long getDuree_ech() {
		return duree_ech;
	}
	public void setDuree_ech(Long duree_ech) {
		this.duree_ech = duree_ech;
	}
	public String getCod_class() {
		return cod_class;
	}
	public void setCod_class(String cod_class) {
		this.cod_class = cod_class;
	}
	public String getLib_ech() {
		return lib_ech;
	}
	public void setLib_ech(String lib_ech) {
		this.lib_ech = lib_ech;
	}
	public ECHELON() {
		super();
	}
	public ECHELON(Long cod_ech, Long duree_ech, String cod_class, String lib_ech) {
		super();
		this.cod_ech = cod_ech;
		this.duree_ech = duree_ech;
		this.cod_class = cod_class;
		this.lib_ech = lib_ech;
	}

}
