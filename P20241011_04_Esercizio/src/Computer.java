
public class Computer {
	
	float prezzo;
	float peso;
	float larghezza;
	float altezza;
	float profondità;
	String produttore;
	int annoDiProduzione;
	private static int numeriOggettiComputer = 0;
	
	public static void stampaNumeroOggettiComputer() {
		System.out.println("Numeri di oggetti di tipo 'Computer' creati: " + numeriOggettiComputer);
	}
	
	public Computer(float prezzo, float peso, float larghezza, float altezza, float profondità, String produttore, int annoDiProduzione) {
		
		this.prezzo = prezzo;
		this.peso = peso;
		this.larghezza = larghezza;
		this.altezza = altezza;
		this.profondità = profondità;
		this.produttore = produttore;
		this.annoDiProduzione = annoDiProduzione;
		this.numeriOggettiComputer++;
	}
	
	
	public float getPrezzo() {
		return prezzo;
	}
	public void setPrezzo(float prezzo) {
		this.prezzo = prezzo;
	}
	public float getPeso() {
		return peso;
	}
	public void setPeso(float peso) {
		this.peso = peso;
	}
	public float getLarghezza() {
		return larghezza;
	}
	public void setLarghezza(float larghezza) {
		this.larghezza = larghezza;
	}
	public float getAltezza() {
		return altezza;
	}
	public void setAltezza(float altezza) {
		this.altezza = altezza;
	}
	public float getProfondità() {
		return profondità;
	}
	public void setProfondità(float profondità) {
		this.profondità = profondità;
	}
	public String getProduttore() {
		return produttore;
	}
	
	public int getAnnoDiProduzione() {
		return annoDiProduzione;
		
	}
	
	public int getNumeriOggettiComputer(){
		
		return numeriOggettiComputer;
		
	}
	
	
	

}
