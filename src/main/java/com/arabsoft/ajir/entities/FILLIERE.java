package com.arabsoft.ajir.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class FILLIERE {
	@Id
	private String  cod_fil     ;
	private String  lib_fil     ;
	private String  cat_deb_fil ;
	private String  cat_fin_fil ;
	private String   lib_fil_a  ;
	private String   reg_trav   ;
	private Long   taux_maj   ;
	public String getCod_fil() {
		return cod_fil;
	}
	public void setCod_fil(String cod_fil) {
		this.cod_fil = cod_fil;
	}
	public String getLib_fil() {
		return lib_fil;
	}
	public void setLib_fil(String lib_fil) {
		this.lib_fil = lib_fil;
	}
	public String getCat_deb_fil() {
		return cat_deb_fil;
	}
	public void setCat_deb_fil(String cat_deb_fil) {
		this.cat_deb_fil = cat_deb_fil;
	}
	public String getCat_fin_fil() {
		return cat_fin_fil;
	}
	public void setCat_fin_fil(String cat_fin_fil) {
		this.cat_fin_fil = cat_fin_fil;
	}
	public String getLib_fil_a() {
		return lib_fil_a;
	}
	public void setLib_fil_a(String lib_fil_a) {
		this.lib_fil_a = lib_fil_a;
	}
	public String getReg_trav() {
		return reg_trav;
	}
	public void setReg_trav(String reg_trav) {
		this.reg_trav = reg_trav;
	}
	public Long getTaux_maj() {
		return taux_maj;
	}
	public void setTaux_maj(Long taux_maj) {
		this.taux_maj = taux_maj;
	}
	public FILLIERE(String cod_fil, String lib_fil, String cat_deb_fil, String cat_fin_fil, String lib_fil_a,
			String reg_trav, Long taux_maj) {
		super();
		this.cod_fil = cod_fil;
		this.lib_fil = lib_fil;
		this.cat_deb_fil = cat_deb_fil;
		this.cat_fin_fil = cat_fin_fil;
		this.lib_fil_a = lib_fil_a;
		this.reg_trav = reg_trav;
		this.taux_maj = taux_maj;
	}
	public FILLIERE() {
		super();
	}

}
