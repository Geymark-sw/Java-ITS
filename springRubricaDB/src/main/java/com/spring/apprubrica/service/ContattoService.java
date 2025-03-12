package com.spring.apprubrica.service;

import java.time.LocalDate;
import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.apprubrica.dao.RubricaDAOMappaImpl;
import com.spring.apprubrica.dto.ContattoDTO;
import com.spring.apprubrica.entity.Contatto;
import com.spring.apprubrica.utility.Conversione;

@Service
public class ContattoService {
	
	@Autowired
	private RubricaDAOMappaImpl dao;
	
	public boolean insertContatto(String idRubrica, Contatto c) {
		//dao.selectByIdRubrica(idRubrica)		Utilizzare Solo Le funzioni CRUD di Rubrica, quindi implementare solo 4 funzioni per DAORubrica anche per effettuare operazioni di Contatto
		return this.dao.selectByIdRubrica(idRubrica).getMappaContatti().put(c.getId(), c) != null;
	}
	
	public ContattoDTO selectByIdContatto(String idRubrica, String idContatto) {
		return Conversione.daContattoAContattoDTO(this.dao.selectByIdRubrica(idRubrica).getMappaContatti().get(idContatto));
	}
	
	public boolean deleteContatto(String idRubrica, String idContatto) {
		return this.dao.selectByIdRubrica(idRubrica).getMappaContatti().remove(idContatto) != null;
	}
	
	public List<ContattoDTO> selectAllContatto(String idRubrica){
		List<ContattoDTO> contattiDTO = new ArrayList<ContattoDTO>();
		
		for(Contatto c : this.dao.selectByIdRubrica(idRubrica).getMappaContatti().values()) {
			contattiDTO.add(Conversione.daContattoAContattoDTO(c));
		}
		
		return contattiDTO;
	}
	
	public boolean modificaContatto(String idRubrica, String idContatto, String nome, String cognome, String numero, String gruppo, LocalDate dataNascita) {
		Contatto c = this.dao.selectByIdRubrica(idRubrica).getMappaContatti().get(idContatto);
		
		try {
			c.setNome(nome);
			c.setCognome(cognome);
			c.setDataNascita(dataNascita);
			c.setGruppo(gruppo);
			c.setNumero(numero);
			return true;
		}catch(Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	
	
	public int getNumeroContatti(String idRubrica) {
		return this.dao.selectByIdRubrica(idRubrica).getMappaContatti().size();
	}
	
	public ContattoDTO getContattoByNumero(String idRubrica, String numeroContatto) {
		for(Contatto c : this.dao.selectByIdRubrica(idRubrica).getMappaContatti().values()) {
			if(numeroContatto.equals(c.getNumero()))
				return Conversione.daContattoAContattoDTO(c);
		}
		return null;
	}
	
	public List<String> getNomeCognomeByGruppo(String idRubrica, String gruppo){
		List<String> listaNomiCognomi = new ArrayList<String>();
		
		for(Contatto c : this.dao.selectByIdRubrica(idRubrica).getMappaContatti().values()) {
			if(c.getGruppo().equals(gruppo))
				listaNomiCognomi.add(c.getNome() + " " + c.getCognome());
		}
		
		return listaNomiCognomi;
	}
	
	public List<String> getNumeroContattiByGruppo(String idRubrica, String gruppo){
		List<String> numeroContatti = new ArrayList<String>();
		for(Contatto c : this.dao.selectByIdRubrica(idRubrica).getMappaContatti().values()) {
			if(c.getGruppo().equals(gruppo))
				numeroContatti.add(c.getNumero());
		}
		
		return numeroContatti;
	}
	
	public boolean deleteGroup(String idRubrica, String gruppo) {
	
		//id dei contatti da eliminare
		List<String> listaIdContatti = new ArrayList<String>();
		for(Contatto c : this.dao.selectByIdRubrica(idRubrica).getMappaContatti().values()) {
			if(c.getGruppo().equals(gruppo))
				listaIdContatti.add(c.getId());
		}
		
		try {
			for(String id : listaIdContatti) {
				this.dao.selectByIdRubrica(idRubrica).getMappaContatti().remove(id);
			}
			return true;
		} catch (Exception e) {
			
			e.printStackTrace();
			return false;
		}
		
	}
	
	public boolean setPreferito(String idRubrica, String idContatto) {
		try {
			this.dao.selectByIdRubrica(idRubrica).getMappaContatti().get(idContatto).setPreferito(true);
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	
	public List<ContattoDTO> selectContattiByPreferito(String idRubrica){
		List<ContattoDTO> contattiPreferiti = new ArrayList<ContattoDTO>();
		
		for(Contatto c : this.dao.selectByIdRubrica(idRubrica).getMappaContatti().values()) {
			if(c.isPreferito())
				contattiPreferiti.add(Conversione.daContattoAContattoDTO(c));
		}
		return contattiPreferiti;
	}
}
