package com.spring.studente.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.studente.entity.Studente;

public interface DaoStudente extends JpaRepository<Studente, Integer>{
	
	// qui ci sono gia in eredità tutte le funzioni CRUD
	
	
	
}
