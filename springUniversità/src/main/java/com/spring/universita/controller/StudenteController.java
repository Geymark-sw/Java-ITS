package com.spring.universita.controller;

import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.universita.dto.CognomeAnnoDiIscrizionePiùGrandeDTO;
import com.spring.universita.dto.CognomeAnnoNascitaPiùGiovaneDTO;
import com.spring.universita.dto.StudenteDTO;
import com.spring.universita.service.StudenteService;

@RestController
@RequestMapping(path="/studente")
public class StudenteController {
	
	private StudenteService service = new StudenteService();
	
	
	@GetMapping(path="/inserisciStudente", consumes = MediaType.APPLICATION_JSON_VALUE)
	public boolean inserisciStudente(@RequestBody StudenteDTO dto) {
		return this.service.inserisciStudente(dto);
	}
	
	@GetMapping(path="/cercaStudente/{matricola}")
	public StudenteDTO cercaStudente(@PathVariable int matricola) {
		return this.service.cercaStudente(matricola);
	}
	
	@GetMapping(path="/visualizzaStudenti", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<StudenteDTO> visualizzaStudenti(){
		return this.service.visualizzaStudenti();
	}

	@GetMapping(path = "/cancellaStudente/{matricola}")
	public boolean cancellaStudente(@PathVariable int matricola) {
		return this.service.cancellaStudente(matricola);
	}
	
	@GetMapping(path = "/modificaIndirizzo")
	public boolean modificaIndirizzo(int matricola, String indirizzo) {
		return this.service.modificaIndirizzo(matricola, indirizzo);
	}
	
	@GetMapping(path = "/visualizzaNomiStudenti")
	public List<String> visualizzaNomiStudenti(){
		return this.service.visualizzaNomiStudenti();
	}
	
	@GetMapping(path = "/visualizzaCognomeAnnoNascitaPiùGiovane")
	public CognomeAnnoNascitaPiùGiovaneDTO visualizzaCognomeAnnoNascitaPiùGiovane() {
		return this.service.visualizzaCognomeAnnoNascitaPiùGiovane();
	}
	
	@GetMapping(path = "/visualizzaCognomeAnnoDiIscrizionePiùGrande")
	public CognomeAnnoDiIscrizionePiùGrandeDTO visualizzaCognomeAnnoDiIscrizionePiùGrande() {
		return this.service.visualizzaCognomeAnnoDiIscrizionePiùGrande();
	}
}
