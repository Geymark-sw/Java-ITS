import java.io.BufferedReader;
import java.util.LinkedList;
import java.util.Locale;

import com.fasterxml.jackson.databind.ObjectMapper;

public class Main {

	public static void main(String[] args) throws Exception{
		
		Locale.setDefault(Locale.US);
		
		// Create una lista con 10 elementi Wifi casuali
		LinkedList<WiFi> lwifi = new LinkedList<WiFi>();
		for (int i = 0; i < 10; i++) {
			lwifi.add(WiFi.MakeWifi());
		}

		System.out.println(lwifi);

		// Domanda:La potreste stampare in formato CSV poiché
		// dobbiamo passarla al vostro collega Onisa?
		
		for (var x : lwifi) {
			String a = String.format("%s,%s,%s,%f\n", 
					x.getId(), x.getProtocollo(), x.getPassword(), x.getFrequenza());
			System.out.print(a);
			
			System.out.printf("%s,%s,%s,%f\n", 
					x.getId(), x.getProtocollo(), x.getPassword(), x.getFrequenza());
			
		}
		
		try {
			var fou = Util.OpenFileForWriting("doc.txt");
			
			for(var x : lwifi) {
				String a = String.format("%s,%s,%s,%f\n", x.getId(), x.getProtocollo(), x.getPassword(), x.getFrequenza());
				fou.write(a);
				
			}
			fou.close();
		}catch(Exception e) {
			System.out.println("Eccezione");
		}
		
		
		
		try {
			BufferedReader fin = Util.OpenFileForReading("doc.txt");
			String riga;
			while((riga = fin.readLine()) != null) {
			
			System.out.println(riga);
			riga = fin.readLine();
			
				
			}
			String[] items = riga.split(",");
			WiFi it = new WiFi(items[0], items[1], items[2], Double.valueOf(items[3]));
			lwifi.add(it);
			System.out.println(riga);
			
			riga = fin.readLine();
			
		}catch(Exception e) {
			System.out.println("Eccezione");
			
		}
		
		WiFi appo = WiFi.MakeWifi();
		
		//Dchiaro la stringa che conterrà la descrizione in formato JSON
		String jsonString;
		
		ObjectMapper objectMapper = new ObjectMapper();
		jsonString = objectMapper.writeValueAsString(appo);
		System.out.println(jsonString);
		
		//Ora, a partire da una stringa JSON che contiene ovviamente i dati di 
		//una WiFi, è possibile tornare indietro e ottenere un oggetto della classe WiFi?
		
		WiFi nuovo = objectMapper.readValue(jsonString, WiFi.class);
		System.out.println(nuovo);
		
		
		
		//Ora come esercizio, salvate su file la wifi ma stavolta in formato JSON
		//e non in formato CSV e poi la rileggete da capo
		
		try {
			System.out.println(lwifi);
			var fou = Util.OpenFileForWriting("wifi.txt");
			for(var x : lwifi) {
				
				fou.write(objectMapper.writeValueAsString(x) + "\n");
				
			}
			
			fou.close();
			
		}catch(Exception e) {
			System.out.println("Eccezione scrittura con objectMapper su wifi.txt");
		}
		
		//lwifi.clear();
		
		try {
			var fin = Util.OpenFileForReading("wifi.txt");
			
			while(fin.readLine() != null) {
				
				
				

				lwifi.add((objectMapper.readValue(fin.readLine(), WiFi.class)));
			
			}
			
			fin.close();
			
			System.out.println(lwifi);
		}catch(Exception e) {
			System.out.println("Eccezione lettura con objectMapper su wifi.txt");
		}
		
	}

}







