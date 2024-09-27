/*12.Display sum of digits e.g. n=352 sum of digit i.e. 3+5+2 => 10 */

import java.util.Scanner;

class demo
{
    public static void main (String[] args)
    {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter no:");
        int n=sc.nextInt(),digit=0,sum=0;

        for(;n>0;n/=10)
        {
            digit=n%10;
            sum+=digit;
        }
        System.out.println("sum of digits:"+sum);
    }
}
