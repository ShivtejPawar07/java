// class a
// {
//   public static void main(String[] args) {
//    for(int i=0;i<args.length;i++)
//     System.out.println(args[i]);
//   }

// }
import java.util.*;
class a
{
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter num");
    int n1=sc.nextInt();
    int n2=sc.nextInt();
    int n3=sc.nextInt();
    if(n1<n2 && n1<n3)
    System.out.println(n1+" minimum");
    else if(n2<n3)
    System.out.println(n2+" minimum");
    else
    System.out.println(n3+" minimum");
  }
}