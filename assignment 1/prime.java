//17.Check given number is prime or not.

import java.util.Scanner;

class demo
{
    public static void main(String[] args)
     {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter no to check:");
        int num=sc.nextInt();
        boolean flag=false;

        for(int i=2;i<=num/2;i++)
        {
            if(num %i==0)
            {
                flag=true;
                break;
            }
        }

        if(flag==true)
        {
            System.out.println(num +" no is not  prime ");
        }
        else
        {
            System.out.println(num +"no is prime ");
        }

    }
}