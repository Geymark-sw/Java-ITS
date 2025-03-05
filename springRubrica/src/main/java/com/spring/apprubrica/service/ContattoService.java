package com.spring.apprubrica.service;

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
		return this.dao.insertContatto(idRubrica, c);
	}
	
	public ContattoDTO selectByIdContatto(String idRubrica, String idContatto) {
		return Conversione.daContattoAContattoDTO(this.dao.selectByIdContatto(idRubrica, idContatto));
	}
	
	public boolean deleteContatto(String idRubrica, String idContatto) {
		return this.dao.deleteContatto(idRubrica, idContatto);
	}
	
	public List<ContattoDTO> selectAllContatto(String idRubrica){
		List<ContattoDTO> contattiDTO = new ArrayList<ContattoDTO>();
		
		for(Contatto c : this.dao.selectAllContatto(idRubrica)) {
			contattiDTO.add(Conversione.daContattoAContattoDTO(c));
		}
		
		return contattiDTO;
	}
	
	
	
}
