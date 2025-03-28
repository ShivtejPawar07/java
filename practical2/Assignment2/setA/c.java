// Shared resource that is shared between Producer and Consumer
class SharedResource {
    private int value; // Stores the produced value
    private boolean hasValue = false; // Flag to check if a value is available

    // Synchronized method to produce a value
    public synchronized void produce(int value) {
        while (hasValue) { // If a value already exists, wait for it to be consumed
            try {
                wait(); // Producer waits until the Consumer consumes the value
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.value = value; // Store the produced value
        hasValue = true; // Set flag to indicate value is available
        System.out.println("Produced: " + value);
        notify(); // Notify the Consumer that a value is available
    }

    // Synchronized method to consume a value
    public synchronized void consume() {
        while (!hasValue) { // If no value is available, wait for it to be produced
            try {
                wait(); // Consumer waits until a value is produced
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Consumed: " + value);
        hasValue = false; // Reset flag after consuming
        notify(); // Notify the Producer that the value is consumed
    }
}

// Producer thread that produces values
class Producer extends Thread {
    private SharedResource resource;

    // Constructor to initialize shared resource
    public Producer(SharedResource resource) {
        this.resource = resource;
    }

    public void run() {
        for (int i = 1; i <= 10; i++) { // Produces 10 values
            resource.produce(i); // Calls produce() method to generate values
            try {
                Thread.sleep(1000); // Sleep for 1 second to simulate production time
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

// Consumer thread that consumes values
class Consumer extends Thread {
    private SharedResource resource;

    // Constructor to initialize shared resource
    public Consumer(SharedResource resource) {
        this.resource = resource;
    }

    public void run() {
        for (int i = 1; i <= 10; i++) { // Consumes 10 values
            resource.consume(); // Calls consume() method to consume values
            try {
                Thread.sleep(1500); // Sleep for 1.5 seconds to simulate consumption time
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

// Main class to start Producer and Consumer threads
class Demo {
    public static void main(String[] args) {
        SharedResource resource = new SharedResource(); // Create shared resource
        Producer producer = new Producer(resource); // Create producer thread
        Consumer consumer = new Consumer(resource); // Create consumer thread

        producer.start(); // Start producer thread
        consumer.start(); // Start consumer thread
    }
}
