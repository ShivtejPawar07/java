/*c) Write a menu driven program to perform the following operations
i. Calculate the volume of cylinder. (hint : Volume: π × r² × h)
ii. Find the factorial of given number.
iii. Check the number is Armstrong or not.
iv. Exit */

import java.util.Scanner;

class demo {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        int ch;
        do{
        
        System.out.println("1.volume of cylinder");
        System.out.println("2.factorial");
        System.out.println("3.Aramstrong");
        System.out.println("4Exit....");
        System.out.println("enter your choice");
        ch=sc.nextInt();
        switch (ch) {
            case 1:volumeofcylinder();              
                break;
            case 2:factorial();
                 break;
            case 3:Aramstrong();
                 break;
            case 4:System.out.println("exit....");
            System.exit(0);
            break;

        
        }

    }while(ch!=4);
    }
 static void volumeofcylinder()
    {     
         float pi=3.14f;
         Scanner sc=new Scanner(System.in);
         System.out.println("enter radius");
         float r=sc.nextFloat();
         System.out.println("enter height");
         float h=sc.nextFloat();
         System.out.println("volume of cylinder="+(pi*r*r*h));

    }
    static void factorial()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a num");
        int n=sc.nextInt();
        int fact=1;
        for(int i=1;i<=n;i++)
        {
            fact*=i;
        }
        System.out.println("factorial="+fact);

    }
    static void Aramstrong()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter no check");
        int onum=sc.nextInt();
        int temp=onum;
        int noofdigit=0;
        while(temp!=0)
        {
            temp /= 10;
            noofdigit++;
        }
        temp=onum;
        int sum=0;
        while (temp!=0) {
            int digit=temp%10;
            sum+=Math.pow(digit, noofdigit)  ;   
            temp/=10;       
        }
        if(onum==sum)
        {
            System.out.println(onum+"is armstrong");
        }
        else{
            System.out.println(onum+"is not armstrong");
        }
    }
 
    
}
