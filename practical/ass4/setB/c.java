import java.util.Scanner;
class InvalidDateException extends Exception {
    public InvalidDateException(String message) {
        super(message);
    }
}

class MyDate {
    int day, month, year;

    // Constructor to accept date
    public MyDate(int day, int month, int year) throws InvalidDateException {
        if (!isValidDate(day, month, year)) {
            throw new InvalidDateException("Invalid Date: " + day + "/" + month + "/" + year);
        }
        this.day = day;
        this.month = month;
        this.year = year;
    }

    // Method to validate date
    public boolean isValidDate(int day, int month, int year) {
        if (year < 0) return false;
        if (month < 1 || month > 12) return false;
        if (day < 1 || day > 31) return false;

        // February case
        if (month == 2) {
            if (isLeapYear(year)) {
                return day <= 29;
            } else {
                return day <= 28;
            }
        }

        // Months with 30 days
        if (month == 4 || month == 6 || month == 9 || month == 11) {
            return day <= 30;
        }

        return true;
    }

    // Check if leap year
    public boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    // Method to display the date
    public void displayDate() {
        System.out.println("Date: " + day + "/" + month + "/" + year);
    }

    public static void main(String[] args) {
        try {   Scanner sc =new Scanner(System.in);
                System.out.println("enter day:");
                int day=sc.nextInt();
                 System.out.println("enter month:");
                int month=sc.nextInt();
                 System.out.println("enter year:");
                int year=sc.nextInt();
            MyDate date = new MyDate(day, month, year);
            date.displayDate();
        } catch (InvalidDateException e) {
            System.out.println(e.getMessage());
 }
}
}
