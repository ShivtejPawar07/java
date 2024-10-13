import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;

 class NumberOperations extends JFrame implements ActionListener {
    private JTextArea numberArea;
    private ArrayList<Integer> numbers;
    
    public NumberOperations() {
        // Initialize the GUI
        setTitle("Number Operations");
        numbers = new ArrayList<>();
        
        // Create Menu Bar
        JMenuBar menuBar = new JMenuBar();
        
        // Create Menus
        JMenu fileMenu = new JMenu("File");
        JMenu computeMenu = new JMenu("Compute");
        JMenu operationMenu = new JMenu("Operation");
        
        // Create Menu Items for File
        JMenuItem loadItem = new JMenuItem("Load");
        JMenuItem saveItem = new JMenuItem("Save");
        JMenuItem exitItem = new JMenuItem("Exit");
        fileMenu.add(loadItem);
        fileMenu.add(saveItem);
        fileMenu.add(exitItem);
        
        // Add action listeners to file menu items
        loadItem.addActionListener(this);
        saveItem.addActionListener(this);
        exitItem.addActionListener(this);
        
        // Create Menu Items for Compute
        JMenuItem sumItem = new JMenuItem("Sum");
        JMenuItem avgItem = new JMenuItem("Average");
        JMenuItem maxItem = new JMenuItem("Maximum");
        JMenuItem minItem = new JMenuItem("Minimum");
        computeMenu.add(sumItem);
        computeMenu.add(avgItem);
        computeMenu.add(maxItem);
        computeMenu.add(minItem);
        
        // Add action listeners to compute menu items
        sumItem.addActionListener(this);
        avgItem.addActionListener(this);
        maxItem.addActionListener(this);
        minItem.addActionListener(this);
        
        // Create Menu Items for Operation
        JMenuItem searchItem = new JMenuItem("Search");
        JMenuItem sortAscItem = new JMenuItem("Sort ASC");
        JMenuItem sortDescItem = new JMenuItem("Sort DESC");
        operationMenu.add(searchItem);
        operationMenu.add(sortAscItem);
        operationMenu.add(sortDescItem);
        
        // Add action listeners to operation menu items
        searchItem.addActionListener(this);
        sortAscItem.addActionListener(this);
        sortDescItem.addActionListener(this);
        
        // Add menus to the menu bar
        menuBar.add(fileMenu);
        menuBar.add(computeMenu);
        menuBar.add(operationMenu);
        
        // Set the menu bar
        setJMenuBar(menuBar);
        
        // TextArea to display numbers
        numberArea = new JTextArea();
        add(new JScrollPane(numberArea), BorderLayout.CENTER);
        
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();
        
        switch (command) {
            case "Load":
                loadNumbers();
                break;
            case "Save":
                saveNumbers();
                break;
            case "Exit":
                System.exit(0);
                break;
            case "Sum":
                showResult("Sum", getSum());
                break;
            case "Average":
                showResult("Average", getAverage());
                break;
            case "Maximum":
                showResult("Maximum", Collections.max(numbers));
                break;
            case "Minimum":
                showResult("Minimum", Collections.min(numbers));
                break;
            case "Search":
                searchNumber();
                break;
            case "Sort ASC":
                sortNumbers(true);
                break;
            case "Sort DESC":
                sortNumbers(false);
                break;
        }
    }
    
    // Method to load random numbers
    private void loadNumbers() {
        numbers.clear();
        Random rand = new Random();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 50; i++) {
            int num = rand.nextInt(90) + 10; // Generate 2-digit random numbers
            numbers.add(num);
            sb.append(num).append(" ");
        }
        numberArea.setText(sb.toString());
    }
    
    // Method to save numbers to a file
    private void saveNumbers() {
        try (PrintWriter writer = new PrintWriter("numbers.txt")) {
            for (int num : numbers) {
                writer.println(num);
            }
            JOptionPane.showMessageDialog(this, "Numbers saved to numbers.txt");
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(this, "Error saving to file");
        }
    }
    
    // Method to get the sum of numbers
    private int getSum() {
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return sum;
    }
    
    // Method to get the average of numbers
    private double getAverage() {
        if (numbers.isEmpty()) return 0;
        return (double) getSum() / numbers.size();
    }
    
    // Method to show result in a message dialog
    private void showResult(String operation, double result) {
        JOptionPane.showMessageDialog(this, operation + ": " + result);
    }
    
    // Method to search for a number
    private void searchNumber() {
        String input = JOptionPane.showInputDialog("Enter number to search:");
        try {
            int num = Integer.parseInt(input);
            if (numbers.contains(num)) {
                JOptionPane.showMessageDialog(this, "Number " + num + " found!");
            } else {
                JOptionPane.showMessageDialog(this, "Number " + num + " not found!");
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Invalid number");
        }
    }
    
    // Method to sort numbers in ascending or descending order
    private void sortNumbers(boolean ascending) {
        if (ascending) {
            Collections.sort(numbers);
        } else {
            numbers.sort(Collections.reverseOrder());
        }
        StringBuilder sb = new StringBuilder();
        for (int num : numbers) {
            sb.append(num).append(" ");
        }
        numberArea.setText(sb.toString());
    }
    
    public static void main(String[] args) {
        new NumberOperations();
    }
}
