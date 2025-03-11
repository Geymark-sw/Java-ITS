
public class Abbigliamento extends Prodotto{

	public Abbigliamento() {
		
	}
	
	public Abbigliamento(String name, Double price, String categoria) {
		
		this.name = name;
		this.price = price;
		this.price = calculateDiscount();
		this.categoria = categoria;
		
	}
	
	
	@Override
	public Double calculateDiscount() {
		
		if(this.categoria.toLowerCase() == "abbigliamento invernale") {
			
			return this.price * 0.85;
			
		}else {
			return this.price;
		}
		
	
		
	}
	
	

}
