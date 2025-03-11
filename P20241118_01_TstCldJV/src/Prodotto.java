
public abstract class Prodotto {
	
	protected String name;
	protected Double price;
	protected String categoria;
	
	/*
	 * public Prodotto() {
	 * 
	 * }
	 * 
	 * public Prodotto(String name, Double price, String categoria) { super();
	 * this.name = name; this.price = price; this.categoria = categoria; }
	 */

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	
	public abstract Double calculateDiscount();

	@Override
	public String toString() {
		return "Prodotto [name=" + name + ", price=" + price + ", categoria=" + categoria + "]";
	}
	
	
	
}
