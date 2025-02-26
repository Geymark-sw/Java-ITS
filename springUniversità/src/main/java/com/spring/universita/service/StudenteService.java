package com.spring.universita.service;

import java.util.*;

import com.spring.universita.dao.DAOStudenteMappa;
import com.spring.universita.dto.CognomeAnnoDiIscrizionePiùGrandeDTO;
import com.spring.universita.dto.CognomeAnnoNascitaPiùGiovaneDTO;
import com.spring.universita.dto.StudenteDTO;
import com.spring.universita.entity.Studente;
import com.spring.universita.utility.Conversioni;

public class StudenteService {
	
	private DAOStudenteMappa dao = new DAOStudenteMappa();
	
	public boolean inserisciStudente(StudenteDTO dto) {
		//la verifica se lo studente è gia presente nella mappa viene effettuata nel dao
		return this.dao.inserisciStudente(Conversioni.daStudenteDTOAStudente(dto));
	}
	
	public StudenteDTO cercaStudente(int matricola) {
		return Conversioni.daStudenteAStudenteDTO(this.dao.cercaStudente(matricola));
	}
	
	public List<StudenteDTO> visualizzaStudenti(){
		
		List<Studente> studentiDAO = this.dao.visualizzaStudenti();
		List<StudenteDTO> studentiDTO = new ArrayList<StudenteDTO>();
		
		for(Studente dao : studentiDAO) {
			studentiDTO.add(Conversioni.daStudenteAStudenteDTO(dao));
		}
		
		return studentiDTO;
		
	}
	
	
	//verifica effettuata nel dao
	public boolean cancellaStudente(int matricola) {
		return this.dao.cancellaStudente(matricola);
	}
	
	
	public boolean modificaIndirizzo(int matricola, String inidirizzo) {
		if(this.dao.cercaStudente(matricola) != null) {
			this.dao.cercaStudente(matricola).setIndirizzo(inidirizzo);
			return true;
		}
		
		return false;
	}
	
	
	public List<String> visualizzaNomiStudenti(){
		List<String> listaNomiStudenti = new ArrayList<String>();
		
		for(Studente s : this.dao.visualizzaStudenti()) {
			listaNomiStudenti.add(s.getNome());
		}
		
		return listaNomiStudenti;
	}
	
	
	public CognomeAnnoNascitaPiùGiovaneDTO visualizzaCognomeAnnoNascitaPiùGiovane() {
		
		int min = 0; // variabile per segnare il più giovane
		String cognome = "";
		
		for(Studente s : this.dao.visualizzaStudenti()) {
			if(s.getAnnoDiNascita() < min) {
				min = s.getAnnoDiNascita();
				cognome = s.getCognome();
			}
		}
		
		return new CognomeAnnoNascitaPiùGiovaneDTO(cognome, min);
		
	}
	
	public CognomeAnnoDiIscrizionePiùGrandeDTO visualizzaAnnoDiIscrizionePiùGrande() {
		int max = 0;
		String cognome = "";
		
		for(Studente s : this.dao.visualizzaStudenti()) {
			if(s.getAnnoDiImmatricolazione() > max) {
				max = s.getAnnoDiImmatricolazione();
				cognome = s.getCognome();
			}
			
		}
		return new CognomeAnnoDiIscrizionePiùGrandeDTO(cognome, max);
	}
}
