import java.util.*;
class Demo{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    TreeSet ts=new TreeSet<>();
    System.out.println("how many color");
    int n=sc.nextInt();
    sc.nextLine();
    for(int i=0;i<n;i++){
        System.out.println("color");
            String name=sc.nextLine();
            ts.add(name);
    }
    System.out.println(ts);
    
    
  
  }
}
