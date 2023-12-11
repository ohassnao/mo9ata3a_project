package com.mo9ata3a.Entities;

import jakarta.persistence.*;

@Entity
public class Demande_inscri extends Demande{
	@ManyToOne
	private Fonctionnaire_inscri fonc_inscri;

	public Fonctionnaire_inscri getFonc_inscri() {
		return fonc_inscri;
	}

	public void setFonc_inscri(Fonctionnaire_inscri fonc_inscri) {
		this.fonc_inscri = fonc_inscri;
	}
	
}
