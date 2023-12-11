package com.mo9ata3a.Entities;

import jakarta.persistence.*;

@Entity
public class Demande_reclam  extends Demande{
	@ManyToOne
	private Fonctionnaire_reclam fonc_reclam;
	
}
