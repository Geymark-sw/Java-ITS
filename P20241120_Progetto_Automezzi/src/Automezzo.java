
public abstract class Automezzo {
	
	protected Integer numeroDiRuote;
	protected String carburante;
	
	public Integer getNumeroDiRuote() {
		return numeroDiRuote;
	}
	public void setNumeroDiRuote(Integer numeroDiRuote) {
		this.numeroDiRuote = numeroDiRuote;
	}
	public String getCarburante() {
		return carburante;
	}
	public void setCarburante(String carburante) {
		this.carburante = carburante;
		
	}
	
	public abstract Double getMaxSpeed();
	
	@Override
	public String toString() {
		return "Automezzo [numero di ruote=" + numeroDiRuote + ", carburante=" + carburante + "]";
	}
	protected abstract Double getConsumo();
	
	

}
