import java.util.*;

public class GestoreProdotti implements Ordinabile
{
	private LinkedList<Prodotto> prodotti = new LinkedList<Prodotto>();
	
	public GestoreProdotti() {
		super();
	}


	public GestoreProdotti(LinkedList<Prodotto> prodotti) {
		super();
		this.prodotti = prodotti;
	}


	public void aggiungiProdotto(Prodotto prodotto)
	{
		this.prodotti.add(prodotto);
	}
	
	@Override
	public LinkedList<Prodotto> sortByPrice(LinkedList<Prodotto> prodotti) 
	{
	    Collections.sort(prodotti);
	    this.prodotti = prodotti;
	    return this.prodotti;
	}

	public void visualizzaProdotti()
	{
		for (Prodotto p : prodotti) 
		{
			System.out.println(p.toString() + "con lo sconto applicato: " + p.calcolaSconto());
		}
	}


	public LinkedList<Prodotto> getProdotti() {
		return prodotti;
	}



	
	

		
}
