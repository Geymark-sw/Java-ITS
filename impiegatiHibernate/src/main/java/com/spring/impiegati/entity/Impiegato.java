package com.spring.impiegati.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Impiegato {
	
	@Id
	Integer matricola;
	String nome, cognome;
	float salario_mensile;
	
	public Impiegato() {
		
	}

	public Impiegato(Integer matricola, String nome, String cognome, float salario_mensile) {
		super();
		this.matricola = matricola;
		this.nome = nome;
		this.cognome = cognome;
		this.salario_mensile = salario_mensile;
	}

	public Integer getMatricola() {
		return matricola;
	}

	public void setMatricola(Integer matricola) {
		this.matricola = matricola;
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

	public float getSalario_mensile() {
		return salario_mensile;
	}

	public void setSalario_mensile(float salario_mensile) {
		this.salario_mensile = salario_mensile;
	}
	
	

}
