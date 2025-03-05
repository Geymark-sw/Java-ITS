package com.spring.apprubrica.service;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.apprubrica.dao.RubricaDAOMappaImpl;
import com.spring.apprubrica.dto.RubricaDTO;
import com.spring.apprubrica.entity.Rubrica;
import com.spring.apprubrica.utility.Conversione;


@Service
public class RubricaService {
	
	
	@Autowired
	private RubricaDAOMappaImpl dao;
	
	public boolean insertRubrica(RubricaDTO dto) {
		return this.dao.insertRubrica(Conversione.daRubricaDTOARubrica(dto));
	}
	
	public List<RubricaDTO> selectAllRubrica(){
		
		List<RubricaDTO> rubricheDTO = new ArrayList<RubricaDTO>();
		for(Rubrica r : this.dao.selectAllRubrica()) {
			rubricheDTO.add(Conversione.daRubricaARubricaDTO(r));
		}
		
		return rubricheDTO;
	}
	
	public RubricaDTO selectByIdRubrica(String idRubrica) {
		return Conversione.daRubricaARubricaDTO(this.dao.selectByIdRubrica(idRubrica));
	}
	
	public boolean deleteRubrica(String idRubrica) {
		return this.dao.deleteRubrica(idRubrica);
	}
	
	//Funzioni avanzate di sotto
	
	
	

}
