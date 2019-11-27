package com.miniprojet.suivi.entities;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Agent extends membre {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String type_agent ;
	
	@OneToOne
	private Droit_Acces droit_Acces ; 

	public String getType_agent() {
		return type_agent;
	}

	public void setType_agent(String type_agent) {
		this.type_agent = type_agent;
	}

	public Droit_Acces getDroit_Acces() {
		return droit_Acces;
	}

	public void setDroit_Acces(Droit_Acces droit_Acces) {
		this.droit_Acces = droit_Acces;
	} 
	
	
	

}
