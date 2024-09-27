// File: Customer.java
package b;

public class Customer {
    public String publicName;
    private String privateName;
    protected String protectedName;
    String defaultName;

    public Customer(String publicName, String privateName, String protectedName, String defaultName) {
        this.publicName = publicName;
        this.privateName = privateName;
        this.protectedName = protectedName;
        this.defaultName = defaultName;
    }
}
