

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JOptionPane;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LogIn implements ActionListener {

    private JButton button = null;
    private JTextField field1 = null;
    private JTextField field2 = null;
    private JFrame myframe = null;

    LogIn() {
        myframe = new JFrame("LogIn Frame");
        myframe.setVisible(true);
        myframe.setSize(1000, 500);
        // myframe.setTitle("LogIn Frame");
        myframe.getContentPane().setBackground(Color.pink); // function chaining.
        myframe.setLocation(150, 150);
        myframe.setLayout(null);

        JLabel label_user3 = new JLabel("LOG IN PAGE ");
        myframe.add(label_user3);
        label_user3.setBounds(400, 10, 150, 20);

        JLabel label_user = new JLabel("Username : ");
        myframe.add(label_user);
        label_user.setBounds(30, 30, 130, 90);

        field1 = new JTextField();
        myframe.add(field1);
        field1.setBounds(140, 60, 100, 40);

        JLabel label_user2 = new JLabel("Password : ");
        myframe.add(label_user2);
        label_user2.setBounds(30, 90, 130, 90);

        field2 = new JTextField();
        myframe.add(field2);
        field2.setBounds(140, 120, 100, 40);

        button = new JButton("Submit");
        myframe.add(button);
        button.setBounds(90, 200, 75, 30);

        JButton button_can = new JButton("Cancel");
        myframe.add(button_can);
        button_can.setBounds(200, 200, 75, 30);

        Font newfont = new Font("SansSerif", Font.BOLD, 20);
        label_user.setFont(newfont);
        label_user2.setFont(newfont);
        label_user3.setFont(newfont);

        Font newfont2 = new Font("SansSerif", Font.BOLD, 10);
        button.setFont(newfont2);
        button_can.setFont(newfont2);

        // Set the current instance as the action listener
        button.addActionListener(this);
        button_can.addActionListener(this);
    }

    public static void main(String[] args) {
        LogIn login = new LogIn();
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getActionCommand().equals("Submit")) {
            String username = field1.getText();
            String password = field2.getText();
            if (username.equalsIgnoreCase("Shivtej") && password.equals("7757949545")) {
                // System.out.println("Log in Button clicked. Access granted.");
                JOptionPane.showMessageDialog(null, "LogIn Success");
                // current frame therefore null is first parameter
                myframe.setVisible(false);
                Personal.main(null);

            } else {
                JOptionPane.showMessageDialog(null, "LogIn Failed");
                field1.setText("");
                field2.setText("");
            }
        } else {
            myframe.dispose();
        }
    }
}

