import java.util.Scanner;
class InvalidAmountException extends Exception {
    InvalidAmountException(String message) {
        super(message);
    }
}

class InsufficientFundException extends Exception {
    InsufficientFundException(String message) {
        super(message);
    }
}

interface Bank {
    void withdraw(int amount) throws InsufficientFundException, InvalidAmountException;
    void deposit(int amount) throws InvalidAmountException;
    void balanceEnquiry();
}

class Hdfc implements Bank {
    private int balance = 1000;

    public void withdraw(int amount) throws InsufficientFundException, InvalidAmountException {
        if (amount <= 0) {
            throw new InvalidAmountException("Enter a positive value to withdraw");
        }
        if (amount > balance) {
            throw new InsufficientFundException("Insufficient balance available");
        }
        balance -= amount;
    }

    public void deposit(int amount) throws InvalidAmountException {
        if (amount <= 0) {
            throw new InvalidAmountException("Enter a positive value for deposit");
        }
        balance += amount;
    }

    public void balanceEnquiry() {
        System.out.println("Current balance: " + balance);
    }
}



public class Cashier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Bank hdfc = new Hdfc();

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Withdraw");
            System.out.println("2. Deposit");
            System.out.println("3. Balance Inquiry");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter withdrawal amount: ");
                    int withdrawAmount = scanner.nextInt();
                    try {
                        hdfc.withdraw(withdrawAmount);
                        System.out.println("Withdrawal successful.");
                    } catch (InvalidAmountException | InsufficientFundException e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;
                case 2:
                    System.out.print("Enter deposit amount: ");
                    int depositAmount = scanner.nextInt();
                    try {
                        hdfc.deposit(depositAmount);
                        System.out.println("Deposit successful.");
                    } catch (InvalidAmountException e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;
                case 3:
                    hdfc.balanceEnquiry();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please select a valid option.");
            }
        }
    }
}