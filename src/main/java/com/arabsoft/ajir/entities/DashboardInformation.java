package com.arabsoft.ajir.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class DashboardInformation {

	@Id
	private String Statut;
	private String Echelon;
	private String Categorie;
	private String Solde_cng;
	private String PBI;
	private String Poste;
	private String Grade;
	private String Fonction;
	private String Affectation;
	
	
	
	
	public String getStatut() {
		return Statut;
	}
	public void setStatut(String statut) {
		Statut = statut;
	}
	public String getEchelon() {
		return Echelon;
	}
	public void setEchelon(String echelon) {
		Echelon = echelon;
	}
	public String getCategorie() {
		return Categorie;
	}
	public void setCategorie(String categorie) {
		Categorie = categorie;
	}
	public String getSolde_cng() {
		return Solde_cng;
	}
	public void setSolde_cng(String solde_cng) {
		Solde_cng = solde_cng;
	}
	public String getPBI() {
		return PBI;
	}
	public void setPBI(String pBI) {
		PBI = pBI;
	}
	public String getPoste() {
		return Poste;
	}
	public void setPoste(String poste) {
		Poste = poste;
	}
	public String getGrade() {
		return Grade;
	}
	public void setGrade(String grade) {
		Grade = grade;
	}
	public String getFonction() {
		return Fonction;
	}
	public void setFonction(String fonction) {
		Fonction = fonction;
	}
	public String getAffectation() {
		return Affectation;
	}
	public void setAffectation(String affectation) {
		Affectation = affectation;
	}
	public DashboardInformation() {
		super();
	}
	public DashboardInformation(String identificate, String statut, String echelon, String categorie, String solde_cng,
			String pBI, String poste, String grade, String fonction, String affectation) {
		super();
		
		Statut = statut;
		Echelon = echelon;
		Categorie = categorie;
		Solde_cng = solde_cng;
		PBI = pBI;
		Poste = poste;
		Grade = grade;
		Fonction = fonction;
		Affectation = affectation;
	}
	@Override
	public String toString() {
		return "DashboardInformation [Identificate=" + ", Statut=" + Statut + ", Echelon=" + Echelon
				+ ", Categorie=" + Categorie + ", Solde_cng=" + Solde_cng + ", PBI=" + PBI + ", Poste=" + Poste
				+ ", Grade=" + Grade + ", Fonction=" + Fonction + ", Affectation=" + Affectation + "]";
	}
	
	
	
	
}
