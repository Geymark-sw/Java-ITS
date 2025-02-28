package com.spring.universita.dto;

public class CognomeAnnoDiIscrizionePiùGrandeDTO {
	
	private String cognome;
	private int annoIscrizione;

	public CognomeAnnoDiIscrizionePiùGrandeDTO(String cognome, int annoIscrizione) {
		this.cognome = cognome;
		this.annoIscrizione = annoIscrizione;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public int getAnnoIscrizione() {
		return annoIscrizione;
	}

	public void setAnnoIscrizione(int annoIscrizione) {
		this.annoIscrizione = annoIscrizione;
	}
	
	

}
