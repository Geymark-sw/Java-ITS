
public class Elefante extends Mammifero implements Must, Req, Comparable<Elefante>{

	private Double peso;
	
	
	
	public Elefante() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Elefante(Integer freqResp, Integer freqCardio, Double peso) {
		super(freqResp, freqCardio);
		this.peso = peso;
		}
	

	@Override
	public int compareTo(Elefante o) {
		return this.peso.compareTo(o.peso);
	}

	@Override
	public String getClassName() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getVersion() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getSerial() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String Verso() {
		return "Barrito";
	}
	
	

	public Double getPeso() {
		return peso;
	}

	public void setPeso(Double peso) {
		this.peso = peso;
	}

	@Override
	public String toString() {
		return "Elefante \n[peso=" + peso + ", toString()=" + super.toString() + "]\n";
	}
	
	
	
	 

}
