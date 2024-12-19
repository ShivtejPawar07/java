import java.util.LinkedList;
import java.util.Scanner;

class Demo {
    public static void main(String[] args) {
        // Create LinkedList
        LinkedList<Integer> list = new LinkedList<>();
        
        // Scanner for user input
        Scanner scanner = new Scanner(System.in);
        
        int choice;
        
        do {
            // Displaying menu for user choice
            System.out.println("\nMenu:");
            System.out.println("1. Add element at first position");
            System.out.println("2. Add element at last position");
            System.out.println("3. Remove last element");
            System.out.println("4. Display size of LinkedList");
            System.out.println("5. Exit");
            
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            
            switch (choice) {
                case 1:
                    // Add element at the first position
                    System.out.print("Enter element to add at first: ");
                    int firstElement = scanner.nextInt();
                    list.addFirst(firstElement);
                    System.out.println("After adding at first: " + list);
                    break;

                case 2:
                    // Add element at the last position
                    System.out.print("Enter element to add at last: ");
                    int lastElement = scanner.nextInt();
                    list.add(lastElement);
                    System.out.println("After adding at last: " + list);
                    break;

                case 3:
                    // Remove last element
                    if (!list.isEmpty()) {
                        list.removeLast();
                        System.out.println("After removing last: " + list);
                    } else {
                        System.out.println("The list is empty, cannot remove last element.");
                    }
                    break;

                case 4:
                    // Display size of the LinkedList
                    System.out.println("Size: " + list.size());
                    break;

                case 5:
                    // Exit the program
                    System.out.println("Exiting program.");
                    break;

                default:
                    // Invalid option
                    System.out.println("Invalid choice, please try again.");
                    break;
            }
        } while (choice != 5);
        
        scanner.close();
    }
}
