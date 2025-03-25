	package com.spring.impiegati.dto;

public class ImpiegatoDTO {
	
	Integer matricola;
	String nome, cognome;
	float salario_mensile;
	
	public ImpiegatoDTO() {
		
	}

	public ImpiegatoDTO(Integer matricola, String nome, String cognome, float salario_mensile) {
		super();
		this.matricola = matricola;
		this.nome = nome;
		this.cognome = cognome;
		this.salario_mensile = salario_mensile;
	}
	
	public ImpiegatoDTO(String nome, String cognome) {
		this.nome = nome;
		this.cognome = cognome;
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
