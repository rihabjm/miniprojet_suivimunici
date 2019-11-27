package com.miniprojet.suivi.services;

import java.util.List;
//
//import org.springframework.security.core.Authentication;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;

import com.miniprojet.suivi.entities.membre;
import com.miniprojet.suivi.model.MessageReponse;


public interface MembreService{
//extends UserDetailsService  {

	
	public MessageReponse ajoutermembre ( membre membre)  ; 	
	public List<membre> getmembre () ; 
	//public UserDetails loadUserByUsername(String login) ;
	//
	public MessageReponse updatemembre( membre membre) ;
public MessageReponse supprimermembre ( int id);
public List<membre> consultermembrebyid(int id);
	
}
