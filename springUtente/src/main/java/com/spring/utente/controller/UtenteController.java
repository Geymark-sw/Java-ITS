package com.spring.utente.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.utente.dto.ErroreDTO;
import com.spring.utente.dto.ListaNomiCognomiENUtentiDTO;
import com.spring.utente.dto.NomeCognomeDTO;
import com.spring.utente.dto.UtenteDTO;
import com.spring.utente.service.UtenteService;

@RestController
@RequestMapping(path="/utenti")
public class UtenteController {
	
	@Autowired
	private UtenteService service;
	
	
	//togliamo il verbo, si rimane senza path		La richiesta si capisce dal metodo di richiesta POST inserimentio
	@PostMapping(path="", consumes = "application/json")
	public boolean registra(@RequestBody UtenteDTO dto) {
		/*
		 * //fake System.out.println("ho registrato l'utente" + u); return true;
		 */
		
		return service.registra(dto);
	}
	
	//L'ID deve viaggiare come path		L'asciamo solo l'ID
	@GetMapping(path="/{id}", produces = "application/json")
	public UtenteDTO cercaPerId(@PathVariable int id) {
		/*
		 * //fake return new Utente(id, "mario", "rossi", "mario", "red");
		 */
		
		return service.cercaPerId(id);
	}
	
	@GetMapping(path="")
	public List<UtenteDTO> visualizzaUtenti(){
		return this.service.visualizzaUtenti();
	}

	@DeleteMapping(path="/{id}", produces = "application/json")
	public UtenteDTO rimuovi(@PathVariable int id) {
		return this.service.rimuovi(id);
	}
	
	@GetMapping(path="/{id}/nomeCognome", produces = MediaType.APPLICATION_JSON_VALUE)
	public NomeCognomeDTO getNomeCognome(@PathVariable int id) {
		return this.service.getNomeCognome(id);
	}
	
	@GetMapping(path="/listaNomiCognomiENUtentiDTO", produces = MediaType.APPLICATION_JSON_VALUE)
	public ListaNomiCognomiENUtentiDTO getListaNomiCognomiENUteniDTO() {
		
		return this.service.getListaNomiCognomiENUteniDTO();
		
	}
	
	
	@ExceptionHandler
	public ResponseEntity<ErroreDTO> gestore(RuntimeException exc){
		
		ErroreDTO errore = new ErroreDTO(exc.getMessage());
		ResponseEntity<ErroreDTO> response = new ResponseEntity<ErroreDTO>(errore, HttpStatus.NOT_FOUND);
		
		return response;
		
	}
	
}
