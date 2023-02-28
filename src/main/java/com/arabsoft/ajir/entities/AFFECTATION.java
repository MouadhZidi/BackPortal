package com.arabsoft.ajir.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class AFFECTATION {
	@Id
	private String cod_affect   ;
	private String  lib_affect   ;
	private String  regime      ;
	private Long  jours        ;
	private Long  heures      ;
	  private String reserve    ;
	  private String  typ_affect  ;
	  private String lib_affect_a;
	  private String  nat_affect   ;
	  private String  cod_mvt     ;
	public String getCod_affect() {
		return cod_affect;
	}
	public void setCod_affect(String cod_affect) {
		this.cod_affect = cod_affect;
	}
	public String getLib_affect() {
		return lib_affect;
	}
	public void setLib_affect(String lib_affect) {
		this.lib_affect = lib_affect;
	}
	public String getRegime() {
		return regime;
	}
	public void setRegime(String regime) {
		this.regime = regime;
	}
	public Long getJours() {
		return jours;
	}
	public void setJours(Long jours) {
		this.jours = jours;
	}
	public Long getHeures() {
		return heures;
	}
	public void setHeures(Long heures) {
		this.heures = heures;
	}
	public String getReserve() {
		return reserve;
	}
	public void setReserve(String reserve) {
		this.reserve = reserve;
	}
	public String getTyp_affect() {
		return typ_affect;
	}
	public void setTyp_affect(String typ_affect) {
		this.typ_affect = typ_affect;
	}
	public String getLib_affect_a() {
		return lib_affect_a;
	}
	public void setLib_affect_a(String lib_affect_a) {
		this.lib_affect_a = lib_affect_a;
	}
	public String getNat_affect() {
		return nat_affect;
	}
	public void setNat_affect(String nat_affect) {
		this.nat_affect = nat_affect;
	}
	public String getCod_mvt() {
		return cod_mvt;
	}
	public void setCod_mvt(String cod_mvt) {
		this.cod_mvt = cod_mvt;
	}
	public AFFECTATION() {
		super();
	}
	public AFFECTATION(String cod_affect, String lib_affect, String regime, Long jours, Long heures, String reserve,
			String typ_affect, String lib_affect_a, String nat_affect, String cod_mvt) {
		super();
		this.cod_affect = cod_affect;
		this.lib_affect = lib_affect;
		this.regime = regime;
		this.jours = jours;
		this.heures = heures;
		this.reserve = reserve;
		this.typ_affect = typ_affect;
		this.lib_affect_a = lib_affect_a;
		this.nat_affect = nat_affect;
		this.cod_mvt = cod_mvt;
	}
	  
	

}
