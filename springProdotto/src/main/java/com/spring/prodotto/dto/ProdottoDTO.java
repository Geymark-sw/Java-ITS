package com.spring.prodotto.dto;

public class ProdottoDTO {
	
	private String marca, modello, descrizione, categoria;
	private double prezzoConsigliato, prezzoMassimo;
	private int id, quantità;
	
	
	
	public ProdottoDTO(int id, String marca, String modello, String descrizione, String categoria, double prezzoConsigliato,
			double prezzoMassimo, int quantità) {
		super();
		this.id = id;
		this.marca = marca;
		this.modello = modello;
		this.descrizione = descrizione;
		this.categoria = categoria;
		this.prezzoConsigliato = prezzoConsigliato;
		this.prezzoMassimo = prezzoMassimo;
		this.quantità = quantità;
	}

	

	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public String getMarca() {
		return marca;
	}



	public void setMarca(String marca) {
		this.marca = marca;
	}



	public String getModello() {
		return modello;
	}



	public void setModello(String modello) {
		this.modello = modello;
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



	public double getPrezzoConsigliato() {
		return prezzoConsigliato;
	}



	public void setPrezzoConsigliato(double prezzoConsigliato) {
		this.prezzoConsigliato = prezzoConsigliato;
	}



	public double getPrezzoMassimo() {
		return prezzoMassimo;
	}



	public void setPrezzoMassimo(double prezzoMassimo) {
		this.prezzoMassimo = prezzoMassimo;
	}



	public int getQuantità() {
		return quantità;
	}



	public void setQuantità(int quantità) {
		this.quantità = quantità;
	}



	@Override
	public String toString() {
		return "Prodotto [marca=" + marca + ", modello=" + modello + ", descrizione=" + descrizione + ", categoria="
				+ categoria + ", prezzoConsigliato=" + prezzoConsigliato + ", prezzoMassimo=" + prezzoMassimo
				+ ", quantità=" + quantità + "]";
	}

}
