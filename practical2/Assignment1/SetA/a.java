import java.util.ArrayList;
import java.util.Scanner;

 class Demo {
    public static void main(String[] args) {
        // Scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // ArrayList to store city names
        ArrayList<String> cityList = new ArrayList<>();

        // Ask the user for the number of cities
        System.out.print("Enter the number of cities: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        // Accept city names from the user
        System.out.println("Enter the names cities:");
        for (int i = 0; i < n; i++) {
            System.out.print("City " + (i + 1) + ": ");
            String city = scanner.nextLine();
            cityList.add(city);
        }

        // Display the contents of the ArrayList
        System.out.println("\nThe cities in the list are:");
        for (String city : cityList) {
            System.out.println(city);
        }

        // Remove all elements from the ArrayList
        cityList.clear();
        System.out.println("\nAll cities have been removed.");

        // Display the ArrayList after removal (it should be empty)
        System.out.println("Current contents of the list: " + cityList);

        // Close the Scanner
        scanner.close();
    }
}
