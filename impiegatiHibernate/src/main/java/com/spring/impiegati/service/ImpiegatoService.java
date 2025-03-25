package com.spring.impiegati.service;

import java.util.List;

import com.spring.impiegati.dto.ImpiegatoDTO;

public interface ImpiegatoService {
	
	public boolean assumi(ImpiegatoDTO dto);
	public ImpiegatoDTO cercaPerMatricola(int matricola);
	public List<ImpiegatoDTO> visualizzaTuttiImpiegati();
	public ImpiegatoDTO licenzia(int matricola);
	public ImpiegatoDTO modificaSalario(int matricola, float salario);
	public ImpiegatoDTO cancellaEritornaNC(int matricola);
	public List<String> visualizzaNominativi();
	public List<ImpiegatoDTO> visualizzaImpiegatiConSalarioMaggiore(float salario);
	public List<ImpiegatoDTO> visualizzaImpiegatiOrdCognome();
	public List<ImpiegatoDTO> visualizzaImpiegatiOrdSalario();
	

}
