import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Scanner;
import java.util.TreeSet;
class Demo{
public static void main(String[] args){
   Scanner sc=new Scanner(System.in);
    System.out.println("enter how many elements");
    int n=sc.nextInt();
 ArrayList<String> al=new ArrayList<>(n);
 System.out.println("enter "+n+"elements");
 sc.nextLine();
  for(int i=0;i<n;i++){
    al.add(sc.nextLine());
  }
  TreeSet <String> tr=new TreeSet<>(al);
  System.out.println(tr);
}
}