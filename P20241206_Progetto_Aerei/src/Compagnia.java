import java.util.*;


public class Compagnia {
	
	private String nome;
	private int annoFondazione;
	private ArrayList<Volo> listaVoli = new ArrayList<Volo>();
	
	
	public Compagnia() {
		
	}
	
	
	public Compagnia(String nome, int annoFondazione, ArrayList<Volo> listaVoli) {
		super();
		this.nome = nome;
		this.annoFondazione = annoFondazione;
		this.listaVoli = listaVoli;
	}
	
	public void prenotaPostoInVolo(Volo v) {
		if (!listaVoli.contains(v)) {
			
			if(v.getPostiPrenotati() + 1 < v.getPostiTotali()){
				v.setPostiPrenotati(v.getPostiPrenotati() + 1);
			
				System.out.println("Il posto " + v.getPostiPrenotati() + "è stato prenotato correttamente nel Volo " + v.getId());
			}else {
				System.out.println("Impossibile prenotare il posto. I posti per il volo " + v.getId() + "sono stati tutti prenotati");
			}
		}else {
			System.out.println("Impossibile prenotare il posto, il volo inserito non esiste");
		}
	} //!!!CREARE LA CLASSE POSTO!!!

	public void cancellaPostoInVolo(Volo v) {
		if(listaVoli.contains(v)) {
			if(v.getPostiPrenotati() - 1 >= 0) {
				v.setPostiPrenotati(v.getPostiPrenotati()-1);
				System.out.println("Il posto nel volo " + v.getId() + "è stato rimosso con successo");
			}
		}else {
			System.out.println("Impossibile rimuovere il  volo perchè non esiste");
		}
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public int getAnnoFondazione() {
		return annoFondazione;
	}


	public void setAnnoFondazione(int annoFondazione) {
		this.annoFondazione = annoFondazione;
	}


	public ArrayList<Volo> getListaVoli() {
		return listaVoli;
	}


	public void setListaVoli(ArrayList<Volo> listaVoli) {
		this.listaVoli = listaVoli;
	}


	@Override
	public String toString() {
		return "Compagnia [nome=" + nome + ", annoFondazione=" + annoFondazione + ", listaVoli=" + listaVoli + "]";
	}
	
	
	
	

}
