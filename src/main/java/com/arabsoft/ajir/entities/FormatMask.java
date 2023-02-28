package com.arabsoft.ajir.entities;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class FormatMask {
	
	@Id
	public String lib;
	public String val1;
	public String val2;
	public String val3;
	public String getLib() {
		return lib;
	}
	public void setLib(String lib) {
		this.lib = lib;
	}
	public String getVal1() {
		return val1;
	}
	public void setVal1(String val1) {
		this.val1 = val1;
	}
	public String getVal2() {
		return val2;
	}
	public void setVal2(String val2) {
		this.val2 = val2;
	}
	public String getVal3() {
		return val3;
	}
	public void setVal3(String val3) {
		this.val3 = val3;
	}
	public FormatMask(String lib, String val1, String val2, String val3) {
		super();
		this.lib = lib;
		this.val1 = val1;
		this.val2 = val2;
		this.val3 = val3;
	}
	public FormatMask() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}