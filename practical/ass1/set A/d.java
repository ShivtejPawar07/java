/*d) Write a program to accept the array element and display in reverse order.*/

import java.util.Scanner;

class demo{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("how many element");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("enter a array element");
        for(int i=0;i<n;i++)
        {
              a[i]=sc.nextInt();
        }
        System.out.println("array=");
        for(int i=0;i<n;i++)
        {
            System.out.print(a[i]+" ");
        }
        System.out.println("reverse=");
        for(int i=n-1;i>=0;i--)
        {
            System.out.print(a[i]+" ");
        }
    }
}
