package com.spring.impiegati.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.impiegati.dto.ImpiegatoDTO;
import com.spring.impiegati.service.ImpiegatoService;

@RestController
@RequestMapping(path = "/impiegati")
public class ImpiegatoController {
	
	@Autowired
	private ImpiegatoService service;
	
	
	@PostMapping(path = "", consumes = MediaType.APPLICATION_JSON_VALUE)
	public boolean assumi(ImpiegatoDTO dto) {
		return this.service.assumi(dto);
	}
	
	@GetMapping(path = "/{matricola}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ImpiegatoDTO cercaPerMatricola(int matricola) {
		return this.service.cercaPerMatricola(matricola);
	}
	
	public List<ImpiegatoDTO> visualizzaTuttiImpiegati(){
		
	}
}
