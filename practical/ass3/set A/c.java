// Define the Operation interface
interface Operation 
{
    // Define the methods to be implemented by any class that implements this interface
    double area();
    double volume();

    // Define a constant PI with a value of 3.142
    double PI = 3.142;
}

// Define the Cylinder class that implements the Operation interface
class Cylinder implements Operation 
{
    // Declare the member variables for the Cylinder class
    private double radius;
    private double height;

    // Constructor to initialize the radius and height
    public Cylinder(double radius, double height)
     {
        this.radius = radius;
        this.height = height;
    }

    // Implement the area method from the Operation interface
    @Override
    public double area()
     {
        // Area of the cylinder = 2 * PI * radius * (radius + height)
        return 2 * PI * radius * (radius + height);
    }

    // Implement the volume method from the Operation interface
    @Override
    public double volume() {
        // Volume of the cylinder = PI * radius^2 * height
        return PI * radius * radius * height;
    }
}

// Main class to test the Cylinder class
 class demo {
    public static void main(String[] args) {
        // Create an object of the Cylinder class
        Cylinder cylinder = new Cylinder(5, 10);

        // Calculate and display the area and volume
        System.out.println("Area of the cylinder: " + cylinder.area());
        System.out.println("Volume of the cylinder: " + cylinder.volume());
    }
}

