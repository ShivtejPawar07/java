import java.util.*;

 class demo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        // i. void add(int index, Object obj)
        list.add("Apple");
        list.add("Banana");
        list.add(1, "Cherry"); // Insert "Cherry" at index 1
        System.out.println("After add: " + list);

        // ii. boolean addAll(int index, Collection<?> c)
        List<String> moreFruits = Arrays.asList("Date", "Elderberry");
        list.addAll(2, moreFruits); // Add at index 2
        System.out.println("After addAll: " + list);

        // iii. Object get(int index)
        System.out.println("Element at index 1: " + list.get(1));

        // iv. int indexOf(Object obj)
        System.out.println("Index of 'Banana': " + list.indexOf("Banana"));

        // v. int lastIndexOf(Object obj)
        list.add("Apple"); // Add duplicate
        System.out.println("Last index of 'Apple': " + list.lastIndexOf("Apple"));

        // vi. ListIterator listIterator()
        ListIterator<String> iterator = list.listIterator();
        System.out.print("Using ListIterator: ");
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();

        // vii. ListIterator listIterator(int index)
        ListIterator<String> iteratorFromIndex = list.listIterator(2);
        System.out.print("Using ListIterator from index 2: ");
        while (iteratorFromIndex.hasNext()) {
            System.out.print(iteratorFromIndex.next() + " ");
        }
        System.out.println();

        // viii. Object remove(int index)
        String removedElement = list.remove(3); // Remove element at index 3
        System.out.println("After remove: " + list + " (Removed: " + removedElement + ")");

        // ix. Object set(int index, Object obj)
        list.set(2, "Fig"); // Replace element at index 2
        System.out.println("After set: " + list);

        // x. List subList(int start, int end)
        List<String> sublist = list.subList(1, 3); // Sublist from index 1 to 2
        System.out.println("Sublist (index 1 to 3): " + sublist);
    }
}
