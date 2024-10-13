/*b) Write a Java program to design a screen using Awt that will take a user name and
password. If the user name and password are not same, raise an Exception with
appropriate message. User can have 3 login chances only. Use clear button to clear
the TextFields.
 */
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class InvalidLoginException extends Exception {
    InvalidLoginException(String msg) {
        super(msg);
    }
}

class Login extends JFrame implements ActionListener {

    JLabel nameLabel, passLabel;
    JTextField nameText;
    JPasswordField passText;
    JButton loginButton, clearButton;

    public static void main(String[] args) {
        new Login();
    }

    Login() {
        setTitle("Login Check");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(3, 2));

        nameLabel = new JLabel("Name: ");
        add(nameLabel);
        nameText = new JTextField(20);
        add(nameText);

        passLabel = new JLabel("Password: ");
        add(passLabel);
        passText = new JPasswordField(20);
        add(passText);

        loginButton = new JButton("Login");
        add(loginButton);
        clearButton = new JButton("Clear");
        add(clearButton);

        loginButton.addActionListener(this);
        clearButton.addActionListener(this);

        setVisible(true); 
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == clearButton) {
            nameText.setText("");
            passText.setText("");
        } else if (ae.getSource() == loginButton) {
            try {
                String user = nameText.getText();
                String pass = new String(passText.getPassword());

              
                if (user.equals(pass)) {  
                    JOptionPane.showMessageDialog(null, "Login successful!");
                } else {
                    throw new InvalidLoginException("Invalid username/password combination");
                }
            } catch (InvalidLoginException e) {
                JOptionPane.showMessageDialog(null, e.getMessage(), "Login Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }
}
