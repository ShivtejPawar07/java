import java.util.*;

class Demo {
    public static void main(String[] args) {
        // 1. Vector() - Default constructor
        // Prototype: public Vector()
        Vector<Integer> v1 = new Vector<>();
        v1.add(10);
        v1.add(10);
        v1.add(20);
        v1.add(30);
        System.out.println("v1: " + v1);

        // 2. Vector(int initialCapacity) - Constructor with initial capacity
        // Prototype: public Vector(int initialCapacity)
        Vector<Integer> list2 = new Vector<>(20);
        list2.add(30);
        list2.add(50);
        list2.add(60);
        System.out.println("list2: " + list2);

        // 3. Vector(int initialCapacity, int capacityIncrement) - Constructor with capacity increment
        // Prototype: public Vector(int initialCapacity, int capacityIncrement)
        Vector<Integer> v3 = new Vector<>(20, 10);
        v3.add(30);
        v3.add(50);
        v3.add(60);
        System.out.println("v3: " + v3);

        // 4. Vector(Collection<? extends E> c) - Constructor with collection
        // Prototype: public Vector(Collection<? extends E> c)
        HashSet<Integer> hs = new HashSet<>();
        hs.add(10);
        hs.add(20);
        
        // Create an ArrayList from HashSet
        ArrayList<Integer> list3 = new ArrayList<>(hs);
        System.out.println("list3 from HashSet: " + list3);

        // Create a Vector from HashSet
        Vector<Integer> v4 = new Vector<>(hs);
        v4.add(30);
        v4.add(50);
        v4.add(60);
        System.out.println("v4: " + v4);

        // Methods of Vector

        // 1. addElement(E obj)
        // Prototype: public void addElement(E obj)
        v4.addElement(60);
        System.out.println("After addElement: " + v4);

        // 2. firstElement()
        // Prototype: public E firstElement()
        System.out.println("First element: " + v4.firstElement());

        // 3. lastElement()
        // Prototype: public E lastElement()
        System.out.println("Last element: " + v4.lastElement());

        // 4. elementAt(int index)
        // Prototype: public E elementAt(int index)
        System.out.println("Element at index 2: " + v4.elementAt(2));

        // 5. removeElementAt(int index)
        // Prototype: public void removeElementAt(int index)
        v4.removeElementAt(2);
        System.out.println("After removeElementAt(2): " + v4);

        // 6. removeElement(Object obj)
        // Prototype: public boolean removeElement(Object obj)
        System.out.println("Is 30 removed? " + v4.removeElement(30));
        System.out.println("After removeElement(30): " + v4);

        // 7. removeAllElements()
        // Prototype: public void removeAllElements()
        v4.removeAllElements();
        System.out.println("After removeAllElements: " + v4);
    }
}
