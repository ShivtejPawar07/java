// Abstract class
abstract class Animal {
    // Abstract method
    abstract void sound();

    // Non-abstract method
    void eat() {
        System.out.println("Animal is eating");
    }
}

// Dog class inherits Animal
class Dog extends Animal {
    // Implementing abstract method
    void sound() {
        System.out.println("Dog barks");
    }
}

// Cat class inherits Animal
class Cat extends Animal {
    // Implementing abstract method
    void sound() {
        System.out.println("Cat meows");
    }
}

class demo {
    public static void main(String[] args) {
        // Animal myDog = new Dog(); // Upcasting
        // Animal myCat = new Cat(); // Upcasting
        Dog myDog = new Dog(); // Upcasting
       Cat myCat = new Cat(); // Upcasting

        myDog.sound(); // Outputs: Dog barks
        myDog.eat();   // Outputs: Animal is eating

        myCat.sound(); // Outputs: Cat meows
        myCat.eat();   // Outputs: Animal is eating
  }
}
