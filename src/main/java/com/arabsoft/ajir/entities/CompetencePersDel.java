package com.arabsoft.ajir.entities;

import java.util.Date;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;


@Entity
@Table(name = "COMPETENCE_PERS")
public class CompetencePersDel {

	
	
	
	@EmbeddedId
    private CleCompetencePers id;

	public String typ_candidat;

	  @ManyToOne(fetch = FetchType.LAZY)
	    @JoinColumns({
	        @JoinColumn(name = "cod_nat_comp", referencedColumnName = "cod_nat_comp", insertable = false, updatable = false),
	        @JoinColumn(name = "cod_comp", referencedColumnName = "cod_comp", insertable = false, updatable = false)
	    })
    private CompetenceDel competence;
	public String cod_crit_comp;
	public String val_crit_comp;
    @JsonFormat(pattern = "dd/MM/yyyy")
	public Date dat_valid;
	public String appreciation;
	public String cod_niv_comp;
	public Integer denom;
	public Integer div;
	public Integer id_competence_pers;
	
	
	
	public CleCompetencePers getId() {
		return id;
	}
	public void setId(CleCompetencePers id) {
		this.id = id;
	}
	public String getTyp_candidat() {
		return typ_candidat;
	}
	public void setTyp_candidat(String typ_candidat) {
		this.typ_candidat = typ_candidat;
	}
	public CompetenceDel getCompetence() {
		return competence;
	}
	public void setCompetence(CompetenceDel competence) {
		this.competence = competence;
	}
	public String getCod_crit_comp() {
		return cod_crit_comp;
	}
	public void setCod_crit_comp(String cod_crit_comp) {
		this.cod_crit_comp = cod_crit_comp;
	}
	public String getVal_crit_comp() {
		return val_crit_comp;
	}
	public void setVal_crit_comp(String val_crit_comp) {
		this.val_crit_comp = val_crit_comp;
	}
	public Date getDat_valid() {
		return dat_valid;
	}
	public void setDat_valid(Date dat_valid) {
		this.dat_valid = dat_valid;
	}
	public String getAppreciation() {
		return appreciation;
	}
	public void setAppreciation(String appreciation) {
		this.appreciation = appreciation;
	}
	public String getCod_niv_comp() {
		return cod_niv_comp;
	}
	public void setCod_niv_comp(String cod_niv_comp) {
		this.cod_niv_comp = cod_niv_comp;
	}
	public Integer getDenom() {
		return denom;
	}
	public void setDenom(Integer denom) {
		this.denom = denom;
	}
	public Integer getDiv() {
		return div;
	}
	public void setDiv(Integer div) {
		this.div = div;
	}
	public Integer getId_competence_pers() {
		return id_competence_pers;
	}
	public void setId_competence_pers(Integer id_competence_pers) {
		this.id_competence_pers = id_competence_pers;
	}
	public CompetencePersDel(CleCompetencePers id, String typ_candidat, CompetenceDel competence, String cod_crit_comp,
			String val_crit_comp, Date dat_valid, String appreciation, String cod_niv_comp, Integer denom, Integer div,
			Integer id_competence_pers) {
		super();
		this.id = id;
		this.typ_candidat = typ_candidat;
		this.competence = competence;
		this.cod_crit_comp = cod_crit_comp;
		this.val_crit_comp = val_crit_comp;
		this.dat_valid = dat_valid;
		this.appreciation = appreciation;
		this.cod_niv_comp = cod_niv_comp;
		this.denom = denom;
		this.div = div;
		this.id_competence_pers = id_competence_pers;
	}
	public CompetencePersDel() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
}
