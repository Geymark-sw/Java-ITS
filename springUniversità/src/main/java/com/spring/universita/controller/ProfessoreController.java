package com.spring.universita.controller;



import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.universita.dto.ProfessoreDTO;
import com.spring.universita.service.ProfessoreService;

@RestController
@RequestMapping(path="/professore")
public class ProfessoreController {
	
	private ProfessoreService service = new ProfessoreService();
	
	
	@GetMapping(path="/inserisciProfessore", consumes = MediaType.APPLICATION_JSON_VALUE)
	public boolean inserisciProfessore(ProfessoreDTO dto) {
		return this.service.inserisciProfessore(dto);
	}
	@GetMapping(path="cercaProfessore/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ProfessoreDTO cercaProfessore(@PathVariable int id) {
		return this.service.cercaProfessore(id);
	}
	
	

}
