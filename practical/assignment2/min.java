/*2 To accept n numbers ,store into array and display minimum number.*/
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
        System.out.println(arr[i]+"");
     }
     int min=arr[0];
     for(int i=0;i<n;i++)
     {
     if(min>arr[i])
     {
        min=arr[i];
     }
     }
     System.out.println("minimum="+min);

    }
}