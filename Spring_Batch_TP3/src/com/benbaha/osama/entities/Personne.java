package com.benbaha.osama.entities;


import javax.persistence.*;

@Entity
public class Personne {

	@Id
	private Long id;
	private String prenom, nom, civilite;
	
	public Personne() {	
		
	}

	public Personne(Long id, String prenom, String nom, String civilite) {
		super();
		this.id = id;
		this.prenom = prenom;
		this.nom = nom;
		this.civilite = civilite;
	}


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getCivilite() {
		return civilite;
	}

	public void setCivilite(String civilite) {
		this.civilite = civilite;
	}

	@Override
	public String toString() {
		return "Personne"+id+" [id=" + id + ", prenom=" + prenom + ", nom=" + nom + ", civilite=" + civilite + "]";
	}

	
	
}
