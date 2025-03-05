package com.spring.apprubrica.utility;

import com.spring.apprubrica.dto.ContattoDTO;
import com.spring.apprubrica.dto.RubricaDTO;
import com.spring.apprubrica.entity.Contatto;
import com.spring.apprubrica.entity.Rubrica;

public class Conversione {
	
	public static Rubrica daRubricaDTOARubrica(RubricaDTO dto){
		return new Rubrica(dto.getId(), dto.getProprietario(), dto.getAnnoCreazione());
		
	}
	
	
	public static RubricaDTO daRubricaARubricaDTO(Rubrica r){
		return new RubricaDTO(r.getId(), r.getProprietario(), r.getAnnoCreazione());
		
	}
	
	public static Contatto daContattoDTOAContatto(ContattoDTO dto) {
		return new Contatto(dto.getId(), dto.getNome(), dto.getCognome(), dto.getNumero(), dto.getGruppo(), dto.getDataNascita());
	}
	
	public static ContattoDTO daContattoAContattoDTO(Contatto c) {
		return new ContattoDTO(c.getId(), c.getNome(), c.getCognome(), c.getNumero(), c.getGruppo(), c.getDataNascita());
	}
	
	

}
