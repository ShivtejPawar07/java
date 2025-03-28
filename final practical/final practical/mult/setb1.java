import java.util.Random;
class SumCal extends Thread
{
  int [] numbers;
  int start;
  int end;
  int sum=0;
  
  SumCal( int [] numbers,
  int start,
  int end)
  {
    this.numbers=numbers;
    this.start=start;
    this.end=end;
  }
  
  public void run()
  {   System.out.println(Thread.currentThread().getName());
     for(int i=0;i<numbers.length;i++)
     {
       sum+=numbers[i];
     }
  }
  
  public int getSum(){
    return this.sum;
  }
  
}
class Demo{
  public static void main(String [] args){
    Random r =new Random();
    int [] numbers=new int [1000];
    
    for(int i=0;i<100;i++)
    {
      numbers[i]=r.nextInt(100);
    }
    
   
    SumCal[] threads=new SumCal[10];
    for(int i=0;i<10;i++)
    {
      threads[i]=new SumCal(numbers,(i*100),((i+1)*100));
      threads[i].start();
    }
    
      int totalSum=0;
    for(int i=0;i<10;i++)
    {
      try{
        threads[i].join();
        totalSum+=threads[i].getSum();
        
      }catch(Exception e){}
      
    }
    
    System.out.println("total sum:"+totalSum);
    System.out.println("Average:"+(totalSum/1000));
    
   
    
  
  }

}
