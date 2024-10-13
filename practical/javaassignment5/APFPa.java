import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
 class StringOperations extends JFrame implements ActionListener {

    JTextField textField1, textField2, textField3;
    JButton concatenateButton, reverseButton;

    public StringOperations() {
        // Frame setup
        setTitle("String Operations");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        // Text field for input 1
        JLabel label1 = new JLabel("String 1:");
        label1.setBounds(50, 30, 100, 25);
        add(label1);
        textField1 = new JTextField();
        textField1.setBounds(150, 30, 150, 25);
        add(textField1);

        // Text field for input 2
        JLabel label2 = new JLabel("String 2:");
        label2.setBounds(50, 70, 100, 25);
        add(label2);
        textField2 = new JTextField();
        textField2.setBounds(150, 70, 150, 25);
        add(textField2);

        // Text field for the result (concatenated or reversed)
        JLabel label3 = new JLabel("Result:");
        label3.setBounds(50, 110, 100, 25);
        add(label3);
        textField3 = new JTextField();
        textField3.setBounds(150, 110, 150, 25);
        textField3.setEditable(false);  // Make the result field non-editable
        add(textField3);

        // Button for concatenation
        concatenateButton = new JButton("Concatenate");
        concatenateButton.setBounds(50, 160, 120, 30);
        concatenateButton.addActionListener(this);
        add(concatenateButton);

        // Button for reversing the concatenated string
        reverseButton = new JButton("Reverse");
        reverseButton.setBounds(180, 160, 120, 30);
        reverseButton.addActionListener(this);
        add(reverseButton);

        // Set the frame to be visible
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String str1 = textField1.getText();
        String str2 = textField2.getText();
        String concatenatedString = str1 + str2;

        if (e.getSource() == concatenateButton) {
            // Concatenate the two strings and display in the third text field
            textField3.setText(concatenatedString);
        } else if (e.getSource() == reverseButton) {
            // Reverse the concatenated string and display in the third text field
            String reversedString = new StringBuilder(concatenatedString).reverse().toString();
            textField3.setText(reversedString);
        }
    }

    public static void main(String[] args) {
        new StringOperations();
    }
}

