package com.spring.impiegati.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.spring.impiegati.entity.Impiegato;

public interface ImpiegatoDAO extends JpaRepository<Impiegato, Integer>{

	
	
	//CRUD GIÀ INCORPORATE
	
	@Query(nativeQuery = true, value = "SELECT * FROM impiegato WHERE salario_mensile > :salario")
	public List<Impiegato> visualizzaImpiegatiConSalarioMaggiore(float salario);
	
	@Query(nativeQuery = true, value = "SELECT * FROM impiegato ORDER BY cognome ASC")
	public List<Impiegato> visualizzaImpiegatiOrdCognome();
	
	
	
}
