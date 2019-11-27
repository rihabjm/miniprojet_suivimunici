package com.miniprojet.suivi.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
@Table(name="municipale")
public class Municipale {
	
	@Id

	@GeneratedValue(strategy = GenerationType.IDENTITY)
private int id ; 
private String ville ; 
private String gouvernant ;
private String Type_municipale ; 

@JsonIgnore
@OneToMany
private List<membre> membres ;


@JsonIgnore
public List<membre> getMembres() {
	return membres;
}


public void setMembres(ArrayList<membre> membres) {
	this.membres = membres;
}



public int getId() {
	return id;
}


public void setId(int id) {
	this.id = id;
}


public String getVille() {
	return ville;
}


public void setVille(String ville) {
	this.ville = ville;
}


public String getGouvernant() {
	return gouvernant;
}


public void setGouvernant(String gouvernant) {
	this.gouvernant = gouvernant;
}


public String getType_municipale() {
	return Type_municipale;
}


public void setType_municipale(String type_municipale) {
	Type_municipale = type_municipale;
}




	
}
