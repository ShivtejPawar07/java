class MyThread extends Thread {
    public void run() {
        for (int i = 1; i <= 3; i++) {
            System.out.println(Thread.currentThread().getName() + " - " + i);
            try { Thread.sleep(1000); } catch (InterruptedException e) { }
        }
    }

    public static void main(String args[]) throws  InterruptedException {
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();

        t1.start();
        t1.join(); 
      //  try {
           // t1.join();  // Main thread waits until t1 finishes
      //  } catch (Exception e) { }

        t2.start();  // Only starts after t1 is complete
}
}
