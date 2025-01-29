import java.util.LinkedList;

class LinkedListDemo {
    public static void main(String[] args) {
        // Constructor 1: LinkedList()
        // Prototype: public LinkedList()
        LinkedList<String> list1 = new LinkedList<>();
        list1.add("Apple"); // Add elements
        list1.add("Banana");
        list1.add("Cherry");
        System.out.println("List1: " + list1); // Output: [Apple, Banana, Cherry]

        // Constructor 2: LinkedList(Collection<? extends E> c)
        // Prototype: public LinkedList(Collection<? extends E> c)
        LinkedList<String> list2 = new LinkedList<>(list1); // Copy elements from list1
        System.out.println("List2 (copied from list1): " + list2); // Output: [Apple, Banana, Cherry]

        // 1. add(E e) - Adds an element to the end of the list
        // Prototype: public boolean add(E e)
        list1.add("Date");
        System.out.println("After add(Date) to list1: " + list1); // Output: [Apple, Banana, Cherry, Date]

        // 2. add(int index, E element) - Adds an element at a specific position
        // Prototype: public void add(int index, E element)
        list1.add(1, "Blueberry");
        System.out.println("After add(1, Blueberry) to list1: " + list1); // Output: [Apple, Blueberry, Banana, Cherry, Date]

        // 3. get(int index) - Retrieves the element at the given position
        // Prototype: public E get(int index)
        String fruit = list1.get(2); // Get element at index 2
        System.out.println("Element at index 2: " + fruit); // Output: Banana

        // 4. remove(int index) - Removes the element at the specified index
        // Prototype: public E remove(int index)
        list1.remove(1); // Removes the element at index 1
        System.out.println("After remove(1) from list1: " + list1); // Output: [Apple, Banana, Cherry, Date]

        // 5. remove(Object o) - Removes the first occurrence of the specified element
        // Prototype: public boolean remove(Object o)
        list1.remove("Cherry"); // Remove Cherry from the list
        System.out.println("After remove(Cherry): " + list1); // Output: [Apple, Banana, Date]

        // 6. size() - Returns the number of elements in the list
        // Prototype: public int size()
        System.out.println("Size of list1: " + list1.size()); // Output: 3

        // 7. contains(Object o) - Checks if the list contains the specified element
        // Prototype: public boolean contains(Object o)
        boolean containsDate = list1.contains("Date");
        System.out.println("Does list1 contain 'Date'? " + containsDate); // Output: true

        // 8. isEmpty() - Checks if the list is empty
        // Prototype: public boolean isEmpty()
        System.out.println("Is list1 empty? " + list1.isEmpty()); // Output: false

        // 9. clear() - Removes all elements from the list
        // Prototype: public void clear()
        list1.clear();
        System.out.println("After clear(), list1: " + list1); // Output: []
    }
}
