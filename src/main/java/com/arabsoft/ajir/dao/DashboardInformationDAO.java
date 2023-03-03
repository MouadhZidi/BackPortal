package com.arabsoft.ajir.dao;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.arabsoft.ajir.entities.DashboardInformation;

@Repository
public interface DashboardInformationDAO extends JpaRepository<DashboardInformation, String>{

	
	
		@Query(value="select p.cod_affect || ' ' ||\r\n"
				+ "       pk_get_lib.GET_AFFECTATIO$LIB_AFFECT(p.cod_affect) ||\r\n"
				+ "       decode(nvl(to_char(p.dat_affect, 'dd/mm/yyyy'), '01/01/0001'),\r\n"
				+ "              '01/01/0001',\r\n"
				+ "              null,\r\n"
				+ "              ' Depuis ') || to_char(p.dat_affect, 'dd/mm/yyyy') Statut,\r\n"
				+ "       p.cod_ech || ' depuis ' || to_char(p.dat_ech, 'dd/mm/yyyy') Echelon,\r\n"
				+ "       p.cod_cat || ' ' ||\r\n"
				+ "       pk_get_lib.GET_CATEGORIE$LIB_CAT(p.cod_categ, p.cod_cat) ||\r\n"
				+ "       ' Depuis ' || to_char(p.dat_cat, 'dd/mm/yyyy') Categorie,\r\n"
				+ "       (select 'Solde actuelle de l annee ' || annee_cng || ' est ' ||\r\n"
				+ "               sold_cng\r\n"
				+ "          from sold_cng\r\n"
				+ "         where cod_soc = p.cod_soc\r\n"
				+ "           and mat_pers = p.mat_pers\r\n"
				+ "           and annee_cng = (select max(annee_cng)\r\n"
				+ "                              from sold_cng\r\n"
				+ "                             where cod_soc = p.cod_soc\r\n"
				+ "                               and mat_pers = p.mat_pers)) Solde_cng,\r\n"
				+ "       p.niv_sal || ' Depuis ' || to_char(p.dat_niv_sal, 'dd/mm/yyyy') PBI,\r\n"
				+ "       p.adm_tech || ' ' ||\r\n"
				+ "       pk_get_lib.GET_TYP_ADM_TE$LIB_ADM_TECH(p.adm_tech) || ' Depuis ' ||\r\n"
				+ "       to_char(p.dat_adm_tech, 'dd/mm/yyyy') Poste,\r\n"
				+ "       p.cod_cat || ' ' ||\r\n"
				+ "       pk_get_lib.GET_GRADE$LIB_GRAD(p.cod_categ, p.cod_cat, p.cod_grad) ||\r\n"
				+ "       ' Depuis ' || to_char(p.dat_grad, 'dd/mm/yyyy') Grade,\r\n"
				+ "       p.cod_fonct || ' ' ||\r\n"
				+ "       pk_get_lib.GET_FONCTIONS$LIB_FONCT(p.cod_fonct, 'F') ||\r\n"
				+ "       decode(nvl(to_char(p.dat_fonct, 'dd/mm/yyyy'), '01/01/0001'),\r\n"
				+ "              '01/01/0001',\r\n"
				+ "              null,\r\n"
				+ "              ' Depuis ') || to_char(p.dat_fonct, 'dd/mm/yyyy') Fonction,\r\n"
				+ "       p.cod_serv || ' ' ||\r\n"
				+ "       pk_get_lib.GET_SERVICE$LIB_SERV(p.cod_soc, p.cod_serv) || ' Depuis ' ||\r\n"
				+ "       to_char(p.dat_serv, 'dd/mm/yyyy') Affectation\r\n"
				+ "  from personnel p where cod_soc =:codSoc and mat_pers=:matPers",nativeQuery = true)
		public DashboardInformation getDashboardInformation(@Param("codSoc")String codSoc,@Param("matPers")String matPers);
}
