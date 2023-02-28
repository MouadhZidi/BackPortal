package com.arabsoft.ajir.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
@Entity
@IdClass(Pk_Competance_poste.class)

public class COMPETENCE_POSTE {
	@Id
	 private String cod_metier;
	@Id
	 private String cod_post;
	@Id
	 private String cod_nat_comp;
	@Id
	 private String cod_comp;
	 private String cod_crit_comp;
	 private String  val_crit_comp;
	 private Long coef_pond;
	 private String typ_comp;
	 private String cod_niv;
	 private Long id_competence_poste;
	 private String courant;
		@Column(insertable = false, updatable = false)

	 private String LIB_POST ;
		@Column(insertable = false, updatable = false)

	 private String LIB_COMP;
		@Column(insertable = false, updatable = false)

	 private String LIB_NIV_COMP;
		@Column(insertable = false, updatable = false)

	 private Double pourcentage;
		
	public COMPETENCE_POSTE(String cod_metier, String cod_post, String cod_nat_comp, String cod_comp,
				String cod_crit_comp, String val_crit_comp, Long coef_pond, String typ_comp, String cod_niv,
				Long id_competence_poste, String courant, String lIB_POST, String lIB_COMP, String lIB_NIV_COMP,
				Double pourcentage) {
			super();
			this.cod_metier = cod_metier;
			this.cod_post = cod_post;
			this.cod_nat_comp = cod_nat_comp;
			this.cod_comp = cod_comp;
			this.cod_crit_comp = cod_crit_comp;
			this.val_crit_comp = val_crit_comp;
			this.coef_pond = coef_pond;
			this.typ_comp = typ_comp;
			this.cod_niv = cod_niv;
			this.id_competence_poste = id_competence_poste;
			this.courant = courant;
			LIB_POST = lIB_POST;
			LIB_COMP = lIB_COMP;
			LIB_NIV_COMP = lIB_NIV_COMP;
			this.pourcentage = pourcentage;
		}
	public String getLIB_POST() {
			return LIB_POST;
		}
		public void setLIB_POST(String lIB_POST) {
			LIB_POST = lIB_POST;
		}
		public String getLIB_COMP() {
			return LIB_COMP;
		}
		public void setLIB_COMP(String lIB_COMP) {
			LIB_COMP = lIB_COMP;
		}
		public String getLIB_NIV_COMP() {
			return LIB_NIV_COMP;
		}
		public void setLIB_NIV_COMP(String lIB_NIV_COMP) {
			LIB_NIV_COMP = lIB_NIV_COMP;
		}
		public Double getPourcentage() {
			return pourcentage;
		}
		public void setPourcentage(Double pourcentage) {
			this.pourcentage = pourcentage;
		}
	public String getCod_metier() {
		return cod_metier;
	}
	public void setCod_metier(String cod_metier) {
		this.cod_metier = cod_metier;
	}
	public String getCod_post() {
		return cod_post;
	}
	public void setCod_post(String cod_post) {
		this.cod_post = cod_post;
	}
	public String getCod_nat_comp() {
		return cod_nat_comp;
	}
	public void setCod_nat_comp(String cod_nat_comp) {
		this.cod_nat_comp = cod_nat_comp;
	}
	public String getCod_comp() {
		return cod_comp;
	}
	public void setCod_comp(String cod_comp) {
		this.cod_comp = cod_comp;
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
	public Long getCoef_pond() {
		return coef_pond;
	}
	public void setCoef_pond(Long coef_pond) {
		this.coef_pond = coef_pond;
	}
	public String getTyp_comp() {
		return typ_comp;
	}
	public void setTyp_comp(String typ_comp) {
		this.typ_comp = typ_comp;
	}
	public String getCod_niv() {
		return cod_niv;
	}
	public void setCod_niv(String cod_niv) {
		this.cod_niv = cod_niv;
	}
	public Long getId_competence_poste() {
		return id_competence_poste;
	}
	public void setId_competence_poste(Long id_competence_poste) {
		this.id_competence_poste = id_competence_poste;
	}
	public String getCourant() {
		return courant;
	}
	public void setCourant(String courant) {
		this.courant = courant;
	}
	public COMPETENCE_POSTE() {
		super();
	}
	public COMPETENCE_POSTE(String cod_metier, String cod_post, String cod_nat_comp, String cod_comp,
			String cod_crit_comp, String val_crit_comp, Long coef_pond, String typ_comp, String cod_niv,
			Long id_competence_poste, String courant) {
		super();
		this.cod_metier = cod_metier;
		this.cod_post = cod_post;
		this.cod_nat_comp = cod_nat_comp;
		this.cod_comp = cod_comp;
		this.cod_crit_comp = cod_crit_comp;
		this.val_crit_comp = val_crit_comp;
		this.coef_pond = coef_pond;
		this.typ_comp = typ_comp;
		this.cod_niv = cod_niv;
		this.id_competence_poste = id_competence_poste;
		this.courant = courant;
	}
	 

}
