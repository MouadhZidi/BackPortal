package com.arabsoft.ajir.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.arabsoft.ajir.dao.SERVICE_test_Dao;
import com.arabsoft.ajir.dao.Servicedao;
import com.arabsoft.ajir.entities.SERVICE;
import com.arabsoft.ajir.entities.SERVICE_test;

@CrossOrigin("*")
@RestController
@RequestMapping(value = "/serv")
public class Servicecontroller {
	@Autowired Servicedao serv;
	@Autowired SERVICE_test_Dao serv2;

	@GetMapping("/getall")
	public List <SERVICE_test> getall(){
		
		return  serv2.findAll();
		
		
	}
	@GetMapping("/getAllServiceByServ/{serv}")
	public List <SERVICE> getAllServiceByServ(@PathVariable("serv")String code){
		
		return  serv.getall(code);
		
		
	}


}
