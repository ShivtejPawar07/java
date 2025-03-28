import java.util.*;
import java.io.*;

class Demo {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            ArrayList<String> al = new ArrayList<>();

            // Read from file
            File file = new File(args[0]);
            BufferedReader br = new BufferedReader(new FileReader(file));
           String line;
            while ((line = br.readLine()) != null) {
                al.add(line);
            }
           br.close();

            int choice;
            do {
                System.out.println("\nList: " + al);
                System.out.println("1. Insert line");
                System.out.println("2. Delete line");
                System.out.println("3. Exit");
                System.out.print("Enter your choice: ");
                choice = sc.nextInt();
                sc.nextLine(); // consume newline

                switch (choice) {
                    case 1:
                        System.out.print("Enter line to insert: ");
                        String newline = sc.nextLine();
                        al.add(newline);
                        break;

                    case 2:
                        System.out.print("Enter line number to delete (starting from 0): ");
                        int index = sc.nextInt();
                        if (index >= 0 && index < al.size()) {
                            al.remove(index);
                        } else {
                            System.out.println("Invalid index!");
                        }
                        break;

                    case 3:
                        // Save back to file
                        BufferedWriter bw = new BufferedWriter(new FileWriter(file));
                        for (String s : al) {
                            bw.write(s);
                            bw.newLine();
                        }
                        bw.close();
                        System.out.println("File updated. Exiting...");
                        break;

                    default:
                        System.out.println("Invalid choice.");
                }
            } while (choice != 3);

        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }
}

