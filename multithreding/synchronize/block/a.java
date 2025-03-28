class SharedResource {
    void printNumbers(int n) {
        synchronized (this){  // Synchronized block
            for (int i = 1; i <= 5; i++) {
                System.out.println(Thread.currentThread().getName() + ": " + (n * i));
               
                  try {
                       Thread.sleep(500);
                } catch (InterruptedException e) {
                   System.out.println(e);
               }
            }
        }
    }
}

class MyThread extends Thread {
    SharedResource obj;

    MyThread(SharedResource obj) {
        this.obj = obj;
    }

    public void run() {
        obj.printNumbers(2);
    }
}

class Demo {
    public static void main(String[] args) {
        SharedResource obj = new SharedResource();

        MyThread t1 = new MyThread(obj);
        MyThread t2 = new MyThread(obj);

        t1.start();
        t2.start();
  }
}