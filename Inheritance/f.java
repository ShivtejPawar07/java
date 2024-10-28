class A {
    int a = 10;
    
    A() {
        System.out.println("A constructor");
    }
    
    void show() {
        System.out.println("A's a = " + a);
    }
}

class B extends A {
    int a = 20;
    
    B() {
        super(); // Calls the constructor of class A
        System.out.println("B constructor");
    }
    
    void show() {
        super.show(); // Calls the show method of class A
        System.out.println("B's a = " + a); // Prints the 'a' in class B
       
    }
}

class Demo {
    public static void main(String[] args) {
        B b = new B();
        b.show();
    }
}
