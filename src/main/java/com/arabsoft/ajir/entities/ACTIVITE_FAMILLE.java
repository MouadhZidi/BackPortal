package com.arabsoft.ajir.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ACTIVITE_FAMILLE {
	@Id
	 private String cod_activite      ;
	 private String  lib_activite      ;
	 private String  allocation       ;
	 private String  parente_act        ;
	 private String  pension            ;
	 private String  lib_activite_a     ;
	 private Long  mnt_pension    ;
	 private Long  age          ;
	 private Long  prm_scol        ;
	 private Long  min_age             ;
	 private Long  max_age         ;
	 private String scol                ;
	 private String typ_activite      ;
	 private Long  id_activite_famille ;
	public String getCod_activite() {
		return cod_activite;
	}
	public void setCod_activite(String cod_activite) {
		this.cod_activite = cod_activite;
	}
	public String getLib_activite() {
		return lib_activite;
	}
	public void setLib_activite(String lib_activite) {
		this.lib_activite = lib_activite;
	}
	public String getAllocation() {
		return allocation;
	}
	public void setAllocation(String allocation) {
		this.allocation = allocation;
	}
	public String getParente_act() {
		return parente_act;
	}
	public void setParente_act(String parente_act) {
		this.parente_act = parente_act;
	}
	public String getPension() {
		return pension;
	}
	public void setPension(String pension) {
		this.pension = pension;
	}
	public String getLib_activite_a() {
		return lib_activite_a;
	}
	public void setLib_activite_a(String lib_activite_a) {
		this.lib_activite_a = lib_activite_a;
	}
	public Long getMnt_pension() {
		return mnt_pension;
	}
	public void setMnt_pension(Long mnt_pension) {
		this.mnt_pension = mnt_pension;
	}
	public Long getAge() {
		return age;
	}
	public void setAge(Long age) {
		this.age = age;
	}
	public Long getPrm_scol() {
		return prm_scol;
	}
	public void setPrm_scol(Long prm_scol) {
		this.prm_scol = prm_scol;
	}
	public Long getMin_age() {
		return min_age;
	}
	public void setMin_age(Long min_age) {
		this.min_age = min_age;
	}
	public Long getMax_age() {
		return max_age;
	}
	public void setMax_age(Long max_age) {
		this.max_age = max_age;
	}
	public String getScol() {
		return scol;
	}
	public void setScol(String scol) {
		this.scol = scol;
	}
	public String getTyp_activite() {
		return typ_activite;
	}
	public void setTyp_activite(String typ_activite) {
		this.typ_activite = typ_activite;
	}
	public Long getId_activite_famille() {
		return id_activite_famille;
	}
	public void setId_activite_famille(Long id_activite_famille) {
		this.id_activite_famille = id_activite_famille;
	}
	public ACTIVITE_FAMILLE() {
		super();
	}
	public ACTIVITE_FAMILLE(String cod_activite, String lib_activite, String allocation, String parente_act,
			String pension, String lib_activite_a, Long mnt_pension, Long age, Long prm_scol, Long min_age,
			Long max_age, String scol, String typ_activite, Long id_activite_famille) {
		super();
		this.cod_activite = cod_activite;
		this.lib_activite = lib_activite;
		this.allocation = allocation;
		this.parente_act = parente_act;
		this.pension = pension;
		this.lib_activite_a = lib_activite_a;
		this.mnt_pension = mnt_pension;
		this.age = age;
		this.prm_scol = prm_scol;
		this.min_age = min_age;
		this.max_age = max_age;
		this.scol = scol;
		this.typ_activite = typ_activite;
		this.id_activite_famille = id_activite_famille;
	}

}
