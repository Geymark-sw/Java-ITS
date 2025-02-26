package com.spring.universita.service;

import java.util.*;

import com.spring.universita.dao.DAOProfessoreMappa;
import com.spring.universita.dto.ProfessoreDTO;
import com.spring.universita.entity.Professore;
import com.spring.universita.utility.Conversioni;

public class ProfessoreService {
	
	private DAOProfessoreMappa dao = new DAOProfessoreMappa();
	
	public boolean inserisciProfessore(ProfessoreDTO dto) {
		return this.dao.inserisciProfessore(Conversioni.daProfessoreDTOaProfessore(dto));
	}
	
	public ProfessoreDTO cercaProfessore(int id) {
		return Conversioni.daProfessoreaProfessoreDTO(this.dao.cercaProfessore(id));
	}
	
	public List<ProfessoreDTO> visualizzaProfessori(){
		List<ProfessoreDTO> lpDTO = new ArrayList<ProfessoreDTO>();
		
		for(Professore p : this.dao.visualizzaProfessori()) {
			lpDTO.add(Conversioni.daProfessoreaProfessoreDTO(p));
		}
		
		return lpDTO;
	}
	
	public boolean cancellaProfessore(int id) {
		return this.dao.cancellaProfessore(id);
	}
	
	public boolean modificaMateria(int id, String materia) {
		
		if(this.dao.cercaProfessore(id) instanceof Professore) {
			this.dao.cercaProfessore(id).setMateria(materia);
			return true;
		}
		return false;
		
	}
	
	//Metodo che ritorna una lista di professori che insegnano una determinata materia
	public List<ProfessoreDTO> visualizzaProfPerMateria(String materia){
		List<ProfessoreDTO> lProfPerMateria = new ArrayList<ProfessoreDTO>();
		
		for(Professore p : this.dao.visualizzaProfessori()) {
			if(p.getMateria().equalsIgnoreCase(materia)) {
				lProfPerMateria.add(Conversioni.daProfessoreaProfessoreDTO(p));
			}
		}
		
		return lProfPerMateria;
	}
	
	public List<ProfessoreDTO> visualizzaProfInOrdineCognome(){
		List<ProfessoreDTO> lProfInOrdineCognome = this.visualizzaProfessori();
		Collections.sort(lProfInOrdineCognome);
		return lProfInOrdineCognome;
	}
	
	public List<String> visualizzaTutteMaterieInsegnate(){
		List<String> tutteMaterieInsegnate = new ArrayList<String>();
		for(Professore p : this.dao.visualizzaProfessori()) {
			if(!tutteMaterieInsegnate.contains(p.getMateria())) {
				tutteMaterieInsegnate.add(p.getMateria());
			}
		}
		return tutteMaterieInsegnate;
	}
	
}
