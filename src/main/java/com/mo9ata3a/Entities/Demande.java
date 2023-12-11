package com.mo9ata3a.Entities;

import java.util.Date;

import jakarta.persistence.*;

@Entity
public class Demande {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id_Demande;
	private String type_demande;
	private String Raison;
	private Date date;
	@ManyToOne
	private Fonctionnaire fonctionnaire;

	
	
	public Long getId_Demande() {
		return Id_Demande;
	}
	public void setId_Demande(Long id_Demande) {
		Id_Demande = id_Demande;
	}
	public String getType_demande() {
		return type_demande;
	}
	public void setType_demande(String type_demande) {
		this.type_demande = type_demande;
	}
	public String getRaison() {
		return Raison;
	}
	public void setRaison(String raison) {
		Raison = raison;
	}
	
}
