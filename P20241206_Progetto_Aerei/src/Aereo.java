
public class Aereo {
	
	private String id;
	private String nome;
	private int annoCostruzione;
	private int numeroPosti;
	
	
	public Aereo() {
		
	}
	
	public Aereo(String id, String nome, int annoCostruzione, int numeroPosti) {
		super();
		this.id = id;
		this.nome = nome;
		this.annoCostruzione = annoCostruzione;
		this.numeroPosti = numeroPosti;
		
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getAnnoCostruzione() {
		return annoCostruzione;
	}
	public void setAnnoCostruzione(int annoCostruzione) {
		this.annoCostruzione = annoCostruzione;
	}
	
	public int getNumeroPosti() {
		return numeroPosti;
	}

	public void setNumeroPosti(int numeroPosti) {
		this.numeroPosti = numeroPosti;
	}

	@Override
	public String toString() {
		return "Aereo [id=" + id + ", nome=" + nome + ", annoCostruzione=" + annoCostruzione + "]";
	}
	
	
	
}
