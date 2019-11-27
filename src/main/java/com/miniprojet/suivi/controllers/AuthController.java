package com.miniprojet.suivi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
/*import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.password.PasswordEncoder;*/
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.miniprojet.suivi.entities.membre;
import com.miniprojet.suivi.services.MembreService;
@CrossOrigin("*")
@RestController
public class AuthController {
/*
	@Autowired
	private PasswordEncoder passwordEncoder ;
	@Autowired 
	private MembreService membreService ; 
	
	@PostMapping("/login")
	private boolean auth (@RequestParam("login") String login , @RequestParam("mdp") String mdp ) {
		
		UserDetails m =	membreService.loadUserByUsername(login);
	if(m!=null) {
		System.out.println(passwordEncoder.encode(mdp));
		System.out.println(m.getPassword());
		return passwordEncoder.matches(mdp,m.getPassword()) ;
		
	}
	return false ;
	}*/
}
