import java.util.*;

interface dep {
    void printdep();
}

class hostel {
    String hname;
    String hlocation;
    int nor;

    public hostel(String hname, String hlocation, int nor) {
        this.hname = hname;
        this.hlocation = hlocation;
        this.nor = nor;
    }

    public void printhostel() {
        System.out.println("Hostel Name: " + hname);
        System.out.println("Hostel Location: " + hlocation);
        System.out.println("Number of Rooms: " + nor);
    }
}

class Student extends hostel implements dep {
    String sname;
    int rno;
    String esub;
    float avgmarks;
    String dname;
    String dhead;

    public Student(String hname, String hlocation, int nor, String sname, int rno, String esub, float avgmarks, String dname, String dhead) {
        super(hname, hlocation, nor);
        this.sname = sname;
        this.rno = rno;
        this.esub = esub;
        this.avgmarks = avgmarks;
        this.dname = dname;
        this.dhead = dhead;
    }

    public void printdep() {
        System.out.println("Department Name: " + dname);
        System.out.println("Department Head: " + dhead);
    }

    public void printStudent() {
        System.out.println("Student Name: " + sname);
        System.out.println("Registration Number: " + rno);
        System.out.println("Elective Subject: " + esub);
        System.out.println("Average Marks: " + avgmarks);
    }

    public void print() {
        printdep();
        printhostel();
        printStudent();
    }
}

class demo {
    static Student[] students = new Student[100];  // Assuming a maximum of 100 students
    static int studentCount = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Admit new student");
            System.out.println("2. Migrate a student");
            System.out.println("3. Display details of a student");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine();  // Consume newline

            switch (choice) {
                case 1:
                    admitNewStudent();
                    break;
                case 2:
                    migrateStudent();
                    break;
                case 3:
                    displayStudentDetails();
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (true);
    }

    public static void admitNewStudent() {
        if (studentCount >= students.length) {
            System.out.println("Cannot admit more students, array is full.");
            return;
        }

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Hostel Name: ");
        String hname = sc.nextLine();

        System.out.print("Enter Hostel Location: ");
        String hlocation = sc.nextLine();

        System.out.print("Enter Number of Rooms: ");
        int nor = sc.nextInt();
        sc.nextLine();  // Consume newline

        System.out.print("Enter Student Name: ");
        String sname = sc.nextLine();

        System.out.print("Enter Registration Number: ");
        int rno = sc.nextInt();
        sc.nextLine();  // Consume newline

        System.out.print("Enter Elective Subject: ");
        String esub = sc.nextLine();

        System.out.print("Enter Average Marks: ");
        float avgmarks = sc.nextFloat();
        sc.nextLine();  // Consume newline

        System.out.print("Enter Department Name: ");
        String dname = sc.nextLine();

        System.out.print("Enter Department Head: ");
        String dhead = sc.nextLine();

        students[studentCount] = new Student(hname, hlocation, nor, sname, rno, esub, avgmarks, dname, dhead);
        studentCount++;
        System.out.println("Student admitted successfully.");
    }

    public static void migrateStudent() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Registration Number of the student to migrate: ");
        int regNo = sc.nextInt();
        sc.nextLine();  // Consume newline

        Student student = findStudentByRegNo(regNo);
        if (student != null) {
            System.out.print("Enter New Hostel Name: ");
            student.hname = sc.nextLine();

            System.out.print("Enter New Hostel Location: ");
            student.hlocation = sc.nextLine();

            System.out.print("Enter New Number of Rooms: ");
            student.nor = sc.nextInt();
            sc.nextLine();  // Consume newline

            System.out.println("Student migrated successfully.");
        } else {
            System.out.println("Student not found.");
        }
    }

    public static Student findStudentByRegNo(int rno) {
        for (int i = 0; i < studentCount; i++) {
            if (students[i].rno == rno) {
                return students[i];
            }
        }
        return null;
    }

    public static void displayStudentDetails() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Registration Number to search: ");
        int rno = sc.nextInt();

        for (int i = 0; i < studentCount; i++) {
            if (students[i].rno == rno) {
                students[i].print();
                return;
            }
        }

        System.out.println("Student not found.");
    }
}
