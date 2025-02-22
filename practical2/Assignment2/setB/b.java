import java.io.*;
import java.util.Scanner;
 class Demo
  {
    public static void searchInFile(File file, String searchString) {
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            int lineNumber = 1;
            boolean found = false;

            while ((line = reader.readLine()) != null) {
                if (line.contains(searchString)) {
                    System.out.println("Found in " + file.getName() + " at line " + lineNumber + ": " + line);
                    found = true;
                }
                lineNumber++;
            }

            if (!found) {
                System.out.println("Not found in " + file.getName());
            }

        } catch (IOException e) {
            System.out.println("Error reading file: " + file.getName());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the search string from the user
        System.out.print("Enter the string to search: ");
        String searchString = scanner.nextLine();

        File folder = new File("."); // Current directory
        File[] files = folder.listFiles((dir, name) -> name.endsWith(".txt")); // Filter only .txt files

        if (files != null && files.length > 0) {
            for (File file : files) {
                searchInFile(file, searchString);
            }
        } else {
            System.out.println("No text files found in the current folder.");
        }

        scanner.close();
}
}
