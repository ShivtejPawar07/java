import java.util.*;
class Staff{
  protected int id;
  protected String name;
  Staff(int id,String name){
   this.id=id;
   this.name=name;
  }
  void display(){
    System.out.println("id="+id);
    System.out.println("name="+name);
  }
}
class officestaff extends Staff{
  String dname;
  officestaff(int id,String name,String dname)
  {
    super(id,name);
    this.dname=dname;
  }
  void display()
  {
    super.display();
    System.out.println("department="+dname);
  }
}
class demo{
  public static void main(String[] args) {
  Scanner sc=new Scanner(System.in);
  System.out.println("how many member");
  int n=sc.nextInt();
  officestaff o[]=new officestaff[n];
  for(int i=0;i<n;i++)
  {
  System.out.println("enter id,name,dname");
  int id=sc.nextInt();
  sc.nextLine();
  String name=sc.nextLine();
  String dname=sc.nextLine();
  o[i]=new officestaff(id,name,dname);
  }
  System.out.println("info");
  // System.out.println("id\tname\tdname");
  for(int i=0;i<n;i++)
  {
    o[i].display();
  }



  //   officestaff obj=new  officestaff(1,"asd","sdds");
  //  obj.display();
  }

}