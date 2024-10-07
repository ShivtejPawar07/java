/*b) Define Student class(roll_no, name, percentage) to create n objects of theStudent class. Accept detailsfrom the user for each object. Define a static
method “sortStudent” which sorts the array on the basis of percentage. */
import java.util.*;
class student {
   int rollno;
   String name;
   float per;
   void accept(int r,String na,float p)
   {
    rollno=r;
    name=na;
    per=p;
   }
   void dispaly()
   {
 System.out.println(rollno+"\t"+name+"\t"+per);
   }
   static void sortstudent(student s[])
    {
        for(int i=0;i<s.length;i++)
        {
            for(int j=i+1;j<s.length;j++)
            {
            if(s[i].per>s[j].per)
            {
               student temp=s[i];
               s[i]=s[j];
               s[j]=temp;
            }

            }
        }

    }
}
class demo
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("how many no");
        int n=sc.nextInt();
        student s[]=new student [n];
        for(int i=0;i<n;i++)
        { 
    System.out.println("enter student"+(i+1)+"rollno name per");
    int r=sc.nextInt();
    sc.nextLine();
    String na=sc.nextLine();
    float per=sc.nextFloat();
    s[i]=new student();
     s[i].accept(r, na, per);
    }
     System.out.println("***student info****");
    System.out.println("rollno \t name \t per");

    for(int i=0;i<n;i++)
    {
    s[i].dispaly();
     }

    student.sortstudent(s);
     System.out.println("***student info****");
     System.out.println("rollno \t name \t per");

    for(int i=0;i<n;i++)
    {
    s[i].dispaly();

    }
    }
    
}
