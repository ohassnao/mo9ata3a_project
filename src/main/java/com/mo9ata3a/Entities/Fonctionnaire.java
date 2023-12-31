package com.mo9ata3a.Entities;
import java.util.List;

import jakarta.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Fonctionnaire extends User{
	String departement;
	@OneToMany(mappedBy = "fonctionnaire")
	private List <Demande> demandes;
	@ManyToOne
	private Admin_commune admin_commune;
	@ManyToOne
	private Admin_logiciel admin_logiciel;
}
