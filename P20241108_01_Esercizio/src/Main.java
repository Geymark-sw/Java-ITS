import java.util.*;


public class Main {
	
	public static void main(String[] args) {
		
		//Persona p1 = (Persona)ParseClass.Parse(Persona.class);
		/* Studente s1 = (Studente)ParseClass.Parse("Studente"); */
		
//		System.out.println(s1);
		
		LinkedList<Studente> lstud = new LinkedList<Studente>();
		
		  lstud.add(new Studente("pluto",20, "elcorso", 30));
		  lstud.add(new Studente("paperino", 28, "limocorso", 4));
		 
		
		lstud.add(new Studente("pippo", 34,"altro", 12));
		
		LinkedList<Integer> li = new LinkedList<Integer>();
		li.add(10);
		li.add(20);
		li.add(1);
		System.out.println(lstud);
		System.out.println(li);
		
		Collections.sort(li);
		
		System.out.println(li);
		
		Collections.reverse(li);
		System.out.println(li);
		
		Collections.max(li);
		
		
		
		
		
		
		
	}

}
