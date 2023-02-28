package com.arabsoft.ajir.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class FONCTIONS {
	@Id
	 private String cod_fonct ;   
	 private String lib_fonct   ;
	 private String  typ_fonct    ;
	 private String  abrv_fonct  ;
	 private Long  niveau     ;
	 private String  lib_fonct_a  ;
	 private String  reserve     ;
	 private String  resp_fonct   ;
	 private Long  nb_sal     ;
	 private Long  ind_insal ;
	  private String  strategiqu   ;
	  private Long  id_fonctions ;
	  private String  note        ;
	public String getCod_fonct() {
		return cod_fonct;
	}
	public void setCod_fonct(String cod_fonct) {
		this.cod_fonct = cod_fonct;
	}
	public String getLib_fonct() {
		return lib_fonct;
	}
	public void setLib_fonct(String lib_fonct) {
		this.lib_fonct = lib_fonct;
	}
	public String getTyp_fonct() {
		return typ_fonct;
	}
	public void setTyp_fonct(String typ_fonct) {
		this.typ_fonct = typ_fonct;
	}
	public String getAbrv_fonct() {
		return abrv_fonct;
	}
	public void setAbrv_fonct(String abrv_fonct) {
		this.abrv_fonct = abrv_fonct;
	}
	public Long getNiveau() {
		return niveau;
	}
	public void setNiveau(Long niveau) {
		this.niveau = niveau;
	}
	public String getLib_fonct_a() {
		return lib_fonct_a;
	}
	public void setLib_fonct_a(String lib_fonct_a) {
		this.lib_fonct_a = lib_fonct_a;
	}
	public String getReserve() {
		return reserve;
	}
	public void setReserve(String reserve) {
		this.reserve = reserve;
	}
	public String getResp_fonct() {
		return resp_fonct;
	}
	public void setResp_fonct(String resp_fonct) {
		this.resp_fonct = resp_fonct;
	}
	public Long getNb_sal() {
		return nb_sal;
	}
	public void setNb_sal(Long nb_sal) {
		this.nb_sal = nb_sal;
	}
	public Long getInd_insal() {
		return ind_insal;
	}
	public void setInd_insal(Long ind_insal) {
		this.ind_insal = ind_insal;
	}
	public String getStrategiqu() {
		return strategiqu;
	}
	public void setStrategiqu(String strategiqu) {
		this.strategiqu = strategiqu;
	}
	public Long getId_fonctions() {
		return id_fonctions;
	}
	public void setId_fonctions(Long id_fonctions) {
		this.id_fonctions = id_fonctions;
	}
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
	public FONCTIONS() {
		super();
	}
	public FONCTIONS(String cod_fonct, String lib_fonct, String typ_fonct, String abrv_fonct, Long niveau,
			String lib_fonct_a, String reserve, String resp_fonct, Long nb_sal, Long ind_insal, String strategiqu,
			Long id_fonctions, String note) {
		super();
		this.cod_fonct = cod_fonct;
		this.lib_fonct = lib_fonct;
		this.typ_fonct = typ_fonct;
		this.abrv_fonct = abrv_fonct;
		this.niveau = niveau;
		this.lib_fonct_a = lib_fonct_a;
		this.reserve = reserve;
		this.resp_fonct = resp_fonct;
		this.nb_sal = nb_sal;
		this.ind_insal = ind_insal;
		this.strategiqu = strategiqu;
		this.id_fonctions = id_fonctions;
		this.note = note;
	}

}
