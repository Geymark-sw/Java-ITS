
public class Studente extends Persona implements Comparable<Studente>{
	
	public static int studentiCreati = 0;
	private String corso;
	private int annoDiFrequenza;
	
	public Studente() {
		
	}
	
	
	public Studente(String nome, int eta, String corso, int annoDiFrequenza) {
		super(nome, eta);
		this.corso = corso;
		this.annoDiFrequenza = annoDiFrequenza;
		studentiCreati++;
	}


	public String getCorso() {
		return corso;
	}


	public void setCorso(String corso) {
		this.corso = corso;
	}


	public int getAnnoDiFrequenza() {
		return annoDiFrequenza;
	}


	public void setAnnoDiFrequenza(int annoDiFrequenza) {
		this.annoDiFrequenza = annoDiFrequenza;
	}


	@Override
	public String toString() {
		return "Studente [nome= "+ this.getNome()+", eta'= "+this.getEta()+", corso= " + corso + ", Anno di frequenza= " + annoDiFrequenza +"]";
	}


	@Override
	public int compareTo(Studente o) {
		return this.getNome().compareTo(o.getNome());
		
	}
	
	
	


	}


	
	
	
	
	
	


