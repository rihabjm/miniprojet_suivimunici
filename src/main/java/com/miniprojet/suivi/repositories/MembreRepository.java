package com.miniprojet.suivi.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.miniprojet.suivi.entities.membre;
public interface MembreRepository extends JpaRepository<membre, Integer> {
	
 List<membre> findByCinAndLogin(int cin , String login) ;
 //List<membre> findMembreByLogin(String login) ;
 List<membre> findMembreByCin(int cin);
 membre findMembreByLogin(String login ) ; 
 List< membre> findByLogin(String login);

}
