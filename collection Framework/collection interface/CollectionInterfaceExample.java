import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionInterfaceExample {
    public static void main(String[] args) {
        // Creating a collection
        Collection<String> collection = new ArrayList<>();

        // 1. boolean add(Object obj)
        collection.add("Apple");
        collection.add("Banana");
        System.out.println("After adding elements: " + collection);

        // 2. boolean addAll(Collection c)
        Collection<String> newCollection = new ArrayList<>();
        newCollection.add("Cherry");
        newCollection.add("Date");
        collection.addAll(newCollection);
        System.out.println("After adding all elements: " + collection);

        // 3. void clear()
        Collection<String> temp = new ArrayList<>(collection);
        temp.clear();
        System.out.println("After clearing elements: " + temp);

        // 4. boolean contains(Object obj)
        System.out.println("Contains 'Apple': " + collection.contains("Apple"));

        // 5. boolean containsAll(Collection c)
        System.out.println("Contains all newCollection: " + collection.containsAll(newCollection));

        // 6. boolean equals(Object obj)
        System.out.println("Equals newCollection: " + collection.equals(newCollection));

        // 7. int hashCode()
        System.out.println("HashCode of collection: " + collection.hashCode());

        // 8. boolean isEmpty()
        System.out.println("Is collection empty: " + collection.isEmpty());

        // 9. Iterator iterator()
        Iterator<String> iterator = collection.iterator();
        System.out.print("Iterating over collection: ");
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();

        // 10. boolean remove(Object obj)
        collection.remove("Banana");
        System.out.println("After removing 'Banana': " + collection);

        // 11. boolean removeAll(Collection c)
        collection.removeAll(newCollection);
        System.out.println("After removing all newCollection: " + collection);

        // 12. boolean retainAll(Collection c)
        collection.add("Elderberry");
        collection.add("Fig");
        collection.retainAll(newCollection);
        System.out.println("After retaining all newCollection: " + collection);

        // 13. int size()
        System.out.println("Size of collection: " + collection.size());

        // 14. Object[] toArray()
        Object[] array = collection.toArray();
        System.out.print("Collection as array: ");
        for (Object obj : array) {
            System.out.print(obj + " ");
        }
        System.out.println();

        // 15. Object[] toArray(Object[] array)
        String[] stringArray = collection.toArray(new String[0]);
        System.out.print("Collection as typed array: ");
        for (String str : stringArray) {
            System.out.print(str + " ");
        }
        System.out.println();
    }
}
