class Resource{
   int value;
   boolean hasValue=false;
   
   
  synchronized void produce(int value){
      if(hasValue)
      {  try{
        wait();
        }catch(Exception e){}
      }
      this.value=value;
      hasValue=true;
      System.out.println(Thread.currentThread().getName()+"produced"+value);
      notify();

}//produce
   
     synchronized void consume(){
       if(!hasValue){
         try{ wait();
         }
         catch(Exception e){}
       }
       System.out.println(Thread.currentThread().getName()+"consumed"+value);
       hasValue=false;
       notify();

  }
}
class Producer extends Thread{
  Resource r;
  
  Producer( Resource r)
  { this.r=r;
  }
  
  public void run()
  {
  for(int i=0;i<10;i++){
      r.produce(i);
      try{
      Thread.sleep(1000);
      }catch(Exception e)
      {
      }
      }
  }

}
class Consumer extends Thread{
  Resource r;
      Consumer(  Resource r){
      this.r=r;
      }
      
        public void run(){
      for(int i=0;i<10;i++){
         r.consume();
         try{
      Thread.sleep(1000);
      }catch(Exception e)
      {
      }
   }
 }
      
}
class Demo{
  public static void main(String[] args){
     
     Resource r=new Resource();
     
     Producer p=new Producer(r);
     Consumer c=new Consumer(r);
     p.start();
     c.start();
  }

}
