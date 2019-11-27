package com.miniprojet.suivi.services;

import java.util.List;

import com.miniprojet.suivi.entities.reunion;
import com.miniprojet.suivi.model.MessageReponse;

public interface ReunionService {
	public List<reunion> findall() ;
	public MessageReponse ajoutReunion (reunion reunion) ;
	public MessageReponse supprimerReunion ( int id) ;
public List<reunion> consulterReunion ();	

}
