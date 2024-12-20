import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.HashMap;

class Demo extends JFrame implements ActionListener {
    
    JLabel l1;
    JTextField t1, t2, t3;
    JButton b1, b2, b3;
    JTextArea area;
    HashMap<String, String> cityCodes;

    public static void main(String[] args) {
        new Demo();
    }

    // Constructor for setting up the frame
    Demo() {
        cityCodes = new HashMap<>();

        // Set up frame
        setTitle("City STD Code Manager");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new JPanel(new GridLayout(5, 2, 10, 10));
       

        panel.add(new JLabel("City Name:"));
        t1 = new JTextField();
        panel.add(t1);

        panel.add(new JLabel("STD Code:"));
        t2 = new JTextField();
        panel.add(t2);

        b1 = new JButton("Add City");
        panel.add(b1);

        b2 = new JButton("Remove City");
        panel.add(b2);

        panel.add(new JLabel("Search City:"));
        t3 = new JTextField();
        panel.add(t3);

        b3 = new JButton("Search");
        panel.add(b3);

        area = new JTextArea(6, 30);
        area.setEditable(false);

        add(panel, BorderLayout.NORTH);
        add(new JScrollPane(area), BorderLayout.CENTER);

        // Button listeners
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);

        // Display frame
        setVisible(true);
    }

    // Action performed for button clicks
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b1) {
            addCity();
        } else if (e.getSource() == b2) {
            removeCity();
        } else if (e.getSource() == b3) {
            searchCity();
        }
    }

    // Method to add city and STD code
    private void addCity() {
        String city = t1.getText().trim();
        String code = t2.getText().trim();

        if (!city.isEmpty() && !code.isEmpty()) {
            if (!cityCodes.containsKey(city)) {
                cityCodes.put(city, code);
                area.append("Added: " + city + " -> " + code + "\n");
            } else {
                area.append("City already exists.\n");
            }
        } else {
            area.append("City name and code cannot be empty.\n");
        }

        t1.setText("");
        t2.setText("");
    }

    // Method to remove city
    private void removeCity() {
        String city = t1.getText().trim();

        if (!city.isEmpty()) {
            if (cityCodes.containsKey(city)) {
                cityCodes.remove(city);
                area.append("Removed: " + city + "\n");
            } else {
                area.append("City not found.\n");
            }
        } else {
            area.append("Please enter a city name to remove.\n");
        }

        t1.setText("");
    }

    // Method to search and display city
    private void searchCity() {
        String city = t3.getText().trim();

        if (!city.isEmpty()) {
            if (cityCodes.containsKey(city)) {
                area.append("Found: " + city + " -> " + cityCodes.get(city) + "\n");
            } else {
                area.append("City not found.\n");
            }
        } else {
            area.append("Please enter a city name to search.\n");
        }

        t3.setText("");
    }
}
