package com.spring.apprubrica.service;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.apprubrica.dao.RubricaDAOMappaImpl;
import com.spring.apprubrica.dto.RubricaDTO;
import com.spring.apprubrica.dto.RubricaENContattiDTO;
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
	
	public RubricaDTO getProprietarioAnnoCreazioneRubrica(String idRubrica) {
		Rubrica rubrica = this.dao.selectByIdRubrica(idRubrica);
		return new RubricaDTO(rubrica.getProprietario(), rubrica.getAnnoCreazione());
	}
	
	public RubricaDTO modificaNomeProprietarioRubrica(String idRubrica, String proprietario) {
		Rubrica r = this.dao.selectByIdRubrica(idRubrica);
		r.setProprietario(proprietario);
		
		return Conversione.daRubricaARubricaDTO(r);
	}
	
	public RubricaDTO modificaAnnoCreazioneRubrica(String idRubrica, String anno) {
		Rubrica r = this.dao.selectByIdRubrica(idRubrica);
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
	
	
	public List<String> getAnniRubriche(){
		
		List<String> anniRubriche = new ArrayList<String>();
		for(Rubrica r : this.dao.selectAllRubrica()) {
			
			if(!anniRubriche.contains(r.getAnnoCreazione()))
				anniRubriche.add(r.getAnnoCreazione());
		}
		Collections.sort(anniRubriche);
		return anniRubriche;
		
	}
	
	//Ultima Funzione delle Rubriche
	//Visualizza nome proprietario e numero contatti di una rubrica
	public List<RubricaENContattiDTO> getRubricheENContattiDTO(){
		List<RubricaENContattiDTO> rubricheENContatti = new ArrayList<RubricaENContattiDTO>();
		for(Rubrica r : this.dao.selectAllRubrica()) {
			rubricheENContatti.add(Conversione.daRubricaARubricaENContattiDTO(r));
		}
		return rubricheENContatti;
	}
	
	

}
