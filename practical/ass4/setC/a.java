import java.io.*;
import java.util.Random;
import java.util.Scanner;

class demo {

    public static void main(String[] args) {
        int[] numbers = new int[10];
        Random random = new Random();

        // Generating 10 random integers between 1 and 100
        for (int i = 0; i < 10; i++) {
            numbers[i] = random.nextInt(100) + 1;
        }

        // Writing numbers to file
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("number.txt"))) {
            for (int num : numbers) {
                bw.write(num + "\n");
            }
            System.out.println("Numbers written to file successfully.");
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }

        // Menu-driven program
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Display all numbers");
            System.out.println("2. Perform sum of numbers");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    displayNumbersFromFile();
                    break;
                case 2:
                    sumNumbersFromFile();
                    break;
                case 3:
                    System.out.println("Exiting...");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    // Method to display numbers from the file
    public static void displayNumbersFromFile() {
        try (BufferedReader br = new BufferedReader(new FileReader("number.txt"))) {
            String line;
            System.out.println("Numbers in the file:");
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Error reading from file: " + e.getMessage());
        }
    }

    // Method to sum numbers from the file
    public static void sumNumbersFromFile() {
        try (BufferedReader br = new BufferedReader(new FileReader("number.txt"))) {
            String line;
            int sum = 0;
            while ((line = br.readLine()) != null) {
                sum += Integer.parseInt(line);
            }
            System.out.println("Sum of numbers: " + sum);
        } catch (IOException e) {
            System.out.println("Error reading from file: " + e.getMessage());
 }
}
}