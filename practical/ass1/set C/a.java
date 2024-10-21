/*a) Write a program to accept n names of country and display them in descending
order. */
import java.util.*;
class demo {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("how many names");
    int n=sc.nextInt();
    String []s=new String[n];
    sc.nextLine();
    for(int i=0;i<n;i++)
    {
        s[i]=sc.nextLine();
    }
    System.out.println("student names");
    for(int i=0;i<n;i++)
    {
        System.out.println(s[i]+" ");
    }
    for(int i=0;i<n;i++)
    {
        for(int j=i+1;j<n;j++)
        {
            if(s[i].compareTo(s[j])>0)
            {
            String temp=s[i];
            s[i]=s[j];
            s[j]=temp;
            }
        }
    }
    System.out.println("asending order");
    for(int i=0;i<n;i++)
    {
        System.out.println(s[i]+"");
    }
  }    
}
