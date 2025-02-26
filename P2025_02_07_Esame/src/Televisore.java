import java.util.ArrayList;

public class Televisore extends Prodotto{
	
	private double peso;
	private String risoluzione;
	
	public Televisore(int id, String nome, String descrizione, double prezzo, ArrayList<String> lista_negozi, double peso, String risoluzione) {
		super(id, nome, descrizione, prezzo, lista_negozi);
		this.peso = peso;
		this.risoluzione = risoluzione;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public String getRisoluzione() {
		return risoluzione;
	}

	public void setRisoluzione(String risoluzione) {
		this.risoluzione = risoluzione;
	}
	
	@Override
	public String toString() {
		return "Televisore [id=" + id + ", nome=" + nome + ", descrizione=" + descrizione + ", prezzo=" + prezzo
				+ ", lista_negozi=" + lista_negozi + ", peso=" + peso + ", risoluzione=" + risoluzione + "]";
		
	}
}
