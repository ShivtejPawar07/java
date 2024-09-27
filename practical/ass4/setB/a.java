import java.io.*;
import java.util.Scanner;

class Book {
    int bookId;
    String bookName;
    double bookPrice;
    int bookQty;

    public Book(int bookId, String bookName, double bookPrice, int bookQty) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.bookPrice = bookPrice;
        this.bookQty = bookQty;
    }

    @Override
    public String toString() {
        return "Book ID: " + bookId + ", Name: " + bookName + ", Price: " + bookPrice + ", Quantity: " + bookQty;
    }
}
class a {
    private static final String FILE_NAME = "book.dat";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Search for a specific book by name");
            System.out.println("2. Display all books and total cost");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter book name to search: ");
                    String name = scanner.nextLine();
                    searchBookByName(name);
                    break;
                case 2:
                    displayAllBooksAndTotalCost();
                    break;
                case 3:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void searchBookByName(String name) {
        try (RandomAccessFile file = new RandomAccessFile(FILE_NAME, "r")) {
            boolean found = false;
            while (file.getFilePointer() < file.length()) {
                Book book = readBook(file);
                if (book.bookName.equalsIgnoreCase(name)) {
                    System.out.println(book);
                    found = true;
                    break;
                }
            }
            if (!found) {
                System.out.println("Book not found.");
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }

    private static void displayAllBooksAndTotalCost() {
        try (RandomAccessFile file = new RandomAccessFile(FILE_NAME, "r")) {
            double totalCost = 0;
            while (file.getFilePointer() < file.length()) {
                Book book = readBook(file);
                System.out.println(book);
                totalCost += book.bookPrice * book.bookQty;
            }
            System.out.println("Total cost of all books: " + totalCost);
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }

    private static Book readBook(RandomAccessFile file) throws IOException {
        int bookId = file.readInt();
        String bookName = file.readUTF();
        double bookPrice = file.readDouble();
        int bookQty = file.readInt();
        return new Book(bookId, bookName, bookPrice, bookQty);
    }
}
