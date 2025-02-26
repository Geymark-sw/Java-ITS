import java.util.*;

public class Cliente {
	
	private int id;
	private String nome;
	private String cognome;
	private String email;
	private String password;
	private ArrayList<Prodotto> prodotti;
	
	public Cliente(int id, String nome, String cognome, String email, String password, ArrayList<Prodotto> prodotti) {
		super();
		this.id = id;
		this.nome = nome;
		this.cognome = cognome;
		this.email = email;
		this.password = password;
		this.prodotti = prodotti;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public ArrayList<Prodotto> getProdotti() {
		return prodotti;
	}

	public void setProdotti(ArrayList<Prodotto> prodotti) {
		this.prodotti = prodotti;
	}

	private String stampaProdotti() {
		
		String s = "";
		for (Prodotto p : this.prodotti){
			s += p.toString() + "\n";
		}
		
		return s;
	}
	
	@Override
	public String toString() {
		return "Cliente [id=" + id + "\n nome=" + nome + "\n cognome=" + cognome + "\n email=" + email + "\n password="
				+ password + "\n prodotti=\n" + stampaProdotti() + "]";
	}
	
	
	
	

}
