class CountDownThread extends Thread {
    public void run() {
        for (int i = 100; i >= 1; i--) {
            System.out.println(i);
            try {
                Thread.sleep(6000); // Sleep for 6 seconds
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

class Demo {
    public static void main(String[] args) {
        CountDownThread t = new CountDownThread();
        t.start();
  }
}