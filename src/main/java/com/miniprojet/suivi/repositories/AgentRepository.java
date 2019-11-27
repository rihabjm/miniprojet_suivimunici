package com.miniprojet.suivi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.miniprojet.suivi.entities.Agent;

public interface AgentRepository  extends JpaRepository<Agent, Integer>{

}
