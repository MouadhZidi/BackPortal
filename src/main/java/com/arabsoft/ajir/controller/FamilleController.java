package com.arabsoft.ajir.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.arabsoft.ajir.dao.FamilleDao;
import com.arabsoft.ajir.entities.Competence;
import com.arabsoft.ajir.entities.Famille;
import com.arabsoft.ajir.entities.NIVEAU_PERS;

@CrossOrigin("*")
@RestController
@RequestMapping(value = "/famille")
public class FamilleController {
	@Autowired
	FamilleDao fam;

	@GetMapping("/getconjoint/{codsoc}/{matpers}")
	public List<Famille> GETALLBY(@PathVariable("codsoc") String x, @PathVariable("matpers") String y) {
		return fam.Getconjoint(x, y);
	}

	@GetMapping("/getenfant/{codsoc}/{matpers}")
	public List<Famille> GETenfant(@PathVariable("codsoc") String x, @PathVariable("matpers") String y) {

		List<Famille> f = fam.getfambycodsocandmatpers(x, y);

		for (int i = 0; i < f.size(); i++) {
			String s = f.get(i).getSexe();
			String b = f.get(i).getBoursier();
			if (s == null) {
				f.get(i).setSexe("");
			}

			else if (s.equals("M")) {

				f.get(i).setSexe("Masculin");

			} else if (s.equals("F")) {

				f.get(i).setSexe("Feminin");

			} else if (s.isEmpty()) {
				f.get(i).setSexe("nulll");
			}
			if (b == null) {
				f.get(i).setBoursier("");
			}

			else if (b.equals("O")) {

				f.get(i).setBoursier("Oui");

			} else if (b.equals("N")) {

				f.get(i).setBoursier("Non");

			} else if (b.isEmpty()) {
				f.get(i).setBoursier("nulll");
			}

		}

		// if (b=="O") {

		// f.get(i).setBoursier("Oui");

		// }
		// else if (b=="N") {

		// f.get(i).setBoursier("Non");

		// }
		// else { f.get(i).setBoursier(f.get(i).getBoursier());}
		// }

		return f;
	}
//	@PostMapping("/saveFam")
//	public void save(@RequestBody Famille f) {
//		f.setParente("C");
//		fam.save(f);
//		
//		
//	}

	@PostMapping("/AddNewLineConjoint")
	public void AddNewLineConjoint(@RequestBody Famille f){
		
		
		if (fam.getmax(f.getCod_soc(), f.getMat_pers()) == null) {
			f.setParente("C");
			f.setNum_fam((long) 83);
			fam.save(f);

		}

		else if (83 <= fam.getmax(f.getCod_soc(), f.getMat_pers())
				&& (fam.getmax(f.getCod_soc(), f.getMat_pers()) <= 96)) {
			long size =  fam.getmax(f.getCod_soc(), f.getMat_pers());

			f.setParente("C");
			f.setNum_fam(size +1);
			f.setMat_pers(f.getMat_pers());
			f.setCod_soc(f.getCod_soc());

			fam.save(f);

		} else if (fam.existconjoint(f.getCod_soc(), f.getMat_pers()) == null) {
	
			f.setParente("C");

			f.setNum_fam((long) 83);


			fam.save(f);
		} else {

			System.out.println("noooooooooo");
		}

		}
	
	
	@PostMapping("/AddNewLineEnfant")
	public void AddNewLineEnfant(@RequestBody Famille f){
		
		
		if (fam.getmaxEnfant(f.getCod_soc(), f.getMat_pers()) == null) {
			f.setParente("E");
			f.setNum_fam((long) 1);

			fam.save(f);
		} else if (
				 1 <= fam.getmaxEnfant(f.getCod_soc(), f.getMat_pers())
				&& (fam.getmaxEnfant(f.getCod_soc(), f.getMat_pers()) <= 80)) {
			f.setParente("E");
			f.setNum_fam((long) fam.getmaxEnfant(f.getCod_soc(), f.getMat_pers()) + 1);
			fam.save(f);

		} else  {
			// try {
			f.setParente("E");

			f.setNum_fam((long) 1);
			fam.save(f);
			// } catch (Exception e) {
			System.out.println("Something went wrong.");
			// }
		} 

		}
	
	
	
