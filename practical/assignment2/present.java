/*5 To accept n numbers ,store into array and accept a number .check the given number is present in
array or not. */
import java.util.Scanner;

class demo
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter how many no:");
        int n=sc.nextInt();
        int[] arr=new int[10];
        System.out.println("enter eleents in arrya:");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("array:");
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println("\nenter no to check ");
        int n1=sc.nextInt();
        
        for(int i=0;i<n;i++)
        {  
            if(arr[i]==n1) 
            {
                System.out.println(n1+" is present at index "+i);
    
            }
            else
            System.out.println("not present");
        
        }
    }
}
