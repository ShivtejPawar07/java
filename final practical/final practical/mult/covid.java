import java.util.*;
import java.io.*;

class Demo extends Thread {
    String name;
    int times;
    
    Demo(String name,int times){
      this.name=name;
      this.times=times;
    }
    public void run(){
      for(int i=1;i<times;i++){
       System.out.println(name);
      }
    
    }
    public static void main(String args[]){
      
      Demo d=new Demo("co",2);
       Demo d1=new Demo("co0",4);
        Demo d2=new Demo("co00",6);
        
        d.start();
        d1.start();
        d2.start();
        
     
    }
}



