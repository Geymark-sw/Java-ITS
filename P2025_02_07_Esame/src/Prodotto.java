import java.util.*;


public abstract class Prodotto {
	
	protected int id;
	protected String nome;
	protected String descrizione;
	protected double prezzo;
	protected ArrayList<String> lista_negozi = new ArrayList<String>();
	
	
	public Prodotto(int id, String nome, String descrizione, double prezzo, ArrayList<String> lista_negozi) {
		this.id = id;
		this.nome = nome;
		this.descrizione = descrizione;
		this.prezzo = prezzo;
		this.lista_negozi = lista_negozi;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
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


	public double getPrezzo() {
		return prezzo;
	}


	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}


	public ArrayList<String> getLista_negozi() {
		return lista_negozi;
	}


	public void setLista_negozi(ArrayList<String> lista_negozi) {
		this.lista_negozi = lista_negozi;
	}


	@Override
	public String toString() {
		return "Prodotto [id=" + id + ", nome=" + nome + ", descrizione=" + descrizione + ", prezzo=" + prezzo
				+ ", lista_negozi=" + lista_negozi + "]";
	}
	
	

}
