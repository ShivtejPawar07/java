import java.util.*;
class demo{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("how many  a num");
        int n=sc.nextInt();
        int [][]a=new int [10][10];

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println("matrix");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        int choice;

        do {
          System.out.println("menu");
          System.out.println("1 sum of diagonal"); 
          System.out.println("2 sum of upper diagonal "); 
          System.out.println("3 sum of lower diagonal"); 
          System.out.println("4 exit");         

          System.out.println("enter your choice"); 
          choice=sc.nextInt();
          int sum=0;  
          switch (choice) {
                 case 1:
              
                   for(int i=0;i<n;i++)
                     {  
                         sum += a[i][i];      
                     }
                      System.out.println("sum of diagonal="+sum);  
                break;

             case 2 :
               
                for(int i=0;i<n;i++)
                 {  
                    for(int j=i;j<n;j++)
                    {
                    sum += a[i][j]; 
                   }     
                 }
               System.out.println("sum of diagonal="+sum);          
             break;  

                case 3:  
                for(int i=0;i<n;i++)
                 {  
                    for(int j=0;j<=i;j++)
                    {
                    sum += a[i][j]; 
                   }     
                 }
               System.out.println("sum of diagonal="+sum); 

                 break;               
          }            
        } while (choice!=4);   
}
}

 
