import java.util.Scanner;
import java.util.TreeSet;
class demo
 {
    public static void main(String[] args) {
        // Create a TreeSet to store integers
        TreeSet<Integer> integers = new TreeSet<>();

        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Accept 'n' as the number of integers
        System.out.print("Enter the number of integers you want to input: ");
        int n = scanner.nextInt();

        // Accept 'n' integers from the user
        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            int input = scanner.nextInt();
            boolean added = integers.add(input);
            if (!added) {
                System.out.println("Duplicate element " + input + " is ignored.");
            }
        }

        // Display the integers in sorted order
        System.out.println("Sorted integers (duplicates removed): " + integers);

        // Close the scanner
        scanner.close();
    }
}
