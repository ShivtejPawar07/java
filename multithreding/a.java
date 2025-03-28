class MyThread extends Thread{
  public void run(){
  System.out.println("thread");

  }

}
class Main{
    public static void main(String[] args) {
          MyThread mt=new  MyThread();
          mt.start();
    }
}
