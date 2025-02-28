package com.spring.universita.controller;



import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.universita.dto.ProfessoreDTO;
import com.spring.universita.service.ProfessoreService;

@RestController
@RequestMapping(path="/professore")
public class ProfessoreController {
	
	private ProfessoreService service = new ProfessoreService();
	
	
	@GetMapping(path="/inserisciProfessore", consumes = MediaType.APPLICATION_JSON_VALUE)
	public boolean inserisciProfessore(@RequestBody ProfessoreDTO dto) {
		return this.service.inserisciProfessore(dto);
	}
	@GetMapping(path="cercaProfessore/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ProfessoreDTO cercaProfessore(@PathVariable int id) {
		return this.service.cercaProfessore(id);
	}
	
	@GetMapping(path="/cancellaProfessore/{id}")
	
	public boolean cancellaProfessore(@PathVariable int id) {
		return this.service.cancellaProfessore(id);
	}
	
	@GetMapping(path = "/visualizzaProfessori")
	public List<ProfessoreDTO> visualizzaProfessori(){
		return this.service.visualizzaProfessori();
	}
	
	@GetMapping(path="/modificaMateria/{id}/{materia}")
	public boolean modificaMateria(@PathVariable int id, @PathVariable String materia) {
		return this.service.modificaMateria(id, materia);
	}
	
	@GetMapping(path="/visualizzaProfPerMateria/{materia}")
	public List<ProfessoreDTO> visualizzaProfPerMateriaI(@PathVariable String materia){
		return this.service.visualizzaProfPerMateria(materia);
	}
	
	@GetMapping(path="/visualizzaProfInOrdineCognome")
	public List<ProfessoreDTO> visualizzaProfInOrdineCognome(){
		return this.service.visualizzaProfInOrdineCognome();
	}
	
	@GetMapping(path="/visualizzaTutteMaterieInsegnate")
	public List<String> visualizzaTutteMaterieInsegnate(){
		return this.service.visualizzaTutteMaterieInsegnate();
	}
}
