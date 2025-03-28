package com.spring.ecommerce.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Prodotto {
	
	@Id
	private int id_prodotto;
	private String nome, descrizione, categoria;
	private int quantita;
	private float prezzo, sconto;
	
	public Prodotto() {
		
	}

	public Prodotto(int id_prodotto, String nome, String descrizione, String categoria, int quantita, float prezzo,
			float sconto) {
		super();
		this.id_prodotto = id_prodotto;
		this.nome = nome;
		this.descrizione = descrizione;
		this.categoria = categoria;
		this.quantita = quantita;
		this.prezzo = prezzo;
		this.sconto = sconto;
	}

	public int getId_prodotto() {
		return id_prodotto;
	}

	public void setId_prodotto(int id_prodotto) {
		this.id_prodotto = id_prodotto;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public int getQuantita() {
		return quantita;
	}

	public void setQuantita(int quantita) {
		this.quantita = quantita;
	}

	public float getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(float prezzo) {
		this.prezzo = prezzo;
	}

	public float getSconto() {
		return sconto;
	}

	public void setSconto(float sconto) {
		this.sconto = sconto;
	}
	
	

}
