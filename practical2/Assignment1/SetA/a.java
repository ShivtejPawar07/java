import java.util.*;
class Demo{
  static public void main(String[] args)
  {
     Scanner sc=new Scanner(System.in);
     
     ArrayList<String> al=new ArrayList<>();
     System.out.println("how many num");
     int n=sc.nextInt();
     sc.nextLine();
     for(int i=0;i<n;i++)
     {
      System.out.println("enter the city name");
      String name=sc.nextLine();
      al.add(name);

     }
     System.out.println("city name");
     System.out.println(al);
     System.out.println("remove city name");
     System.out.println(al.removeAll(al));
     System.out.println(al);
     sc.close();
  }
  
}



