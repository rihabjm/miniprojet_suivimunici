package com.miniprojet.suivi.controllers;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.miniprojet.suivi.entities.membre;
import com.miniprojet.suivi.model.MessageReponse;
import com.miniprojet.suivi.services.MembreService;
@CrossOrigin("*")
@RestController
@RequestMapping("/membre")
public class MembreController {	
	@Autowired
private MembreService membreService ; 

@GetMapping
private List<membre> getmembre () {
return	membreService.getmembre() ;
}


@PostMapping
private MessageReponse addmembre ( @RequestBody membre membre ) {
	System.out.println(membre.toString());
	return  membreService.ajoutermembre(membre);
}

@PutMapping
private MessageReponse updatemembre (@RequestBody membre membre ) {
	return membreService.updatemembre(membre) ;
	
}

@DeleteMapping("{id}")
private MessageReponse deletmembre (@PathVariable("id") int id) {
	return membreService.supprimermembre(id) ;
	
}
@GetMapping("/bynom/{nom}")
private List<membre> getbyid(@PathVariable("nom")String  nom) {
	return membreService.consultermembrebyNom(nom);
	
}
@PutMapping("/valide")
private MessageReponse validemembre ( @RequestBody membre membre ) {
	System.out.println(membre.toString());
	return  membreService.validemembre(membre);
}


}
