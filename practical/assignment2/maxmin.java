/*11 Accept a matrix and display maximum and minimum number from matrix. */

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
       int max=a[0][0],min=a[0][0];
       
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(max<a[i][j])
                {
                max=a[i][j];
                }
                else if(min>a[i][j]) {
                  min=a[i][j];  
                }
               
              
            }
          
        }
    System.out.println("maximum= "+max);
    System.out.println("minimum= "+min);
    }
}
