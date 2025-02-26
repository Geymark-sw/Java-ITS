import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		
		ArrayList<Studente> aLStudenti = new ArrayList<Studente>();
		
		Studente s1 = new Studente("Pippo", 20, "FullStack", 2018);
		Studente s2 = new Studente("Pluto", 75, "Cloud", 2020);
		Studente s3 = new Studente("Paperino", 46, "Cyber", 1999);
		
		aLStudenti.add(s1);
		aLStudenti.add(s2);
		aLStudenti.add(s3);
		
		
		
		System.out.println("Arraylist studenti disordinata:\n" + aLStudenti);
		
		Collections.sort(aLStudenti);
		
		System.out.println("Arraylist studenti ordinata:\n" + aLStudenti);
		
		
		
	}

}
