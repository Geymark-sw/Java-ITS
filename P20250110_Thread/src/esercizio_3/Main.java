package esercizio_3;

public class Main {
	
	public static void main(String[] args) {
		
		Thread_runnable c1 = new Thread_runnable(1);
		Thread_runnable c2 = new Thread_runnable(2);
		
		Thread t1 = new Thread(c1);
		Thread t2 = new Thread(c2);
		
		
		t1.start();
		t2.start();
	}

}
