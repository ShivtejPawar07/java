import java.util.*;
class demo{
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("enter num");
        int n=obj.nextInt();

        for(int i=1;i<=10;i++)
        {
            for(int j=1;j<=n;j++)
            {
                 System.out.print(i+"*"+j+"="+i*j+"  ");
            }
            System.out.println();
        }
     
    }
}