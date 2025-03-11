
public abstract class Prodotto implements Comparable<Prodotto>
{
	protected String nome;
	protected Double prezzo;
	protected String categoria;
	
	public Prodotto(String nome, Double prezzo, String categoria) {
		super();
		this.nome = nome;
		this.prezzo = prezzo;
		this.categoria = categoria;
	}

	public Prodotto() {
		super();
	}

	public String getName() {
		return nome;
	}

	public void setName(String nome) {
		this.nome = nome;
	}

	public Double getPrice() {
		return prezzo;
	}

	public void setPrice(Double prezzo) {
		this.prezzo = prezzo;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public abstract Double calcolaSconto ();

	@Override
	public String toString() {
		return "Prodotto [nome=" + nome + ", prezzo=" + prezzo + ", categoria=" + categoria + "]";
	}
	
	public int compareTo(Prodotto p) {
		
		return this.getPrice().compareTo(p.getPrice());
		
	}
	
	
			
}


