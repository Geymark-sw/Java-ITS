package com.spring.ecommerce.entity;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;

@Entity
public class Venditore {
	
	@Id
	private int id_venditore;
	private String nome, cognome, username, password, via, citta;
	
	@OneToMany(cascade = CascadeType.PERSIST)
	@JoinColumn(name = "FK_Venditore")
	private List<Prodotto> lista_prodotti = new ArrayList<Prodotto>();
	
	public Venditore() {
		
	}

	public Venditore(int id_venditore, String nome, String cognome, String username, String password, String via,
			String citta) {
		super();
		this.id_venditore = id_venditore;
		this.nome = nome;
		this.cognome = cognome;
		this.username = username;
		this.password = password;
		this.via = via;
		this.citta = citta;
	}

	public int getId_venditore() {
		return id_venditore;
	}

	public void setId_venditore(int id_venditore) {
		this.id_venditore = id_venditore;
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

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getVia() {
		return via;
	}

	public void setVia(String via) {
		this.via = via;
	}

	public String getCitta() {
		return citta;
	}

	public void setCitta(String citta) {
		this.citta = citta;
	}

	public List<Prodotto> getLista_prodotti() {
		return lista_prodotti;
	}

	public void setLista_prodotti(List<Prodotto> lista_prodotti) {
		this.lista_prodotti = lista_prodotti;
	}
	
	

}
