package com.spring.rubrica.dto;

import java.util.ArrayList;
import java.util.List;




public class RubricaDTO {

	private int idRubrica;
	private String proprietario;
	private int annoCreazione;
	
	private List<ContattoDTO> contattiDTO = new ArrayList<ContattoDTO>();
	
	public RubricaDTO() {
		
	}

	public RubricaDTO(int idRubrica, String proprietario, int annoCreazione) {
		super();
		this.idRubrica = idRubrica;
		this.proprietario = proprietario;
		this.annoCreazione = annoCreazione;
	}

	public int getIdRubrica() {
		return idRubrica;
	}

	public void setIdRubrica(int idRubrica) {
		this.idRubrica = idRubrica;
	}

	public String getProprietario() {
		return proprietario;
	}

	public void setProprietario(String proprietario) {
		this.proprietario = proprietario;
	}

	public int getAnnoCreazione() {
		return annoCreazione;
	}

	public void setAnnoCreazione(int annoCreazione) {
		this.annoCreazione = annoCreazione;
	}

	public List<ContattoDTO> getContatti() {
		return contattiDTO;
	}

	public void setContatti(List<ContattoDTO> contattiDTO) {
		this.contattiDTO = contattiDTO;
	}
	
	
	// aggiungo qlk metodo di business
	
	public void aggiungiContatto(ContattoDTO contattoDTO) {
		this.contattiDTO.add(contattoDTO);
	}
	
}
