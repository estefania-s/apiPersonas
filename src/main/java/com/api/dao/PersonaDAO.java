package com.api.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.model.Persona;

public interface PersonaDAO extends JpaRepository<Persona, Integer>{

}
