package esercizio_6_lambda;

@FunctionalInterface
interface Even{
	boolean isEven(int n);
}

public class Main {
	
	public static void main(String[] args) {
		Even e = n -> n%2 == 0;
		int n = 1021;
		System.out.println(e.isEven(n));
	}

}
