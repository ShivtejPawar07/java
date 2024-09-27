
import b.Customer;
import b.Same;

public class Different {
    public static void main(String[] args) {
        Customer customer = new Customer("Public", "Private", "Protected", "Default");

        // Access public variable
        System.out.println("Public Name: " + customer.publicName);

        // Access private variable (This will cause a compilation error)
        // System.out.println("Private Name: " + customer.privateName);

        // Access protected variable (This will cause a compilation error)
        // System.out.println("Protected Name: " + customer.protectedName);

        // Access default variable (This will cause a compilation error)
        // System.out.println("Default Name: " + customer.defaultName);
    }
}
