package com.spring.utente.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.utente.dto.ListaNomiCognomiENUtentiDTO;
import com.spring.utente.dto.NomeCognomeDTO;
import com.spring.utente.dto.UtenteDTO;
import com.spring.utente.service.UtenteService;

@RestController
@RequestMapping(path="/utenti")
public class UtenteController {
	
	@Autowired
	private UtenteService service;
	
	@GetMapping(path="/registra", consumes = "application/json")
	public boolean registra(@RequestBody UtenteDTO dto) {
		/*
		 * //fake System.out.println("ho registrato l'utente" + u); return true;
		 */
		
		return service.registra(dto);
	}
	
	
	@GetMapping(path="/cerca/{id}", produces = "application/json")
	public UtenteDTO cercaPerId(@PathVariable int id) {
		/*
		 * //fake return new Utente(id, "mario", "rossi", "mario", "red");
		 */
		
		return service.cercaPerId(id);
	}
	
	@GetMapping(path="/visualizzaUtenti")
	public List<UtenteDTO> visualizzaUtenti(){
		return this.service.visualizzaUtenti();
	}

	@GetMapping(path="/rimuovi/{id}", produces = "application/json")
	public UtenteDTO rimuovi(@PathVariable int id) {
		return this.service.rimuovi(id);
	}
	
	@GetMapping(path="getNomeCognome/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public NomeCognomeDTO getNomeCognome(@PathVariable int id) {
		return this.service.getNomeCognome(id);
	}
	
	@GetMapping(path="/getListaNomiCognomiENUtentiDTO", produces = MediaType.APPLICATION_JSON_VALUE)
	public ListaNomiCognomiENUtentiDTO getListaNomiCognomiENUteniDTO() {
		
		return this.service.getListaNomiCognomiENUteniDTO();
		
	}
	
	
}
