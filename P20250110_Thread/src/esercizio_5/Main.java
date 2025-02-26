package esercizio_5;

public class Main {
	
	public static void main(String[] args) {
		MioThread m1 = new MioThread(1);
		MioThread m2 = new MioThread(2,2);
		
		m1.start();
		m2.start();
	}

}
