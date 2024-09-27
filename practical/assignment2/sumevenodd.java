/* 4 To accept n numbers ,store into array and display sum of all even numbers and sum of all odd
numbers. */
import java.util.*;
class demo{
    public static void main(String args[]){
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
     int evensum=0,oddsum=0;
    
     for(int i=0;i<n;i++)
     {
        if(arr[i]%2==0)
        {
          evensum+=arr[i];
        }
        else
        {
            oddsum+=arr[i];
        }
     }
     System.out.println("even sum= "+evensum);
     System.out.println("odd sum= "+oddsum);
    }
}