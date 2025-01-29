import java.util.Stack;

class StackDemo {
    public static void main(String[] args) {
        // Create a Stack (LIFO - Last In First Out)
        // Prototype: public Stack()
        Stack<Integer> stack = new Stack<>();

        // 1. push(E item) - Adds an element to the top of the stack
        // Prototype: public E push(E item)
        stack.push(10); // Adds 10 to the stack
        stack.push(20); // Adds 20 to the stack
        stack.push(30); // Adds 30 to the stack
        System.out.println("Stack after push: " + stack); // Output: [10, 20, 30]

        // 2. pop() - Removes and returns the top element of the stack
        // Prototype: public E pop()
        int poppedElement = stack.pop(); // Removes and returns the top (30)
        System.out.println("Popped element: " + poppedElement); // Output: 30
        System.out.println("Stack after pop: " + stack); // Output: [10, 20]

        // 3. peek() - Returns the top element without removing it
        // Prototype: public E peek()
        int topElement = stack.peek(); // Gets the top element (20)
        System.out.println("Top element (peek): " + topElement); // Output: 20

        // 4. isEmpty() - Checks if the stack is empty
        // Prototype: public boolean isEmpty()
        boolean isStackEmpty = stack.isEmpty(); // False since elements are present
        System.out.println("Is stack empty? " + isStackEmpty); // Output: false

        // 5. search(Object o) - Searches for an element in the stack
        // Prototype: public int search(Object o)
        int position = stack.search(10); // Searches for 10 in the stack
        if (position != -1) { // If element found, print position (1-based index)
            System.out.println("Element 10 found at position (1-based): " + position); // Output: 2
        } else {
            System.out.println("Element 10 not found in the stack.");
        }

        // 6. size() - Returns the number of elements in the stack
        // Prototype: public int size()
        System.out.println("Stack size: " + stack.size()); // Output: 2

        // 7. clear() - Removes all elements from the stack
        // Prototype: public void clear() (Inherited from Vector)
        stack.clear(); // Clears the stack
        System.out.println("Stack after clear: " + stack); // Output: []
    }
}
