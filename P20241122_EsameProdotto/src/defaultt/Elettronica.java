package defaultt;

public class Elettronica extends Prodotto{
	
	public Elettronica(String nome, Double prezzo, String categoria) {
		
		this.nome = nome;
		this.prezzo = prezzo;
		this.prezzo = this.calculateDiscount();
		this.categoria = categoria;
		
	}
	
	public Double calculateDiscount() {
		
		if(this.prezzo > 500) {
			return this.prezzo * 0.9;
		}else {
			return this.prezzo;
		}
		
	}

	
	
	
	

}
