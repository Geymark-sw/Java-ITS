import java.time.LocalTime;

public class MyThread extends Thread {
    private long num;

    public void run() {
    	
//        while (num -- > 0) { // diminusce di uno ogni volta, conto alla rovescia
//            System.out.println("Thread id: " + getId() + ". Num: " + num);
//       }
    	while (true) {
    		System.out.println(LocalTime.now());
    		try {
    			Thread.sleep(1000);
    		}
    		catch (InterruptedException e) {
    			e.printStackTrace();
    		}
    	}
    }	

	public MyThread(long num) {
		super();
		this.num = num;
	}

	public MyThread() {
		super();
	}
	
	
}
