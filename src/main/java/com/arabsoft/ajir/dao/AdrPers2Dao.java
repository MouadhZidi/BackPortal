package com.arabsoft.ajir.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.arabsoft.ajir.entities.AdrPers;
import com.arabsoft.ajir.entities.AdrPers2;
import com.arabsoft.ajir.entities.CleAdrPers;

public interface AdrPers2Dao extends JpaRepository<AdrPers2, CleAdrPers> {
	 Boolean existsByAdrelectronique(String email);
	  Optional <AdrPers2> findByAdrelectronique(String email);
	  @Query("select a from AdrPers a where a.adr_courant='O' and a.adrelectronique=:adrelectronique")
	   AdrPers findByAdrelectroniqueo(@Param("adrelectronique") String adrelectronique);
	  @Query("select a from AdrPers a where a.adr_courant='O' and a.adrelectronique=:adrelectronique")
	  Optional<AdrPers2> findByAdrelectroniqueoo(@Param("adrelectronique") String adrelectronique);


		@Query(value="select cod_soc,\r\n"
				+ "	   mat_pers,\r\n"
				+ "(pk_get_lib.GET_GOUVERNORA$LIB_GOUV(cod_gouv)) lib_gouv,\r\n"
				+ "(pk_get_lib.GET_POSTE$LIB_POST(cod_post)) libpost,\r\n"

				+ "	   num_adr,\r\n"
				+ "	   cod_gouv,\r\n"
				+ "	   (pk_get_lib.GET_GOUVERNORA$LIB_GOUV(cod_gouv)) lib_gouv,\r\n"
				+ "	   cod_deleg,\r\n"
				+ "	   cod_post,\r\n"
				+ "	   rue,\r\n"
				+ "	   rue_a,\r\n"
				+ "	   tel_pers,\r\n"
				+ "	   fax_pers,\r\n"
				+ "	   adr_courant,\r\n"
				+ "	   adr_electronique,\r\n"
				+ "	   tel_port_pers,\r\n"
				+ "	   numero_adr,\r\n"
				+ "	   etat_adr,\r\n"
				+ "	   immb_pers,\r\n"
				+ "	   app_pers,\r\n"
				+ "	   local_pers,\r\n"
				+ "	   id_adr_pers,\r\n"
				+ "	   rec_mail,\r\n"
				+ "	   cod_user\r\n"
				+ "from adr_pers\r\n"
				+ "where cod_soc = :codSoc and mat_pers = :matPers",nativeQuery = true)
		public List<AdrPers2> getAdrPers(@Param("codSoc") String codSoc,@Param("matPers") String matPers);

		
		  @Query(value="  select s.mat_pers  from personnel p,service s,adr_pers a\r\n"
			  		+ "    where p.cod_soc = s.cod_soc\r\n"
			  		+ "      and p.cod_serv = s.cod_serv\r\n"
			  		+ "      and p.cod_soc = a.cod_soc\r\n"
			  		+ "      and p.mat_pers = a.mat_pers\r\n"
			  		+ "      and p.mat_pers =:mat\r\n"
			  		+ "       and adr_courant = 'O'\r\n",nativeQuery=true)
			  String GetMatChef(@Param("mat") String mat);
		  
		 
		  

			@Query(value="select cod_soc,\r\n"
					+ "	   mat_pers,\r\n"
					+ "(pk_get_lib.GET_GOUVERNORA$LIB_GOUV(cod_gouv)) lib_gouv,\r\n"
					+ "(pk_get_lib.GET_POSTE$LIB_POST(cod_post)) libpost,\r\n"
					+ "	   num_adr,\r\n"
					+ "	   cod_gouv,\r\n"
					+ "	   (pk_get_lib.GET_GOUVERNORA$LIB_GOUV(cod_gouv)) lib_gouv,\r\n"
					+ "	   cod_deleg,\r\n"
					+ "	   cod_post,\r\n"
					+ "	   rue,\r\n"
					+ "	   rue_a,\r\n"
					+ "	   tel_pers,\r\n"
					+ "	   fax_pers,\r\n"
					+ "	   adr_courant,\r\n"
					+ "	   adr_electronique,\r\n"
					+ "	   tel_port_pers,\r\n"
					+ "	   numero_adr,\r\n"
					+ "	   etat_adr,\r\n"
					+ "	   immb_pers,\r\n"
					+ "	   app_pers,\r\n"
					+ "	   local_pers,\r\n"
					+ "	   id_adr_pers,\r\n"
					+ "	   rec_mail,\r\n"
					+ "	   cod_user\r\n"
					+ "from adr_pers\r\n"
					+ "where mat_pers = :matPers",nativeQuery = true)
			public AdrPers2 GetAdrChef(@Param("matPers") String matPers);
}
