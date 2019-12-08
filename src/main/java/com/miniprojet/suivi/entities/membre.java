package com.miniprojet.suivi.entities;

import java.io.Serializable;
import java.util.Collections;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.hibernate.mapping.Collection;
/*import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;*/

import com.fasterxml.jackson.annotation.JsonIgnore;



@Entity
@Table(name = "membre")
public class membre implements Serializable {
//, UserDetails {
	
	@Id
	@GeneratedValue
	private int id ; 
	private int cin ; 
	private String prenom  ;
	private String nom ; 
	private int tel ; 
	private String adresse ; 
	private String poste_membre ; 
	private String login ; 
	@JsonIgnore
	@Column(name="valide")
	private boolean valide_membre ;
	
	
public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public boolean isValide_membre() {
		return valide_membre;
	}
	public void setValide_membre(boolean valide_membre) {
		this.valide_membre = valide_membre;
	}
@OneToOne
private Municipale Municipale ;

@JsonIgnore
@OneToMany
private List<reunion> reunions ;


	public List<reunion> getReunions() {
	return reunions;
}
public void setReunions(List<reunion> reunions) {
	this.reunions = reunions;
}
	public Municipale getMunicipale() {
	return Municipale;
}
public void setMunicipale(Municipale municipale) {
	Municipale = municipale;
}
	
	private String mdp ;
	public int getCin() {
		return cin;
	}
	public void setCin(int cin) {
		this.cin = cin;
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
	public int getTel() {
		return tel;
	}
	public void setTel(int tel) {
		this.tel = tel;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public String getPoste_membre() {
		return poste_membre;
	}
	public void setPoste_membre(String poste_membre) {
		this.poste_membre = poste_membre;
	}

	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	
	public String getMdp() {
		return mdp;
	}
	public void setMdp(String mdp) {
		this.mdp = mdp;
	}

	
	/*
	@JsonIgnore
	@Override
	public java.util.Collection<? extends GrantedAuthority> getAuthorities() {
		// TODO Auto-generated method stub
	 return	Collections.singleton(new SimpleGrantedAuthority("USER"));
	}
	@JsonIgnore
	@Override
	public String getPassword() {
		// TODO Auto-generated method stub
		return getMdp();
	}
	@JsonIgnore
	@Override
	public String getUsername() {
		// TODO Auto-generated method stub
		return getLogin();
	}
	@JsonIgnore
	@Override
	public boolean isAccountNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}
	@JsonIgnore
	@Override
	public boolean isAccountNonLocked() {
		// TODO Auto-generated method stub
		return true;
	}
	@JsonIgnore
	@Override
	public boolean isCredentialsNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}
	@JsonIgnore
	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return true;
	}

*/


	
	

}
