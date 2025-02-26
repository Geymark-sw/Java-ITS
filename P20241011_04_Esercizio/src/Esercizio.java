/*Realizzare una classe Computer con i seguenti attributi
		 * - Prezzo
		 * - Peso
		 * - Dimensioni (larghezza, altezza, profondità)
		 * - Produttore
		 * - Anno di produzione
		 * 
		 * 
		 * Nel main creare degli oggetti di Computer
		 *e stampare il loro contenuto
		 *
		 * NB: ricordate di utilizzare getter, settere e costruttore
		 * generati da eclipse
		 * 
		 * Bonus: aggiungere un metodo alla classe Computer
		 * che stampi quanti oggetti di tipo Computer sono stati creati
		 *
		 */


public class Esercizio {
	
	public static void main(String[] args) {
		
		
		Computer c1 = new Computer(500,2,40,20,10,"Asus",2010);
		Computer c2 = new Computer(700,2.5f,45,25,15,"HP",2015);
		
		
		System.out.println("Prezzo: " + c1.getPrezzo());
		System.out.println("Peso: " + c1.getPeso() + " kg");
		System.out.println("Larghezza: " + c1.getLarghezza() + " cm");
		System.out.println("Altezza: " + c1.getAltezza() + " cm");
		System.out.println("Profondità: " + c1.getProfondità() + " cm");
		System.out.println("Produttore: " + c1.getProduttore());
		System.out.println("Anno di produzione : " + c1.getAnnoDiProduzione());
	
		System.out.println("--------------------------------------------------");
		
		System.out.println("Prezzo: " + c2.getPrezzo());
		System.out.println("Peso: " + c2.getPeso() + " kg");
		System.out.println("Larghezza: " + c2.getLarghezza() + " cm");
		System.out.println("Altezza: " + c2.getAltezza() + " cm");
		System.out.println("Profondità: " + c2.getProfondità() + " cm");
		System.out.println("Produttore: " + c2.getProduttore());
		System.out.println("Anno di produzione : " + c2.getAnnoDiProduzione());
		
		
		Computer.stampaNumeroOggettiComputer();

		
	}

}
