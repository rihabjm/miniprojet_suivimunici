package com.miniprojet.suivi.services.impl;

import javax.transaction.Transactional;


import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.Authentication;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.miniprojet.suivi.entities.membre;
import com.miniprojet.suivi.model.MessageReponse;
import com.miniprojet.suivi.outils.SendEmail;
import com.miniprojet.suivi.repositories.MembreRepository;
import com.miniprojet.suivi.services.MembreService;

import java.util.List;
import java.util.Objects;

@Service
public class MembreServiceImpl  implements  MembreService{

	@Autowired
	private MembreRepository membrerepository ; 
	
//	@Autowired
//	private BCryptPasswordEncoder bcrypte ;
	
	@Autowired
	private SendEmail SendEmail ;
	
	@Transactional
	@Override
	public MessageReponse ajoutermembre(membre membre) {
		
	
		List< membre>	list = membrerepository.findByLogin(membre.getLogin()) ; 
			if (!(list.isEmpty())) {
				System.err.println("email trouver");
				return new MessageReponse(false, "Email existant");	
			}
			
//	//		String pwd = bcrypte.encode(membre.getMdp());
//			System.out.println(pwd);
//			membre.setMdp(pwd);			
membrerepository.save(membre) ; 
 //SendEmail.sendEmail(membre.getLogin(), "vouz etes ajouer ", "Bienvenu dans notre application , ");
return new MessageReponse(true, "memebre est ajouter ") ; 
	}

@Transactional
	@Override
	public List<membre> getmembre() {
		// TODO Auto-generated method stub
		return membrerepository.findAll() ;
	}

//@Override
//public UserDetails loadUserByUsername(String login) {
//	// TODO Auto-generated method stub
//	membre membre = membrerepository.findByLogin(login).get(0);
////	System.out.println("hi");
//	if (membre ==null ) {
//		throw new UsernameNotFoundException("not found") ;
//
//	}
//	return membre ;
//}
//test--
//controlleur --
//modifier membre
@Transactional
@Override
public MessageReponse updatemembre(membre membre) {

	membre membre2 = membrerepository.findById(membre.getCin()).orElse(null);
	System.out.println(membre2.getLogin());	

	if (membre2!=null) {
		
membre.setReunions(membre2.getReunions());
membre.setMunicipale(membre2.getMunicipale());
	membrerepository.save(membre);
	System.out.println("membre est modifier ");
//	 SendEmail.sendEmail(membre.getLogin(), "vouz etes modifier ", "");

	return new MessageReponse(true, "membre est modifier");
	}
	return new MessageReponse(false , "membre introuvable");
}


@Transactional
@Override
public MessageReponse supprimermembre(int id) {

membre membre = membrerepository.findById(id).orElse(null) ;
if(membre== null) {
return new MessageReponse(false, "erreur , membre introuvable");
}
membrerepository.delete(membre);
return new MessageReponse(true, "operation delet effectue avec succes");

}

@Transactional
@Override
public List<membre> consultermembrebyid(int id) {
return membrerepository.findMembreByCin(id);
}



	
}


