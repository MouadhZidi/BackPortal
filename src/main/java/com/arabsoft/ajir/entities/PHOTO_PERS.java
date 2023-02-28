package com.arabsoft.ajir.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class PHOTO_PERS {
	@Id
	private String  cod_soc ;
	private String  mat_pers;
	private byte[] photo;
	private Long  id_photo_pers;
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
	public byte[] getPhoto() {
		return photo;
	}
	public void setPhoto(byte[] photo) {
		this.photo = photo;
	}
	public Long getId_photo_pers() {
		return id_photo_pers;
	}
	public void setId_photo_pers(Long id_photo_pers) {
		this.id_photo_pers = id_photo_pers;
	}
	
	
}
