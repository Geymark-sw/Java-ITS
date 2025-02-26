package esercizio_4_lambda;

@FunctionalInterface
interface Positive{
	boolean isPositive(int n);
}

public class Main {
	
	public static void main(String[] args) {
		
		Positive positive = n -> n > 0;
		
		System.out.println(positive.isPositive(2));
		
	}

}
