package com.spring.apprubrica.dao;

import java.util.List;

import com.spring.apprubrica.entity.Contatto;
import com.spring.apprubrica.entity.Rubrica;

public interface RubricaDAOMappa {
	
	public boolean insertRubrica(Rubrica r);
	
	public List<Rubrica> selectAllRubrica();
	
	public Rubrica selectByIdRubrica(String idRubrica);

	public boolean deleteRubrica(String idRubrica);
	
	/*
	 * public boolean insertContatto(String idRubrica, Contatto c);
	 * 
	 * public Contatto selectByIdContatto(String idRubrica, String idContatto);
	 * 
	 * public boolean deleteContatto(String idRubrica, String id);
	 * 
	 * public List<Contatto> selectAllContatto (String idRubrica);
	 */

	
}
