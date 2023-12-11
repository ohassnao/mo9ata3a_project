package com.mo9ata3a.Entities;

import java.util.List;

import jakarta.persistence.*;

@Entity
public class Fonctionnaire_legal extends Fonctionnaire{
	@OneToOne
	private Document_legal doc_legal;
	@OneToMany(mappedBy = "fonc_legal")
	private List<Demande_legal> demandes_legal;
}
