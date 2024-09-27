

import java.util.*;
abstract class Order {
    protected int id;
    protected String des;

    abstract void accept();
    abstract void display();
}
class PurchaseOrder extends Order {
    private String vname;

    void accept() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Purchase Order ID,Description, Vendor Nam: ");
        id = sc.nextInt();
        sc.nextLine();      
        des = sc.nextLine();    
        vname = sc.nextLine();
    }
    void display() {
        System.out.println("Purchase Order ID: " + id);
        System.out.println("Description: " + des);
        System.out.println("Vendor Name: " + vname);
    }
}

class SalesOrder extends Order {
    private String cname;

    void accept() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Sales Order ID: ");
        id = sc.nextInt();
        sc.nextLine();  
        System.out.print("Enter Description: ");
        des = sc.nextLine();
        System.out.print("Enter Customer Name: ");
        cname = sc.nextLine();
    }

    void display() {
        System.out.println("Sales Order ID: " + id);
        System.out.println("Description: " + des);
        System.out.println("Customer Name: " + cname);
    }
}

class Demo {
    public static void main(String[] args) {
       
        PurchaseOrder[] p = new PurchaseOrder[3];
        for (int i = 0; i < 3; i++) {
            p[i] = new PurchaseOrder();
            System.out.println("\nEntering details for Purchase Order " + (i + 1));
            p[i].accept();
        }

        SalesOrder[] s = new SalesOrder[3];
        for (int i = 0; i < 3; i++) {
        s[i] = new SalesOrder();
            System.out.println("\nEntering details for Sales Order " + (i + 1));
            s[i].accept();
        }

        
        System.out.println("\nDisplaying all Purchase Orders:");
        for (int i = 0; i < 3; i++) {
            p[i].display();
        }

        System.out.println("\nDisplaying all Sales Orders:");
        for (int i = 0; i < 3; i++) {
         s[i].display();
        }
    }
}
