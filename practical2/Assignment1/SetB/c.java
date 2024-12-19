
import java.io.*;
import java.util.*;
 class Demo{
    public static void main(String[] args) {
        // HashMap to store data
        HashMap<String, String> phoneBook = new HashMap<>();

        // Load data from file
        try (BufferedReader br = new BufferedReader(new FileReader("a.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split("\t");
                phoneBook.put(data[0], data[1]); // Name -> Phone
                phoneBook.put(data[1], data[0]); // Phone -> Name
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
            return;
        }

        // Search for name or phone
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a name or phone number: ");
        String input = scanner.nextLine();

        // Output result
        System.out.println(phoneBook.getOrDefault(input, "No match found."));
        scanner.close();
    }
}
