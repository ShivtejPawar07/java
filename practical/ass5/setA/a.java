/*a) Write a java program that works as a simple calculator. Use a grid layout to arrange
buttons for the digits and for the +, -, *, % operations. Add a text field to display the
result */
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class SimpleCalculator extends JFrame implements ActionListener {
    // Create components
    private JTextField display;
    private JPanel panel;
    private String operator;
    private double num1, num2, result;

    // Constructor
    public SimpleCalculator() {
        setTitle("Simple Calculator");
        setSize(400, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create the display field
        display = new JTextField();
        display.setEditable(false);
        display.setFont(new Font("Arial", Font.BOLD, 24));
        display.setHorizontalAlignment(SwingConstants.RIGHT);
        add(display, BorderLayout.NORTH);

        // Create the panel and set grid layout (4x4)
        panel = new JPanel();
        panel.setLayout(new GridLayout(4, 4, 10, 10));

        // Add buttons for digits and operators
        String[] buttons = {
            "7", "8", "9", "+",
            "4", "5", "6", "-",
            "1", "2", "3", "*",
            "C", "0", "=", "%"
        };

        // Add buttons to the panel
        for (String text : buttons) {
            JButton button = new JButton(text);
            button.setFont(new Font("Arial", Font.BOLD, 24));
            button.addActionListener(this);
            panel.add(button);
        }

        // Add the panel to the frame
        add(panel, BorderLayout.CENTER);

        setVisible(true);
    }

    // Action performed method
    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();

        // If clear button is pressed
        if (command.equals("C")) {
            display.setText("");
            num1 = num2 = result = 0;
            operator = "";
        }
        // If number button is pressed
        else if (command.matches("[0-9]")) {
            display.setText(display.getText() + command);
        }
        // If operator button is pressed
        else if (command.matches("[+\\-*/%]")) {
            operator = command;
            num1 = Double.parseDouble(display.getText());
            display.setText("");
        }
        // If equals button is pressed
        else if (command.equals("=")) {
            num2 = Double.parseDouble(display.getText());

            // Perform the operation based on the operator
            switch (operator) {
                case "+":
                    result = num1 + num2;
                    break;
                case "-":
                    result = num1 - num2;
                    break;
                case "*":
                    result = num1 * num2;
                    break;
                case "%":
                    result = num1 % num2;
                    break;
            }
            display.setText(String.valueOf(result));
        }
    }

    // Main method
    public static void main(String[] args) {
        new SimpleCalculator();
    }
}
