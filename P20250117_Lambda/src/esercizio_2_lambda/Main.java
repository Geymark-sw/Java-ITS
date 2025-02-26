package esercizio_2_lambda;

@FunctionalInterface
interface VerificatoreParola{
	boolean verifica(String parola, int lunghezza);
}

public class Main {
	
	public static void main(String[] args) {
		
		VerificatoreParola verifica = (parola, lunghezza) -> parola.length() > lunghezza;
		
		
		System.out.println(verifica.verifica("P", 10));
	}
}
