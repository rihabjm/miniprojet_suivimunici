package com.miniprojet.suivi;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.miniprojet.suivi.config.appSecurityConfig;
import com.miniprojet.suivi.controllers.ReunionController;
import com.miniprojet.suivi.entities.membre;
import com.miniprojet.suivi.entities.reunion;
import com.miniprojet.suivi.repositories.MembreRepository;
import com.miniprojet.suivi.repositories.RenionRepository;
import com.miniprojet.suivi.services.MembreService;
import com.miniprojet.suivi.services.ReunionService;


@SpringBootApplication
//@EnableScheduling
public class SuiviMunicipauApplication implements CommandLineRunner{

	
	@Autowired 
	private MembreRepository MembreRepository ;
	
	@Autowired
	private RenionRepository renionRepository ; 

	@Autowired
	private ReunionService reunionService ; 
	
	@Autowired
	private MembreService MembreService ;
	
@Autowired
private MembreRepository membreRepository ; 

	
//	private ReunionController reunionController ; 
	
	public static void main(String[] args) {
		SpringApplication.run(SuiviMunicipauApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
	
	
		//System.out.println(membreRepository.findById(1).orElse(null).getLogin());	
//		ap.bCryptPasswordEncoder() ; 
		//renionRepository.findAll() ; 
	//	MembreRepository.findByLogin("achref");
	/*	
		membre membre = new membre() ; 
		membre.setCin(20);
		membre.setLogin("hszkk");
		membre.setMdp("hmed");
		membre.setTel(22222);
		membre.setPoste_membre(0);
MembreService.ajoutermembre(membre);*/
		

		
	}
}
