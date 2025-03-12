package com.spring.apprubrica.controller;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.apprubrica.dto.ContattoDTO;
import com.spring.apprubrica.dto.RubricaDTO;
import com.spring.apprubrica.entity.Contatto;
import com.spring.apprubrica.service.ContattoService;
import com.spring.apprubrica.service.RubricaService;

@RestController
@RequestMapping(path="/appRubrica")
public class RubricaController {
	
	
	@Autowired
	private RubricaService rubricaService;
	@Autowired
	private ContattoService contattoService;
	
	
	//CRUD Rubrica:
	@PostMapping(path="/rubriche", consumes=MediaType.APPLICATION_JSON_VALUE)
	public boolean insertRubrica(@RequestBody RubricaDTO dto) {
		System.out.println("ciao");
		return this.rubricaService.insertRubrica(dto);
	}
	
	@GetMapping(path="/rubriche", produces=MediaType.APPLICATION_JSON_VALUE)
	public List<RubricaDTO> selectAllRubrica(){
		return this.rubricaService.selectAllRubrica();
	}
	
	@GetMapping(path="/rubriche/{id}", produces=MediaType.APPLICATION_JSON_VALUE)
	public RubricaDTO selectByIdRubrica(@PathVariable String id) {
		return this.rubricaService.selectByIdRubrica(id);
	}
	
	@DeleteMapping(path="/rubriche/{id}")
	public boolean deleteRubrica(@PathVariable String id) {
		return this.rubricaService.deleteRubrica(id);
	}
	
	
	//CRUD Contatto: 
	@PostMapping(path="/contatti/{idRubrica}", consumes=MediaType.APPLICATION_JSON_VALUE)
	public boolean insertContatto(@PathVariable String idRubrica, @RequestBody Contatto c) {
		return this.contattoService.insertContatto(idRubrica, c);
	}
	
	@GetMapping(path="/contatti/{idRubrica}/{idContatto}", produces=MediaType.APPLICATION_JSON_VALUE)
	public ContattoDTO selectByIdContatto(@PathVariable String idRubrica,@PathVariable String idContatto) {
		return this.contattoService.selectByIdContatto(idRubrica, idContatto);
	}
	
	@DeleteMapping(path="/contatti/{idRubrica}/{idContatto}")
	public boolean deleteContatto(String idRubrica, String idContatto) {
		return this.contattoService.deleteContatto(idRubrica, idContatto);
	}
	
	@GetMapping(path="/contatti")
	public List<ContattoDTO> selectAllContatto(String idRubrica){
		return this.contattoService.selectAllContatto(idRubrica);
	}
	
	
	//Funzioni Avanzate Rubrica
	@GetMapping(path="rubriche/{idRubrica}/proprietarioAnnoCreazioneRubrica")
	public RubricaDTO getProprietarioAnnoCreazioneRubrica(String idRubrica) {
		return this.rubricaService.getProprietarioAnnoCreazioneRubrica(idRubrica);
	}
	
	
	@PatchMapping(path="rubriche/{idRubrica}/{proprietario}/proprietario")
	public RubricaDTO modificaNomeProprietarioRubrica(String idRubrica, String proprietario) {
		return this.rubricaService.modificaNomeProprietarioRubrica(idRubrica, proprietario);
	}
	
	
	
	
}












