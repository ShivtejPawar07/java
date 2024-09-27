 import java.util.*;
 class student {
    int rollno;
    String name;
    float per;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("how many student");
        int n=sc.nextInt();
        student s[]=new student[n];
        for(int i=0;i<n;i++)
        {
            s[i]=new student();
        }
        for(int i=0;i<n;i++)
        {
           System.out.println("enter student "+(i+1)+ " rollno");
           int r=sc.nextInt();
          
          
           System.out.println("enter student "+(i+1)+ " name");
           sc.nextLine();
           String na=sc.nextLine();
           System.out.println("enter student "+(i+1)+ " per");
           float p=sc.nextFloat();
           s[i].rollno=r;
           s[i].name=na;
           s[i].per=p;
        }
        System.out.println("****student info****");
        System.out.println("rollno\t name\t per\t");
        for(int i=0;i<n;i++)
        {
           System.out.println(s[i].rollno+"\t"+s[i].name+"\t"+s[i].per);
        }

        System.out.println("sorted array");
        student.sortstudent(s);
        for(int i=0;i<n;i++)
        {
           System.out.println(s[i].rollno+"\t"+s[i].name+"\t"+s[i].per);
        }
        
    }  
    static  void sortstudent(student s[])
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
