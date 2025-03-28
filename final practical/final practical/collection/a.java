import java.util.*;
class Demo{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    ArrayList al=new ArrayList();
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
