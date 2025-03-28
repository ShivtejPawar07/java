import java.util.*;
class Demo extends Thread{
  public void run(){
    try{
      Random r=new Random();
      
      while(true){
       int num=r.nextInt(100);
       if(num%2==0){
         Square s=new Square(num);
         s.start();
       }
       else{
        Cube c=new Cube(num);
        c.start();
       }
       Thread.sleep(1000);
      }
    }catch(Exception e){
    }
  }
}
class Cube extends Thread{
   int num;
   Cube(int num){
    this.num=num;
   }
    public void run(){
    System.out.println(num+"cube is"+(num*num*num));
    }
}
class Square extends Thread{
   int num;
   Square(int num){
    this.num=num;
   }
    public void run(){
    System.out.println(num+"cube is"+(num*num));
    }
}
class ThreadApp{
  public static void main(String args[]){
    Demo d=new Demo();
    d.start();
  }

}
