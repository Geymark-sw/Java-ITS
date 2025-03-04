package com.spring.apprubrica.entity;

import java.util.*;

public class Rubrica {
	
	private String id, proprietario, annoCreazione;
	private Map<String, Contatto> mappaContatti = new HashMap<String, Contatto>();
	
	public Rubrica(String id, String proprietario, String annoCreazione) {
		this.id = id;
		this.proprietario = proprietario;
		this.annoCreazione = annoCreazione;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getProprietario() {
		return proprietario;
	}

	public void setProprietario(String proprietario) {
		this.proprietario = proprietario;
	}

	public String getAnnoCreazione() {
		return annoCreazione;
	}

	public void setAnnoCreazione(String annoCreazione) {
		this.annoCreazione = annoCreazione;
	}
	
	

	public Map<String, Contatto> getMappaContatti() {
		return mappaContatti;
	}

	public void setMappaContatti(Map<String, Contatto> mappaContatti) {
		this.mappaContatti = mappaContatti;
	}

	@Override
	public String toString() {
		return "Rubrica [id=" + id + ", proprietario=" + proprietario + ", annoCreazione=" + annoCreazione + "]";
	}
	
	

}
