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
	
	public RubricaDTO getProprietarioAnnoCreazioneRubrica(String id) {
		Rubrica rubrica = this.dao.selectByIdRubrica(id);
		return new RubricaDTO(rubrica.getProprietario(), rubrica.getAnnoCreazione());
	}
	
	public RubricaDTO modificaNomeProprietarioRubrica(String id, String proprietario) {
		Rubrica r = this.dao.selectByIdRubrica(id);
		r.setProprietario(proprietario);
		
		return Conversione.daRubricaARubricaDTO(r);
	}
	
	public RubricaDTO modificaAnnoCreazioneRubrica(String id, String anno) {
		Rubrica r = this.dao.selectByIdRubrica(id);
		r.setAnnoCreazione(anno);
		
		return Conversione.daRubricaARubricaDTO(r);
	}
	
	public String getProprietariENRubriche() {
		List<Rubrica> rubriche = this.dao.selectAllRubrica();
		List<String> proprietari = new ArrayList<String>();
		
		String ris = "";
		
		for(Rubrica r : rubriche) {
			if(!proprietari.contains(r.getProprietario())) {
				proprietari.add(r.getProprietario());
			}
		}
		
		for(String proprietario : proprietari) {
			int nRubriche = 0;
			
			for(Rubrica r : rubriche)
				if(proprietario == r.getProprietario()) 
					nRubriche++;
			ris += proprietario + " " + nRubriche + "\n";
		}
		
		return ris;
		
	}
	
	public RubricaDTO getProprietarioAnnoCreazioneRubricaPiuVecchia() {
		
		Rubrica rubPiuVecchia = this.dao.selectAllRubrica().get(0);
		String annoCreazione = rubPiuVecchia.getAnnoCreazione();
		
		
		for(Rubrica r : this.dao.selectAllRubrica()) {
			if(r.getAnnoCreazione().compareTo(annoCreazione) < 0) {
				rubPiuVecchia = r;
				annoCreazione = r.getAnnoCreazione();
			}
			
		}
	
		return new RubricaDTO(rubPiuVecchia.getProprietario(), rubPiuVecchia.getAnnoCreazione());
	}
	

}
