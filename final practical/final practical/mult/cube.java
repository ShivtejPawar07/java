import java.util.Random;
class NumGen extends Thread{  
   public void run()
   { try{
   Random r=new Random();
    
   while(true){
    int num=r.nextInt(100);
     if(num%2==0){
     SquareThread s=new SquareThread(num);
     s.start();
     }
     else{
      CubeThread c=new CubeThread(num);
     c.start();
     }
     Thread.sleep(1000);
 
   }
   }catch(Exception e){}
 }  

}
class SquareThread extends Thread{
     int num;
    SquareThread(int num){
    this.num=num;
    }
    public void run()
    {
    System.out.println(num +"is even->square "+(num*num));
    }
}
class CubeThread extends Thread{
     int num;
    CubeThread(int num){
    this.num=num;
    }
    public void run()
    {
    System.out.println(num+"id odd ->cube "+(num*num*num));
    }
}

class ThreadApp{
public static void main(String[] args){
NumGen n=new NumGen();
 n.start();
}
}
