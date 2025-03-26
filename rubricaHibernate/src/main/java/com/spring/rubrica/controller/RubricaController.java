package com.spring.rubrica.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.rubrica.dto.ContattoDTO;
import com.spring.rubrica.dto.RubricaDTO;
import com.spring.rubrica.service.RubricaService;

@RestController
@RequestMapping(path = "/rubriche")
public class RubricaController {
	
	@Autowired
	private RubricaService service;
	
	
	@PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
	public boolean creaRubrica(@RequestBody RubricaDTO rdto) {
		return this.service.creaRubrica(rdto);
	}
	
	@GetMapping(path="/{idRubrica}", produces = MediaType.APPLICATION_JSON_VALUE)
	public RubricaDTO cerca(@PathVariable Integer idRubrica) {
		return this.service.cerca(idRubrica);
	}
	
	@PostMapping(path="/{idRubrica}/contatti")
	public boolean aggiungiContatto(@PathVariable Integer idRubrica, @RequestBody ContattoDTO cdto) {
		return this.service.aggiungiContatto(idRubrica, cdto);
	}
}
