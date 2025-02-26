package com.spring.utente.dto;

import java.util.List;

public class ListaNomiCognomiENUtentiDTO {
	
	private List<NomeCognomeDTO> listaNomiCognomi;
	private int numeroUtenti;
	
	public ListaNomiCognomiENUtentiDTO (List<NomeCognomeDTO> listaNomiCognomi, int numeroUtenti) {
		this.listaNomiCognomi = listaNomiCognomi;
		this.numeroUtenti = numeroUtenti;
	}

	public List<NomeCognomeDTO> getListaNomiCognomi() {
		return listaNomiCognomi;
	}

	public void setListaNomiCognomi(List<NomeCognomeDTO> listaNomiCognomi) {
		this.listaNomiCognomi = listaNomiCognomi;
	}

	public int getNumeroUtenti() {
		return numeroUtenti;
	}

	public void setNumeroUtenti(int numeroUtenti) {
		this.numeroUtenti = numeroUtenti;
	}

	@Override
	public String toString() {
		return "ListaNomiCognomiENUtentiDTO [listaNomiCognomi=" + listaNomiCognomi + ", numeroUtenti=" + numeroUtenti
				+ "]";
	}
	
	
	
	
	
	
	

}
