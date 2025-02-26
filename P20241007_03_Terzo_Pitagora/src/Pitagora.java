
public class Pitagora {
	
	public static void main(String[] args) {
		
		float cateto1 = 45.3f;
		float cateto2 = 67.2f;
		
		float ipotenusa;
		
		ipotenusa = (float) Math.sqrt(cateto1*cateto1 + cateto2*cateto2);
		
		float area = (float) cateto1 * cateto2 / 2;
		
		float perimetro = (float) cateto1 + cateto2 + ipotenusa;
		
		System.out.println("L'ipotenusa vale: " + ipotenusa);
		System.out.println("L'area vale: " + area);
		System.out.println("Il perimetro vale: " + perimetro + "!" + "\n");
		
		//Cerchio
		
		float raggio = ipotenusa / 4 * 3f;
		double circonferenza = 2 * 3.14 * raggio;
		double areaCerchio = 3.14 * raggio * raggio;
		
		System.out.println("Il raggio del cerchio è: " + raggio);
		System.out.println("La circonferenza del cerchio è: " + circonferenza);
		System.out.println("L'area del cerchio è: " + areaCerchio);
		
		TriangoloRettangolo tr = new TriangoloRettangolo(3, 4);
		TriangoloRettangolo tr1 = new TriangoloRettangolo(900,0.2);
		
		System.out.println("Ipotenusa: " + tr.getHyp());
		System.out.println("Area: " + tr.getArea());
		
		tr.setCat1(6);
				
	}

}
