
public class Ghepardo extends Mammifero implements Must, Req, Comparable<Ghepardo>{
	
	private Double speed;	

	public Ghepardo() {
		super();

	}

	public Ghepardo(Integer freqResp, Integer freqCardio, Double speed) {
		super(freqResp, freqCardio);
		this.speed = speed;
	}

	public Double getSpeed() {
		return speed;
	}

	public void setSpeed(Double speed) {
		this.speed = speed;
	}

	public String Verso() {
		return "Roaarrr";
	}
	
	

	@Override
	public String toString() {
		return "Ghepardo\n [speed=" + speed + ", toString()=" + super.toString() + "]\n";
	}

	@Override
	public String getClassName() {
		
		return "Ghepardo";
	}

	@Override
	public String getVersion() {
		
		return "1.0";
	}

	@Override
	public String getSerial() {
		
		return "AI48";
	}
	
	public int compareTo(Ghepardo o) {
		
		if (this.getSpeed().compareTo(o.speed) != 0) {
			
			return this.getSpeed().compareTo(o.getSpeed());
			
		}else {
			return this.getFreqCardio().compareTo(o.getFreqCardio());
		}

	}
	
	

}
