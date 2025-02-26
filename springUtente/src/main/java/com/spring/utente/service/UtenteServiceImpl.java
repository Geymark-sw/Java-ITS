package com.spring.utente.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.utente.dao.DAOUtente;
import com.spring.utente.dto.ListaNomiCognomiENUtentiDTO;
import com.spring.utente.dto.NomeCognomeDTO;
import com.spring.utente.dto.UtenteDTO;
import com.spring.utente.entity.Utente;
import com.spring.utente.utility.Conversione;


@Service
public class UtenteServiceImpl implements UtenteService{
	
	@Autowired
	private DAOUtente dao;
	
	
	public boolean registra(UtenteDTO dto) {
		
		//1.trasformo il dto in entity
		Utente entity = Conversione.daUtenteDTOAUtente(dto);
		//2.inserisco l'entity attraverso il dao
		return this.dao.insert(entity);
		
	}
	
	public UtenteDTO cercaPerId(int id) {
		Utente utente = this.dao.selectById(id);
		
		if(utente != null) {
			return Conversione.daUtenteAUtenteDTO(utente);
		}
		
		return null;
	}
	
	
	public List<UtenteDTO> visualizzaUtenti(){
		List<Utente> utenti = this.dao.selectAll();
		
		List<UtenteDTO> utentiDTO = new ArrayList<UtenteDTO>();
		
		for(Utente u : utenti) {
			utentiDTO.add(Conversione.daUtenteAUtenteDTO(u));
 		}
		
		return utentiDTO;
	}
	
	
	public UtenteDTO rimuovi(int id) {
		
		UtenteDTO utenteRimosso= Conversione.daUtenteAUtenteDTO(this.dao.selectById(id));
		
		this.dao.delete(id);
		
		return utenteRimosso;
	}
	
	public NomeCognomeDTO getNomeCognome(int id) {
		Utente utente = dao.selectById(id);
		
		if(utente != null) {
			return new NomeCognomeDTO(utente.getNome(), utente.getCognome());
		}
		
		return null;
	}
	
	public ListaNomiCognomiENUtentiDTO getListaNomiCognomiENUteniDTO () {
		
		List<Utente> listaUtenti = this.dao.selectAll();
		
		List<NomeCognomeDTO> listaNomiCognomiDTO = new ArrayList<NomeCognomeDTO>();
		
		for(Utente u : listaUtenti) {
			listaNomiCognomiDTO.add(new NomeCognomeDTO(u.getNome(),u.getCognome()));
		}
		
		return new ListaNomiCognomiENUtentiDTO(listaNomiCognomiDTO, listaNomiCognomiDTO.size());
		
	}
	
}
