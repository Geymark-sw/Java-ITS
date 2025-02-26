package defaultt;
import java.util.*;
public class GestoreProdotti implements Ordinabile{
	
	private ArrayList<Prodotto> prodotti;
	
	public GestoreProdotti() {
		
	}
	
	public GestoreProdotti(ArrayList<Prodotto> prodotti) {
		
		this.prodotti = prodotti;
	}
	
	
	
	public ArrayList<Prodotto> getProdotti() {
		return prodotti;
	}

	public ArrayList<Prodotto> sortByPrice(ArrayList<Prodotto> prodotti){ // metodo per ordinare i prodotti
		
		Collections.sort(prodotti);
		this.prodotti = prodotti;
		return prodotti;
		
	}
	
	
	public void visualizzaProdotti() {				// metodo per visualizzare i prodotti
		System.out.println("-- Lista prodotti --\n");
		for(Prodotto p: prodotti) {
			System.out.println(p);
		}
		System.out.println();
		
	}

}
