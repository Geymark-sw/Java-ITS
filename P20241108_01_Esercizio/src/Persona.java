
public class Persona extends EssereVivente{
	
	private String nome;
	private int eta;
	
	public Persona() {
		
	}
	
	
	public Persona(String nome, int eta) {
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


	public int getEta() {
		return eta;
	}


	public void setEta(int eta) {
		this.eta = eta;
		
	}


	@Override
	public String toString() {
		return "Persona [nome=" + nome + ", eta=" + eta + "]";
	}


	@Override
	public void setColoreOcchi(String s) {
		this.coloreOcchi = s;
		
	}


	@Override
	public void GetColoreOcchi(String s) {
		// TODO Auto-generated method stub
		
	}
	
	
	
	
	
}
