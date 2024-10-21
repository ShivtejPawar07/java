/*d) Write a program to find the cube of given number using function interfac */

import java.util.Scanner;
interface num
 {
    public void print(int x);
}

 class demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number to find its cube: ");
        int num = sc.nextInt();

        num p=n->System.out.println("cube="+n*n*n);
         p.print(num);
     

    
    }
}

