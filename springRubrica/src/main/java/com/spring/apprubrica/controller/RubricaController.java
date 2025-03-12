package com.spring.apprubrica.controller;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.apprubrica.dto.RubricaDTO;
import com.spring.apprubrica.service.ContattoService;
import com.spring.apprubrica.service.RubricaService;

@RestController
@RequestMapping(path="/rubriche")
public class RubricaController {
	
	//CRUD Rubrica:
	@Autowired
	private RubricaService rubricaService;
	@Autowired
	private ContattoService contattoService;
	
	@PostMapping(path="", consumes=MediaType.APPLICATION_JSON_VALUE)
	public boolean insertRubrica(@RequestBody RubricaDTO dto) {
		return this.rubricaService.insertRubrica(dto);
	}
	
	@GetMapping(path="", produces=MediaType.APPLICATION_JSON_VALUE)
	public List<RubricaDTO> selectAllRubrica(){
		return this.rubricaService.selectAllRubrica();
	}
	
	@GetMapping(path="/{id}", produces=MediaType.APPLICATION_JSON_VALUE)
	public RubricaDTO selectByIdRubrica(@PathVariable String id) {
		return this.rubricaService.selectByIdRubrica(id);
	}
	
	@DeleteMapping(path="/{id}")
	public boolean deleteRubrica(@PathVariable String id) {
		return this.rubricaService.deleteRubrica(id);
	}
	
	
	//CRUD Contatto: 
	
}
