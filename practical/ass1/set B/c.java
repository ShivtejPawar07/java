import java.util.*;
class demo{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("how many num");
        int n=sc.nextInt();
        int [][]a=new int[10][10];
        int [][]b=new int[10][10];
        int [][]c=new int[10][10];
         System.out.println("enter element 1st matrix");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println("enter elemen 2nd matrix");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                b[i][j]=sc.nextInt();
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

        System.out.println("2nd matrix");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
               System.out.print(b[i][j]+" ");
             }
             System.out.println();
        }



        int choice;
        do {
          System.out.println("***menu***");
          System.out.println("1 addition"); 
          System.out.println("2 multiplication"); 
          System.out.println("3 transpose"); 
          System.out.println("4 exit");         

          System.out.println("enter your choice"); 
          choice=sc.nextInt();
          switch (choice) 
          {
                 case 1:
                 System.out.println("addition");
                 for(int i=0;i<n;i++)
                 {
                     for(int j=0;j<n;j++)
                     {
                        System.out.print(a[i][j]+b[i][j]+" ");
                      }
                      System.out.println();
                 }              
                break;

                case 2:
                System.out.println("multiplication");
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
                break;  

                case 3:
                System.out.println("transpose matrix");
                for(int i=0;i<n;i++)
                {
                    for(int j=0;j<n;j++)
                    {
                       System.out.print(a[j][i]+" ");
                     }
                     System.out.println();
                 }
                
                break;               
          }            
        } while (choice!=4);
    }
  
    
}
