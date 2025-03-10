package modificaNomeDaOggettoRestituito;

public class Cane {
	
	private String nome;
	private String eta;
	
	
	public Cane(String nome, String eta) {
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


	public String getEta() {
		return eta;
	}


	public void setEta(String eta) {
		this.eta = eta;
	}


	@Override
	public String toString() {
		return "Cane [nome=" + nome + ", eta=" + eta + "]";
	}
	
	

}
