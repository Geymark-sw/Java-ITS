package com.spring.ecommerce.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.spring.ecommerce.entity.Venditore;

public interface EcommerceDAO extends JpaRepository<Venditore, Integer>{
	
	@Query(nativeQuery = true, value = "SELECT * FROM venditore WHERE id_venditore = :id_venditore")
	public Venditore cercaPerIdVenditore(int id_venditore);
	
	

}
