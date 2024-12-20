import java.io.*;
import java.util.*;

class Demo {
    public static void main(String[] args) {
   

        File f =new File(args[0]);
        ArrayList<String> al = new ArrayList<>();

        // Load file content into a list
        try (BufferedReader br = new BufferedReader(new FileReader(f))) {
            String ch;
            while ((ch = br.readLine()) != null) {
                al.add(ch);
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
            return;
        }

        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Insert line");
            System.out.println("2. Delete line");
            System.out.println("3. Append line");
            System.out.println("4. Modify line");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();  // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter line to insert: ");
                    String line = sc.nextLine();
                   al.add(line);
                   System.out.print(al);
                   break;

                case 2:
                    System.out.print("Enter position to delete: ");
                    int pos = sc.nextInt();
                     al.remove(pos);
                    break;

                case 3:
                    System.out.print("Enter line to append: ");
                    String l = sc.nextLine();
                    al.add(l);
                    break;

                    case 4:
                    System.out.print("Enter position to modify: ");
                    int modifyPos = sc.nextInt();
                    sc.nextLine(); // consume newline
                    if (modifyPos >= 0 && modifyPos < al.size()) {
                        System.out.print("Enter new content: ");
                        String newContent = sc.nextLine();
                        al.set(modifyPos, newContent); // Update the content at the specified position
                    } else {
                        System.out.println("Invalid position.");
                    }
                    break;
                case 5:
                    try{
                        FileWriter fw=new FileWriter(f);
                        for(int i=0;i<al.size();i++)
                        {
                                fw.write((String)al.get(i));
                                fw.write("\n");
                        }
                       fw.close();
                    } catch (IOException e) {
                        System.out.println("Error saving file: " + e.getMessage());
                    }
                    System.out.println("Changes saved. Exiting program.");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice != 5);

        sc.close();
    }
}

