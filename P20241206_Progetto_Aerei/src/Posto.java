
public class Posto {
	
	private int id;
	private String classe;
	
	public Posto() {
		
	}
	
	public Posto(int id, String classe) {
		this.id = id;
		this.classe = classe;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getClasse() {
		return classe;
	}

	public void setClasse(String classe) {
		this.classe = classe;
	}

	@Override
	public String toString() {
		return "Posto [id=" + id + ", classe=" + classe + "]";
	}
	
	

}
