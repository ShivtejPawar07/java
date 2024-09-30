import java.util.*;
class demo{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter length");
        float l=sc.nextFloat();
        System.out.println("enter breadth");
        float b=sc.nextFloat();
       System.out.println("area of rectangle="+l*b);
       System.out.println("perimeter of rectangle="+(2*(l+b)));

    }
}