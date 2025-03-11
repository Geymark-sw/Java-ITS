import java.util.*;
import java.io.*;
public class Main {
	
	
	
	public static void main(String[] args)throws Exception{
		
		Comparator<Automezzo> compaVel = new Comparator<Automezzo>(){
			
			public int compare(Automezzo a1, Automezzo a2) {		//voglio vedere se mi prende il motciclo come automezzo
				return a1.getMaxSpeed().compareTo(a2.getMaxSpeed());
			}};
			
		Comparator<Automezzo> compaCons = new Comparator<Automezzo>() {
			public int compare(Automezzo a1, Automezzo a2) {
				return a1.getConsumo().compareTo(a2.getConsumo());
			}
		};
		
		
		/*Da riga 7 a riga 19 ho creato 2 Comparator, uno per velocità e uno per consumo
		 * che successivamente passero alla funzione TipoList.sort()*/
		
		BufferedReader tastiera = new BufferedReader(new InputStreamReader(System.in));
		
		Random random = new Random();
		
		ArrayList<Motociclo> motocicli = new ArrayList<Motociclo>();
		ArrayList<Autovettura> autovetture = new ArrayList<Autovettura>();
		ArrayList<Automezzo> automezzi = new ArrayList<Automezzo>();

		String ricomincia = ""; // variabile per esguire un'altra operazione
		
		
		for(int i = 0; i < 10; i++) { 
			motocicli.add(new Motociclo(2, "Benzina", random.nextDouble(50, 1000), random.nextDouble(1.0,30), random.nextDouble(100,400)));
		}
		
		for(int i = 0; i < 10; i++) {
			autovetture.add(new Autovettura(4, "Benzina", random.nextDouble(1000, 20000), random.nextDouble(1, 20), random.nextDouble(100,400)));
		}
		automezzi.addAll(motocicli);
		automezzi.addAll(autovetture);
		
		System.out.println("-- Lista Motocicli --\n" + motocicli + "\n");
		System.out.println("-- Lista Autovetture --\n" + autovetture + "\n");
		System.out.println("-- Lista Automezzi --\n" + automezzi + "\n");
		
		do {
			System.out.println("\nScegli il criterio di ordinamento\n1 - Velocita'\n2 - Consumo\n");
			int scelta = Integer.valueOf(tastiera.readLine());
			
			switch(scelta) {
			
			case 1:
				System.out.println("\n-- Ordinamento per velocità --\n");
				motocicli.sort(compaVel);
				autovetture.sort(compaVel);
				automezzi.sort(compaVel);
				break;
				
			case 2:
				System.out.println("\n-- Ordinamento per consumo--\n");
				motocicli.sort(compaCons);
				autovetture.sort(compaCons);
				automezzi.sort(compaCons);
				break;
				
			default:
				
				System.out.println("\nInserimento non valido");
				ricomincia = null;
				break;
			}
			if(ricomincia != null) {
				System.out.println("\n-- Ordinamento delle liste --\n");
				System.out.println("-- Lista Motocicli --\n" + motocicli + "\n");
				System.out.println("-- Lista Autovetture --\n" + autovetture + "\n");
				System.out.println("-- Lista Automezzi --\n" + automezzi + "\n");
			}
			
			System.out.println("\nVoi eseguire un'altra operazione? si/no");
			ricomincia = tastiera.readLine();
				
		}while(ricomincia.equalsIgnoreCase("si"));
		
		
		 
	}
	
	
	

}
