package com.miniprojet.suivi.services.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.miniprojet.suivi.entities.membre;
import com.miniprojet.suivi.entities.reunion;
import com.miniprojet.suivi.model.MessageReponse;
import com.miniprojet.suivi.repositories.MembreRepository;
import com.miniprojet.suivi.repositories.RenionRepository;
import com.miniprojet.suivi.services.ReunionService;


@Service
@Transactional
public class ReunionServiceImpl implements ReunionService {
	
	@Autowired
private RenionRepository RenionRepository ; 
	
	@Autowired
	private MembreRepository MembreRepository ;
	
	
	
	@Override
	public List<reunion> findall() {
		// TODO Auto-generated method stub
return	RenionRepository.findAll() ;
	}


	@Override
	public MessageReponse ajoutReunion(reunion reunion) {
		// TODO Auto-generated method stub
RenionRepository.save(reunion);
return new MessageReponse(true, reunion.getId_reu()+ "reunion est ajouter ") ;
}


	@Override
	public MessageReponse supprimerReunion(int id) {
		// TODO Auto-generated method stub
		reunion reunion = RenionRepository.findById(id).orElse(null); 
		if (reunion !=null) {
			//System.out.println("");
			RenionRepository.delete(reunion);
			return new MessageReponse(true,"reunion d"+ id+ "est supprimer");
		}

		return new MessageReponse(false, "introuvable");
	}


	@Override
	public List<reunion> consulterReunion() {
		// TODO Auto-generated method stub
	return RenionRepository.findAll();
	}


	@Override
	public List<reunion> rechercherReunion(String objectif) {
		return RenionRepository.findReunionByObjectif(objectif);
	}


	@Override
	public MessageReponse updatereunion(reunion reunion) {
RenionRepository.save(reunion) ; 
return new MessageReponse(true, "reunion est modifier") ;
	}


	@Override
	public MessageReponse validereunion(reunion reunion) {
		// TODO Auto-generated method stub
	reunion reunion2 = RenionRepository.findById(reunion.getId_reu()).orElse(null);
	if(reunion2 !=null) {
		reunion2.setValide(true);
		RenionRepository.save(reunion2);
		return new MessageReponse(true, "reunion validee ");
	}
	return new MessageReponse(false, "introuvable");
	}


	@Override
	public MessageReponse affecterreunion(reunion reunion, List<membre> r) {
		// TODO Auto-generated method stub
	/*	reunion reunion2 = RenionRepository.findById(reunion.getId_reu()).orElse(null);
		if ( reunion2 != null) {
			if(!(r.isEmpty())){
				for (int i=0 ; i>r.size();i++) {
					r.get(i).set
				}
				
			}
		}*/
		return null ;
	}

}
