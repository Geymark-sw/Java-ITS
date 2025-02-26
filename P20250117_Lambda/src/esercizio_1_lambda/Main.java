package esercizio_1_lambda;









public class Main {
	
	public static void main(String[] args) {
		
		
		
		Calcolatore somma = (a, b) -> a + b;
		
		int risultato = somma.calcola(5,3);
		
		System.out.println(risultato);
		
	}

}
