package com.arabsoft.ajir.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.arabsoft.ajir.dao.FormatMaskRep;
import com.arabsoft.ajir.entities.FormatMask;


@CrossOrigin(origins="*")
@RestController
@RequestMapping("/mask")
public class FormatMaskController {
	
	@Autowired

    FormatMaskRep 	formaMaskRep ;	
	
	@GetMapping("/getFormat")
	public List<FormatMask>  getAllFormatMask(){
			return  formaMaskRep.findAll();
		}
	@GetMapping("/getFormatDate")
	public FormatMask  getFormatDate(){
			return   formaMaskRep.getmaskdate();
		}
	@GetMapping("/getFormatMontant")
	public FormatMask  getFormatMontant(){
			return   formaMaskRep.getmaskMontant();
		}
}