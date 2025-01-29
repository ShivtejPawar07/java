import java.util.*; // Import required package

class EnumerationExample {
    public static void main(String[] args) {
        // Create a Vector and add elements
        Vector<String> v = new Vector<>();
        v.add("Apple");
        v.add("Banana");
        v.add("Cherry");
        v.add("Mango");

        // Obtain an Enumeration for the Vector
        Enumeration<String> e = v.elements();

        // Traverse the elements using Enumeration
        System.out.println("Fruits in the vector:");
        while (e.hasMoreElements()) { // Check if more elements exist
            String fruit = e.nextElement(); // Get the next element
            System.out.println(fruit);
        }
    }
}
/* Output:
Fruits in the vector:
Apple
Banana
Cherry
Mango
*/
