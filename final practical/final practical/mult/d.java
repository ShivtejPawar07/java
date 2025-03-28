class MyThread extends Thread {
    public void run() {
        // Display the name and priority of the thread
        System.out.println("Thread Name: " + Thread.currentThread().getName());
        System.out.println("Thread Priority: " + Thread.currentThread().getPriority());
    }
}

class Demo {
    public static void main(String[] args) {
        // Create a thread
        MyThread t1 = new MyThread();

        // Set a custom name and priority for the thread
        t1.setName("MyCustomThread");
        t1.setPriority(7);

        // Start the thread
        t1.start();
    }
}

