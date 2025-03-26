package com.spring.rubrica.utils;

import java.util.List;

import com.spring.rubrica.dto.ContattoDTO;
import com.spring.rubrica.dto.RubricaDTO;
import com.spring.rubrica.entity.Contatto;
import com.spring.rubrica.entity.Rubrica;

public class Conversione {
	
	public static RubricaDTO daRubricaARubricaDTO(Rubrica rubrica) {
		
		RubricaDTO dto = new RubricaDTO(rubrica.getIdRubrica(), rubrica.getProprietario(), rubrica.getAnnoCreazione());
		
		for(Contatto c : rubrica.getContatti())
			dto.getContatti().add(Conversione.daContattoAContattoDTO(c));
		
		return dto;
	}
	
	public static Rubrica daRubricaDTOARubrica(RubricaDTO rdto) {
		Rubrica r = new Rubrica(rdto.getIdRubrica(), rdto.getProprietario(), rdto.getAnnoCreazione());
		
		for(ContattoDTO cdto : rdto.getContatti())
			r.getContatti().add(Conversione.daContattoDTOAContatto(cdto));
		
		return r;
	}

	public static Contatto daContattoDTOAContatto(ContattoDTO cdto) {
		
		return new Contatto(cdto.getIdContatto(), cdto.getNome(), cdto.getCognome(), cdto.getNumero());
	}

	public static ContattoDTO daContattoAContattoDTO(Contatto c) {
		
		return new ContattoDTO(c.getIdContatto(), c.getNome(), c.getCognome(), c.getNumero());
	}
	
	

}
