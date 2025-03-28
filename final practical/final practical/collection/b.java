import java.util.*;
class Demo{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    LinkedList al=new LinkedList();
    System.out.println("how many city");
    int n=sc.nextInt();
    sc.nextLine();
    for(int i=0;i<n;i++){
        System.out.println(" city");
            String name=sc.nextLine();
            al.add(name);
    }
    System.out.println(al);
    al.removeAll(al);
    System.out.println("all elemnt deleted");
    
  
  }
}
