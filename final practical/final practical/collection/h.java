import java.util.*;

class Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Create a LinkedList to store integers
        LinkedList<Integer> list = new LinkedList<>();

        // Accept number of elements
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        // Accept elements from the user
        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }

        // Display only positive numbers
        System.out.print("Positive Numbers: ");
        for (int num : list) {
            if (num > 0) {
                System.out.print(num + " ");
            }
        }

        sc.close(); // Close the scanner
    }
}

