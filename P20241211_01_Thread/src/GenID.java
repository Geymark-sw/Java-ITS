import java.util.concurrent.locks.ReentrantLock;

public class GenID extends Thread {
	
	private static ReentrantLock lock = new ReentrantLock();
	static long ID = 0;
	
	public static synchronized void increase() {
		
		//lock.lock();
        System.out.println(ID); // " " + getId());
        // Simulare un minimo di tempo di calcolo
        try {
            Thread.sleep(5);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        
        ID = ID + 1;
        //lock.unlock();
		
	}
	
	public void run() {
        for (int i=0; i<100; i++) {
        	lock.lock();
            System.out.println(ID + " " + getId());
            // Simulare un minimo di tempo di calcolo
            try {
                Thread.sleep(5);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            
            ID = ID + 1;
            lock.unlock();
            try {
                Thread.sleep(5);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }

}
