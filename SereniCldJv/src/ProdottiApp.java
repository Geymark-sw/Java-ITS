import java.util.*;
public class ProdottiApp {
	
	
    public static void main(String[] args){
    	
    	
    	
        // Crea il gestore dei prodotti
        GestoreProdotti gestore = new GestoreProdotti(new LinkedList<Prodotto>());
        
        // Aggiungi alcuni prodotti
        gestore.aggiungiProdotto(new Elettronica("Smartphone", 600.00, "Elettronica"));
        gestore.aggiungiProdotto(new Elettronica("Laptop", 1200.00, "Elettronica"));
        gestore.aggiungiProdotto(new Elettronica("Cuffie Bluetooth", 150.00, "Elettronica"));
        gestore.aggiungiProdotto(new Abbigliamento("Giubbotto Invernale", 100.00, "Abbigliamento invernale"));
        gestore.aggiungiProdotto(new Abbigliamento("T-shirt Estiva", 30.00, "Abbigliamento estivo"));
        
        // Visualizza i prodotti prima dell'ordinamento
        System.out.println("Prodotti prima dell'ordinamento:");
        gestore.visualizzaProdotti();
        
        // Ordina i prodotti per prezzo in ordine crescente
        gestore.sortByPrice(gestore.getProdotti());
      
        
        
        // Visualizza i prodotti dopo l'ordinamento
        System.out.println("\nProdotti dopo l'ordinamento:");
        gestore.visualizzaProdotti();
    }
}
