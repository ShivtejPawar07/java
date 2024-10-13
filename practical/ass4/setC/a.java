import java.io.*;
import java.util.*;


class demo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int []n=new int[10];
        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1.Genrate to 10 random number");
            System.out.println("2. Save num. to the file");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                generateno(n);
                    break;
                case 2:
                savenumbersfromfile(n);
                    break;
                case 3:
                    System.out.println("Exiting...");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
    public static void generateno(int n[]){    
            Random r = new Random();
            for (int i = 0; i < 10; i++) {
                n[i] =10+ r.nextInt(90) ;
                System.out.println(n[i]+" ");
            }
            System.out.println();
    
}

   
    public static void savenumbersfromfile(int []n) {
        try (FileWriter fw = new FileWriter("number.txt")){
           for(int num:n)
           {
              fw.write(num+"\n") ;  
           }
       
            System.out.println("Numbers in the file:");
            
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
   