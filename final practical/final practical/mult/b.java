//Write a java program that implements a multi-thread application that has three threads. Each
//thread displays 1 to 5 numbers.
class NumberThread extends Thread {
    private String threadName;

    // Constructor to set thread name
    public NumberThread(String name) {
        this.threadName = name;
    }

    // Run method to display numbers 1 to 5
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(threadName + ": " + i);
            try {
                Thread.sleep(500); // Pause for better output visualization
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

class Demo {
    public static void main(String[] args) {
        // Create three threads
        NumberThread t1 = new NumberThread("Thread 1");
        NumberThread t2 = new NumberThread("Thread 2");
        NumberThread t3 = new NumberThread("Thread 3");

        // Start all threads
        t1.start();
        t2.start();
        t3.start();
    }
}

