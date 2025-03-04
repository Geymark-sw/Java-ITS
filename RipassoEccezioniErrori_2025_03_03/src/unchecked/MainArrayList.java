package unchecked;

import java.util.ArrayList;

public class MainArrayList {
	
	public static void main(String[] args) {
		// creo un arraylist di stringhe e uso metodi che sollevano eccezioni UNCHECKED
		
		ArrayList<String> fiori = new ArrayList<String>();
		fiori.add("fresie");
		fiori.add("rose");
		fiori.add("margherite");
		
		System.out.println(fiori);
		
		try {
			fiori.add(4, "ciao");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("fine");
	}
		
}
