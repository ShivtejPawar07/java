//5. Accept marks of 6 subject.Display total marks,percentage and Grade
import java.util.Scanner;
class demo{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("s1,s2,s3,s4,s5,s6");
        int s1=sc.nextInt();
        int s2=sc.nextInt();
        int s3=sc.nextInt();
        int s4=sc.nextInt();
        int s5=sc.nextInt();
        int s6=sc.nextInt();
        int percentage=(s1+s2+s3+s4+s5+s6)/6;
        System.out.println("total marks:"+(s1+s2+s3+s4+s5+s6));
        System.out.println("total percentage:"+(s1+s2+s3+s4+s5+s6)/6);
        if(percentage >80)
        {
            System.out.println("A grade ");
        }
        if(percentage >60)
        {
            System.out.println("B grade "); 
        }
        if(percentage >50)
        {
            System.out.println("C grade "); 
        }
        else 
        {
            System.out.println("D grade ");   
       }
    }
}

    
