package com.mo9ata3a.Entities;
import jakarta.persistence.Entity;

import java.util.List;

import jakarta.persistence.*;

@Entity
public class Admin_commune extends User{
	
	private String commune;
	@OneToMany(mappedBy = "admin_commune")
	private List <Fonctionnaire> fonctionnaires;
	@ManyToOne
	private Admin_logiciel admin_logiciel;
	

}
