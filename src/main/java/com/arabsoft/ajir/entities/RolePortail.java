package com.arabsoft.ajir.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class RolePortail {

	@Id
	public String use_id;
	public String role_portail;
	public String getUse_id() {
		return use_id;
	}
	public void setUse_id(String use_id) {
		this.use_id = use_id;
	}
	public String getRole_portail() {
		return role_portail;
	}
	public void setRole_portail(String role_portail) {
		this.role_portail = role_portail;
	}
	public RolePortail(String use_id, String role_portail) {
		super();
		this.use_id = use_id;
		this.role_portail = role_portail;
	}
	public RolePortail() {
		super();
	}
	
	
	
	
}
