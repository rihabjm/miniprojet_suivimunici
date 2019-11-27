package com.miniprojet.suivi.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Droit_Acces {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_droitacces ; 
	@Column(name="ajout")
	private boolean fnc_ajouter ; 
	@Column(name="supprimer")
	private boolean fnc_supprimer ; 
	@Column(name="modoier")
	private boolean fnc_modifier ;
	@Column(name="valider")
	private boolean fnc_valider ; 
	@Column(name="cherhcer")
	private boolean fnc_chercher;
	@Column(name="consulter")
	private boolean fnc_consultertableaudebord ;
	
	@OneToMany
	private List<Agent> agents ;
	
	
	
	public List<Agent> getAgents() {
		return agents;
	}
	public void setAgents(List<Agent> agents) {
		this.agents = agents;
	}
	public int getId_droitacces() {
		return id_droitacces;
	}
	public void setId_droitacces(int id_droitacces) {
		this.id_droitacces = id_droitacces;
	}
	public boolean isFnc_ajouter() {
		return fnc_ajouter;
	}
	public void setFnc_ajouter(boolean fnc_ajouter) {
		this.fnc_ajouter = fnc_ajouter;
	}
	public boolean isFnc_supprimer() {
		return fnc_supprimer;
	}
	public void setFnc_supprimer(boolean fnc_supprimer) {
		this.fnc_supprimer = fnc_supprimer;
	}
	public boolean isFnc_modifier() {
		return fnc_modifier;
	}
	public void setFnc_modifier(boolean fnc_modifier) {
		this.fnc_modifier = fnc_modifier;
	}
	public boolean isFnc_valider() {
		return fnc_valider;
	}
	public void setFnc_valider(boolean fnc_valider) {
		this.fnc_valider = fnc_valider;
	}
	public boolean isFnc_chercher() {
		return fnc_chercher;
	}
	public void setFnc_chercher(boolean fnc_chercher) {
		this.fnc_chercher = fnc_chercher;
	}
	public boolean isFnc_consultertableaudebord() {
		return fnc_consultertableaudebord;
	}
	public void setFnc_consultertableaudebord(boolean fnc_consultertableaudebord) {
		this.fnc_consultertableaudebord = fnc_consultertableaudebord;
	}
	public Droit_Acces(boolean fnc_ajouter, boolean fnc_supprimer, boolean fnc_modifier, boolean fnc_valider,
			boolean fnc_chercher, boolean fnc_consultertableaudebord) {
		super();
		this.fnc_ajouter = fnc_ajouter;
		this.fnc_supprimer = fnc_supprimer;
		this.fnc_modifier = fnc_modifier;
		this.fnc_valider = fnc_valider;
		this.fnc_chercher = fnc_chercher;
		this.fnc_consultertableaudebord = fnc_consultertableaudebord;
	}
	public Droit_Acces() {
		super();
	}
	
	
}
