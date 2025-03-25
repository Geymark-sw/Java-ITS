package com.spring.studente.service;

import java.util.List;

import com.spring.studente.dto.StudenteDTO;

public interface StudenteService {
	
	public boolean immatricola(StudenteDTO dto);
	public StudenteDTO cerca(Integer matricola);
	public List<StudenteDTO> visualizzaTutti();
	public boolean cancella(Integer matricola);
	public List<StudenteDTO> getGiovani(int annoImm);
	
}
