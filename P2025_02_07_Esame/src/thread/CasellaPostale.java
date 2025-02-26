package thread;

import java.util.LinkedList;
import java.util.Queue;


class CasellaPostale {
    private final int MAX_SIZE = 10;
    private final Queue<String> messages = new LinkedList<>();

    
    public synchronized void writeMessage(String message) throws InterruptedException {
        while (messages.size() == MAX_SIZE) {
            System.out.println("Casella piena. In attesa di spazio...");
            wait();
        }
        messages.add(message);
        System.out.println("Messaggio scritto: " + message);
        notifyAll(); 
    }

    
    public synchronized String readMessage() throws InterruptedException {
        while (messages.isEmpty()) {
            System.out.println("Casella vuota. In attesa di messaggi...");
            wait();
        }
        String message = messages.poll();
        System.out.println("Messaggio letto: " + message);
        notifyAll(); 
        return message;
    }
}

