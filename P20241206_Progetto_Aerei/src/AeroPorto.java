import java.util.*;


public class AeroPorto {
	
	private String nome;
	private String citta;
	private String nazione;
	private int annoFondazione;
	
	public AeroPorto() {
		
	}
	
	public AeroPorto(String nome, String citta, String nazione, int annoFondazione) {
		super();
		this.nome = nome;
		this.citta = citta;
		this.nazione = nazione;
		this.annoFondazione = annoFondazione;
	}
	
	//implica che i posti di un determinato volo non siano più prenotabili
	public void imbarco(Volo v) {
		v.setImbarcato(true);
		System.out.println("Il volo " + v.getId() + "è stato imbarcato con successo.\n Non è più possibile prenotari posti per questo volo.");
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCitta() {
		return citta;
	}

	public void setCitta(String citta) {
		this.citta = citta;
	}

	public String getNazione() {
		return nazione;
	}

	public void setNazione(String nazione) {
		this.nazione = nazione;
	}

	public int getAnnoFondazione() {
		return annoFondazione;
	}

	public void setAnnoFondazione(int annoFondazione) {
		this.annoFondazione = annoFondazione;
	}

	@Override
	public String toString() {
		return "AeroPorto [nome=" + nome + ", citta=" + citta + ", nazione=" + nazione + ", annoFondazione="
				+ annoFondazione + "]";
	}
	
	
	
	

}
