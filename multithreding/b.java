class MyThread implements Runnable {
    public void run(){
        System.out.println("thread");

    }
    
}
class Main{
    public static void main(String[] args) {
        MyThread mt=new MyThread();
        Thread t=new Thread(mt);
        t.start();
    }
}
