import java.util.*;

public class Main {
	
	/*
	 * public static void swapCoppia(Coppia<Integer, Double> ci1, Coppia<Integer,
	 * Double> ci2) {
	 * 
	 * Coppia<Integer, Double> ci3 = new Coppia<Integer, Double>(0,0.0);
	 * 
	 * ci3.setPrimo(ci1.getPrimo()); ci3.setSecondo(ci1.getSecondo());
	 * 
	 * ci1.setPrimo(ci2.getPrimo()); ci1.setSecondo(ci2.getSecondo());
	 * 
	 * ci2.setPrimo(ci3.getPrimo()); ci2.setSecondo(ci3.getSecondo());
	 * 
	 * 
	 * 
	 * }
	 */
	
	private static <T1, T2> void swapCoppia(Coppia<T1, T2> c1, Coppia<T1, T2> c2) {
		
		Coppia<T1, T2> appo = new Coppia<T1, T2>(c1.getPrimo(), c1.getSecondo());
		
		c1.setPrimo(c2.getPrimo());
		c1.setSecondo(c2.getSecondo());
		c2.setPrimo(appo.getPrimo());
		c2.setSecondo(appo.getSecondo());
		
	}
	
	public static void swapInt(Integer a, Integer b) {
		
		Integer c = a;
		a = b;
		b = c;
		
	}
	
	public static void swapInList(LinkedList <Integer>li) {
		
		Integer a = li.get(3);
		
		li.set(3, li.get(5));
		li.set(5, a);
		
	}

	public static void main(String[] args) {
		
		// Definire una classe (CoppiaInt) che contiene due Integer
		
		Coppia <Integer, Double> ci1 = new Coppia<Integer, Double>(1, 2.0);
		Coppia<Integer, Double> ci2 = new Coppia<Integer, Double>(111, 112.0);
		
		//implementare un metodo swapCoppia che scambia tra loro i contenuti di
		//due coppie di dati (es: in ci2 va 1, 2.0 e in ci1 va 111, 112.0)
		
		System.out.println("ci1: " + ci1);
		System.out.println("ci2: " + ci2);
		
		swapCoppia(ci1, ci2);
		
		System.out.println("\n--Effettuo lo scambio--\n");
		
		System.out.println("ci1: " + ci1);
		System.out.println("ci2: " + ci2);
		
		
		Coppia<String, String> css1 = new Coppia<String, String>("Ciao1", "Bella1");
		Coppia<String, String> css2 = new Coppia<String, String>("Ciao2", "Bella2");
		
		System.out.println(css1);
		System.out.println(css2);
		
		System.out.println("\n--Effettuo lo scambio--\n");
		swapCoppia(css1,css2);
		
		System.out.println(css1);
		System.out.println(css2);
		
		int a = 20;
		int b = 10;
		
		swapInt(a, b);
		
		System.out.println(a);
		System.out.println(b);  // Lo Swap tra int non si può fare tramite metodo che non restituisce niente, p
								// perchè le variabili vengono passati per valori e non per riferimento
		
		
		LinkedList<Integer> li = new LinkedList<Integer>();
		li.addAll(Arrays.asList(new Integer[] {3, 4, 6, 2, 5, 7, 8}));
		System.out.println(li);
		swapInList(li);
		
		System.out.println(li);
		
	}
	
}
