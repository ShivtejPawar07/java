class useranimal {
    public static void main(String[] args) {
        zoo.sendanimal(new lion()); // Instantiating lion, not the animal interface
        zoo.sendanimal(new rabit()); // Instantiating rabit
    }
}

class zoo {
    public static void sendanimal(animal a) {
        a.eat();
        a.sleep();
    }
}

interface animal {
    void eat();  // Abstract method
    void sleep(); // Abstract method
}

class lion implements animal {
    public void eat() {
        System.out.println("Lion is eating...");
    }

    public void sleep() {
        System.out.println("Lion is sleeping...");
    }
}

class rabit implements animal {
    public void eat() {
        System.out.println("Rabit is eating...");
    }

    public void sleep() {
        System.out.println("Rabit is sleeping...");
    }
}
