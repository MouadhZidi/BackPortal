package com.arabsoft.ajir.sevices;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.arabsoft.ajir.dao.AdrPers2Dao;
import com.arabsoft.ajir.dao.AdrPersRep;
import com.arabsoft.ajir.dao.ComptePersDAO;
import com.arabsoft.ajir.dao.Etablis_PERSdAO;
import com.arabsoft.ajir.dao.PersonnelRep;
import com.arabsoft.ajir.dao.PhotoPersDao;
import com.arabsoft.ajir.dao.PossModpDAO;
import com.arabsoft.ajir.dao.PossedeDao;
import com.arabsoft.ajir.dao.RenseignementPersDAO;
import com.arabsoft.ajir.entities.Libre_demandeBis;
import com.arabsoft.ajir.entities.PHOTO_PERS;
import com.arabsoft.ajir.entities.POSSEDE;
import com.arabsoft.ajir.entities.Personnel;
import com.arabsoft.ajir.entities.PossModp;
import com.arabsoft.ajir.entities.RenseignementPers;

@Service
public class PersonnelService {
	
	@Autowired
	PersonnelRep personnelDAO;
	@Autowired
	AdrPers2Dao adrPersDAO;
	@Autowired
	PossModpDAO possModpDAO;
	@Autowired
	RenseignementPersDAO renseignementPersDAO;
	@Autowired
	Etablis_PERSdAO ETABB;
	@Autowired
	PossModpService possModpService;
	@Autowired
	PossedeDao possdao;
	@Autowired 
	PhotoPersDao persDao;
	
	public Personnel getpersInfo(String codSoc,String matPers) {
		Personnel p = this.personnelDAO.getPersonnel(codSoc, matPers);
		p.setAdresses_personnel(adrPersDAO.getAdrPers(codSoc, matPers));
		p.setMode_payement(possModpService.getListPossModp(codSoc, matPers));
		p.setRens_pers(renseignementPersDAO.getRensPers(codSoc, matPers));
		p.setEtab(ETABB.getetablissementbycodesocandmatpers(codSoc, matPers));
	p.setPossede(this.getListPOSS(codSoc, matPers));
		return p;
	}
	public List <Personnel> getpersInfo2(String cod_serv,String mat) {
		List <Personnel> p = personnelDAO. getPersonnel2(cod_serv,mat);
		
		//p.setAdresses_personnel(adrPersDAO.getAdrPers(p.getCod_soc(), p.getMat_pers()));
		//p.setMode_payement(possModpService.getListPossModp(p.getCod_soc(), p.getMat_pers()));
		//p.setRens_pers(renseignementPersDAO.getRensPers(p.getCod_soc(), p.getMat_pers()));
		//p.setEtab(ETABB.getetablissementbycodesocandmatpers(p.getCod_soc(), p.getMat_pers()));
		//p.setPossede(this.getListPOSS(p.getCod_soc(), p.getMat_pers()));

		for(Personnel pr: p) {
			//pr.setAdresses_personnel(adrPersDAO.getAdrPers(pr.getCod_soc(), pr.getMat_pers()));
			//pr.setMode_payement(possModpService.getListPossModp(pr.getCod_soc(), pr.getMat_pers()));
			//pr.setRens_pers(renseignementPersDAO.getRensPers(pr.getCod_soc(), pr.getMat_pers()));
			//pr.setEtab(ETABB.getetablissementbycodesocandmatpers(pr.getCod_soc(), pr.getMat_pers()));
			//pr.setPossede(this.getListPOSS(pr.getCod_soc(), pr.getMat_pers()));
			
			
		//System.out.println("fsssds"+p.getCod_soc());
		
			
			
			
			
		}
		return p;
	}
	
	
	public List<POSSEDE> getListPOSS(String codSoc,String matPers){
		List<POSSEDE> mp =possdao.getPOSSEDEPers(codSoc, matPers);		
		for (int i=0;i<mp.size();i++) {
			String d=mp.get(i).getAbrv_fixe();
			mp.get(i).setLib_ind(possdao.getlibind(d));
		}
		return  mp;
	}
	
	  public PHOTO_PERS getFile(String id) {
		    return  persDao.gettByMat(id);
		  }

}

