package com.arabsoft.ajir.controller;


import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.tomcat.util.http.fileupload.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.arabsoft.ajir.dao.PersonnelRep;
import com.arabsoft.ajir.dao.PhotoPersDao;
import com.arabsoft.ajir.entities.Libre_demandeBis;
import com.arabsoft.ajir.entities.PHOTO_PERS;
import com.arabsoft.ajir.entities.Personnel;
import com.arabsoft.ajir.sevices.PersonnelService;
@CrossOrigin("*")
@RestController
@RequestMapping(value="/infoPers")
public class PersonnelControler {

	@Autowired
	PersonnelService personnelService;
	@Autowired
	PersonnelRep personnelRep;
	@Autowired
	PhotoPersDao persDao; 
	@CrossOrigin
	@PostMapping("/getPers")
	public Personnel getInfosPers(@RequestBody Personnel p) {
		String codSoc = p.getCod_soc();
		String matPers = p.getMat_pers();
		System.out.println("codSoc & matPers : "+codSoc+" || "+matPers);
		return this.personnelService.getpersInfo(codSoc, matPers);
	}
	
	
	@GetMapping("/getPers/{codSoc}/{matPaers}")
	public Personnel getInfosPerse(@PathVariable("codSoc") String c,@PathVariable("matPaers") String p) {

		return this.personnelService.getpersInfo(c, p);
	}

	@GetMapping("/getPers22/{cod_serv}/{mat_pers}")
	public List<Personnel> getInfosPers2(@PathVariable("cod_serv")String cod_serv,@PathVariable ("mat_pers")String mat_pers) {
		
		
		return this.personnelService.getpersInfo2(cod_serv,mat_pers);
	}
	@PostMapping("/savepers")
	public void save(@RequestBody Personnel p) {
		personnelRep.save(p);
		
		
	}
	@GetMapping("/exist/{mat_pers}")
	public Boolean exist(@PathVariable("mat_pers")String mat_pers) {
		return personnelRep.exist(mat_pers);
		
		
	}
	@GetMapping("/files/{id}")
	  public ResponseEntity<byte[]> getFile(@PathVariable String id) {
	    PHOTO_PERS fileDB = personnelService.getFile(id);

	    return ResponseEntity.ok()
	        .body(fileDB.getPhoto());
	  }
	  @PostMapping("/getPersonnel")
		public Personnel get66(@RequestBody Personnel p) {
		  String codSoc = p.getCod_soc();
		String matPers = p.getMat_pers();
			return personnelRep.get66(codSoc,matPers);
			
			
		}
		
}
