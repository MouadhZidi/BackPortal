package com.arabsoft.ajir.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.arabsoft.ajir.entities.NOTES_EVENEMENTS;
@Repository
public interface NOTES_EVENEMENTSDao extends JpaRepository<NOTES_EVENEMENTS, Long> {
	@Query(value="  Select id_evenement ,\r\n"
			+ "  libelle,\r\n"
			+ "  date_even,\r\n"
			+ "  date_expiration,\r\n"
			+ "  fichier_joint,\r\n"
			+ "  typ_even,\r\n"
			+ "  file_name,\r\n"
			+ "  content_type, \r\n"
			+ "  path,\r\n"
			+ "  typ_droit,\r\n"
		
			+ "  from NOTES_EVENEMENTS order by date_even DESC \r\n"
			+ "",nativeQuery=true)
	public List<NOTES_EVENEMENTS> getNOTES_EVENEMENTS();
	
	
	
	@Query(value="select e from NOTES_EVENEMENTS e where e.id_evenement=:x")
	public NOTES_EVENEMENTS get(@Param("x") long x);
	
	
	@Query(value="Select * \r\n "
			+ "  from NOTES_EVENEMENTS e where date_expiration > sysdate\r\n"
			+ " order by e.date_even DESC\r\n"
			,nativeQuery = true)
	public List<NOTES_EVENEMENTS> getD();
	
	
	
	@Query(value=" Select * from NOTES_EVENEMENTS ",nativeQuery=true)
	public List<NOTES_EVENEMENTS> getNOTES_EVENEMENTS22();

}
