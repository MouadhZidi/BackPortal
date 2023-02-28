package com.arabsoft.ajir.entities;

import java.io.Serializable;

import javax.persistence.Column;

public class CleCompetencePers  implements Serializable {
	
	
        /**
	 * 
	 */
	private static final long serialVersionUID = 1L;


		@Column(name = "cod_soc")
	    private String cod_soc;
    
    
        @Column(name = "cod_candidat")
	    private String cod_candidat;
	    
	    @Column(name = "cod_nat_comp")
	    private String cod_natComp;
	    
	    
	    @Column(name = "cod_comp")

	    private String cod_comp;
		public String getCodSoc() {
			return getCodSoc();
		}
		public void setCodSoc(String codSoc) {
			this.cod_soc = codSoc;
		}
		public String getCodCandidat() {
			return cod_candidat;
		}
		public void setCodCandidat(String codCandidat) {
			this.cod_candidat = codCandidat;
		}
		public String getCodNatComp() {
			return getCodNatComp();
		}
		public void setCodNatComp(String codNatComp) {
			this.cod_comp = codNatComp;
		}
		public String getCodComp() {
			return cod_comp;
		}
		public void setCodComp(String codComp) {
			this.cod_comp = codComp;
		}
		public CleCompetencePers(String cod_soc, String cod_candidat, String cod_natComp, String cod_comp) {
			super();
			this.cod_soc = cod_soc;
			this.cod_candidat = cod_candidat;
			this.cod_natComp = cod_natComp;
			this.cod_comp = cod_comp;
		}
		public CleCompetencePers() {
			super();
			// TODO Auto-generated constructor stub
		}
	    
	    
	    
	    
}
