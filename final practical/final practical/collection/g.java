import java.util.*;

class LinkedListSorting {
    public static void main(String[] args) {
        // Create a LinkedList
        LinkedList<Integer> list = new LinkedList<>();

        // Adding elements to LinkedList
        list.add(30);
        list.add(10);
        list.add(50);
        list.add(20);
        list.add(40);

        // Display list before sorting
        System.out.println("Before Sorting: " + list);

        // Sorting the LinkedList
        Collections.sort(list);

        // Display list after sorting
        System.out.println("After Sorting: " + list);
    }
}

