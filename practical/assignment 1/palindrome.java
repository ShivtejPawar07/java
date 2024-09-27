//14.Check given number is palindrome or not. 121 palindrom 113 not 

import java.util.Scanner;

class demo{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter no to check:");
       int  originalNum=sc.nextInt();
       int num=originalNum;
        int reversedNum = 0;

        for(;num!=0;num /= 10)
         {
            int remainder = num % 10;
            reversedNum=reversedNum*10+remainder;

        }

        if (originalNum == reversedNum) 
        {
            System.out.println(originalNum + " is a Palindrome.");
        } else 
        {
            System.out.println(originalNum + " is not a Palindrome.");
        }
    }
}
