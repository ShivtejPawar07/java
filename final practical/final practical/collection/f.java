import java.util.*;
class Demo{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    LinkedList ts=new LinkedList();
    System.out.println("how manyno");
    int n=sc.nextInt();
    sc.nextLine();
    
    for(int i=0;i<n;i++){
        System.out.println("no");
            int no=sc.nextInt();
            ts.add(no);
    }
    System.out.println(ts);
    ts.addFirst(10);
     System.out.println(ts);
     ts.removeLast();
   System.out.println(ts);
  }
}
