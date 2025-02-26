
public class Studente extends Persona implements Comparable<Studente>{
	
	private String corso;
	private Integer annoDiFrequenza;
	
	
	
	public Studente(String nome, Integer eta, String corso, int annoDiFrequenza) {
		super(nome, eta);
		this.corso = corso;
		this.annoDiFrequenza = annoDiFrequenza;
	}


	public String getCorso() {
		return corso;
	}


	public void setCorso(String corso) {
		this.corso = corso;
	}


	public Integer getAnnoDiFrequenza() {
		return annoDiFrequenza;
	}


	public void setAnnoDiFrequenza(int annoDiFrequenza) {
		this.annoDiFrequenza = annoDiFrequenza;
	}


	@Override
	public String toString() {
		return "Studente [nome= "+ this.getNome()+", eta'= "+this.getEta()+", corso= " + corso + ", Anno di frequenza= " + annoDiFrequenza +"]";
	}
	
	
	//metodo compareTo per comparare per nome
	
	  public int compareTo(Studente s) {
	  
	  return this.getNome().compareTo(s.getNome());
	  
	  }
	 
	
	
	//metodo compareTo per comparare per età
	
	/*
	 * public int compareTo(Studente s) {
	 * 
	 * return this.getEta().compareTo(s.getEta());
	 * 
	 * }
	 */
	 
	 
	//metodo compareTo per comparare per corso
	
	
	/*
	 * public int compareTo(Studente s) {
	 * 
	 * return this.getCorso().compareTo(s.getCorso());
	 * 
	 * }
	 */
	 
	
	//metodo compareTo per comparare per anno di frequenza
	
	/*
	 * public int compareTo(Studente s) {
	 * 
	 * return this.getAnnoDiFrequenza().compareTo(s.getAnnoDiFrequenza());
	 * 
	 * }
	 */
	 
	


	
}


	
	
	
	
	
	


