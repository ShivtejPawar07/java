/**
 * The MyNumber class represents a number and provides methods
 * to check if the number is negative, positive, zero, odd, or even.
 */
class MyNumber {
  // Private data member to store the number
  private int n;

  /**
   * Default constructor that initializes the number to 0.
   */
  MyNumber() {
      this.n = 0;
  }

  /**
   * Parameterized constructor that initializes the number to a specific value.
   * @param n The number to initialize with.
   */
  MyNumber(int n) {
      this.n = n;
  }

  /**
   * Checks if the number is negative.
   * @return true if the number is negative, otherwise false.
   */
  boolean isNegative() {
      return n < 0;
  }

  /**
   * Checks if the number is positive.
   * @return true if the number is positive, otherwise false.
   */
  boolean isPositive() {
      return n > 0;
  }

  /**
   * Checks if the number is zero.
   * @return true if the number is zero, otherwise false.
   */
  boolean isZero() {
      return n == 0;
  }

  /**
   * Checks if the number is odd.
   * @return true if the number is odd, otherwise false.
   */
  boolean isOdd() {
      return n % 2 != 0;
  }

  /**
   * Checks if the number is even.
   * @return true if the number is even, otherwise false.
   */
  boolean isEven() {
      return n % 2 == 0;
  }

  /**
   * Main method that creates an object of MyNumber using a command-line argument.
   * Performs tests to check if the number is negative, positive, zero, odd, or even.
   * @param args Command-line arguments, expected to pass a number.
   */
  public static void main(String[] args) {
      // Convert command-line argument to integer
      int data = Integer.parseInt(args[0]);
      
      // Create an object of MyNumber using the provided argument
      MyNumber m = new MyNumber(data);

      // Perform tests and print the results
      System.out.println(data + " is negative: " + m.isNegative());
      System.out.println(data + " is positive: " + m.isPositive());
      System.out.println(data + " is zero: " + m.isZero());
      System.out.println(data + " is odd: " + m.isOdd());
      System.out.println(data + " is even: " + m.isEven());
  }
}
