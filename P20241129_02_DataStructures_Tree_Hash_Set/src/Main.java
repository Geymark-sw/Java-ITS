import java.util.*;
public class Main {
	
	//set, Map, List, Queue, Stack, Vector, ...
	
	//I set
	HashSet<Prova> hsp = new HashSet<Prova>();
	TreeSet<Prova> tsp = new TreeSet<Prova>();
	
	//Le mappe
	HashMap<Prova, Integer> hmp = new HashMap<Prova, Integer>();
	TreeMap<Prova, Integer> tmp = new TreeMap<Prova, Integer>();
	
	for(int i=0; i<100; i++) {
		hsp.add(new Prova(i));
		tsp.add(new Prova(i));
	}
	
	
}

class Prova{
	public String uno;
	public Integer due;
	
	public Prova(int n) {
		this.uno = "UNO";
		this.due = n;
	}
	
}
}
