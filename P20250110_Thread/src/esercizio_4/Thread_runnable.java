package esercizio_4;

public class Thread_runnable implements Runnable {

	private int istance;

	public Thread_runnable(int istance) {

		this.istance = istance;

	}

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {

			System.out.println("[" + this.istance + "]" + (i + 1));
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}
	}

}
