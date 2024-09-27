/*  Write a program for multilevel inheritance such that country is inherited from
continent. State is inherited from country. Display the place, state, country and
continent.*/
class continent{
String cname;
continent(String cname)
{
  this.cname=cname;
}
void show()
{
    System.out.println("continent name=>"+cname);
}

 }
 class country extends continent
 {
    String name;
    country(String name,String cname)
    {
       super(cname);
        this.name=name;  
    }
    void show()
{
     System.out.println("continent name=>"+cname); 
     System.out.println("continent name=>"+name);
}
     
}
class state extends country{
  String sname;
  String pname;
  state(String sname,String pname,String name,String cname)
  {
     super(name,cname);
      this.sname=sname;
      this.pname=pname;    
  }
  void show()
  {
      super.show();
      System.out.println("continent name=>"+sname); 
      System.out.println("continent name=>"+pname);

  }

}
class demo{

    public static void main(String[] args) {
        state c=new state("asia","india","maharastra","pune");
        c.show();
    }
}
