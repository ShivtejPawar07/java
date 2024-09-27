/*Write a java program that take input as a person name in the format of first, middle
and last name and then print it in the form last, first and middle name, where in the
middle name first character is capital letter. */
import java.util.Scanner;
class Demo
{     //  shivtej dipak pawar
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
          System.out.println("enter full name:first middle last");
          String name=sc.nextLine();

       String  last=name.substring(name.lastIndexOf(" ",name.length()),name.length());
       String first=name.substring(0,name.indexOf(" "));
       String middle=name.substring(name.indexOf(" ")+1,name.lastIndexOf(" ",name.length()));
       middle = middle.substring(0, 1).toUpperCase() + middle.substring(1);
          
       System.out.println(last+" "+first+" "+middle+" ");
}
}