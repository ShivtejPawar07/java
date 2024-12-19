import java.util.TreeSet;

 class Demo {
    public static void main(String[] args) {
        // Create a TreeSet to store color names
        TreeSet<String> colorSet = new TreeSet<>();

        // Add colors to the TreeSet
        colorSet.add("Red");
        colorSet.add("Blue");
        colorSet.add("Green");
        colorSet.add("Yellow");
        colorSet.add("White");
        colorSet.add("Black");

        // Print out the TreeSet
        System.out.println("Colors in the TreeSet (sorted order):");
        for (String color : colorSet) {
            System.out.println(color);
        }
    }
}

