class Payment extends Thread {
    public void run() {
        System.out.println("Processing Payment...");
        try { Thread.sleep(2000); } catch (InterruptedException e) { }
        System.out.println("Payment Successful!");
    }
}

class InventoryCheck extends Thread {
    public void run() {
        System.out.println("Checking Inventory...");
        try { Thread.sleep(1000); } catch (InterruptedException e) { }
        System.out.println("Item Available!");
    }
}

class OrderConfirmation extends Thread {
    public void run() {
        System.out.println("Confirming Order...");
        try { Thread.sleep(1500); } catch (InterruptedException e) { }
        System.out.println("Order Confirmed!");
    }
}

public class OnlineOrderSystem {
    public static void main(String[] args) {
        // Creating thread objects
        Payment payment = new Payment();
        InventoryCheck inventory = new InventoryCheck();
        OrderConfirmation confirmation = new OrderConfirmation();

        // Starting all threads
        payment.start();
        inventory.start();
        confirmation.start();

        // Ensuring that the order is shipped only after all processes are completed
        try {
            payment.join();      // Wait for payment to complete
            inventory.join();    // Wait for inventory check to complete
            confirmation.join(); // Wait for order confirmation to complete
        } catch (InterruptedException e) {
            System.out.println("Process Interrupted: " + e.getMessage());
        }

        System.out.println("All checks done. Order is ready for shipping!");
}
}
