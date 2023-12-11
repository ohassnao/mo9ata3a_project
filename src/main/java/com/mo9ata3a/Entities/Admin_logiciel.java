package com.mo9ata3a.Entities;
import java.util.List;

import jakarta.persistence.*;

@Entity
public class Admin_logiciel extends User {
	@OneToMany(mappedBy = "admin_logiciel")
	private List<Admin_commune> admin_commune;
	@OneToMany(mappedBy = "admin_logiciel")
	private List<Fonctionnaire> fonctionnaires;
}
