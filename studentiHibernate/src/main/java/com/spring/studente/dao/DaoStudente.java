package com.spring.studente.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.spring.studente.entity.Studente;

public interface DaoStudente extends JpaRepository<Studente, Integer>{
	
	// qui ci sono gia in eredità tutte le funzioni CRUD
	
	// aggiungo query native
	
	@Query(nativeQuery = true, value = "SELECT * FROM studente WHERE anno_imm > :annoImm")
	public List<Studente> getGiovani(int annoImm);
}



