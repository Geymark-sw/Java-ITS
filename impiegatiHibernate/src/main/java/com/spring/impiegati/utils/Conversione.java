package com.spring.impiegati.utils;

import com.spring.impiegati.dto.ImpiegatoDTO;
import com.spring.impiegati.entity.Impiegato;

public class Conversione {

	public static Impiegato daImpiegatoDTOAImpiegato(ImpiegatoDTO dto) {
		
		return new Impiegato(dto.getMatricola(), dto.getNome(), dto.getCognome(), dto.getSalario_mensile());
	}
	
	public static ImpiegatoDTO daImpiegatoAImpiegatoDTO(Impiegato impiegato) {
		
		return new ImpiegatoDTO(impiegato.getMatricola(), impiegato.getNome(), impiegato.getCognome(), impiegato.getSalario_mensile());
	}

}
