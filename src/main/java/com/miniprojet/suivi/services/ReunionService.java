package com.miniprojet.suivi.services;

import java.util.List;

import com.miniprojet.suivi.entities.membre;
import com.miniprojet.suivi.entities.reunion;
import com.miniprojet.suivi.model.MessageReponse;

public interface ReunionService {
	public List<reunion> findall() ;
	public MessageReponse ajoutReunion (reunion reunion) ;
	public MessageReponse supprimerReunion ( int id) ;
	public MessageReponse updatereunion(reunion reunion);
public List<reunion> consulterReunion ();	
public List<reunion> rechercherReunion (String objectif ) ;
public MessageReponse validereunion (reunion reunion) ;
public MessageReponse affecterreunion (reunion reunion , List<membre> r);


}
