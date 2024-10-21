/* a) Write a Java program to create a Package “SY” which has a class SYMarks
(members – ComputerTotal, MathsTotal, and ElectronicsTotal). Create another
package TY which has a class TYMarks (members – Theory, Practicals). Create n
objects of Student class (having rollNumber, name, SYMarks and TYMarks). Add
the marks of SY and TY computer subjects and calculate the Grade (‘A’ for >= 70,
‘B’ for >= 60 ‘C’ for >= 50 , Pass Class for > =40 else ‘FAIL’) and display the result
of the student in proper format*/

import sy.SYMarks; // user-defined package
import ty.TYMarks; // user-defined package
import java.util.Scanner; // predefined package

class student {
    int rollno;
    String studname;
    SYMarks sym;
    TYMarks tym;

    student(int r, String name, SYMarks s, TYMarks t) {
        rollno = r;
        studname = name;
        sym = s;
        tym = t;
    }

    public String toString() {
        return rollno + "\t" + studname + "\t" + sym.comptot + "\t" + sym.mathtot + "\t" + sym.electronics + "\t" + tym.theory + "\t" + tym.practical;
    }

    void calculategrade() {
        int total = sym.comptot + tym.theory + tym.practical; // computer total (sy -2 theory 1 practical,ty -6 subject ty practical -3)
        double per = total / 12.0; // ensure floating point division
        if (per >= 70)
            System.out.println("\tA");
        else if (per >= 60)
            System.out.println("\tB");
        else if (per >= 50)
            System.out.println("\tC");
        else if (per >= 40)
            System.out.println("\tPassClass");
        else
            System.out.println("\tFail");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many student details");
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        // create array of objects
        student[] stud = new student[n];

        // read student details
        for (int i = 0; i < n; i++) {
            System.out.println("Enter " + (i + 1) + " student details");
            System.out.print("Enter roll number: ");
            int rn = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character
            System.out.print("Enter student name: ");
            String name = scanner.nextLine();
            System.out.print("Enter SY marks (computer total, math total, electronics total): ");
            int ct = scanner.nextInt();
            int mt = scanner.nextInt();
            int et = scanner.nextInt();
            SYMarks sym = new SYMarks(ct, mt, et);
            System.out.print("Enter TY marks (theory, practical): ");
            int th = scanner.nextInt();
            int pr = scanner.nextInt();
            TYMarks tym = new TYMarks(th, pr);

            stud[i] = new student(rn, name, sym, tym); // student object
        } // for end

        // display student details
        System.out.println("******STUDENT DETAILS******");
        System.out.println("ROLLNO\tNAME\tCOMPTOT\tMATHTOT\tELECTOT\tTHEORY\tPRACTICAL\tGRADE");
        for (int i = 0; i < n; i++) {
            System.out.print(stud[i]); // invoke toString() method
            stud[i].calculategrade();
        }
        scanner.close(); // close the scanner
    } // main
} // class end
