package com.arabsoft.ajir.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.arabsoft.ajir.dao.Statsoldcngdao;
import com.arabsoft.ajir.entities.Stat_Soldcng;

@RestController
@CrossOrigin("*")
@RequestMapping("/statsoldcng")
public class Statsoldcngdaocontroller {
	@Autowired Statsoldcngdao stat;
	@GetMapping("/stat/{cod}/{mat}")
	public List <Stat_Soldcng> gestat(@PathVariable("cod")String cod,@PathVariable("mat") String mat){
		return stat.getStat_Soldcng(cod,mat);}

}
