import java.util.Scanner;

class InvalidNameException extends Exception {
    String msg;

    InvalidNameException(String msg) {
        this.msg = msg;
    }

    public String toString() {
        return "InvalidNameException: " + msg;
    }
}

class Employee {
    String name;

    
    Employee(String name) throws InvalidNameException {
        this.name = name;

      
        if (!name.matches("[a-zA-Z]+")) {
            throw new InvalidNameException("Name is Invalid: " + name);
        } else {
            System.out.println("Employee name is valid: " + name);
        }
    }
}

class demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Employee Name: ");
        String name = sc.nextLine();

       
        try {
           
            new Employee(name);
        } catch (InvalidNameException e) {
           
            System.out.println(e);
        }

    
    }
}
