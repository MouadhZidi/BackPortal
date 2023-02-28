package com.arabsoft.ajir.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonFormat;

public class CleRetardJourne  implements Serializable {
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	    public String cod_soc;
		public String mat_pers;
	    @JsonFormat(pattern = "dd/MM/yyyy")
		public Date dat_point;
		public Integer num_point;
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
		public Date getDat_point() {
			return dat_point;
		}
		public void setDat_point(Date dat_point) {
			this.dat_point = dat_point;
		}
		public Integer getNum_point() {
			return num_point;
		}
		public void setNum_point(Integer num_point) {
			this.num_point = num_point;
		}
		public static long getSerialversionuid() {
			return serialVersionUID;
		}
		public CleRetardJourne(String cod_soc, String mat_pers, Date dat_point, Integer num_point) {
			super();
			this.cod_soc = cod_soc;
			this.mat_pers = mat_pers;
			this.dat_point = dat_point;
			this.num_point = num_point;
		}
		public CleRetardJourne() {
			super();
			// TODO Auto-generated constructor stub
		}
		

}
