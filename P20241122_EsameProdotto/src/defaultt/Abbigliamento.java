package defaultt;

public class Abbigliamento extends Prodotto{
	
	public Abbigliamento(String nome, Double prezzo, String categoria) {
		
		this.nome = nome;
		this.prezzo = prezzo;
		this.categoria = categoria;
		this.prezzo = this.calculateDiscount();
		
	}
	
	public Double calculateDiscount() {
		
		if(this.categoria.equalsIgnoreCase("Abbigliamento invernale")) {
			return this.prezzo * 0.85;
		}else {
			return this.prezzo;
		}
		
	}

}
