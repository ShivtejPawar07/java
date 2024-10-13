import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

class RegistrationForm extends JFrame implements ActionListener {
    // GUI Components
    JTextField nameField, captchaField, sumField;
    JPasswordField passwordField, confirmPasswordField;
    JLabel captchaLabel;
    JButton submitButton;

    // Random numbers for captcha
    int captcha1, captcha2;

    RegistrationForm() {
        setTitle("User Registration");

        // Labels and TextFields for Name
        JLabel nameLabel = new JLabel("Name: ");
        nameField = new JTextField(15);

        // Password Fields
        JLabel passwordLabel = new JLabel("Password: ");
        passwordField = new JPasswordField(15);
        
        JLabel confirmPasswordLabel = new JLabel("Confirm Password: ");
        confirmPasswordField = new JPasswordField(15);

        // Captcha fields
        JLabel captchaTextLabel = new JLabel("Captcha: ");
        captchaField = new JTextField(5);
        sumField = new JTextField(5);
        sumField.setEditable(false);

        captchaLabel = new JLabel();
        generateCaptcha(); // Generate random captcha values

        // Submit Button
        submitButton = new JButton("Submit");
        submitButton.addActionListener(this);

        // Layout
        setLayout(new GridLayout(6, 2));

        add(nameLabel);
        add(nameField);
        add(passwordLabel);
        add(passwordField);
        add(confirmPasswordLabel);
        add(confirmPasswordField);
        add(captchaTextLabel);
        add(captchaField);
        add(captchaLabel);
        add(sumField);
        add(submitButton);

        setSize(300, 200);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    // Method to generate random captcha values
    private void generateCaptcha() {
        Random rand = new Random();
        captcha1 = rand.nextInt(90) + 10; // Generate random 2-digit numbers
        captcha2 = rand.nextInt(90) + 10;
        captchaLabel.setText(captcha1 + " + " + captcha2 + " = ");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String name = nameField.getText();
        String password = new String(passwordField.getPassword());
        String confirmPassword = new String(confirmPasswordField.getPassword());
        String captchaInput = captchaField.getText();

        // Validation for password length and character requirements
        if (password.length() < 6 || !password.matches(".*[A-Z].*") ||
            !password.matches(".*[0-9].*") || !password.matches(".*[!@#$%^&*()].*")) {
            JOptionPane.showMessageDialog(this, "Password must be at least 6 characters long, contain at least one uppercase letter, one digit, and one symbol.");
            return;
        }

        // Check if passwords match
        if (!password.equals(confirmPassword)) {
            JOptionPane.showMessageDialog(this, "Passwords do not match.");
            return;
        }

        // Captcha validation
        int captchaSum = captcha1 + captcha2;
        try {
            int userCaptcha = Integer.parseInt(captchaInput);
            if (userCaptcha != captchaSum) {
                JOptionPane.showMessageDialog(this, "Incorrect Captcha.");
                return;
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Please enter a valid number for the captcha.");
            return;
        }

        // If all conditions are met
        JOptionPane.showMessageDialog(this, "Registration Successful!");
    }

    public static void main(String[] args) {
        new RegistrationForm();
    }
}
