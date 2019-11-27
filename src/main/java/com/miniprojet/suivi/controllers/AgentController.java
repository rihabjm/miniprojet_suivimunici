package com.miniprojet.suivi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.miniprojet.suivi.entities.Agent;
import com.miniprojet.suivi.model.MessageReponse;
import com.miniprojet.suivi.services.agentService;

@RestController
@RequestMapping("/agent")
public class AgentController {
	
	@Autowired
	private agentService agentService ;

	
	@PostMapping
	public MessageReponse droitacce (@RequestBody Agent agent) {
		
	return	agentService.droitacces(agent);
	}
	
}
