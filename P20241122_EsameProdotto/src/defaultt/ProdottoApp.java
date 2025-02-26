package defaultt;
import java.util.*;
public class ProdottoApp {
	
	private static Random random = new Random(); //oggetto Random per generare valori random da passare ai parametri
	
	private static String categoriaRandom() {
		
		if(random.nextInt(1,3) == 1) {
			return "Abbigliamento invernale";
		}else {
			return "Abbigliamento estivo";
		}
		
	}
	
	public static void main(String[] args) {
		
		
		GestoreProdotti gp = new GestoreProdotti(new ArrayList<Prodotto>());
		
		//aggiungo 5 oggetti Elettronica con parametri random
		for(int i = 0; i < 5; i++) {
			gp.getProdotti().add(new Elettronica("e", random.nextDouble(200, 800), "Elettrodomestici"));
		}
		
		//aggiungo 5 oggetti Abbigliamento con parametri random
				for(int i = 0; i < 5; i++) {
					gp.getProdotti().add(new Abbigliamento("a", random.nextDouble(20, 500), categoriaRandom()));
				}
		
		System.out.println("-- Prodotti non ordinati --");
		gp.visualizzaProdotti();
		gp.sortByPrice(gp.getProdotti());
		System.out.println("-- Prodotti ordinati --");
		gp.visualizzaProdotti();
		
		
	
	
	
	}

}
