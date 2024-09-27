import java.util.Scanner;
class employee{
int id;
String name;
String dname;
float salary;
employee()
{
    id=0;
 name=null;
 dname=null;
  salary=0;
}
employee(int id,String name,String dname,float salary)
{
    this.id=id;
    this.name=name;
    this.dname=dname;
  this.salary=salary;
}
void dispaly()
{
    System.out.println(id+"\t"+name+"\t"+dname+"\t"+salary);
}
}
class demo{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("how many emp");
        int n=sc.nextInt();
        employee e[]=new employee[n];
        for(int i=0;i<n;i++)
        {
         System.out.println("enter employee id"+(i+1)+"name dname salary");
         int id=sc.nextInt();
         sc.nextLine();
         String name=sc.nextLine();
         String dname=sc.nextLine();
         float salary=sc.nextFloat();
         e[i]=new employee(id,name,dname,salary);
        }
        System.out.println("***emp info");
        System.out.println("id\tname\tdname\tsalary");
        for(int i=0;i<n;i++)
        {
            e[i].dispaly();
        }
          employee max=e[0];
        for(int i=0;i<n;i++)
        {
            if(max.salary<e[i].salary)
            {
                max=e[i];
            }
        }
        System.out.println("maximun salary");
        System.out.println("id\tname\tdname\tsalary");
        max.dispaly();;

    }
}
