import java.util.Scanner;

// Custom Exception class for invalid date
class InvalidDateException extends Exception {
    String msg;

    InvalidDateException(String msg) {
        this.msg = msg;
    }

    public String toString() {
        return "InvalidDateException: " + msg;
    }
}

// MyDate class to store day, month, and year
class MyDate {
    int day, month, year;

    // Constructor to initialize and validate date
    MyDate(int day, int month, int year) throws InvalidDateException {
        this.day = day;
        this.month = month;
        this.year = year;

        // Validate the date
        if (!isValidDate(day, month, year)) {
            throw new InvalidDateException("Invalid date: " + day + "/" + month + "/" + year);
        }
    }

    // Method to display the date
    public void displayDate() {
        System.out.println("Valid date: " + day + "/" + month + "/" + year);
    }

    // Helper method to check if a date is valid
    private boolean isValidDate(int day, int month, int year) {
        if (month < 1 || month > 12) {
            return false; // Invalid month
        }

        if (day < 1 || day > getDaysInMonth(month, year)) {
            return false; // Invalid day for the given month and year
        }

        return true;
    }

    // Helper method to get the number of days in a month
    private int getDaysInMonth(int month, int year) {
        switch (month) {
            case 1:  // January
            case 3:  // March
            case 5:  // May
            case 7:  // July
            case 8:  // August
            case 10: // October
            case 12: // December
                return 31;
            case 4:  // April
            case 6:  // June
            case 9:  // September
            case 11: // November
                return 30;
            case 2:  // February
                return isLeapYear(year) ? 29 : 28;
            default:
                return -1; // Should never reach here
        }
    }

    // Helper method to check if a year is a leap year
    private boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}

// Main class to test the MyDate class
class demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            // Input date from user
            System.out.print("Enter day (dd): ");
            int day = sc.nextInt();
            System.out.print("Enter month (mm): ");
            int month = sc.nextInt();
            System.out.print("Enter year (yyyy): ");
            int year = sc.nextInt();

            // Create a MyDate object and validate the date
            MyDate date = new MyDate(day, month, year);
            date.displayDate();

        } catch (InvalidDateException e) {
            // Handle invalid date exception
            System.out.println(e);
        } finally {
            sc.close();
        }
    }
}

