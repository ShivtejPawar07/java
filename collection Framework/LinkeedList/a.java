import java.util.LinkedList;

 class a
 {
    public static void main(String[] args) {
        // Constructor 1: Default constructor
        LinkedList<String> list = new LinkedList<>();

        // Adding elements
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        System.out.println("Initial List: " + list);

        // Constructor 2: Creating LinkedList from another collection
        LinkedList<String> anotherList = new LinkedList<>(list);
        System.out.println("Another List (copied from first): " + anotherList);

        // i. void addFirst(Object o)
        list.addFirst("Mango");
        System.out.println("After addFirst: " + list);

        // ii. void addLast(Object o)
        list.addLast("Pineapple");
        System.out.println("After addLast: " + list);

        // iii. Object clone()
        LinkedList<String> clonedList = (LinkedList<String>) list.clone();
        System.out.println("Cloned List: " + clonedList);

        // iv. Object getFirst()
        System.out.println("First Element: " + list.getFirst());

        // v. Object getLast()
        System.out.println("Last Element: " + list.getLast());

        // vi. Object removeFirst()
        String removedFirst = list.removeFirst();
        System.out.println("After removeFirst: " + list + " (Removed: " + removedFirst + ")");

        // vii. Object removeLast()
        String removedLast = list.removeLast();
        System.out.println("After removeLast: " + list + " (Removed: " + removedLast + ")");
    }
}
