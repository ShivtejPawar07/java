 import java.util.*;
 class demo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter value");
        int n=sc.nextInt();

        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n;j++)
            {
                System.out.print(i);
            }
            System.out.println();
        }

        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=n;j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }

        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(i);
            }
            System.out.println();
        }

        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
       

      
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<=n;j++)
            {
              char Alphabet=(char)('A'+ i);
              System.out.print(Alphabet);
            }
            System.out.println();
        }

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<=i;j++)
            {
              char Alphabet=(char)('A'+ i);
              System.out.print(Alphabet);
            }
            System.out.println();
        }

        int cnt=0;
       for(int i=0;i<n;i++)
       {
          for(int j=0;j<=i;j++)
          {
            char Aphabet=(char)('A'+ cnt);
            System.out.print(Aphabet);
            cnt++;
          }
          System.out.println();
        }
    }
}
