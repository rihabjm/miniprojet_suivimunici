package com.miniprojet.suivi.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.miniprojet.suivi.entities.reunion;

public interface RenionRepository extends JpaRepository<reunion, Integer> {
	
List<reunion> findReunionByObjectif(String objectif);

}
