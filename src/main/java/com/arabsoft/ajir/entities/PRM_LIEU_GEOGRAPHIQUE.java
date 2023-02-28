package com.arabsoft.ajir.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class PRM_LIEU_GEOGRAPHIQUE {
	@Id
	  private String cod_lieu_geog  ;
	  private String lib_lieu        ;
	  private String lib_lieu_a      ;
	  private Long dist_lieu_tunis ;
	 private Long nbr_association ;
	public String getCod_lieu_geog() {
		return cod_lieu_geog;
	}
	public void setCod_lieu_geog(String cod_lieu_geog) {
		this.cod_lieu_geog = cod_lieu_geog;
	}
	public String getLib_lieu() {
		return lib_lieu;
	}
	public void setLib_lieu(String lib_lieu) {
		this.lib_lieu = lib_lieu;
	}
	public String getLib_lieu_a() {
		return lib_lieu_a;
	}
	public void setLib_lieu_a(String lib_lieu_a) {
		this.lib_lieu_a = lib_lieu_a;
	}
	public Long getDist_lieu_tunis() {
		return dist_lieu_tunis;
	}
	public void setDist_lieu_tunis(Long dist_lieu_tunis) {
		this.dist_lieu_tunis = dist_lieu_tunis;
	}
	public Long getNbr_association() {
		return nbr_association;
	}
	public void setNbr_association(Long nbr_association) {
		this.nbr_association = nbr_association;
	}
	public PRM_LIEU_GEOGRAPHIQUE() {
		super();
	}
	public PRM_LIEU_GEOGRAPHIQUE(String cod_lieu_geog, String lib_lieu, String lib_lieu_a, Long dist_lieu_tunis,
			Long nbr_association) {
		super();
		this.cod_lieu_geog = cod_lieu_geog;
		this.lib_lieu = lib_lieu;
		this.lib_lieu_a = lib_lieu_a;
		this.dist_lieu_tunis = dist_lieu_tunis;
		this.nbr_association = nbr_association;
	}

}
