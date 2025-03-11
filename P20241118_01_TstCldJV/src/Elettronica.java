
public class Elettronica extends Prodotto{
	
	public Elettronica() {
		
	}
	
	public Elettronica(String name, Double price, String categoria) {
		
		this.name = name;
		this.price = price;
		this.price = calculateDiscount();
		this.categoria = categoria;
		
	}
	

	@Override
	public Double calculateDiscount() {
		
		if(this.price > 500) {
			
			return this.price * 0.9;
			
		}else {
			return this.price;
		}
		
	}
	
	
	
	

}
