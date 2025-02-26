package com.spring.universita.dao;

import java.util.*;

import com.spring.universita.entity.Studente;

public class DAOStudenteMappa {
	
	private Map<Integer, Studente> mappaStudenti = new HashMap<Integer, Studente>();
	
	public boolean inserisciStudente(Studente studente) {
		
		if(!mappaStudenti.containsKey(studente.getMatricola())) {
			this.mappaStudenti.put(studente.getMatricola(), studente);
			return true;
		}
		
		return false;
		
	}
	
	public Studente cercaStudente(int matricola) {
		
		if(this.mappaStudenti.containsKey(matricola))
			return this.mappaStudenti.get(matricola);
		return null;
		
	}
	
	public List<Studente> visualizzaStudenti(){
		return new ArrayList<Studente>(this.mappaStudenti.values());
	}
	
	public boolean cancellaStudente(int matricola) {
		if(this.mappaStudenti.containsKey(matricola)) {
			this.mappaStudenti.remove(matricola);
			return true;
		}
		return false;
	}
	
	

	
	

}
