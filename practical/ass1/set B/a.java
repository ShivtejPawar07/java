import java.util.Date;
import java.text.SimpleDateFormat;

class Demo {
    public static void main(String[] args) {
        // Create a Date object to get the current system date and time
        Date d = new Date();

        // Display the current date in the format: dd/MM/yyyy (e.g., 15/10/2024)
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        String s = sdf.format(d);
        System.out.println("Current date is : " + s);
        // Example output: Current date is : 15/10/2024

        // Display the current date in the format: MM-dd-yyyy (e.g., 10-15-2024)
        sdf = new SimpleDateFormat("MM-dd-yyyy");
        s = sdf.format(d);
        System.out.println("Current date is : " + s);
        // Example output: Current date is : 10-15-2024

        // Display the current date in the format: EEEE MMMM dd yyyy (e.g., Tuesday October 15 2024)
        sdf = new SimpleDateFormat("EEEE MMMM dd yyyy");
        s = sdf.format(d);
        System.out.println("Current date is : " + s);
        // Example output: Current date is : Tuesday October 15 2024

        // Display the current date and time in the format: E MMMM dd HH:mm:ss z yyyy
        // (e.g., Tue October 15 15:25:59 IST 2024)
        sdf = new SimpleDateFormat("E MMMM dd HH:mm:ss z yyyy");
        s = sdf.format(d);
        System.out.println("Current date and time is : " + s);
        // Example output: Current date and time is : Tue October 15 15:25:59 IST 2024

        // Display the current date and time in the format: dd/MM/yy HH:mm:ss a z
        // (e.g., 15/10/24 15:25:59 PM IST)
        sdf = new SimpleDateFormat("dd/MM/yy HH:mm:ss a z");
        s = sdf.format(d);
        System.out.println("Current date and time is : " + s);
        // Example output: Current date and time is : 15/10/24 15:25:59 PM IST

        // Display the current time in the format: HH:mm:ss (24-hour time format)
        sdf = new SimpleDateFormat("HH:mm:ss");
        s = sdf.format(d);
        System.out.println("Current time is : " + s);
        // Example output: Current time is : 15:25:59

        // Display the current week of the year (w = week number in the year)
        sdf = new SimpleDateFormat("w");
        s = sdf.format(d);
        System.out.println("Current week of year is : " + s);
        // Example output: Current week of year is : 42

        // Display the current week of the month (W = week number in the month)
        sdf = new SimpleDateFormat("W");
        s = sdf.format(d);
        System.out.println("Current week of month is : " + s);
        // Example output: Current week of month is : 3

        // Display the current day of the year (D = day number in the year)
        sdf = new SimpleDateFormat("D");
        s = sdf.format(d);
        System.out.println("Current day of the year is : " + s);
        // Example output: Current day of the year is : 289
    }
}
