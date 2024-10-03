import java.util.*;
class demo{
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter a row");
    int r=sc.nextInt();
    System.out.println("enter a column");
    int c=sc.nextInt();

    int [][]a=new int[r][c];
    int [][]b=new int[r][c];
    int [][]s=new int[r][c];
    System.out.println("enter a elemnt");
    for(int i=0;i<r;i++)
    {
      for(int j=0;j<c;j++)
      {
        a[i][j]=sc.nextInt();
      }
    }
    System.out.println("enter a elemnt");
    for(int i=0;i<r;i++)
    {
      for(int j=0;j<c;j++)
      {
        b[i][j]=sc.nextInt();
      }
    }
    System.out.println("matrix 1st");
    for(int i=0;i<r;i++)
    {
      for(int j=0;j<c;j++)
      {
      System.out.print(a[i][j]+" ");
      }
      System.out.println();
    }
    System.out.println("matrix 2st");
    for(int i=0;i<r;i++)
    {
      for(int j=0;j<c;j++)
      {
      System.out.print(b[i][j]+" ");
      }
      System.out.println();
    }
     int ch;
    do{
      System.out.println("1.Addition");
      System.out.println("2.multiplication");
      System.out.println("3.transpose");
      System.out.println("4.Exit");
       ch=sc.nextInt();
      switch (ch) {
        case 1:
        System.out.println("addition");
        for(int i=0;i<r;i++)
        {
          for(int j=0;j<c;j++)
          {
          System.out.print(a[i][j]+b[i][j]+" ");
          }
          System.out.println();
        }
          break;
        case 2:
        System.out.println("multiplication");
        for(int i=0;i<r;i++)
        {
          for(int j=0;j<c;j++)
          {
            s[i][j]=0;
            for(int k=0;k<r;k++)
            {
          s[i][i]+=a[i][k]*b[k][j];
            }
          }
        }
        
        for(int i=0;i<r;i++)
        {
          for(int j=0;j<c;j++)
          {
          System.out.print(s[i][j]+" ");
          }
          System.out.println();
        }
        break;
        case 3:
        System.out.println("transpose of 1st matrix");
        for(int i=0;i<r;i++)
        {
          for(int j=0;j<c;j++)
          {
          System.out.print(a[j][i]+" ");
          }
          System.out.println();
        }
        break;
      
      
      }

    }while(ch!=4);
  }
}
