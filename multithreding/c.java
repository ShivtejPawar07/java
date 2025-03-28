class MyThread extends Thread {
    public void run() {  // 
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + " : " + i);
            try {
                Thread.sleep(1000); 
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
 class Main {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();

        t1.setName("thread 1");
        t2.setName("thread 2");

        t1.start(); // `run()` आपोआप चालते
        t2.start();
    }
}
