package com.arabsoft.ajir.controller;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Blob;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Base64;
import java.util.List;
import java.util.Optional;

import javax.servlet.http.HttpServletResponse;
import javax.sql.rowset.serial.SerialBlob;
import javax.sql.rowset.serial.SerialException;

import org.apache.tomcat.util.http.fileupload.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.arabsoft.ajir.dao.NOTES_EVENEMENTSDao;
import com.arabsoft.ajir.entities.Libre_demandeBis;
import com.arabsoft.ajir.entities.NOTES_EVENEMENTS;
import com.arabsoft.ajir.sevices.NoteEvenementService;
import com.fasterxml.jackson.databind.ObjectMapper;

@CrossOrigin("*")
@RestController
@RequestMapping(value="/noteevent")
public class NOTES_EVENEMENTSController {
	@Autowired
	private NOTES_EVENEMENTSDao dao;
	@Autowired
	private NoteEvenementService evenementService;
	@Autowired NOTES_EVENEMENTSDao noteevent;
	@GetMapping("/getall")
	public List <NOTES_EVENEMENTS> GETALL(){
		return noteevent.findAll();}
	
	
	@GetMapping("/getbyid/{id}")
	public Optional <NOTES_EVENEMENTS> GETbyid(@PathVariable("id")long id){
		return noteevent.findById(id);}

	
	
	@GetMapping("/getbyD")
	public List <NOTES_EVENEMENTS> GETbyD(){
		return noteevent.getD();}
	@GetMapping("/get")
	public List <NOTES_EVENEMENTS> GETbyDd(){
		return noteevent.getNOTES_EVENEMENTS22();}

	
	  @CrossOrigin
	  @GetMapping("/files/{id}")
		public void GETbyid(@PathVariable("id") Long id, HttpServletResponse response)
				throws IOException {
		  NOTES_EVENEMENTS fileDB = noteevent.get(id);

			try {
				response.setHeader("Content-Disposition", "inline;filename=\"" + fileDB.getFile_name() + "\"");
				response.setContentType(fileDB.getContent_type());


				InputStream ins = new ByteArrayInputStream(fileDB.getFichier_joint());
				IOUtils.copy(ins, response.getOutputStream());

			} catch (IOException e) {
				e.printStackTrace();
			} catch (Exception e) {
				e.printStackTrace();
			}

		}
	  
	  @CrossOrigin
	  @GetMapping("/image/{id}")
		public void getImageById(@PathVariable("id") Long id, HttpServletResponse response)
				throws IOException {
		  NOTES_EVENEMENTS fileDB = noteevent.get(id);

			try {
				response.setHeader("Content-Disposition", "inline;filename=\"" + fileDB.getFile_name() + "\"");
				response.setContentType(fileDB.getContent_type_i());


				InputStream ins = new ByteArrayInputStream(fileDB.getIMAGE_EVEN());
				IOUtils.copy(ins, response.getOutputStream());

			} catch (IOException e) {
				e.printStackTrace();
			} catch (Exception e) {
				e.printStackTrace();
			}

		}
	  @CrossOrigin
	  @GetMapping("/images")
		public void getImages(HttpServletResponse response)
				throws IOException {
		  List<NOTES_EVENEMENTS> fileDB = noteevent.getD();
		  System.out.println(fileDB.size());
		  for (int i = 0; i < fileDB.size(); i++) {
	
	
	
			try {
				response.setHeader("Content-Disposition", "inline;filename=\"" + fileDB.get(i).getFile_name() + "\"");
				response.setContentType(fileDB.get(i).getContent_type_i());

			
				InputStream ins = new ByteArrayInputStream(fileDB.get(i).getIMAGE_EVEN());
				IOUtils.copy(ins, response.getOutputStream());

			}
		  catch (IOException e) {
				e.printStackTrace();
			} catch (Exception e) {
				e.printStackTrace();
			}
		  }
		}
	  @CrossOrigin
	  @PostMapping("/createevent")
	  public ResponseEntity<HttpStatus> createDemande(@RequestParam(name="file",required = false)  MultipartFile file,@RequestParam(name="image",required = false) MultipartFile image,@RequestParam("event") String event) throws IOException {	        
		  
		  
		  
		  
		  if ( image == null && file ==null) {
		        System.out.println("no image and no file");
				  NOTES_EVENEMENTS even = new ObjectMapper().readValue(event, NOTES_EVENEMENTS.class);

				  dao.save(even);	
			    	return  ResponseEntity.ok(HttpStatus.OK);

		  }
		  
		  
		  else if (file == null ) {
		        System.out.println("no file");
		        NOTES_EVENEMENTS even = new ObjectMapper().readValue(event, NOTES_EVENEMENTS.class);
				even.setIMAGE_EVEN(image.getBytes());
				even.setFile_name_i(image.getOriginalFilename());
				even.setContent_type_i(image.getContentType());
				even.setPath_i("DB");
				dao.save(even);	   

		    	return  ResponseEntity.ok(HttpStatus.OK);
		        
		    } 
		  else if (image == null) {
		        System.out.println("no image");

			  NOTES_EVENEMENTS even = new ObjectMapper().readValue(event, NOTES_EVENEMENTS.class);
				even.setFichier_joint(file.getBytes());
				even.setFile_name(file.getOriginalFilename());
				even.setContent_type(file.getContentType());
				even.setPath("DB");
			
				dao.save(even);	   

		    	return  ResponseEntity.ok(HttpStatus.OK);
		  }
		  
		  else {
		    	  NOTES_EVENEMENTS even = new ObjectMapper().readValue(event, NOTES_EVENEMENTS.class);
					even.setFichier_joint(file.getBytes());
					even.setFile_name(file.getOriginalFilename());
					even.setContent_type(file.getContentType());
					even.setPath("DB");
					even.setIMAGE_EVEN(image.getBytes());
					even.setFile_name_i(image.getOriginalFilename());
					even.setContent_type_i(image.getContentType());
					even.setPath_i("DB");
					dao.save(even);	   

			    	return  ResponseEntity.ok(HttpStatus.OK);
		    }
		  
		  
		
	    
	    
	    
	    
	    
	  }

	  @GetMapping("/imagess")
	  @ResponseBody
	  public List<byte[]> getImagess() throws IOException  {
		  List<byte[]> images = new ArrayList<>();
	        List<NOTES_EVENEMENTS> imageEntities = noteevent.getD();
	       
	        for (NOTES_EVENEMENTS imageEntity : imageEntities) {
	            images.add(imageEntity.getIMAGE_EVEN());
	        }
	        return images;
	  }
	 

}
