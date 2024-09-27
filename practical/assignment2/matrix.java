/*6 Accept a matrix and display it. */
import java.util.*;
class demo{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("how many number");
        int n=sc.nextInt();
        int a[][]=new int [10][10];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
    System.out.println("array");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
               System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
}
