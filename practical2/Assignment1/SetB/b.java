import java.util.HashMap;
import java.util.TreeMap;

class Demo {
    public static void main(String[] args) {
        // Create and populate HashMap
        HashMap<Integer, String> map = new HashMap<>();
        map.put(5, "Alice");
        map.put(3, "Bob");
        map.put(8, "Charlie");
        map.put(1, "David");

        // Print original HashMap
        System.out.println("Before sorting: " + map);

        // Sort HashMap by keys
        TreeMap<Integer, String> sortedMap = new TreeMap<>(map);

        // Print sorted HashMap
        System.out.println("After sorting: " + sortedMap);
    }
}
