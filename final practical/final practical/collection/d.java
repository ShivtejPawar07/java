import java.util.*;
class Demo{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    HashMap<String,String> hm=new HashMap();
    System.out.println("how many color");
    int n=sc.nextInt();
    sc.nextLine();
    for(int i=0;i<n;i++){
        System.out.println("name");
            String name=sc.nextLine();
            System.out.println("no");
            String no=sc.nextLine();
            hm.put(name,no);
    }
    System.out.println(hm);
    
    
  
  }
}
