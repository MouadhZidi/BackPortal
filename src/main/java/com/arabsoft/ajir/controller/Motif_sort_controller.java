package com.arabsoft.ajir.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.arabsoft.ajir.dao.MOTIF_SORTDao;
import com.arabsoft.ajir.entities.MOTIF_SORT;

@RestController
@CrossOrigin("*")
@RequestMapping("/Motif")
public class Motif_sort_controller {
	@Autowired MOTIF_SORTDao motif;
	@GetMapping("/getall")
	public List <MOTIF_SORT>  getall(){
		return motif.findAll();
	}

}
