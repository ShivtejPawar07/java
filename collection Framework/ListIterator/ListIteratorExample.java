import java.util.*;

public class ListIteratorExample {
    public static void main(String[] args) {
        // Create a LinkedList of Integer type
        List<Integer> list = new LinkedList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        
        // Create a ListIterator to traverse the list
        ListIterator<Integer> listIterator = list.listIterator();
        
        // **hasNext()**: Check if the iterator has a next element
        // Prototype: boolean hasNext()
        System.out.println("Traversing Forward Direction:");
        while (listIterator.hasNext()) {
            // Loop will print the elements as it finds a next one
            System.out.println("Next element: " + listIterator.next());
        }
        // Output after hasNext() is true and the loop goes until the last element
        
        // **hasPrevious()**: Check if the iterator has a previous element
        // Prototype: boolean hasPrevious()
        System.out.println("\nTraversing Backward Direction:");
        while (listIterator.hasPrevious()) {
            // Now looping in reverse direction and printing the elements
            System.out.println("Previous element: " + listIterator.previous());
        }

        // Reinitialize iterator for demonstrating other methods
        listIterator = list.listIterator();

        // **next()**: Get the next element in the forward direction
        // Prototype: E next()
        System.out.println("\nUsing next() method:");
        System.out.println("Next element: " + listIterator.next());

        // **previous()**: Get the previous element in the backward direction
        // Prototype: E previous()
        System.out.println("\nUsing previous() method:");
        System.out.println("Previous element: " + listIterator.previous());

        // **nextIndex()**: Get the index of the next element
        // Prototype: int nextIndex()
        System.out.println("\nUsing nextIndex() method:");
        System.out.println("Next index: " + listIterator.nextIndex());

        // **previousIndex()**: Get the index of the previous element
        // Prototype: int previousIndex()
        System.out.println("\nUsing previousIndex() method:");
        System.out.println("Previous index: " + listIterator.previousIndex());

        // **add()**: Add an element at the current cursor position
        // Prototype: void add(E e)
        listIterator.add(50);
        System.out.println("\nAfter adding element 50 at current position:");
        System.out.println(list);

        // **set()**: Modify the last element returned by next or previous
        // Prototype: void set(E e)
        listIterator.set(100);
        System.out.println("\nAfter setting the last element to 100:");
        System.out.println(list);

        // **remove()**: Removes the last element returned by next() or previous()
        // Prototype: void remove()
        listIterator.remove();
        System.out.println("\nAfter removing last element (100):");
        System.out.println(list);
    }
}
