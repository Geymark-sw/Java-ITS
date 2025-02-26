import java.util.ArrayList;

public class Smartphone extends Prodotto{
	
	private int batteria;
	private int risoluzione_fotocamera;
	
	public Smartphone(int id, String nome, String descrizione, double prezzo, ArrayList<String> lista_negozi, int batteria, int risoluzione_fotocamera) {
		super(id, nome, descrizione, prezzo, lista_negozi);
		this.batteria = batteria;
		this.risoluzione_fotocamera = risoluzione_fotocamera;
	}

	public int getBatteria() {
		return batteria;
	}

	public void setBatteria(int batteria) {
		this.batteria = batteria;
	}

	public int getRisoluzione_fotocamera() {
		return risoluzione_fotocamera;
	}

	public void setRisoluzione_fotocamera(int risoluzione_fotocamera) {
		this.risoluzione_fotocamera = risoluzione_fotocamera;
		
	}

	@Override
	public String toString() {
		return "Smartphone [id=" + id + ", nome=" + nome + ", descrizione=" + descrizione + ", prezzo=" + prezzo
				+ ", lista_negozi=" + lista_negozi + ", batteria=" + batteria + ", risoluzione_fotocamera=" + risoluzione_fotocamera + "]";
		
	}
	
		
	

}
