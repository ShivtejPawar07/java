import java.util.*;

// Define the Student class without implementing Comparable
class Student {
    int rno;
    String name;
    int mno;

    // Constructor to initialize the Student object
    Student(int rno, String name, int mno) {
        this.rno = rno;
        this.name = name;
        this.mno = mno;
    }

    // Override toString for printing the Student details in TreeSet
    public String toString() {
        return "Student{rno=" + rno + ", name='" + name + "', mno=" + mno + "}";
    }
}

// Define a Comparator to compare students by roll number (rno)
class RollNumberComparator implements Comparator<Student> {
    public int compare(Student s1, Student s2) {
        return Integer.compare(s1.rno, s2.rno);
    }
}

class Demo {
    public static void main(String[] args) {
        // Creating TreeSet with custom Comparator for roll number
        TreeSet<Student> ts = new TreeSet<>(new RollNumberComparator());

        // Adding Student objects to TreeSet
        ts.add(new Student(1, "s", 32));
        ts.add(new Student(5, "h", 52));
        ts.add(new Student(3, "i", 12));
        ts.add(new Student(2, "v", 45));
        ts.add(new Student(7, "t", 36));

        // Printing the TreeSet to check sorted order based on roll number
        System.out.println(ts);
        // Output: [Student{rno=1, name='s', mno=32}, ..., Student{rno=7, name='t', mno=36}]
    }
}
