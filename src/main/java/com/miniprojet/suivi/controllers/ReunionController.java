package com.miniprojet.suivi.controllers;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.miniprojet.suivi.entities.membre;
import com.miniprojet.suivi.entities.reunion;
import com.miniprojet.suivi.model.MessageReponse;
import com.miniprojet.suivi.repositories.RenionRepository;
import com.miniprojet.suivi.services.MembreService;
import com.miniprojet.suivi.services.ReunionService;

@RestController
@RequestMapping("/reunion")
public class ReunionController {

	
	@Autowired
private  ReunionService reunionService ; 
	
	@Autowired
	private RenionRepository RenionRepository ; 

@GetMapping
private List<reunion> getreunion () {
return	reunionService.findall() ;
}
@GetMapping ("/byobj/{objectif}")
private List<reunion > getreunion (@PathVariable("objectif") String objectif){
	return reunionService.rechercherReunion(objectif) ;
}

@PostMapping
private MessageReponse ajouterreunion (@RequestBody reunion reunion) {
	return reunionService.ajoutReunion(reunion);
}

@PutMapping
private MessageReponse updatereunion (@RequestBody reunion reunion) {
	return reunionService.updatereunion(reunion);
}

@DeleteMapping("{id}")
private MessageReponse deletreinion (@PathVariable("id")int id ) {
	return reunionService.supprimerReunion(id);
}


@PutMapping("/valide")
private MessageReponse validereunion (@RequestBody reunion reunion) {
	return reunionService.validereunion(reunion);
}


}
