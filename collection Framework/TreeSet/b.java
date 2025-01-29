import java.util.*;

// Define the Student class implementing Comparable
class Student implements Comparable {
    int rno;
    String name;
    int mno;

    // Constructor to initialize the Student object
    Student(int rno, String name, int mno) {
        this.rno = rno;
        this.name = name;
        this.mno = mno;
    }

    // CompareTo method to compare students by roll number (rno)
    public int compareTo(Object obj) {
        int result = 0;
        Student s = (Student) obj;
        try {
            result = (new Integer(this.rno).compareTo(s.rno));//name ni =>(this.name).compareTo(s.name);
        } catch (Exception e) {
            System.out.println(e);
        }
        return result;
    }

    // Override toString for printing the Student details in TreeSet
    public String toString() {
        return "Student{rno=" + rno + ", name='" + name + "', mno=" + mno + "}";
    }
}

// Main Demo class
class Demo {
    public static void main(String[] args) {
        // Creating TreeSet to store Student objects
        TreeSet<Student> ts = new TreeSet<>();

        // Adding Student objects to TreeSet (ts.add requires single object argument)
        ts.add(new Student(1, "s", 32));
        ts.add(new Student(5, "h", 52));
        ts.add(new Student(3, "i", 12));
        ts.add(new Student(2, "v", 45));
        ts.add(new Student(7, "t", 36));

        // Printing the TreeSet to check sorted order based on rno
        System.out.println(ts);
        // Output: [Student{rno=1, name='s', mno=32}, ..., Student{rno=5, name='t', mno=36}]
    }
}
