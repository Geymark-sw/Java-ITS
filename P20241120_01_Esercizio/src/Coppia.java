
public class Coppia <T1, T2> {
	
	private T1 primo;
	private T2 secondo;
	
	public Coppia() {
		
	}
	
	public Coppia(T1 primo, T2 secondo) {
		
		this.primo = primo;
		this.secondo = secondo;
		
	}
	
	public T1 getPrimo() {
		
		return this.primo;
		
	}
	
	public T2 getSecondo() {
		
		return this.secondo;
		
	}
	
	public void setPrimo(T1 primo) {
		
		this.primo = primo;
		
	}
	
	public void setSecondo(T2 secondo) {
		
		this.secondo = secondo;
		
	}

	@Override
	public String toString() {
		return "Coppia [primo=" + this.primo + ", secondo=" + this.secondo + "]";
	}
	
	

}
