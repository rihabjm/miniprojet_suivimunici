package com.miniprojet.suivi.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class reunion {

	@Id
	@GeneratedValue
	private int id_reu ; 
	private String Date_reun; 
	private String type_reun; 
	private String pv_reunion ;
	private String heu_deb_reu ;
	private String heu_fin_reu ; 
	private String objectif ;
	
	@JsonIgnore
	private boolean valide_reu ;
	
	
	
	public boolean isValide() {
		return valide_reu;
	}

	public void setValide(boolean valide) {
		this.valide_reu = valide;
	}
	@JsonIgnore
	@OneToMany
	private List<membre> membres ;
	public int getId_reu() {
		return id_reu;
	}
	
	public List<membre> getMembres() {
		return membres;
	}

	public void setMembres(List<membre> membres) {
		this.membres = membres;
	}

	public void setId_reu(int id_reu) {
		this.id_reu = id_reu;
	}
	public String getDate_reun() {
		return Date_reun;
	}
	public void setDate_reun(String date_reun) {
		Date_reun = date_reun;
	}
	public String getType_reun() {
		return type_reun;
	}
	public void setType_reun(String type_reun) {
		this.type_reun = type_reun;
	}
	public String getPv_reunion() {
		return pv_reunion;
	}
	public void setPv_reunion(String pv_reunion) {
		this.pv_reunion = pv_reunion;
	}
	public String getHeu_deb_reu() {
		return heu_deb_reu;
	}
	public void setHeu_deb_reu(String heu_deb_reu) {
		this.heu_deb_reu = heu_deb_reu;
	}
	public String getHeu_fin_reu() {
		return heu_fin_reu;
	}
	public void setHeu_fin_reu(String heu_fin_reu) {
		this.heu_fin_reu = heu_fin_reu;
	}
	public String getobjectif() {
		return objectif;
	}
	public void setobjectif(String objectif) {
		this.objectif = objectif;
	} 
	
	
	
}
