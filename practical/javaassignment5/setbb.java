import java.awt.*;
import java.awt.event.*;

 class LoginFormAWT extends Frame implements ActionListener {
    Label nameLabel, passwordLabel, messageLabel;
    TextField nameField, passwordField;
    Button loginButton, clearButton;
    int attempts = 0;

    public LoginFormAWT() {
        // Frame layout settings
        setTitle("Login Form");
        setSize(400, 300);
        setLayout(null);
        setVisible(true);

        // Labels
        nameLabel = new Label("Username:");
        nameLabel.setBounds(50, 70, 80, 30);
        add(nameLabel);

        passwordLabel = new Label("Password:");
        passwordLabel.setBounds(50, 120, 80, 30);
        add(passwordLabel);

        messageLabel = new Label();
        messageLabel.setBounds(50, 200, 300, 30);
        add(messageLabel);

        // Text fields
        nameField = new TextField();
        nameField.setBounds(150, 70, 150, 30);
        add(nameField);

        passwordField = new TextField();
        passwordField.setBounds(150, 120, 150, 30);
        passwordField.setEchoChar('*'); // Mask the password input
        add(passwordField);

        // Buttons
        loginButton = new Button("Login");
        loginButton.setBounds(100, 170, 80, 30);
        loginButton.addActionListener(this);
        add(loginButton);

        clearButton = new Button("Clear");
        clearButton.setBounds(200, 170, 80, 30);
        clearButton.addActionListener(this);
        add(clearButton);

        // Window close event handler
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == loginButton) {
            String username = nameField.getText();
            String password = passwordField.getText();
            
            // Sample correct username and password (can be replaced with actual logic)
            String correctUsername = "admin";
            String correctPassword = "1234";

            if (username.equals(correctUsername) && password.equals(correctPassword)) {
                messageLabel.setText("Login successful!");
                messageLabel.setForeground(Color.GREEN);
            } else {
                attempts++;
                if (attempts >= 3) {
                    messageLabel.setText("Login failed! No more attempts.");
                    messageLabel.setForeground(Color.RED);
                    loginButton.setEnabled(false); // Disable login button after 3 attempts
                } else {
                    messageLabel.setText("Invalid credentials! Attempts left: " + (3 - attempts));
                    messageLabel.setForeground(Color.RED);
                }
            }
        }

        if (e.getSource() == clearButton) {
            nameField.setText("");
            passwordField.setText("");
            messageLabel.setText("");
        }
    }

    public static void main(String[] args) {
        new LoginFormAWT();
    }
}

