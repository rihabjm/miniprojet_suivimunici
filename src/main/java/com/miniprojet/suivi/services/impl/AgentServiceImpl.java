package com.miniprojet.suivi.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.miniprojet.suivi.entities.Agent;
import com.miniprojet.suivi.entities.Droit_Acces;
import com.miniprojet.suivi.entities.membre;
import com.miniprojet.suivi.entities.reunion;
import com.miniprojet.suivi.model.MessageReponse;
import com.miniprojet.suivi.repositories.AgentRepository;
import com.miniprojet.suivi.repositories.Droit_accesRepository;
import com.miniprojet.suivi.repositories.MembreRepository;
import com.miniprojet.suivi.services.agentService;
@Service
public class AgentServiceImpl implements agentService {

	@Autowired
	private Droit_accesRepository Droit_accesRepository ;

	@Autowired
	private AgentRepository AgentRepository;
	
	@Autowired
	private MembreRepository MembreRepository ;
	@Override
	public MessageReponse droitacces(Agent agent) {

		
		if ( agent.getType_agent().equals("Agent de saisie") ){
	//
		membre membre =	MembreRepository.findMembreByCin( agent.getCin()).get(0) ;	
	
if(	membre ==null) {
	System.out.println("erreur");
	new MessageReponse(false," memebre introuvable"); 
}else {


	Droit_Acces dr = new Droit_Acces(true, false, true, false, true, false);
	Droit_accesRepository.save(dr);
	agent.setDroit_Acces(dr);
	AgentRepository.save(agent);
//	membre membre2 = MembreRepository.findByCinAndLogin(agent.getCin(), agent.getLogin()).get(0);
	MembreRepository.delete(membre);
	return new MessageReponse(true, "agent de saisie effectue avec ses droit d'acces");
}
	
} else if (agent.getType_agent()=="Agent de validation") {

membre membre =	MembreRepository.findMembreByCin( agent.getCin()).get(0) ;	

if(	membre ==null) {
System.out.println("erreur");
new MessageReponse(false," memebre introuvable"); 
}else {


	Droit_Acces dr = new Droit_Acces(false, true, false, true, false, false);
Droit_accesRepository.save(dr);
agent.setDroit_Acces(dr);
AgentRepository.save(agent);
//membre membre2 = MembreRepository.findByCinAndLogin(agent.getCin(), agent.getLogin()).get(0);
MembreRepository.delete(membre);
return new MessageReponse(true, "agent de saisie effectue avec ses droit d'acces");
}
	
}else if (agent.getType_agent()=="Agent de consultation du tableau du bord"){
	
	membre membre =	MembreRepository.findMembreByCin( agent.getCin()).get(0) ;	

	if(	membre ==null) {
	System.out.println("erreur");
	new MessageReponse(false," memebre introuvable"); 
	}else {


		Droit_Acces dr = new Droit_Acces(false, false, false, false, false, true);
	Droit_accesRepository.save(dr);
	agent.setDroit_Acces(dr);
	AgentRepository.save(agent);
	//membre membre2 = MembreRepository.findByCinAndLogin(agent.getCin(), agent.getLogin()).get(0);
	MembreRepository.delete(membre);
	return new MessageReponse(true, "agent de saisie effectue avec ses droit d'acces");}
	
}else if (agent.getType_agent()=="Agent de consultation annuaire") {
	membre membre =	MembreRepository.findMembreByCin( agent.getCin()).get(0) ;	

	if(	membre ==null) {
	System.out.println("erreur");
	new MessageReponse(false," memebre introuvable"); 
	}else {


		Droit_Acces dr = new Droit_Acces(false, false, false, false, false, true);
	Droit_accesRepository.save(dr);
	agent.setDroit_Acces(dr);
	AgentRepository.save(agent);
	//membre membre2 = MembreRepository.findByCinAndLogin(agent.getCin(), agent.getLogin()).get(0);
	MembreRepository.delete(membre);
	return new MessageReponse(true, "agent de saisie effectue avec ses droit d'acces");}
}else 
{
	return new MessageReponse(false, "type incorrect");
}
return new MessageReponse(false, "erreur");
	}

}
