import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		
		List<Integer> listaInteri = new ArrayList<Integer>(Arrays.asList(1,2,3));
		
		System.out.println(listaInteri);
		
		if(!listaInteri.contains(4)) {
			System.out.println("Non contiene");
		}
		
	}

}
