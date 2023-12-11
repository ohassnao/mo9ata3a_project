package com.mo9ata3a.Entities;

import java.util.List;

import jakarta.persistence.*;

public class Fonctionnaire_reclam extends Fonctionnaire{
@OneToMany(mappedBy="fonc_reclam")
private List<Demande_reclam> demande_reclam;
}
