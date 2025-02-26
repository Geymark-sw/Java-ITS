
public class TriangoloRettangolo {
	
	private double cat1;
	private double cat2;
	private double hyp;
	private double area;
	private double perimetro;
	
	
	
	//è sufficiente la conoscenza dei due cateti per poter calcolare tutto il resto
	
	public TriangoloRettangolo(double cat1, double cat2) {
		
		this.cat1 = cat1;
		this.cat2 = cat2;
		hyp = Math.sqrt(cat2*cat2+cat1*cat1);
		area = cat1*cat2/2;
		this.cat1 = 2;
		
	}
	
	private void updateFunctionalRelationship() {
		hyp = Math.sqrt(cat2*cat2+cat1*cat1);
		area = cat1*cat2/2.;
		perimetro = cat1+cat2+hyp;
	}
	

	public double getArea() {
		return area;
	}


	public void setArea(double area) {
		this.area = area;
	}


	public double getCat1() {
		return cat1;
	}

	public void setCat1(double cat1) {
		updateFunctionalRelationship();
		this.cat1 = cat1;
	}

	public double getCat2() {
		
		return cat2;
	}

	public void setCat2(double cat2) {
		updateFunctionalRelationship();
		this.cat2 = cat2;
	}

	public double getHyp() {
		return hyp;
	}

	
	
	

}
