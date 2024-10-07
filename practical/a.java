import java.util.Scanner;

class emp{
    int id;
    String name;
   String dname;
    float salary;
    emp(){

    }
    emp(int id,String name, String dname,float salary)
    {
        this.id=id;
        this.name=name;
        this.dname=dname;
        this.salary=salary;
    }
    void display()
    {
        System.out.println(id+"\t"+name+"\t"+dname+"\t"+salary);
    }
}
class demo{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("how many student");
        int n=sc.nextInt();
        emp []e=new emp[n];
        for(int i=0;i<n;i++)
        {
            System.out.println("enter id"+(i+1)+"name dname salary");
            int id=sc.nextInt();
            sc.nextLine();
            String name=sc.nextLine();
            String dname=sc.nextLine();
           float salary=sc.nextFloat(); 
           e[i]=new emp(id, name, dname, salary);
        }   
        System.out.println("***info***");
        System.out.println("id\tname\tdname\tsalry");
        for(int i=0;i<n;i++)
        {
            e[i].display();
        }
        System.out.println("***info***");
        System.out.println("id\tname\tdname\tsalry");
        emp max=e[0];
        for(int i=0;i<e.length;i++)
        {
           if(max.salary<e[i].salary)
           {
              max=e[i];
           }
        }
        System.out.println("Employee with maximum salary:");
        System.out.println("ID\tName\tDName\tSalary");
         max.display();
  
    }
}
