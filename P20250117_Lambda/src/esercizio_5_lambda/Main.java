package esercizio_5_lambda;

@FunctionalInterface
interface ConcatenateString{
	String concatena(String a, String b);
}

public class Main {
	
	public static void main(String[] args) {
		
		ConcatenateString cs = (a, b) -> a + b;
		
		System.out.println(cs.concatena("Ciao", " bello"));
		
	}

}
