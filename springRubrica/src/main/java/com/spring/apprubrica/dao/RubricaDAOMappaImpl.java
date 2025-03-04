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

	@Override
	public boolean insertContatto(String idRubrica, Contatto c) {
		
		List<String> listaNomiCognomi = new ArrayList<String>();
		for(Contatto co : this.mappa.get(idRubrica).getMappaContatti().values()) {
			listaNomiCognomi.add(co.getNome().toLowerCase() + co.getCognome().toLowerCase());
			}
			//verifico se il contatto è presenta nella mappa contatti della rubrica per id e se non ci sono contatti con lo stesso nome e cognome
		if(( !this.mappa.get(idRubrica).getMappaContatti().containsKey(c.getId()) ) && listaNomiCognomi.contains(c.getNome().toLowerCase() + c.getCognome().toLowerCase())){
			this.mappa.get(idRubrica).getMappaContatti().put(c.getId(), c);
			return true;
		}
		return false;
		
	}

	@Override
	public Contatto selectByIdContatto(String idRubrica, String idContatto) {
		
		return this.mappa.get(idRubrica).getMappaContatti().get(idContatto);
	}

	@Override
	public boolean deleteContatto(String idRubrica, String idContatto) {
		if(this.mappa.containsKey(idRubrica) && this.mappa.get(idRubrica).getMappaContatti().containsKey(idContatto)) {
			this.mappa.get(idRubrica).getMappaContatti().remove(idContatto);
			return true;
		}
		return false;
	}

	@Override
	public List<Contatto> selectAllContatto(String idRubrica) {
		
		return new ArrayList<Contatto>(this.mappa.get(idRubrica).getMappaContatti().values());
	}
	
	

	
	
	
	
}
