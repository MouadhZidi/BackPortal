package com.arabsoft.ajir.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;

import com.fasterxml.jackson.annotation.JsonFormat;
@Entity
@IdClass(Id_COMPETENCE_PERS.class)

public class COMPETENCE_PERS {
	@Id
	 private String cod_soc ;
	@Id
	 private String cod_candidat  ;
	 private String typ_candidat ;
	 @Id
	 private String cod_nat_comp  ;
	 @Id
	 private String cod_comp       ;
	 private String cod_crit_comp   ;
	 private String val_crit_comp    ;
		@JsonFormat( pattern = "dd/MM/yyyy") 

	 private Date dat_valid       ;
	 private String appreciation   ;
	 private String  cod_niv_comp   ;
	 private Long denom              ;
	 private Long  div ;
	 private Long id_competence_pers ;
		@Column(insertable = false, updatable = false)

	 private String libnom;
		@Column(insertable = false, updatable = false)

	 private String libcomp;
		@Column(insertable = false, updatable = false)

	 private String libnivcmp;
		
	public COMPETENCE_PERS(String cod_soc, String cod_candidat, String typ_candidat, String cod_nat_comp,
				String cod_comp, String cod_crit_comp, String val_crit_comp, Date dat_valid, String appreciation,
				String cod_niv_comp, Long denom, Long div, Long id_competence_pers, String libnom, String libcomp,
				String libnivcmp) {
			super();
			this.cod_soc = cod_soc;
			this.cod_candidat = cod_candidat;
			this.typ_candidat = typ_candidat;
			this.cod_nat_comp = cod_nat_comp;
			this.cod_comp = cod_comp;
			this.cod_crit_comp = cod_crit_comp;
			this.val_crit_comp = val_crit_comp;
			this.dat_valid = dat_valid;
			this.appreciation = appreciation;
			this.cod_niv_comp = cod_niv_comp;
			this.denom = denom;
			this.div = div;
			this.id_competence_pers = id_competence_pers;
			this.libnom = libnom;
			this.libcomp = libcomp;
			this.libnivcmp = libnivcmp;
		}
	public String getLibnom() {
			return libnom;
		}
		public void setLibnom(String libnom) {
			this.libnom = libnom;
		}
		public String getLibcomp() {
			return libcomp;
		}
		public void setLibcomp(String libcomp) {
			this.libcomp = libcomp;
		}
		public String getLibnivcmp() {
			return libnivcmp;
		}
		public void setLibnivcmp(String libnivcmp) {
			this.libnivcmp = libnivcmp;
		}
	public String getCod_soc() {
		return cod_soc;
	}
	public void setCod_soc(String cod_soc) {
		this.cod_soc = cod_soc;
	}
	public String getCod_candidat() {
		return cod_candidat;
	}
	public void setCod_candidat(String cod_candidat) {
		this.cod_candidat = cod_candidat;
	}
	public String getTyp_candidat() {
		return typ_candidat;
	}
	public void setTyp_candidat(String typ_candidat) {
		this.typ_candidat = typ_candidat;
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
	public Long getDenom() {
		return denom;
	}
	public void setDenom(Long denom) {
		this.denom = denom;
	}
	public Long getDiv() {
		return div;
	}
	public void setDiv(Long div) {
		this.div = div;
	}
	public Long getId_competence_pers() {
		return id_competence_pers;
	}
	public void setId_competence_pers(Long id_competence_pers) {
		this.id_competence_pers = id_competence_pers;
	}
	public COMPETENCE_PERS() {
		super();
	}
	public COMPETENCE_PERS(String cod_soc, String cod_candidat, String typ_candidat, String cod_nat_comp,
			String cod_comp, String cod_crit_comp, String val_crit_comp, Date dat_valid, String appreciation,
			String cod_niv_comp, Long denom, Long div, Long id_competence_pers) {
		super();
		this.cod_soc = cod_soc;
		this.cod_candidat = cod_candidat;
		this.typ_candidat = typ_candidat;
		this.cod_nat_comp = cod_nat_comp;
		this.cod_comp = cod_comp;
		this.cod_crit_comp = cod_crit_comp;
		this.val_crit_comp = val_crit_comp;
		this.dat_valid = dat_valid;
		this.appreciation = appreciation;
		this.cod_niv_comp = cod_niv_comp;
		this.denom = denom;
		this.div = div;
		this.id_competence_pers = id_competence_pers;
	}
	
	 

}
