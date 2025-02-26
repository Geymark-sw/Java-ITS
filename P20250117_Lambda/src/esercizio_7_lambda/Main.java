package esercizio_7_lambda;
import java.util.*;

@FunctionalInterface
interface SumElements{
	int sumElements(List<Integer> l);
}

public class Main {
	
	public static void main(String[] args) {
		
		SumElements se =  l -> {
			
			int somma = 0;
			
			for(Integer n : l) {
				somma = somma + n;
			}
			
			return somma;
		};
		
		List<Integer> l =  List.of(2,2,3);
		
		
		System.out.println(se.sumElements(l));
		
	}
	
}
