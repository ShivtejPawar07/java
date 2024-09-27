//15.Check given number is Armstrong or not. 
import java.util.Scanner;

 class demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();
        int originalNumber = number;
        int numDigits = 0;
        int temp = number;
        
        // Count the number of digits
        while (temp != 0) {
            temp /= 10;
            numDigits++;
        }

        int sum = 0;
        temp = number;
    //    suppose 
    //    153  3^3 +5^3+1^3=153

        while (temp != 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, numDigits);
            temp /= 10;
        }
        if (sum == originalNumber)
         {
            System.out.println(originalNumber + " is an Armstrong number.");
        } else 
        {
            System.out.println(originalNumber + " is not an Armstrong number.");
        }
    }
}
