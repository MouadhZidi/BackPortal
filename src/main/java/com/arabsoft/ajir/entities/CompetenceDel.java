package com.arabsoft.ajir.entities;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;


@Entity
@Table(name = "COMPETENCE")
public class CompetenceDel {

	
	@EmbeddedId
    private CleCompetence id;
	

    public String lib_comp;
    public String lib_comp_a;
    public Integer id_competence;
    
    @OneToMany(mappedBy = "competence", cascade = CascadeType.ALL)
    private List<CompetencePersDel> competencePersList;

	public CleCompetence getId() {
		return id;
	}

	public void setId(CleCompetence id) {
		this.id = id;
	}

	public String getLib_comp() {
		return lib_comp;
	}

	public void setLib_comp(String lib_comp) {
		this.lib_comp = lib_comp;
	}

	public String getLib_comp_a() {
		return lib_comp_a;
	}

	public void setLib_comp_a(String lib_comp_a) {
		this.lib_comp_a = lib_comp_a;
	}

	public Integer getId_competence() {
		return id_competence;
	}

	public void setId_competence(Integer id_competence) {
		this.id_competence = id_competence;
	}

	public List<CompetencePersDel> getCompetencePersList() {
		return competencePersList;
	}

	public void setCompetencePersList(List<CompetencePersDel> competencePersList) {
		this.competencePersList = competencePersList;
	}

	public CompetenceDel(CleCompetence id, String lib_comp, String lib_comp_a, Integer id_competence,
			List<CompetencePersDel> competencePersList) {
		super();
		this.id = id;
		this.lib_comp = lib_comp;
		this.lib_comp_a = lib_comp_a;
		this.id_competence = id_competence;
		this.competencePersList = competencePersList;
	}

	public CompetenceDel() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
