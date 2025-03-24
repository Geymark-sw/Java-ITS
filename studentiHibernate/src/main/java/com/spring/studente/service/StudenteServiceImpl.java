package com.spring.studente.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.spring.studente.dao.DaoStudente;
import com.spring.studente.dto.StudenteDTO;
import com.spring.studente.entity.Studente;


@Service
@Transactional
public class StudenteServiceImpl implements StudenteService {
	
	@Autowired
	private DaoStudente dao;

	@Override
	public boolean immatricola(StudenteDTO dto) {
		//transf
		Studente st = new Studente(dto.getMatricola(), dto.getNome(), dto.getCognome(), dto.getAnnoImm());
		
		Optional<Studente> opt = dao.findById(dto.getMatricola());
		if(opt.isPresent())
			return false;
		else {
			dao.save(st);
			return true;
		}
	}

	@Override
	public StudenteDTO cerca(Integer matricola) {
		Optional<Studente> opt = this.dao.findById(matricola);
		if(opt.isPresent()) {
			Studente st = opt.get();
			return new StudenteDTO(st.getMatricola(), st.getNome(), st.getCognome(), st.getAnnoImm());
		}
		return null;
	}
	
	@Override
	public List<StudenteDTO> visualizzaTutti(){
		List<StudenteDTO> listaDTO = new ArrayList<StudenteDTO>();
		for(Studente s : this.dao.findAll()) {
			listaDTO.add(new StudenteDTO(s.getMatricola(), s.getNome(), s.getCognome(), s.getAnnoImm()));
		}
		return listaDTO;
	}

	@Override
	public boolean cancella(Integer matricola) {
		if(this.dao.findById(matricola).isPresent()) {
			this.dao.deleteById(matricola);
			return true;
		}
		return false;
		
	}

}
