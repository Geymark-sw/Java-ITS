package com.spring.apprubrica.dao;

import java.util.*;

import org.springframework.stereotype.Repository;

import com.spring.apprubrica.entity.Contatto;
import com.spring.apprubrica.entity.Rubrica;

@Repository
public class RubricaDAOMappaImpl implements RubricaDAOMappa {
	
	private Map<String, Rubrica> mappa = new HashMap<String, Rubrica>();

	@Override
	public boolean insertRubrica(Rubrica r) {
		if(!this.mappa.containsKey(r.getId())) {
			this.mappa.put(r.getId(), r);
			return true;
		}
			
		return false;
	}

	@Override
	public List<Rubrica> selectAllRubrica() {
		return new ArrayList<Rubrica>(this.mappa.values());
	}

	@Override
	public Rubrica selectByIdRubrica(String idRubrica) {
		return this.mappa.get(idRubrica);
	}

	@Override
	public boolean deleteRubrica(String idRubrica) {
		
		if(this.mappa.containsKey(idRubrica)) {
			this.mappa.remove(idRubrica);
			return true;
		}
		return false;
	}

	
	
	

	
	
	
	
}
