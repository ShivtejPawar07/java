import java.io.*;
import java.util.*;

class Demo {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: java SimpleFileEditor <filename>");
            return;
        }

        String filename = args[0];
        List<String> lines = new ArrayList<>();

        // Load file content into a list
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                lines.add(line);
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
            return;
        }

        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Insert line");
            System.out.println("2. Delete line");
            System.out.println("3. Append line");
            System.out.println("4. Modify line");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();  // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter line to insert: ");
                    String lineToInsert = scanner.nextLine();
                    System.out.print("Enter position: ");
                    int insertPos = scanner.nextInt();
                    scanner.nextLine(); // consume newline
                    if (insertPos >= 0 && insertPos <= lines.size()) {
                        lines.add(insertPos, lineToInsert);
                    } else {
                        System.out.println("Invalid position.");
                    }
                    break;

                case 2:
                    System.out.print("Enter position to delete: ");
                    int deletePos = scanner.nextInt();
                    scanner.nextLine(); // consume newline
                    if (deletePos >= 0 && deletePos < lines.size()) {
                        lines.remove(deletePos);
                    } else {
                        System.out.println("Invalid position.");
                    }
                    break;

                case 3:
                    System.out.print("Enter line to append: ");
                    String lineToAppend = scanner.nextLine();
                    lines.add(lineToAppend);
                    break;

                case 4:
                    System.out.print("Enter position to modify: ");
                    int modifyPos = scanner.nextInt();
                    scanner.nextLine(); // consume newline
                    if (modifyPos >= 0 && modifyPos < lines.size()) {
                        System.out.print("Enter new content: ");
                        String newContent = scanner.nextLine();
                        lines.set(modifyPos, newContent);
                    } else {
                        System.out.println("Invalid position.");
                    }
                    break;

                case 5:
                    try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
                        for (String line : lines) {
                            writer.write(line);
                            writer.newLine();
                        }
                    } catch (IOException e) {
                        System.out.println("Error saving file: " + e.getMessage());
                    }
                    System.out.println("Changes saved. Exiting program.");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice != 5);

        scanner.close();
    }
}

