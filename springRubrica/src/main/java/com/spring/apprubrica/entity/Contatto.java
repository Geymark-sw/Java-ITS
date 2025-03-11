package com.spring.apprubrica.entity;

import java.time.LocalDate;

public class Contatto {
	
	private String id, nome, cognome, numero, gruppo = "default";
	private LocalDate dataNascita;
	private boolean preferito = false;
	
	
	
	
	public Contatto(String id, String nome, String cognome, String numero, String gruppo, LocalDate dataNascita) {
		super();
		this.id = id;
		this.nome = nome;
		this.cognome = cognome;
		this.numero = numero;
		this.gruppo = gruppo;
		this.dataNascita = dataNascita;
	}
	
	
	
	
	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}




	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCognome() {
		return cognome;
	}
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getGruppo() {
		return gruppo;
	}
	public void setGruppo(String gruppo) {
		this.gruppo = gruppo;
	}
	public LocalDate getDataNascita() {
		return dataNascita;
	}
	public void setDataNascita(LocalDate dataNascita) {
		this.dataNascita = dataNascita;
		
	}
	
	public boolean isPreferito() {
		return preferito;
	}


	public void setPreferito(boolean preferito) {
		this.preferito = preferito;
	}
	
	@Override
	public String toString() {
		return "Contatto [nome=" + nome + ", cognome=" + cognome + ", numero=" + numero + ", gruppo=" + gruppo
				+ ", dataNascita=" + dataNascita + "]";
	}
	
	

}
