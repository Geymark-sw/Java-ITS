package esercizio_3_lambda;


@FunctionalInterface
interface CalcolatoreArea{
	double calcola(double raggio);
}

public class Main {
	
	
	
	public static void main(String[] args) {
		
		CalcolatoreArea area = raggio -> Math.PI * raggio*raggio;
		
		int r = 3;
		
		System.out.println("L'area del cerchio di raggio " + r + " equivale a: " + area.calcola(r));
	}

}
