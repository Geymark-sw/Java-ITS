package thread;

class ScrittoreMessaggi implements Runnable {
    private final CasellaPostale mailbox;

    public ScrittoreMessaggi(CasellaPostale mailbox) {
        this.mailbox = mailbox;
    }

    @Override
    public void run() {
        int messageCount = 1;
        while (true) {
            try {
                String message = "Messaggio " + messageCount++;
                mailbox.writeMessage(message);
                Thread.sleep(500); 
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                break;
            }
        }
    }
}