	@PostMapping("/saveFam")
	public void save(@RequestBody List <Famille> f) {
		
	

		for(int i=0;i<f.size();i++) {

		if (fam.getmax(f.get(i).getCod_soc(), f.get(i).getMat_pers()) == null) {
			f.get(i).setParente("C");
			f.get(i).setNum_fam((long) 83);
			fam.save(f.get(i));

		}

		else if (83 <= fam.getmax(f.get(i).getCod_soc(), f.get(i).getMat_pers())
				&& (fam.getmax(f.get(i).getCod_soc(), f.get(i).getMat_pers()) <= 96)) {
			long size =  fam.getmax(f.get(i).getCod_soc(), f.get(i).getMat_pers());

			f.get(i).setParente("C");
			f.get(i).setNum_fam(size +1);
			f.get(i).setMat_pers(f.get(i).getMat_pers());
			f.get(i).setCod_soc(f.get(i).getCod_soc());


			System.out.println("rrrrr"+f.get(i).getNum_fam());
		
			fam.save(f.get(i));

		} else if (fam.existconjoint(f.get(i).getCod_soc(), f.get(i).getMat_pers()) == null) {
			// try {
			f.get(i).setParente("C");

			f.get(i).setNum_fam((long) 83);
			// } catch (Exception e) {
			System.out.println("bbbb"+((long) fam.getmax(f.get(i).getCod_soc(), f.get(i).getMat_pers()) + 1));

			System.out.println("Something went wrong.");
			fam.save(f.get(i));

			// }
		} else {

			System.out.println("noooooooooo");
		}

		}
		fam.saveAll(f);
		System.out.println(f);
	}

	@PostMapping("/saveenf")
	public void saveenfant(@RequestBody List<Famille> f) {
	
		for(int i=0;i<f.size();i++) 
		{
			if (fam.getmaxEnfant(f.get(i).getCod_soc(), f.get(i).getMat_pers()) == null) {
				f.get(i).setParente("E");
				f.get(i).setNum_fam((long) 1);

				fam.save(f.get(i));
			} else if (
					 1 <= fam.getmaxEnfant(f.get(i).getCod_soc(), f.get(i).getMat_pers())
					&& (fam.getmaxEnfant(f.get(i).getCod_soc(), f.get(i).getMat_pers()) <= 80)) {
				f.get(i).setParente("E");
				f.get(i).setNum_fam((long) fam.getmaxEnfant(f.get(i).getCod_soc(), f.get(i).getMat_pers()) + 1);
				fam.save(f.get(i));

			} else  {
				// try {
				f.get(i).setParente("E");

				f.get(i).setNum_fam((long) 1);
				fam.save(f.get(i));
				// } catch (Exception e) {
				System.out.println("Something went wrong.");
				// }
			} 
		}
		

	}
	@PostMapping("/update")
	public void updateEnf(@RequestBody Famille f) {
 fam.save(f);
 }
	@DeleteMapping("/{num}/{mat}")
	public void deletFam(@PathVariable("num") Long num, @PathVariable("mat") String mat) {
		fam.deleteFamille(num, mat);
	}

	@GetMapping("/getMaxConjoint/{codsoc}/{matpers}")
	public Long getMaxConjoint(@PathVariable("codsoc") String x, @PathVariable("matpers") String y) {
		return fam.getmax(x, y);
	}

	@GetMapping("/getMaxEnfant/{codsoc}/{matpers}")
	public Long getMaxEnfant(@PathVariable("codsoc") String x, @PathVariable("matpers") String y) {
		return fam.getmaxEnfant(x, y);
	}

	@PostMapping("/register")
	public void saveUsers(@RequestBody List<Famille> f) {
		for (int i = 0; i < f.size(); i++) {
			if (fam.getmaxEnfant(f.get(i).getCod_soc(), f.get(i).getMat_pers()) == null) {
				f.get(i).setParente("E");
				f.get(i).setNum_fam((long) 1);
				System.out.println("nummmmfam" + f.get(i).getNum_fam());

				fam.saveAll(f);
			} else if (fam.existconjoint(f.get(i).getCod_soc(), f.get(i).getMat_pers()) != null
					&& 1 <= fam.getmaxEnfant(f.get(i).getCod_soc(), f.get(i).getMat_pers())
					&& (fam.getmaxEnfant(f.get(i).getCod_soc(), f.get(i).getMat_pers()) <= 80)) {
				System.out.println(
						"nummmmfam" + ((long) fam.getmaxEnfant(f.get(i).getCod_soc(), f.get(i).getMat_pers()) + 1));

				f.get(i).setParente("E");
				f.get(i).setNum_fam((long) fam.getmaxEnfant(f.get(i).getCod_soc(), f.get(i).getMat_pers()) + 1);

				fam.saveAll(f);

			} else if (fam.existconjoint(f.get(i).getCod_soc(), f.get(i).getMat_pers()) == null) {
				// try {
				f.get(i).setParente("E");

				f.get(i).setNum_fam((long) 1);
				// System.out.println("nummmmfam"+f.get(i).getNum_fam());

				fam.saveAll(f);
				// } catch (Exception e) {
				System.out.println("Something went wrong.");
				// }
			} else {

				System.out.println("noooooooooo");
			}

		}
	}
	@PostMapping("/getenfants")
	public List <Famille> getenfant(@RequestBody Famille f){
		 String codSoc = f.getCod_soc();
			String matPers = f.getMat_pers();
		return fam.getbymatandsocbyenfant(codSoc, matPers);}
	@PostMapping("/findconjoints")
	public List <Famille> findconjoint(@RequestBody Famille f){
		String codSoc = f.getCod_soc();
		String matPers = f.getMat_pers();
		return fam.getbymatandsocbyconjoint(codSoc, matPers);}

}
