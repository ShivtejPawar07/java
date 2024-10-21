 /*Write a program to using marker interface create a class product(product_id,
product_name, product_cost, product_quantity) define a default and parameterized
constructor. Create objects of class product and display the contents of each object
and Also display the object count */
 
 // Define the marker interface
interface ProductInterface {
    // Marker interface contains no methods
}

// Define the Product class which implements the marker interface
class Product implements ProductInterface {
    private int product_id;
    private String product_name;
    private double product_cost;
    private int product_quantity;
    
    // Static variable to count the number of objects created
    private static int objectCount = 0;

    // Default constructor
    public Product() {
        this.product_id = 0;
        this.product_name = "Unknown";
        this.product_cost = 0.0;
        this.product_quantity = 0;
        objectCount++; // Increment object count
    }

    // Parameterized constructor
    public Product(int product_id, String product_name, double product_cost, int product_quantity) {
        this.product_id = product_id;
        this.product_name = product_name;
        this.product_cost = product_cost;
        this.product_quantity = product_quantity;
        objectCount++; // Increment object count
    }

    // Method to display product details
    public void display() {
        System.out.println("Product ID: " + product_id);
        System.out.println("Product Name: " + product_name);
        System.out.println("Product Cost: $" + product_cost);
        System.out.println("Product Quantity: " + product_quantity);
        System.out.println();
    }

    // Static method to display the total object count
    public static void displayObjectCount() {
        System.out.println("Total Product Objects Created: " + objectCount);
    }
}

// Define the main class to test the Product class and marker interface
 class demo {
    public static void main(String[] args) {
        // Create objects using the parameterized constructor
        Product p1 = new Product(101, "Laptop", 1500.50, 10);
        Product p2 = new Product(102, "Smartphone", 800.99, 20);
        Product p3 = new Product(103, "Tablet", 450.75, 15);

        // Create an object using the default constructor
        Product p4 = new Product();

        // Display the details of each product
        System.out.println("Displaying Product Details:\n");
        p1.display();
        p2.display();
        p3.display();
        p4.display();

        // Display the total count of product objects created
        Product.displayObjectCount();
    }
}

