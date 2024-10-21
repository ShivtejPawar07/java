/*b) Define a class CricketPlayer (name,no_of_innings,no_of_times_notout, totatruns,
bat_avg). Create an array of n player objects .Calculate the batting average for each
player using static method avg(). Define a static sort method which sorts the array on
the basis of average. Display the player details in sorted order */
import java.util.Scanner;

class CricketPlayer {
    String name;
    int inning;
    int notout;
    int total;
    float avg;

    // Method to accept player details
    void accept(String name, int inning, int notout, int total) {
        this.name = name;
        this.inning = inning;
        this.notout = notout;
        this.total = total;
    }

    // Static method to calculate average
    static void avg(CricketPlayer c) {
        if (c.inning == c.notout) {
            c.avg = c.total; // If all innings are not out, avg = total runs
        } else {
            c.avg = (float) c.total / (c.inning - c.notout); // Calculate the batting average
        }
    }

    // Static method to sort players based on average
    static void sort(CricketPlayer[] c) {
        for (int i = 0; i < c.length; i++) {
            for (int j = i + 1; j < c.length; j++) {
                if (c[i].avg < c[j].avg) {
                    CricketPlayer temp = c[i];
                    c[i] = c[j];
                    c[j] = temp;
                }
            }
        }
    }

    // Method to display player details
    void display() {
        System.out.println(name + "\t" + inning + "\t" + notout + "\t" + total + "\t" + avg);
    }
}

class demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input number of players
        System.out.println("How many players?");
        int n = sc.nextInt();
        CricketPlayer[] c = new CricketPlayer[n];

        // Accept details for each player
        for (int i = 0; i < n; i++) {
            System.out.println("Enter name, innings, not out, total for player " + (i + 1) + ":");
            sc.nextLine(); // consume the newline
            String name = sc.nextLine();
            int inning = sc.nextInt();
            int notout = sc.nextInt();
            int total = sc.nextInt();
            c[i] = new CricketPlayer();
            c[i].accept(name, inning, notout, total);
            CricketPlayer.avg(c[i]); // Calculate average
        }

        // Display player details before sorting
        System.out.println("*** Cricket Info (Before Sorting) ***");
        System.out.println("Name\tInnings\tNotOut\tTotal\tBatAvg");
        for (int i = 0; i < n; i++) {
            c[i].display();
        }

        // Sort the players based on average
        CricketPlayer.sort(c);

        // Display player details after sorting
        System.out.println("*** Cricket Info (After Sorting) ***");
        System.out.println("Name\tInnings\tNotOut\tTotal\tBatAvg");
        for (int i = 0; i < n; i++) {
            c[i].display();
        }

        sc.close();
    }
}
