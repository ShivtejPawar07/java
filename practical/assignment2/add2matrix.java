/*8 To display addition of two matrices . */
//10 To display multiplication of two matrices .
import java.util.*;
class demo{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("how many number");
        int n=sc.nextInt();
        int a[][]=new int [10][10];
        int b[][]=new int [10][10];
        int c[][]=new int [10][10];
        System.out.println("1st matrix elemnt=");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
    System.out.println("1st matrix");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
               System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
System.out.println("2nd matrix elemnt=");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                b[i][j]=sc.nextInt();
            }
        }
    System.out.println("2nd matrix");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
               System.out.print(b[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println("addition=");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
               System.out.print(b[i][j]+a[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println("multiplication=");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            { 
              c[i][j]=0;
                for(int k=0;k<n;k++)
                {
                    c[i][j]+=a[i][k]*b[k][j];
                }
            }
         
        }

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
               System.out.print(c[i][j]+" ");
            }
            System.out.println();
        }
        
    }
}
