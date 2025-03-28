import java.util.*;

class Demo {
    public static void main(String[] args)throws InputMismatchException
 {
        Scanner sc = new Scanner(System.in);

        // Create a LinkedList to store subject names
        LinkedList ll= new LinkedList();

        // Accept number of subjects
        System.out.print("Enter the number of subjects: ");
        int n = sc.nextInt();
        sc.nextLine(); // Consume newline

        // Accept subject names from the user
        System.out.println("Enter " + n + " subject names:");
        for (int i = 0; i < n; i++) {
            ll.add(sc.nextLine());
        }

        // Display subjects using Iterator
        System.out.println("\nSubjects List:");
        Iterator it = ll.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        sc.close(); // Close the scanner
    }
}

