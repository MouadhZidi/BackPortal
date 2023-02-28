package com.arabsoft.ajir.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Id;

public class CleLigBultStar implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	
	@Id
    public Integer num_bord_assur;
	@Id
	public Integer num_lig_bord;
	@Id
	public Integer num_bult;
	@Id
	public String cod_soc;
	@Id
	public String mat_pers;
	@Id
	public Date dat_soins_star;
	@Id
	public String abrv_act_star;
	public Integer getNum_bord_assur() {
		return num_bord_assur;
	}
	public void setNum_bord_assur(Integer num_bord_assur) {
		this.num_bord_assur = num_bord_assur;
	}
	public Integer getNum_lig_bord() {
		return num_lig_bord;
	}
	public void setNum_lig_bord(Integer num_lig_bord) {
		this.num_lig_bord = num_lig_bord;
	}
	public Integer getNum_bult() {
		return num_bult;
	}
	public void setNum_bult(Integer num_bult) {
		this.num_bult = num_bult;
	}
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
	public Date getDat_soins_star() {
		return dat_soins_star;
	}
	public void setDat_soins_star(Date dat_soins_star) {
		this.dat_soins_star = dat_soins_star;
	}
	public String getAbrv_act_star() {
		return abrv_act_star;
	}
	public void setAbrv_act_star(String abrv_act_star) {
		this.abrv_act_star = abrv_act_star;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public CleLigBultStar(Integer num_bord_assur, Integer num_lig_bord, Integer num_bult, String cod_soc,
			String mat_pers, Date dat_soins_star, String abrv_act_star) {
		super();
		this.num_bord_assur = num_bord_assur;
		this.num_lig_bord = num_lig_bord;
		this.num_bult = num_bult;
		this.cod_soc = cod_soc;
		this.mat_pers = mat_pers;
		this.dat_soins_star = dat_soins_star;
		this.abrv_act_star = abrv_act_star;
	}
	public CleLigBultStar() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
