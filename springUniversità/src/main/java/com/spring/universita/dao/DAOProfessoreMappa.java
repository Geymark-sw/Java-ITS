package com.spring.universita.dao;

import java.util.*;

import com.spring.universita.entity.Professore;

public class DAOProfessoreMappa {
	
	private Map<Integer, Professore> mappaProfessori = new HashMap<Integer, Professore>();
	
	public boolean inserisciProfessore(Professore professore) {
		if (!this.mappaProfessori.containsKey(professore.getId())){
			this.mappaProfessori.put(professore.getId(), professore);
			return true;
		}
		return false;
	}
	
	public Professore cercaProfessore(int id) {
		
		if(this.mappaProfessori.containsKey(id)) {
			return this.mappaProfessori.get(id);
		}
		return null;
	}
	
	public List<Professore> visualizzaProfessori(){
		return new ArrayList<Professore>(this.mappaProfessori.values());
	}
	
	public boolean cancellaProfessore(int id) {
		if(this.mappaProfessori.containsKey(id)) {
			this.mappaProfessori.remove(id);
			return true;
		}
		return false;
	}
	
	
	
}
