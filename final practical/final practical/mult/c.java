class Demo {
    public static void main(String[] args) {
        // Get the reference of the main thread
        Thread mainThread = Thread.currentThread();

        // Display details of the main thread
        System.out.println("Current Thread: " + mainThread);
        System.out.println("Thread Name: " + mainThread.getName());
        System.out.println("Thread Priority: " + mainThread.getPriority());
        System.out.println("Thread State: " + mainThread.getState());

        // Display numbers from 1 to 10 using sleep()
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
            try {
                Thread.sleep(500); // Sleep for 500ms (0.5 seconds)
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

