package com.spring.studente.controller;



import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.studente.dto.StudenteDTO;
import com.spring.studente.service.StudenteService;


@RestController
@RequestMapping(path = "/studenti")
public class StudenteController {
	
	@Autowired
	private StudenteService service;
	
	@PostMapping(path = "", consumes = MediaType.APPLICATION_JSON_VALUE)
	public boolean immatricola(@RequestBody StudenteDTO dto) {
		return this.service.immatricola(dto);
	}
	
	@GetMapping(path = "/{matricola}", produces = MediaType.APPLICATION_JSON_VALUE)
	public StudenteDTO cerca(@PathVariable Integer matricola) {
		return this.service.cerca(matricola);
	}
	
	@GetMapping(path = "", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<StudenteDTO> visualizzaTutti(){
		return this.service.visualizzaTutti();
	}
	
	@DeleteMapping(path = "/{matricola}", produces = MediaType.APPLICATION_JSON_VALUE)
	public boolean cancella(@PathVariable Integer matricola) {
		return this.service.cancella(matricola);
	}
}
