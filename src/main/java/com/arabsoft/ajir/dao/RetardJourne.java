package com.arabsoft.ajir.dao;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.arabsoft.ajir.entities.CleRetardJourne;
import com.arabsoft.ajir.entities.RetardJoune;

public interface RetardJourne extends JpaRepository<RetardJoune,CleRetardJourne> {
   
	
	
	
	
	@Query(value="select\r\n"
			+ "\r\n"
			+ "j.cod_soc, j.mat_pers, j.dat_point, j.num_point,(cast(h_point as varchar(100)) || ' Heures et ' || cast(m_point as varchar(100)) || ' minutes') heur_min, h_reg , m_reg, type, duree_h,\r\n"
			+ "duree_m, duree_tot, semaine, j.cod_serv,  cod_reg, date_shift,\r\n"
			+ "etat_retard, dat_sais, id_retard_journee, h_entre, m_entre, typ_sais, typ_point,transf,cod_aut,\r\n"
			+ "dure_aut, temp_comp, j.nat_comp,\r\n"
			+ "pk_get_lib.Get_personnel$NomPrenom(j.cod_soc,j.mat_pers) nom_pren\r\n"
			+ "\r\n"
			+ "from  retard_journee j,personnel p\r\n"
			+ "where\r\n"
			+ "j.cod_soc=p.cod_soc and  j.mat_pers=p.mat_pers and\r\n"
			+ "\r\n"
			+ "p.cod_serv = (select h.cod_serv from personnel h where h.mat_pers = :matPers and h.cod_soc = :codSoc) and j.mat_pers= :matPersAgent",nativeQuery=true)
	public List<RetardJoune> getRetardDet(@Param("matPers") String matPers,@Param("codSoc") String codSoc,@Param("matPersAgent") String matPersAgent);

	@Query(value="select\r\n"
			+ "\r\n"
			+ "j.cod_soc, j.mat_pers, j.dat_point, j.num_point,(cast(h_point as varchar(100)) || ' Heures et ' || cast(m_point as varchar(100)) || ' minutes') heur_min, h_reg , m_reg, type, duree_h,\r\n"
			+ "duree_m, duree_tot, semaine, j.cod_serv,  cod_reg, date_shift,\r\n"
			+ "etat_retard, dat_sais, id_retard_journee, h_entre, m_entre, typ_sais, typ_point,transf,cod_aut,\r\n"
			+ "dure_aut, temp_comp, j.nat_comp,\r\n"
			+ "pk_get_lib.Get_personnel$NomPrenom(j.cod_soc,j.mat_pers) nom_pren\r\n"
			+ "\r\n"
			+ "from  retard_journee j,personnel p\r\n"
			+ "where\r\n"
			+ "j.cod_soc=p.cod_soc and  j.mat_pers=p.mat_pers and\r\n"
			+ "\r\n"
			+ "p.cod_serv = (select h.cod_serv from personnel h where h.mat_pers = :matPers and h.cod_soc = :codSoc) ",nativeQuery=true)
	public List<RetardJoune> getRetard(@Param("matPers") String matPers,@Param("codSoc") String codSoc);

	
	@Query(value="select\r\n"
			+ "\r\n"
			+ "j.cod_soc, j.mat_pers, j.dat_point, j.num_point,(cast(h_point as varchar(100)) || ' Heures et ' || cast(m_point as varchar(100)) || ' minutes') heur_min, h_reg , m_reg, type, duree_h,\r\n"
			+ "duree_m, duree_tot, semaine, j.cod_serv,  cod_reg, date_shift,\r\n"
			+ "etat_retard, dat_sais, id_retard_journee, h_entre, m_entre, typ_sais, typ_point,transf,cod_aut,\r\n"
			+ "dure_aut, temp_comp, j.nat_comp,\r\n"
			+ "pk_get_lib.Get_personnel$NomPrenom(j.cod_soc,j.mat_pers) nom_pren\r\n"
			+ "\r\n"
			+ "from  retard_journee j,personnel p\r\n"
			+ "where\r\n"
			+ "j.cod_soc=p.cod_soc and  j.mat_pers=p.mat_pers and\r\n"
			+ "\r\n"
			+ "p.cod_serv = (select h.cod_serv from personnel h where h.mat_pers = :matPers and h.cod_soc = :codSoc) and dat_point = :dateSelect",nativeQuery=true)
	public List<RetardJoune> getRetardDate(@Param("matPers") String matPers,@Param("codSoc") String codSoc,@Param("dateSelect") String dateSelect);



}
