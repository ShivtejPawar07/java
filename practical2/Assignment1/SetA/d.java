import java.util.Hashtable;
import java.util.Scanner;
import java.util.Set;

class Demo {
    public static void main(String[] args) {
        // Create a Hashtable to store student names and mobile numbers
        Hashtable<String, String> ht = new Hashtable<>();

        // Scanner to accept user input
        Scanner sc = new Scanner(System.in);

        // Input the number of contacts
        System.out.print("Enter the number of contacts: ");
        int n = sc.nextInt();
        sc.nextLine(); // Consume the newline character

        // Input contact details
        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for contact " + (i + 1) + ":");
            System.out.print("Enter Student Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Mobile Number: ");
            String mobile = sc.nextLine();

            // Add to the Hashtable
            ht.put(name, mobile);
        }

        // Display the contact list
        System.out.println("\nContact List:");
        Set<String> s = ht.keySet();
         for (String key : s) {
            System.out.println("Name: " + key + ", Mobile: " + ht.get(key));
        }

        // Close the Scanner
        sc.close();
    }
}

