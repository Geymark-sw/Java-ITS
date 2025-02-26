import java.util.*;
public class Main {
	
	public static void main(String[] args) {
		
		int id_s = 1;
		String nome_s = "Samsung Galaxy s22 Ultra";
		String descrizione_s = "Smartphone di ultima generazione";
		double prezzo_s = 1399;
		ArrayList<String> lista_negozi_s = new ArrayList<String>(Arrays.asList("MediaWorld", "Euronics"));
		int batteria = 5000;
		int risoluzione_fotocamera = 120;
				
		
		Smartphone s = new Smartphone(id_s, nome_s, descrizione_s, prezzo_s, lista_negozi_s, batteria, risoluzione_fotocamera);
				  
		
		int id_t = 2;
		String nome_t = "Samsung OLed 40''";
		String descrizione_t = "Televisore Smart ad altissima risoluzione";
		double prezzo_t = 2000;
		ArrayList<String> lista_negozi_t = new ArrayList<String>(Arrays.asList("Unieuro"));
		int peso = 10;
		String risoluzione = "4K";
		
		Televisore t = new Televisore(id_t, nome_t, descrizione_t, prezzo_t, lista_negozi_t, peso, risoluzione);
		
		int id = 12;
		String nome = "Geymark Emmanuel";
		String cognome = "Papio";
		String email = "emmanuelp@gmail.com";
		String password = "Password";
		ArrayList<Prodotto> prodotti = new ArrayList<Prodotto>(Arrays.asList(s,t));
		
		Cliente c = new Cliente(id, nome, cognome, email, password, prodotti);
		
		System.out.println(c);
		
	}

}
