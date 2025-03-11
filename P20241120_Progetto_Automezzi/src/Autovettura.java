
public class Autovettura extends Automezzo {
	
	private Double cilindrata;
	private Double consumo;
	private Double velocitaMassima;
	
	public Autovettura() {
		
	}
	
	public Autovettura(Integer numeroDiRuote, String carburante, Double cilindrata, Double consumo, Double velocitaMassima) {
		
		this.numeroDiRuote = numeroDiRuote;
		this.carburante = carburante;
		this.cilindrata = cilindrata;
		this.consumo = consumo;
		this.velocitaMassima = velocitaMassima;		
	}
	
	public Double getCilindrata() {
		return this.cilindrata;
	}
	
	public Double getConsumo() {
		return this.consumo;
	}
	
	public void setCilindrata(Double cilindrata) {
		this.cilindrata = cilindrata;
	}
	
	public void setConsumo(Double consumo) {
		this.consumo = consumo;
	}
	
	
	
	@Override
	public String toString() {
		return "Autovettura [velocitaMax= "+ velocitaMassima +", cilindrata=" + cilindrata + ", consumo=" + consumo + ", numeroDiRuote=" + numeroDiRuote
				+ ", carburante=" + carburante + "]";
	}

	public Double getMaxSpeed() {
		return this.velocitaMassima;
	}
	
	public void setMaxSpeed(Double maxSpeed) {
		
		this.velocitaMassima = maxSpeed;
		
	}
	

	
	
}
