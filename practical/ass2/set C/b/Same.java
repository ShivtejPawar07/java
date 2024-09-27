// File: Same.java

import b.Customer;
public class Same {
    public static void main(String[] args) {
        Customer cust = new Customer("Public", "Private", "Protected", "Default");

        // Access public variable
        System.out.println("Public Name: " + cust.publicName);

        // Access private variable (This will cause a compilation error)
        // System.out.println("Private Name: " + cust.privateName);

        // Access protected variable
      //  System.out.println("Protected Name: " + cust.protectedName);

        // Access default variable
       // System.out.println("Default Name: " + cust.defaultName);
    }
}
// javac b\Customer.java b\Same.java
// java b.Same