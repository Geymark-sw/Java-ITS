package esercizio_5;
import java.util.Scanner;

public class MioThread extends Thread{
	
	Scanner input = new Scanner(System.in);
	
	private int p1;
	private int p2;
	
	public MioThread(int p1) {
		this.p1 = p1;
	}
	
	public MioThread(int p1, int p2) {
		this.p1 = p1;
		while(p2 == 0) {
			p2 = input.nextInt();
		}
		this.p2 = p2;
	}

	
	@Override
	public void run() {
		try {
			if(this.p2 == 0) {
				for(int i=1; i<=10; i++) {
					System.out.println("Thread 1: " + i);
					Thread.sleep(600);
				}
			}else {
				for(int i=100; i>=90; i--) {
					System.out.println("Thread 2: " + i);
					Thread.sleep(600);
				}
			}
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
}
