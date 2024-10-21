/*a) Create an employee class(id,name,deptname,salary). Define a default and
parameterized constructor. Use ‘this’ keyword to initialize instance variables. Keep 
a count of objects created. Create objects using parameterized constructor and 
display the object count after each object is created.(Use static member and
method). Also display the contents of each object */

class Employee {
    int id;
    String name;
    String deptName;
    float salary;
    
    // Static variable to keep track of object count
    static int count = 0;

    // Default constructor
    Employee() {
        //count++;
    }

    // Parameterized constructor using 'this' keyword
    Employee(int id, String name, String deptName, float salary) {
        this.id = id;
        this.name = name;
        this.deptName = deptName;
        this.salary = salary;
        count++;  // Increment count when object is created
    }

    // Method to display employee details
    void display() {
        System.out.println("ID: " + id + ", Name: " + name + ", Department: " + deptName + ", Salary: " + salary);
    }

    // Static method to display the count of objects created
    static void displayCount() {
        System.out.println("Number of Employee objects created: " + count);
    }
}

 class demo {
    public static void main(String[] args) {
        // Creating objects using the parameterized constructor
        Employee emp1 = new Employee(101, "shivtej", "bcs", 5000000);
        emp1.display();
        emp1.displayCount();

        Employee emp2 = new Employee(102, "shiv", "bca", 60000);
        emp2.display();
        Employee.displayCount();

        Employee emp3 = new Employee(103, "tej", "Engineering", 70000);
        emp3.display();
        Employee.displayCount();
    }
}

