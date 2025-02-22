class Message {
    private String message;
    private boolean hasMessage = false;

    public synchronized void sendMessage(String msg) {
        while (hasMessage) {  // Wait if message is not yet consumed
            try { wait(); } catch (InterruptedException ignored) {}
        }
        message = msg;
        hasMessage = true;
        notify(); // Notify receiver
    }

    public synchronized String receiveMessage() {
        while (!hasMessage) { // Wait for message
            try { wait(); } catch (InterruptedException ignored) {}
        }
        hasMessage = false;
        notify(); // Notify sender
        return message;
    }
}

class Sender extends Thread {
    private Message msg;

    public Sender(Message msg) {
        this.msg = msg;
    }

    public void run() {
        String[] messages = { "Hello!", "How are you?", "Stay safe!", "Good Bye Corona" };
        for (String message : messages) {
            msg.sendMessage(message);
            try { Thread.sleep(1000); } catch (InterruptedException ignored) {}
        }
    }
}

class Receiver extends Thread {
    private Message msg;

    public Receiver(Message msg) {
        this.msg = msg;
    }

    public void run() {
        String received;
        do {
            received = msg.receiveMessage();
            System.out.println("Received: " + received);
        } while (!received.equals("Good Bye Corona"));
    }
}

 class SenderReceiver {
    public static void main(String[] args) {
        Message msg = new Message();
        new Sender(msg).start();
        new Receiver(msg).start();
}
}