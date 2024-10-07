import java.util.Scanner;

class Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Prompt the user to enter the full name
        System.out.println("Enter full name (first middle last):");
        String name = sc.nextLine();
        
        // Find the positions of the spaces between first, middle, and last names
        int firstSpace = name.indexOf(" ");
        int lastSpace = name.lastIndexOf(" ");
        
        // Extract the first, middle, and last names
        String first = name.substring(0, firstSpace);  // First name from the start to the first space
        String middle = name.substring(firstSpace + 1, lastSpace);  // Middle name between spaces
        String last = name.substring(lastSpace + 1);  // Last name from the last space to the end
        
        // Capitalize the first letter of the middle name
        middle = middle.substring(0, 1).toUpperCase() + middle.substring(1).toLowerCase();
        
        // Print the name in the format: last, first, middle
        System.out.println(last +" " +first + " " + middle);
    }
}
