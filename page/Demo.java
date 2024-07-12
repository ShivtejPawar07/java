import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import java.awt.Font;

class Demo implements ActionListener {
    JFrame myframe;
    JTextField username;
    JTextField pass;

    public Demo() {
        myframe = new JFrame("Login Page");
        myframe.setVisible(true);
        myframe.setSize(500, 200);
        myframe.getContentPane().setBackground(Color.pink);
        myframe.setLocation(250, 250);
        myframe.setLayout(null);

        // Username label
        JLabel lbl_username = new JLabel("Username");
        myframe.add(lbl_username);
        lbl_username.setBounds(40, 10, 80, 50);
        lbl_username.setFont(new Font("Helvetica", Font.ITALIC, 16));

        // Username text box
        username = new JTextField();
        myframe.add(username);
        username.setBounds(150, 25, 80, 20);

        // Password label
        JLabel lbl_password = new JLabel("Password");
        myframe.add(lbl_password);
        lbl_password.setBounds(40, 50, 80, 50);
        lbl_password.setFont(new Font("Helvetica", Font.ITALIC, 16));

        // Password text box
        pass = new JTextField();
        myframe.add(pass);
        pass.setBounds(150, 67, 80, 20);

        // Login button
        JButton lbl_login = new JButton("Login");
        myframe.add(lbl_login);
        lbl_login.setBounds(40, 100, 80, 20);
        lbl_login.addActionListener(this);

        // Cancel button
        JButton lbl_cancel = new JButton("Cancel");
        myframe.add(lbl_cancel);
        lbl_cancel.setBounds(200, 100, 80, 20);
        lbl_cancel.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                System.out.println("cancel button clicked");
            }
        });
    }

    public void actionPerformed(ActionEvent ae) {
        System.out.println("Login button clicked");
        // Add your login logic here
        // You can access the username and password using the text fields
        // For example:
        String user = username.getText();
        String password = pass.getText();
    }

    public static void main(String[] args) {
        new Demo();
    }
}
