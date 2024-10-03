 class employee {
    int eid;
    String ename;
    int salary;
    String edesg;
    employee(int eid,String ename,int salary,String edesg)
    {
        this.eid=eid;
        this.ename=ename;
        this.salary=salary;
        this.edesg=edesg;
        System.out.println("employee parameterised constructor");
    }

}
class manager extends employee{
 int bonus;
    manager(int eid,String ename,int salary,String edesg,int bonus)
    {
        super(eid, ename, salary, edesg);
       this.bonus=bonus; 
       System.out.println("manager parameterised constructor");     
    }

}
class demo
{
  public static void main(String args[])
  {
     manager shiv=new manager(1,"shiv", 100, "tfg",100);
  }
}
