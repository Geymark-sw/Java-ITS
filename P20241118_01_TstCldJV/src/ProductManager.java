import java.util.*;

public class ProductManager implements Ordinable{

	private List<Prodotto> prodotti;
	
	public ProductManager() {
		
	}
	
	public void addProdotto(Prodotto p) {
		
		this.prodotti.add(p);
		
	}
	
	
	
	@Override
	public String toString() {
		return "ProductManager [prodotti=" + prodotti + "]";
	}

	@Override
	public List<Prodotto> sortByPrice(List<Prodotto> prodotti) {
		
		Collections.sort(this.prodotti);
		
	}


	
	
	

}
