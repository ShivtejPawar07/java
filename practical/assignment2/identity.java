/*12 Accept n and display nXn identity matrix. */
import java.util.*;
class demo{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("how many number");
        int n=sc.nextInt();
        int a[][]=new int [10][10];
        System.out.println("matrix");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(i==j)
                {
                    System.out.print(1+" ");
                }
                else{
                    System.out.print(0+" ");
                }
             
            }
            System.out.println();
        }
    }
}
