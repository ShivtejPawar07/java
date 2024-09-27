//1. accept n numbers ,store into array and display maximum number.

import java.util.Scanner;
class demo
{
    public static void main(String[] args) {
      
      Scanner sc=new Scanner(System.in);
      System.out.println("how many no");
      int n=sc.nextInt();
      
        int []arr=new int [10];

        for(int i=0;i<n;i++)
        {
           arr[i]=sc.nextInt();
        }
        System.out.println("array");
        for(int i=0;i<n;i++)
        {
           System.out.println(arr[i]+" ");
        }
        int max=arr[0];
    
        for(int i=0;i<n;i++)
        {
           if(max<arr[i])
           {
              max=arr[i];
           }
        }
        System.out.println("maximum element"+max);
    }
 


}

