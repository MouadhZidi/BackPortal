package com.arabsoft.ajir.entities;
public class CompetenceAndPersObject {
	private CompetencesPers competencePers;
    private Competence competence;
	public CompetencesPers getCompetencePers() {
		return competencePers;
	}
	public void setCompetencePers(CompetencesPers competencePers) {
		this.competencePers = competencePers;
	}
	public Competence getCompetence() {
		return competence;
	}
	public void setCompetence(Competence competence) {
		this.competence = competence;
	}
	public CompetenceAndPersObject(CompetencesPers competencePers, Competence competence) {
		super();
		this.competencePers = competencePers;
		this.competence = competence;
	}
	public CompetenceAndPersObject() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
    
}
