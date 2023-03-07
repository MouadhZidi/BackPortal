package com.arabsoft.ajir.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.arabsoft.ajir.entities.RolePortail;

public interface RolePortailDAO extends JpaRepository<RolePortail, String>{

	@Query(value=" select c from admuser c where c.role_portail='RH'",nativeQuery = true)
	public List<RolePortail> GetRolePortail();
}
