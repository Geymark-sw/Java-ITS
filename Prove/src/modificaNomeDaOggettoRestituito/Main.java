package modificaNomeDaOggettoRestituito;

import java.util.ArrayList;

public class Main {
	
	public static void main(String args[]) {
		
		ArrayList<Cane> cani = new ArrayList<Cane>();
		
		cani.add(new Cane("Pluto", "5"));
		
		System.out.println(cani);
		
		Cane pluto = cani.get(0);
		
		pluto.setNome("PlutoSettato");
		
		System.out.println(cani);
		
	}

}
