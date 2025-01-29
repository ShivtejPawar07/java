import java.util.*;
class VectorConstructors {
    public static void main(String[] args) {
        // 1. Default constructor
        // Prototype: public Vector()
        Vector<Integer> defaultVector = new Vector<>();
        System.out.println("Default Vector: " + defaultVector);

        // 2. Constructor with initial capacity
        // Prototype: public Vector(int initialCapacity)
        Vector<String> capacityVector = new Vector<>(5);
        System.out.println("Vector with initial capacity (5): " + capacityVector);

        // 3. Constructor with initial capacity and capacity increment
        // Prototype: public Vector(int initialCapacity, int capacityIncrement)
        Vector<Double> capacityIncrementVector = new Vector<>(3, 2);
        System.out.println("Vector with initial capacity (3) and increment (2): " + capacityIncrementVector);

        // 4. Constructor using another collection
        // Prototype: public Vector(Collection<? extends E> c)
        Vector<String> collectionVector = new Vector<>(java.util.Arrays.asList("A", "B", "C"));
        System.out.println("Vector from Collection: " + collectionVector);
    }
}
