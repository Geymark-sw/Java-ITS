package defaultt;

public abstract class Prodotto implements Comparable<Prodotto>{
	
	protected String nome;
	protected Double prezzo;
	protected String categoria;
	
	public Prodotto() {
		
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Double getPrezzo() {
		return prezzo;
	}
	public void setPrezzo(Double prezzo) {
		this.prezzo = prezzo;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	@Override
	public String toString() {
		return this.getClass().getName() + " [nome=" + nome + ", prezzo=" + String.format("%.2f", prezzo) + ", categoria=" + categoria + "]";
	}
	
	public abstract Double calculateDiscount();
	
	public int compareTo(Prodotto p) {
		return this.prezzo.compareTo(p.getPrezzo());
	}

}
