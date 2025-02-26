
public class Persona {
	
	private String nome;
	private int eta;
	
	public Persona() {
		
	}
	
	
	public Persona(String nome, Integer eta) {
		super();
		this.nome = nome;
		this.eta = eta;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public Integer getEta() {
		return eta;
	}


	public void setEta(int eta) {
		this.eta = eta;
	}


	@Override
	public String toString() {
		return "Persona [nome=" + nome + ", eta=" + eta + "]";
	}
	
	
	
	
	
}
