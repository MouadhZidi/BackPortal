package com.arabsoft.ajir.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.arabsoft.ajir.entities.FormatMask;

public interface FormatMaskRep  extends JpaRepository<FormatMask,String>{
	@Query("select f from FormatMask f where f.val2='FormatDatePattern' ")
	public FormatMask getmaskdate();
	
	
	@Query("select f from FormatMask f where f.val2='minFractionDigits' ")
	public FormatMask getmaskMontant();
	
	

}
