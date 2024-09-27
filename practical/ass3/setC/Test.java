import java.util.Scanner;
interface Department {
    String deptName="";
    String deptHead="";
    void printDepartmentDetails();
}

class Hostel {
    String hname;
    String hlocation;
    int nor;

    public Hostel(String hname, String hlocation, int nor) {
        this.hname = hname;
        this.hlocation = hlocation;
        this.nor = nor;
    }

    public void printHostelDetails() {
        System.out.println("Hostel Name: " + hname);
        System.out.println("Hostel Location: " + hlocation);
        System.out.println("Number of Rooms: " + nor);
    }
}

class Student extends Hostel implements Department {
    String studentName;
    String regNo;
    String electiveSubject;
    double avgMarks;
    String deptName;
    String deptHead;

    public Student(String hostelName, String hostelLocation, int numberOfRooms,
                   String studentName, String regNo, String electiveSubject,
                   double avgMarks, String deptName, String deptHead) {
        super(hostelName, hostelLocation, numberOfRooms);
        this.studentName = studentName;
        this.regNo = regNo;
        this.electiveSubject = electiveSubject;
        this.avgMarks = avgMarks;
        this.deptName = deptName;
        this.deptHead = deptHead;
    }

    @Override
    public void printDepartmentDetails() {
        System.out.println("Department Name: " + deptName);
        System.out.println("Department Head: " + deptHead);
    }

    public void printStudentDetails() {
        System.out.println("Student Name: " + studentName);
        System.out.println("Registration Number: " + regNo);
        System.out.println("Elective Subject: " + electiveSubject);
        System.out.println("Average Marks: " + avgMarks);
    }

    public void printData() {
        printHostelDetails();
        printDepartmentDetails();
        printStudentDetails();
    }
}

public class Test {
    static Student[] students = new Student[100];  // Assuming a maximum of 100 students
    static int studentCount = 0;

    public static void admitNewStudent() {
        if (studentCount >= students.length) {
            System.out.println("Cannot admit more students, array is full.");
            return;
        }

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Hostel Name: ");
        String hostelName = sc.nextLine();

        System.out.print("Enter Hostel Location: ");
        String hostelLocation = sc.nextLine();

        System.out.print("Enter Number of Rooms: ");
        int numberOfRooms = sc.nextInt();
        sc.nextLine();  // Consume newline

        System.out.print("Enter Student Name: ");
        String studentName = sc.nextLine();

        System.out.print("Enter Registration Number: ");
        String regNo = sc.nextLine();

        System.out.print("Enter Elective Subject: ");
        String electiveSubject = sc.nextLine();

        System.out.print("Enter Average Marks: ");
        double avgMarks = sc.nextDouble();
        sc.nextLine();  // Consume newline

        System.out.print("Enter Department Name: ");
        String deptName = sc.nextLine();

        System.out.print("Enter Department Head: ");
        String deptHead = sc.nextLine();

        students[studentCount] = new Student(hostelName, hostelLocation, numberOfRooms,
                                             studentName, regNo, electiveSubject,
                                             avgMarks, deptName, deptHead);
        studentCount++;
        System.out.println("Student admitted successfully.");
    }

    public static void migrateStudent() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Registration Number of the student to migrate: ");
        String regNo = sc.nextLine();

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

    public static void displayStudentDetails() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Registration Number of the student: ");
        String regNo = sc.nextLine();

        Student student = findStudentByRegNo(regNo);
        if (student != null) {
            student.printData();
        } else {
            System.out.println("Student not found.");
        }
    }

    public static Student findStudentByRegNo(String regNo) {
        for (int i = 0; i < studentCount; i++) {
            if (students[i].regNo.equals(regNo)) {
                return students[i];
            }
        }
        return null;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
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
        }
    }
}
