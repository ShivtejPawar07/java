
import java.util.*;
class demo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("how many elemnrt");
        int n=sc.nextInt();

        int []arr=new int[10];

        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("array");

        for(int i=0;i<n;i++)
        {
            System.out.println(arr[i]+"");
        }
      
       
    
        int sum = 1; // 1 is a proper divisor of every number
        for (int i = 2; i <= n/ 2; i++)
         {
            if (n % i == 0) {
                sum += i;
            }
        }
        if(sum == n)
        {
            System.out.println("Perfect numbers in the array:");
        }
        else
        System.out.println(" not Perfect numbers in the array:");
    }
  }
    

