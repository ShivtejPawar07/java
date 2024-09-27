import java.util.*;
class demo
{
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter n value");
    int n=sc.nextInt();
 
    for(int i=1;i<=n;i++)
    {
        for(int j=1;j<=n;j++)
        {
        System.err.print( "* ");
        }
        System.out.println();
    }

    for(int i=1;i<=n;i++)
    {
        for(int j=1;j<=i;j++)
        {
        System.err.print("* ");
        }
        System.out.println();
    }

  }

}
