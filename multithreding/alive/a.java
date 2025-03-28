class Mythread extends Thread{
  public void run(){

  }

}
class Main{
    public static void main(String[] args) {
        Mythread mt=new Mythread();
        System.out.println("before starting="+mt.isAlive());
        mt.start();
        System.out.println("after starting="+mt.isAlive());
    }
}