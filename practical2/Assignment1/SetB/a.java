import java.util.*;
class Demo
{
  public static void main(String[] args)
  {
  Scanner sc=new Scanner(System.in);
  System.out.println("enter how many numbers ");
  int n=sc.nextInt();
    TreeSet ts =new TreeSet();
    System.out.println("enter "+(n)+"numbers");
  for(int i=0;i<n;i++)
  {
   ts.add(sc.nextInt());
  }
  
  System.out.println("elements "+ts);
  
  }

}
