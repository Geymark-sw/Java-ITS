import java.util.*;


public class Main {
	
	public static void chiamaAscensore(Integer pianoAscensore, Integer pianoUtente) {
		Integer diff;
		
		if(pianoUtente > pianoAscensore) {
			diff = pianoUtente - pianoAscensore;
			System.out.println("Sono al piano: " + pianoAscensore);
			for(int i=0; i< diff; i++) {
				
				System.out.println("Sto salendo al piano: " + (pianoAscensore + 1));
				System.out.println("Sono al piano: " + (pianoAscensore + 1));
				pianoAscensore++;
				
			}
		}else if(pianoUtente < pianoAscensore) {
			System.out.println("Sono al piano: " + pianoAscensore);
			diff = pianoAscensore - pianoUtente;
			for(int i=0; i<diff; i++) {
				
				System.out.println("Sto scendendo al piano: " + (pianoAscensore -1));
				System.out.println("sono al piano" + (pianoAscensore - 1)); 
				pianoAscensore--;
			}
		}else {
			System.out.println("L'ascensore si trova già al tuo piano");
		}
		
	}
	
	public static void vaiInUnPiano(Integer pianoAscensore, Integer pianoAScelta) { 
		if(pianoAScelta > pianoAscensore) {
			System.out.println("Sono la piano: " + pianoAscensore);
			for(int i=0; i < pianoAScelta - pianoAscensore; i++) {
				System.out.println("Sto salendo al piano: " + (pianoAScelta + 1));
				System.out.println("Sono al piano: " + (pianoAScelta + 1));
				
			}
			
		}
	}
	
	public static void main(String[] args) {
		
		Scanner rd = new Scanner(System.in);
		
		Integer[] piani = {0, 1, 2, 3};
		Integer pianoAScelta;
		Integer pianoUtente;
		Integer pianoScelto;
		
		
		do {
			System.out.print("In che piano si trova l'ascensore? ");
			Integer pianoAscensore = rd.nextInt();
			System.out.print("In che piano ti trovi? ");
			pianoUtente = rpianoUtente - pianoAscensore d.nextInt();
			
			//Funzione che chiama ascensore...
			chiamaAscensore(pianoAscensore, pianoUtente);
			
			//Funzione che porta l'utente ad un piano
			
			
			
			
		}while(true);
		
		
		

		
	}

}


 