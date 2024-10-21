/*Define Student class(roll_no, name, percentage) to create n objects of the Student class. Accept detailsfrom the user for each object. Define a static
method “sortStudent” which sorts the array on the basis of percentage.
 */

import java.util.Scanner;

class student{
    int rno;
    String name;
    float per;
    student(int rno,String name,float per){
       this.rno=rno;
       this. name=name;
       this .per=per;
    }
    static void sort(student s[])
    {
        for(int i=0;i<s.length;i++)
         {
           for(int j=0;j<s.length;j++)
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
    void display(){
        System.out.println(rno+"\t"+name+"\t"+per);
    }
}
class demo{
    public static void main(String[] args) {  
 Scanner sc=new Scanner(System.in);
 System.out.println("how many student");
 int n=sc.nextInt();
 student []s=new student[n];
 for(int i=0;i<n;i++)
 {
    System.out.println("enter student rollno "+(i+1)+ " name per");
    int rno=sc.nextInt();
    sc.nextLine();
    String name=sc.nextLine();
    float per=sc.nextFloat();
    s[i]=new student(rno,name,per);
 }
 System.out.println("****student info****");
 System.out.println("rollno\t name\t per\t");
 for(int i=0;i<n;i++)
 {
    s[i].display();
 }
 student.sort(s);
 System.out.println("****student info****");
 System.out.println("rollno\t name\t per\t");
 for(int i=0;i<n;i++)
 {
    s[i].display();
 }
    }
}
