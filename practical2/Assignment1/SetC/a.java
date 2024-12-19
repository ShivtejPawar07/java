import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.HashMap;

 class Demo {
    private HashMap<String, String> cityMap = new HashMap<>();

    public Demo() {
        // Main JFrame
        JFrame frame = new JFrame("City STD Code Manager");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(5, 1));

        // Input fields and buttons
        JTextField cityField = new JTextField(15);
        JTextField codeField = new JTextField(15);
        JButton addButton = new JButton("Add City");
        JButton removeButton = new JButton("Remove City");
        JButton searchButton = new JButton("Search City");

        // Text area to display messages
        JTextArea displayArea = new JTextArea(5, 30);
        displayArea.setEditable(false);

        // Panel for inputs and buttons
        JPanel inputPanel = new JPanel();
        inputPanel.add(new JLabel("City: "));
        inputPanel.add(cityField);
        inputPanel.add(new JLabel("STD Code: "));
        inputPanel.add(codeField);
        inputPanel.add(addButton);

        JPanel operationPanel = new JPanel();
        operationPanel.add(removeButton);
        operationPanel.add(searchButton);

        frame.add(inputPanel);
        frame.add(operationPanel);
        frame.add(new JScrollPane(displayArea));

        // Add City Button Listener
        addButton.addActionListener(e -> {
            String city = cityField.getText().trim();
            String code = codeField.getText().trim();
            if (city.isEmpty() || code.isEmpty()) {
                displayArea.setText("City name and STD code cannot be empty.");
                return;
            }
            if (cityMap.containsKey(city)) {
                displayArea.setText("City already exists!");
            } else {
                cityMap.put(city, code);
                displayArea.setText("City added: " + city + " -> " + code);
            }
            cityField.setText("");
            codeField.setText("");
        });

        // Remove City Button Listener
        removeButton.addActionListener(e -> {
            String city = cityField.getText().trim();
            if (city.isEmpty()) {
                displayArea.setText("Enter a city name to remove.");
                return;
            }
            if (cityMap.containsKey(city)) {
                cityMap.remove(city);
                displayArea.setText("City removed: " + city);
            } else {
                displayArea.setText("City not found!");
            }
            cityField.setText("");
        });

        // Search City Button Listener
        searchButton.addActionListener(e -> {
            String city = cityField.getText().trim();
            if (city.isEmpty()) {
                displayArea.setText("Enter a city name to search.");
                return;
            }
            String code = cityMap.get(city);
            if (code != null) {
                displayArea.setText("STD Code for " + city + ": " + code);
            } else {
                displayArea.setText("City not found!");
            }
            cityField.setText("");
        });

        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(b::new);
    }
}
