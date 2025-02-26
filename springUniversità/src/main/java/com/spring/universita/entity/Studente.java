package com.spring.universita.entity;

public class Studente {
	
	private int matricola, annoDiNascita, annoDiImmatricolazione;
	private String nome,cognome, indirizzo;
	
	public Studente() {
		
	}

	public Studente(int matricola, int annoDiNascita, int annoDiImmatricolazione, String nome, String cognome,
			String indirizzo) {
		super();
		this.matricola = matricola;
		this.annoDiNascita = annoDiNascita;
		this.annoDiImmatricolazione = annoDiImmatricolazione;
		this.nome = nome;
		this.cognome = cognome;
		this.indirizzo = indirizzo;
	}

	public int getMatricola() {
		return matricola;
	}

	public void setMatricola(int matricola) {
		this.matricola = matricola;
	}

	public int getAnnoDiNascita() {
		return annoDiNascita;
	}

	public void setAnnoDiNascita(int annoDiNascita) {
		this.annoDiNascita = annoDiNascita;
	}

	public int getAnnoDiImmatricolazione() {
		return annoDiImmatricolazione;
	}

	public void setAnnoDiImmatricolazione(int annoDiImmatricolazione) {
		this.annoDiImmatricolazione = annoDiImmatricolazione;
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

	public String getIndirizzo() {
		return indirizzo;
	}

	public void setIndirizzo(String indirizzo) {
		this.indirizzo = indirizzo;
	}

	@Override
	public String toString() {
		return "Studente [matricola=" + matricola + ", annoDiNascita=" + annoDiNascita + ", annoDiImmatricolazione="
				+ annoDiImmatricolazione + ", nome=" + nome + ", cognome=" + cognome + ", indirizzo=" + indirizzo + "]";
	}
	
	

}
