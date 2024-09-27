/*3 To accept n numbers ,store into array and display array numbers in ascending order. */
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
        int temp;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(arr[i]<arr[j])
                {
                   temp=arr[i];
                   arr[i]=arr[j];
                   arr[j]=temp;
                }
                    
            }
        
        }
        System.out.println("asending oreder= ");
        for(int i=0;i<n;i++)
        {
            System.out.println(arr[i]);
        }

    }
    
}
