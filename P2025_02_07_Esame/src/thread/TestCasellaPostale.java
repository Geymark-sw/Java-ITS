package thread;

public class TestCasellaPostale {
    public static void main(String[] args) {
        CasellaPostale mailbox = new CasellaPostale();

        Thread writerThread = new Thread(new ScrittoreMessaggi(mailbox));
        Thread readerThread = new Thread(new LettoreMessaggi(mailbox));

        writerThread.start();
        readerThread.start();

       
        try {
            Thread.sleep(15000); 
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        writerThread.interrupt();
        readerThread.interrupt();
    }
}
