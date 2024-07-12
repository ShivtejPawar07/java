//1. Check number is positive or negative.
// class pos {
//      public static void main(String[] args) {
//         int num=Integer.parseInt(args[0]);
//         if(num=<0)
//         System.out.println("negative");
//       else
//         System.out.println("positive");
//      }
//     }
import java.util.Scanner;
class demo
{
public static void main(String[] args) 
{    
     Scanner sc=new Scanner(System.in);
     System.out.println("no check");
     int number=sc.nextInt();
         if(number>0)
    {
        System.out.println("positive");
    }
      else if(number==0)
      {
        System.out.println("zero");
      }
    else
    {
        System.out.println( "negative ");
    }
 }
}