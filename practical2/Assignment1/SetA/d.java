import java.util.*;
import java.util.Scanner;
class Demo {
 public static void main(String[] args){
   Scanner sc=new Scanner(System.in);
   System.out.println("enter how many studnets ");
   int n=sc.nextInt();
   Hashtable<String,String> hs=new Hashtable<>();
  
   sc.nextLine();
   for(int i=0;i<n;i++)
   { 
   System.out.println("enter name for"+(i+1)+"students");
   String name=sc.nextLine();
    System.out.println("enter mobile number for"+(i+1)+"students");
   String mobile=sc.nextLine();
    hs.put(name,mobile);   
   }
   System.out.println("after adding=:"+hs);
 }
}
