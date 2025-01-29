import java.util.*;

class Demo {
    public static void main(String[] args) {
        // **Constructor**: Create a TreeSet
        // Prototype: TreeSet<E> treeSet = new TreeSet<>();
        SortedSet ss = new TreeSet();

        // **add()**: Add elements to the TreeSet
        // Prototype: boolean add(E e)
        ss.add(50);
        ss.add(20);
        ss.add(70);
        ss.add(40);
        System.out.println("TreeSet after adding elements: " + ss);
        // Output: TreeSet after adding elements: [20, 40, 50, 70]

        // **contains()**: Check if an element exists
        // Prototype: boolean contains(Object o)
        System.out.println("Does TreeSet contain 40? " + ss.contains(40));
        // Output: Does TreeSet contain 40? true

        // **remove()**: Remove an element from the TreeSet
        // Prototype: boolean remove(Object o)
        ss.remove(50);
        System.out.println("TreeSet after removing 50: " + ss);
        // Output: TreeSet after removing 50: [20, 40, 70]

        // **first()**: Get the first (lowest) element
        // Prototype: E first()
        System.out.println("First element: " + ss.first());
        // Output: First element: 20

        // **last()**: Get the last (highest) element
        // Prototype: E last()
        System.out.println("Last element: " + ss.last());
        // Output: Last element: 70

        // **size()**: Get the number of elements
        // Prototype: int size()
        System.out.println("Size of TreeSet: " + ss.size());
        // Output: Size of TreeSet: 3

        // **isEmpty()**: Check if the TreeSet is empty
        // Prototype: boolean isEmpty()
        System.out.println("Is TreeSet empty? " + ss.isEmpty());
        // Output: Is TreeSet empty? false

        System.out.println("subset " + ss.subSet(20,40));

        // **clear()**: Remove all elements
        // Prototype: void clear()
        ss.clear();
        System.out.println("TreeSet after clear: " + ss);
        // Output: TreeSet after clear: []
    }
}
