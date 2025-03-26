package com.spring.rubrica.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.spring.rubrica.dao.RubricaDAO;
import com.spring.rubrica.dto.ContattoDTO;
import com.spring.rubrica.dto.RubricaDTO;
import com.spring.rubrica.utils.Conversione;

@Service
@Transactional
public class RubricaServiceImpl implements RubricaService {
	
	@Autowired
	private RubricaDAO dao;
	
	@Override
	public boolean creaRubrica(RubricaDTO rdto) {
		if(this.dao.findById(rdto.getIdRubrica()).isPresent())
			return false;
		this.dao.save(Conversione.daRubricaDTOARubrica(rdto));
		return true;
	}

	@Override
	public RubricaDTO cerca(Integer idRubrica) {
		return Conversione.daRubricaARubricaDTO(this.dao.findById(idRubrica).get());
	}

	@Override
	public boolean aggiungiContatto(Integer idRubrica, ContattoDTO dto) {
		if(this.dao.findById(idRubrica).isPresent()) {
			this.dao.findById(idRubrica).get().getContatti().add(Conversione.daContattoDTOAContatto(dto));
			return true;
		}
		return false;
	}

}
