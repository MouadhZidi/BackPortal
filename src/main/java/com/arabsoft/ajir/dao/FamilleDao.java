package com.arabsoft.ajir.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.arabsoft.ajir.entities.FAMILLEiD;
import com.arabsoft.ajir.entities.Famille;

public interface FamilleDao extends JpaRepository<Famille, FAMILLEiD> {
	@Query(value="select num_fam,\r\n"
			+ "		   parente_act,\r\n"
		
			+ "		   cod_activite,\r\n"
			+ "		   prenom,\r\n"
			+ "		   parente,\r\n"
			+ "		   dat_mar,\r\n"
			+ "		   nom_jf,\r\n"
			+ "		   dat_naiss,\r\n"
			+ "		   sexe,\r\n"
			+ "		   benef,\r\n"
			+ "		   regime_conj,\r\n"
			+ "		   dat_dece,\r\n"
		+ "		   mat_conj,\r\n"
			+ "		   plaf_tot_remb,\r\n"
			+ "		   cod_soc,\r\n"
			+ "		   mat_pers,\r\n"
			+ "		   lieu_naiss,\r\n"
			+ "		   ass_conj,\r\n"
			+ "		   profession,\r\n"
			+ "		   employeur,\r\n"
			+ "		   dat_div,\r\n"
                       + "boursier,\r\n"
			+ "		   cod_sit,\r\n"
			+ "		   dat_effet_act,\r\n"
			+ "		   num_ass_conj,\r\n"
			+ "		   dat_engag_parent,\r\n"
			+ "		   dat_e_sais,\r\n"
			+ "		   date_validation,\r\n"
		+ "		   declar_all,\r\n"
		+ "		   proced_judic,\r\n"
		+ "		   pension,\r\n"
		+ "		   etat_fam,\r\n"
	+ "		   mere,\r\n"
			+ "		   grp_sang,\r\n"
			+ "		   prenom_a,\r\n"
			+ "		   nom_jf_a,\r\n"
			+ "		   etat_valid,\r\n"
			+ "		   pec,\r\n"
			+ "		   cin,\r\n"
			+ "		   mnt_pension,\r\n"
			+ "		   dat_divorce,\r\n"
	+ "		   pec_mut,\r\n"

	+ "		   nom_pren,\r\n"

	+ "		   num_fich_hand,\r\n"

	+ "		   dat_eff_fich_hand,\r\n"

	+ "		   dat_fin_fich_hand,\r\n"

	+ "		   typ_membre,\r\n"
	+ "		   cin_conj,\r\n"
	+ "		   prenom_mere,\r\n"
	+ "		   num_mere,\r\n"
	+ "		   cod_aff_css,\r\n"
	+ "		   dat_cin,\r\n"

	+ "		   lieu_cin,\r\n"

	+ "		   dat_pec,\r\n"

	+ "		   decode(handicap,'O','Oui','N','Non','','') handicap,\r\n"
	+ "		   dat_pec_mut,\r\n"

	+ "		   presum_nais,\r\n"

	+ "		   observation,\r\n"

+ "		   chronique,\r\n"
	+ "		   typ_cin,\r\n"

	+ "		   id_famille,\r\n"
	+"(select a.lib_activite from ACTIVITE_FAMILLE a where a.cod_activite=f.cod_activite ) libactt,\r\n"

	+ "		   cod_user\r\n"


		+ "	from famille f\r\n"
		+ "	where cod_soc = :codSoc and mat_pers = :matPers and  f.parente='E'",nativeQuery = true)
	public List<Famille> getfambycodsocandmatpers(@Param("codSoc") String codSoc,@Param("matPers") String matPers);
	@Query(value="select num_fam,\r\n"
			+ "		   parente_act,\r\n"
		
			+ "		   cod_activite,\r\n"
			+ "		   prenom,\r\n"
			+ "		   parente,\r\n"
			+ "		   dat_mar,\r\n"
			+ "		   nom_jf,\r\n"
			+ "		   dat_naiss,\r\n"
			+ "		   sexe,\r\n"
			+ "		   benef,\r\n"
			+ "		   regime_conj,\r\n"
			+ "		   dat_dece,\r\n"
		+ "		   mat_conj,\r\n"
			+ "		   plaf_tot_remb,\r\n"
			+ "		   cod_soc,\r\n"
			+ "		   mat_pers,\r\n"
			+ "		   lieu_naiss,\r\n"
			+ "		   ass_conj,\r\n"
			+ "		   profession,\r\n"
			+ "		   employeur,\r\n"
			+ "		   dat_div,\r\n"
                       + "boursier,\r\n"
			+ "		   cod_sit,\r\n"
			+ "		   dat_effet_act,\r\n"
			+ "		   num_ass_conj,\r\n"
			+ "		   dat_engag_parent,\r\n"
			+ "		   dat_e_sais,\r\n"
			+ "		   date_validation,\r\n"
		+ "		   declar_all,\r\n"
		+ "		   proced_judic,\r\n"
		+ "		   pension,\r\n"
		+ "		   etat_fam,\r\n"
	+ "		   mere,\r\n"
			+ "		   grp_sang,\r\n"
			+ "		   prenom_a,\r\n"
			+ "		   nom_jf_a,\r\n"
			+ "		   etat_valid,\r\n"
			+ "		   pec,\r\n"
			+ "		   cin,\r\n"
			+ "		   mnt_pension,\r\n"
			+ "		   dat_divorce,\r\n"
	+ "		   pec_mut,\r\n"

	+ "		   nom_pren,\r\n"

	+ "		   num_fich_hand,\r\n"

	+ "		   dat_eff_fich_hand,\r\n"

	+ "		   dat_fin_fich_hand,\r\n"

	+ "		   typ_membre,\r\n"
	+ "		   cin_conj,\r\n"
	+ "		   prenom_mere,\r\n"
	+ "		   num_mere,\r\n"
	+ "		   cod_aff_css,\r\n"
	+ "		   dat_cin,\r\n"

	+ "		   lieu_cin,\r\n"

	+ "		   dat_pec,\r\n"

	+ "		   decode(handicap,'O','Oui','N','Non','','') handicap,\r\n"
	+ "		   dat_pec_mut,\r\n"

	+ "		   presum_nais,\r\n"

	+ "		   observation,\r\n"

+ "		   chronique,\r\n"
	+ "		   typ_cin,\r\n"

	+ "		   id_famille,\r\n"
	+"(select a.lib_activite from ACTIVITE_FAMILLE a where a.cod_activite=f.cod_activite ) libactt,\r\n"

	+ "		   cod_user\r\n"


		+ "	from famille f\r\n"
		+ "	where cod_soc = :x and mat_pers = :y and  f.parente='C' ",nativeQuery = true)
	public List<Famille> Getconjoint(@Param("x") String x,@Param("y") String y);
	@Query("select f from Famille f where f.cod_soc=:x and f.mat_pers=:y and f.parente='E'")
	public List<Famille> getbymatandsocbyenfant(@Param("x") String x,@Param("y") String y);
	@Query("select f from Famille f where f.cod_soc=:x and f.mat_pers=:y and f.parente='C'")
	public List<Famille> getbymatandsocbyconjoint(@Param("x") String x,@Param("y") String y);

	@Query(value="select max(f.num_fam) from Famille f where f.parente ='C' and cod_soc =:codSoc and mat_pers =:mat ",nativeQuery=true)
	public Long getmax(@Param("codSoc") String codSoc,@Param("mat") String mat);

	@Query(value="select max(f.num_fam) from Famille f where f.parente ='E' and cod_soc =:codSoc and mat_pers =:mat ",nativeQuery=true)
	public Long getmaxEnfant(@Param("codSoc") String codSoc,@Param("mat") String mat);
	
	@Query("select f from Famille f where f.parente = 'C' and cod_soc = :x and mat_pers = :y ")
	public Famille existconjoint(@Param("x") String x,@Param("y") String y);

	
@Query(value="delete from Famille f where f.num_fam=:num and f.mat_pers=:mat",nativeQuery=true)
public void deleteFamille(@Param("num")Long num ,@Param("mat") String mat);
}
