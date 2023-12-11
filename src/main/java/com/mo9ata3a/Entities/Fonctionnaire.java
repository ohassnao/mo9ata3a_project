package com.mo9ata3a.Entities;
import java.util.List;

import jakarta.persistence.*;

@Entity
public class Fonctionnaire extends User{
	String departement;
	@OneToMany(mappedBy = "fonctionnaire")
	private List <Demande> demandes;
}
