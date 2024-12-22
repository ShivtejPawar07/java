import java.util.*;
class Demo{
  static public void main(String[] args)
  {
    Scanner sc=new Scanner(System.in);
    LinkedList<String> list=new LinkedList<>();
    System.out.println("how many friend");
    int n=sc.nextInt();
    sc.nextLine();
    for(int i=0;i<n;i++)
    {
        System.out.println("enter friend name");
        String name=sc.nextLine();
        list.add(name);
    }
    System.out.println("friend names"+list);
    

  }

}

/* 
import java.util.LinkedList;
import java.util.Scanner;

 class Demo {
    public static void main(String[] args) {
        // Scanner object for user input
        Scanner scanner = new Scanner(System.in);
        
        // LinkedList to store the names of friends
        LinkedList<String> friendsList = new LinkedList<>();
        
        // Ask user for the number of friends
        System.out.print("Enter the number of friends: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        // Input names of friends
        System.out.println("Enter the names of your " + n + " friends:");
        for (int i = 0; i < n; i++) {
            System.out.print("Friend " + (i + 1) + ": ");
            String name = scanner.nextLine();
            friendsList.add(name); // Add the name to LinkedList
        }

        // Display the contents of the LinkedList
        System.out.println("\nThe names of your friends are:");
        for (String friend : friendsList) {
            System.out.println(friend);
        }

        // Closing scanner to prevent resource leak
        scanner.close();
    }
}
*/
