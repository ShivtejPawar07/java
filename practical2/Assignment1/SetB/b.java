import java.util.*;
class Demo  
{
  public static void main(String[] args)
  {  Scanner sc=new Scanner(System.in);
     System.out.println("enter how many values");
     int n=sc.nextInt();
    HashMap<String,Integer> hs=new  HashMap<>();
    
     sc.nextLine();
    for(int i=0;i<n;i++)
    {  sc.nextLine();
      System.out.println("enter key for"+(i+1)+"element");
      String key=sc.nextLine();
      System.out.println("enter value for"+(i+1)+"element");
      int value=sc.nextInt();
      hs.put(key,value);
    }
    
    TreeMap<String,Integer> tm=new TreeMap(hs);
    System.out.println("after sorting by keys "+tm);
        
  
  }

}
