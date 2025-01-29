import java.util.*;

 class IteratorExample {
    public static void main(String[] args) {
        // Create a List of Strings
        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");

        // Get an iterator for the list
        Iterator<String> iterator = fruits.iterator();

        // Traverse the list using the iterator
        System.out.println("Fruits in the list:");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}

/* Output:
Fruits in the list:
Apple
Banana
Orange
*/
