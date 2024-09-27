/*9.To Display transpose matrix of given matrix */
import java.util.*;
class demo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("how many no");
        int n=sc.nextInt();

        int [][]a=new int[10][10];
         System.out.println("element");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
       System.out.println("matrix=");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.err.print(a[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println(" transpose of matrix=");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.err.print(a[j][i]+" ");
            }
            System.out.println();
        }
        

    }
    
}
