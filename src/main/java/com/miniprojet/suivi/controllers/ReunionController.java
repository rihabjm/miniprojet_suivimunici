package com.miniprojet.suivi.controllers;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.miniprojet.suivi.entities.membre;
import com.miniprojet.suivi.entities.reunion;
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




}
