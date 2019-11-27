package com.miniprojet.suivi.services.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.miniprojet.suivi.entities.reunion;
import com.miniprojet.suivi.model.MessageReponse;
import com.miniprojet.suivi.repositories.RenionRepository;
import com.miniprojet.suivi.services.ReunionService;


@Service
public class ReunionServiceImpl implements ReunionService {
	
	@Autowired
private RenionRepository RenionRepository ; 
	
	
	@Transactional
	@Override
	public List<reunion> findall() {
		// TODO Auto-generated method stub
return	RenionRepository.findAll() ;
	}


	@Override
	public MessageReponse ajoutReunion(reunion reunion) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public MessageReponse supprimerReunion(int id) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public List<reunion> consulterReunion() {
		// TODO Auto-generated method stub
		return null;
	}

}
