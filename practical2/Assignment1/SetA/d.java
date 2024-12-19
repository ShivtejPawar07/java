import java.util.Hashtable;
import java.util.Scanner;
import java.util.Set;

class Demo {
    public static void main(String[] args) {
        // Create a Hashtable to store student names and mobile numbers
        Hashtable<String, String> contacts = new Hashtable<>();

        // Scanner to accept user input
        Scanner scanner = new Scanner(System.in);

        // Input the number of contacts
        System.out.print("Enter the number of contacts: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        // Input contact details
        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for contact " + (i + 1) + ":");
            System.out.print("Enter Student Name: ");
            String name = scanner.nextLine();

            System.out.print("Enter Mobile Number: ");
            String mobile = scanner.nextLine();

            // Add to the Hashtable
            contacts.put(name, mobile);
        }

        // Display the contact list
        System.out.println("\nContact List:");
        Set<String> keys = contacts.keySet();
        for (String key : keys) {
            System.out.println("Name: " + key + ", Mobile: " + contacts.get(key));
        }

        // Close the Scanner
        scanner.close();
    }
}

