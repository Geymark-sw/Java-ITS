import java.io.*;


public class Main {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader tastiera = new BufferedReader(new InputStreamReader (System.in));
		
		Studente[] classe = new Studente[10];
		String verifica;
		
		do {
			
			System.out.println("Scegli l'operazione da eseguire:\n(1)Inserisci 10 studenti\n(2)Stampa gli studenti");
			
			int scelta = Integer.valueOf(tastiera.readLine());
			int nStud;
			
			switch(scelta) {
			
				case 1:
					
					for(int i = 0; i<classe.length; i++) {
						//variabile per stampare numero dello sudente
						nStud = i+1;
						
						System.out.println("Inserisci il nome del "+ nStud+ "° studente:");
						String nome = tastiera.readLine();
						System.out.println("Inserisci l'eta'del "+ nStud+ "° studente:");
						int eta = Integer.valueOf(tastiera.readLine());
						System.out.println("Inserisci il corso del "+ nStud+ "° studente:");
						String corso = tastiera.readLine();
						System.out.println("Inserisci l'anno di frequenz del "+ nStud+ "° studente:");
						int annoDiFrequenza = Integer.valueOf(tastiera.readLine());
						
						Studente s = new Studente(nome,eta,corso,annoDiFrequenza);
						
						classe[i] = s;
						
					}
					
					System.out.println("Vuoi eseguire un'altra operazione? si/no");
					verifica = tastiera.readLine();
					
					break;
					
					
				case 2:
					
					for(int i = 0; i < classe.length; i++) {
						nStud = i+1;
						System.out.println(nStud +"°"+classe[i]);
						
					}
					System.out.println("Vuoi eseguire un'altra operazione? si/no");
					verifica = tastiera.readLine();
					
					break;
					
				default:
					
					System.out.println("Inserimento non valido! Vuoi eseguire un'altra operazione? si/no");
					verifica = tastiera.readLine();
					
			}
			
			
		}while(verifica.toLowerCase().equals("si"));
		
	}

}
