package com.marwa.zitounaTamkin.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ChefAgence implements Serializable{
	public ChefAgence() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String nom;
	private String prenom; 
	private String email;
	private String MotDePasse;
	
	public ChefAgence(Long id, String nom, String prenom, String email, String motDePasse) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		MotDePasse = motDePasse;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMotDePasse() {
		return MotDePasse;
	}

	public void setMotDePasse(String motDePasse) {
		MotDePasse = motDePasse;
	}

	public Long getId() {
		return id;
	}
	
	
}
