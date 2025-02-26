package thread;

class LettoreMessaggi implements Runnable {
    private final CasellaPostale mailbox;

    public LettoreMessaggi(CasellaPostale mailbox) {
        this.mailbox = mailbox;
    }

    @Override
    public void run() {
        while (true) {
            try {
                mailbox.readMessage();
                Thread.sleep(1000); 
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                break;
            }
        }
    }
}