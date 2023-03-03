package com.arabsoft.ajir.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.arabsoft.ajir.dao.DashboardInformationDAO;
import com.arabsoft.ajir.entities.DashboardInformation;

@CrossOrigin("*")
@RestController
@RequestMapping("/DashboardInformation")
public class DashboardInformationController {
	
	@Autowired DashboardInformationDAO dashboardInformationDAO;

	@GetMapping("Informations/{codSoc}/{matPers}")
	public DashboardInformation get(@PathVariable("codSoc") String codSoc,@PathVariable("matPers") String matPers) {
		return dashboardInformationDAO.getDashboardInformation(codSoc,matPers);
		
		
		
	}
}
