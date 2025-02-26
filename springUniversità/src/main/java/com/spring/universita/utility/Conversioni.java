package com.spring.universita.utility;

import com.spring.universita.dto.ProfessoreDTO;
import com.spring.universita.dto.StudenteDTO;
import com.spring.universita.entity.Professore;
import com.spring.universita.entity.Studente;

public class Conversioni {
	
	public static Studente daStudenteDTOAStudente(StudenteDTO dto) {
		return new Studente(dto.getMatricola(), dto.getAnnoDiNascita(), dto.getAnnoDiImmatricolazione(), dto.getNome(), dto.getCognome(), dto.getIndirizzo());
	}
	
	public static StudenteDTO daStudenteAStudenteDTO(Studente studente) {
		return new StudenteDTO(studente.getMatricola(), studente.getAnnoDiNascita(), studente.getAnnoDiImmatricolazione(), studente.getNome(), studente.getCognome(), studente.getIndirizzo());
	}

	public static Professore daProfessoreDTOaProfessore(ProfessoreDTO dto) {
		
		return new Professore(dto.getId(), dto.getNome(), dto.getCognome(), dto.getMateria());
	}
	
	public static ProfessoreDTO daProfessoreaProfessoreDTO(Professore professore) {
		
		return new ProfessoreDTO(professore.getId(), professore.getNome(), professore.getCognome(), professore.getMateria());
	}

}
