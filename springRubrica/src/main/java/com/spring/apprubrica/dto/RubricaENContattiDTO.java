package com.spring.apprubrica.dto;



public class RubricaENContattiDTO extends RubricaDTO {
	
	private int nContatti;

	public RubricaENContattiDTO(String id, String proprietario, String annoCreazione) {
		super(id, proprietario, annoCreazione);
		this.nContatti = this.getMappaContatti().size();
		
	}
	
	
	
}
