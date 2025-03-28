package com.spring.ecommerce.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.ecommerce.dto.ProdottoDTO;
import com.spring.ecommerce.dto.VenditoreDTO;
import com.spring.ecommerce.service.VenditoreService;
import com.spring.ecommerce.dto.ErroreDTO;

@RestController
@RequestMapping(path="/venditori")
public class EcommerceController {
	
	@Autowired
	private VenditoreService service;
	
	@PostMapping(path="", consumes=MediaType.APPLICATION_JSON_VALUE)
	public boolean inserisciVenditore(@RequestBody VenditoreDTO vdto) {
		return this.service.inserisciVenditore(vdto);
	}
	
	@GetMapping(path="/{id_venditore}", produces=MediaType.APPLICATION_JSON_VALUE)
	public VenditoreDTO cercaPerIdVenditore(@PathVariable int id_venditore) {
		return this.service.cercaPerIdVenditore(id_venditore);
	}
	
	@GetMapping(path="/{id_venditore}/datiBase", produces=MediaType.APPLICATION_JSON_VALUE)
	public VenditoreDTO getDatiBaseVenditore(@PathVariable int id_venditore) {
		return this.service.getDatiBaseVenditore(id_venditore);
	}
	
	@PatchMapping(path="/{id_venditore}", produces=MediaType.APPLICATION_JSON_VALUE)
	public VenditoreDTO modificaPasswordVenditore(@PathVariable int id_venditore,@RequestBody String password) {
		return this.service.modificaPasswordVenditore(id_venditore, password);
	}
	
	@PostMapping(path="/{id_venditore}/prodotti", consumes=MediaType.APPLICATION_JSON_VALUE)
	public boolean aggiungiProdotto(@PathVariable int id_venditore, @RequestBody ProdottoDTO pdto) {
		return this.service.aggiungiProdotto(id_venditore, pdto);
	}
	
	@PatchMapping(path="/{id_venditore}/prodotti/{id_prodotto}/{quantita}")
	public ProdottoDTO modificaQuantitaProdotto(@PathVariable int id_venditore,@PathVariable int id_prodotto,@PathVariable int quantita) {
		return this.service.modificaQuantitaProdotto(id_venditore, id_prodotto, quantita);
	}
	
	@ExceptionHandler
	public ResponseEntity<ErroreDTO> gestore(RuntimeException exc){
		
		ErroreDTO errore = new ErroreDTO(exc.getMessage());
		ResponseEntity<ErroreDTO> response = new ResponseEntity<ErroreDTO>(errore, HttpStatus.NOT_FOUND);
		
		return response;
		
	}
	
}
