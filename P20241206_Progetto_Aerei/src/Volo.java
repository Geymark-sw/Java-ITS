import java.util.*;

/*DA FARE
 * Definire la collezioni di oggetti di tipo Posto
 * Implementare un for per il riempimento della collezione posti basndoti sul numero di postiTotali
 * implementare getPosti*/


public class Volo {
	
	private String id;
	private String aeroportoPartenza;
	private String aeroportoArrivo;
	private Date istantePartenza;
	private Date istanteArrivo;
	private Aereo aereo; // di tipo aereo
	private int postiTotali;
	private int postiPrenotati = 0;
	private boolean imbarcato;
	
	//provo a fare una lista collezione di posti
	
	private ArrayList<Posto> posti = new ArrayList<Posto>();
	
	public Volo() {
		
	}
	
	public Volo(String id, String aeroportoPartenza, String aeroportoArrivo, Date istantePartenza, Date istanteArrivo,
			Aereo aereo, boolean imbarcato) {
		super();
		this.id = id;
		this.aeroportoPartenza = aeroportoPartenza;
		this.aeroportoArrivo = aeroportoArrivo;
		this.istantePartenza = istantePartenza;
		this.istanteArrivo = istanteArrivo;
		this.aereo = aereo;
		this.postiTotali = aereo.getNumeroPosti();
		this.imbarcato = imbarcato;
	}
	
	//for per riempire

	
	public String getId() {
		return this.id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public String getAeroportoPartenza() {
		return aeroportoPartenza;
	}

	public void setAeroportoPartenza(String aeroportoPartenza) {
		this.aeroportoPartenza = aeroportoPartenza;
	}

	public String getAeroportoArrivo() {
		return aeroportoArrivo;
	}

	public void setAeroportoArrivo(String aeroportoArrivo) {
		this.aeroportoArrivo = aeroportoArrivo;
	}

	public Date getIstantePartenza() {
		return istantePartenza;
	}

	public void setIstantePartenza(Date istantePartenza) {
		this.istantePartenza = istantePartenza;
	}

	public Date getIstanteArrivo() {
		return istanteArrivo;
	}

	public void setIstanteArrivo(Date istanteArrivo) {
		this.istanteArrivo = istanteArrivo;
	}

	public Aereo getAereo() {
		return aereo;
	}

	public void setAereo(Aereo aereo) {
		this.aereo = aereo;
	}

	public boolean isImbarcato() {
		return imbarcato;
	}

	public void setImbarcato(boolean imbarcato) {
		this.imbarcato = imbarcato;
	}
	
	public int getPostiTotali() {
		return this.postiTotali;
		
	}
	
	public void setPostiTotali(int prenotazioni) {
		this.postiTotali = prenotazioni;
	}
	
	public int getPostiPrenotati() {
		return this.postiPrenotati;
	}
	
	public void setPostiPrenotati(int n) {
		this.postiPrenotati = n;
	}

	

	


}
