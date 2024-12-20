import java.util.LinkedList;
import java.util.Scanner;

class Demo {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>(); // Create a LinkedList to store integer objects
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            // Menu options
            System.out.println("\nMenu:");
            System.out.println("1. Add element at the first position");
            System.out.println("2. Delete the last element");
            System.out.println("3. Display the size of the LinkedList");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    // Add element at the first position
                    System.out.print("Enter an integer to add at the first position: ");
                    int element = scanner.nextInt();
                    list.addFirst(element); // Add the element to the beginning
                    System.out.println("Element added at the first position.");
                    break;

                case 2:
                    // Delete the last element
                   
                        int removedElement = list.removeLast(); // Remove the last element
                        System.out.println("Deleted last element: " + removedElement);
                   
                    break;

                case 3:
                    // Display the size of the LinkedList
                    System.out.println("Size of the LinkedList: " + list.size());
                    break;

                case 4:
                    // Exit the program
                    System.out.println("Exiting program.");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 4);

        scanner.close();
    }
}
