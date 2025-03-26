package com.spring.impiegati.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.spring.impiegati.dao.ImpiegatoDAO;
import com.spring.impiegati.dto.ImpiegatoDTO;
import com.spring.impiegati.entity.Impiegato;
import com.spring.impiegati.utils.Conversione;

@Service
@Transactional
public class ImpiegatoServiceImpl implements ImpiegatoService{
	
	@Autowired
	ImpiegatoDAO dao;

	@Override
	public boolean assumi(ImpiegatoDTO dto) {
		
		if(this.dao.findById(dto.getMatricola()).isPresent()) {
			return false;
		}
		this.dao.save(Conversione.daImpiegatoDTOAImpiegato(dto));
		return true;
	}

	@Override
	public ImpiegatoDTO cercaPerMatricola(int matricola) {
		if(this.dao.findById(matricola).isPresent())
			return Conversione.daImpiegatoAImpiegatoDTO(this.dao.findById(matricola).get());
		return null;
			
	}

	@Override
	public List<ImpiegatoDTO> visualizzaTuttiImpiegati() {
		List<ImpiegatoDTO> ldto = new ArrayList<ImpiegatoDTO>();
		for(Impiegato i : this.dao.findAll())
			ldto.add(Conversione.daImpiegatoAImpiegatoDTO(i));
		return ldto;
	}
	
	@Override
	public ImpiegatoDTO licenzia(int matricola) {
		ImpiegatoDTO dto = Conversione.daImpiegatoAImpiegatoDTO(this.dao.findById(matricola).get());
		this.dao.deleteById(matricola);
		return dto;
	}

	@Override
	public ImpiegatoDTO modificaSalario(int matricola, float salario) {
		this.dao.findById(matricola).get().setSalario_mensile(salario);
		return Conversione.daImpiegatoAImpiegatoDTO(this.dao.findById(null).get());
	}

	@Override
	public ImpiegatoDTO cancellaEritornaNC(int matricola) {
		ImpiegatoDTO dto = Conversione.daImpiegatoAImpiegatoDTO(this.dao.findById(matricola).get());
		this.dao.deleteById(matricola);
		return dto;
	}

	@Override
	public List<String> visualizzaNominativi() {
		List<String> listaNominativi = new ArrayList<String>();
		for(Impiegato i : this.dao.findAll())
			listaNominativi.add(i.getNome() + " " + i.getCognome());
		return listaNominativi;
	}

	@Override
	public List<ImpiegatoDTO> visualizzaImpiegatiConSalarioMaggiore(float salario) {
		List<ImpiegatoDTO> ldto = new ArrayList<ImpiegatoDTO>();
		for(Impiegato i : this.dao.visualizzaImpiegatiConSalarioMaggiore(salario))
			ldto.add(Conversione.daImpiegatoAImpiegatoDTO(i));
		return ldto;
	}

	@Override
	public List<ImpiegatoDTO> visualizzaImpiegatiOrdCognome() {
		List<ImpiegatoDTO> ldto = new ArrayList<ImpiegatoDTO>();
		for(Impiegato i : this.dao.visualizzaImpiegatiOrdCognome())
			ldto.add(Conversione.daImpiegatoAImpiegatoDTO(i));
		return ldto;
	}

	@Override
	public List<ImpiegatoDTO> visualizzaImpiegatiOrdSalario() {
		List<ImpiegatoDTO> ldto = new ArrayList<ImpiegatoDTO>();
		for(Impiegato i : this.dao.visualizzaImpiegatiOrdSalario())
			ldto.add(Conversione.daImpiegatoAImpiegatoDTO(i));
		return ldto;
	}
	


	

}
