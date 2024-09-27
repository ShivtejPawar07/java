import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Personal implements ActionListener {
    private JButton btnSubmit;
    private JButton btnCancel;
    private JTextField nameField;
    private JTextField ageField;
    private JComboBox<String> departmentComboBox;
    private JFrame myFrame;
    JRadioButton rb;
    ButtonGroup bg;

        JRadioButton rb1;

    public Personal() {
        myFrame = new JFrame("Personal Information");
        myFrame.setVisible(true);
        myFrame.setSize(600, 400);
        myFrame.getContentPane().setBackground(Color.CYAN);
        myFrame.setLocationRelativeTo(null); // Center the frame
        myFrame.setLayout(null);

        Font font = new Font("SansSerif", Font.BOLD, 15);

        JLabel title = new JLabel("Personal Information");
        myFrame.add(title);
        title.setBounds(200, 10, 200, 30);
        title.setFont(font);

        JLabel nameLabel = new JLabel("Name:");
        myFrame.add(nameLabel);
        nameLabel.setBounds(30, 50, 100, 30);

        nameField = new JTextField();
        myFrame.add(nameField);
        nameField.setBounds(130, 50, 200, 30);

        JLabel ageLabel = new JLabel("Age:");
        myFrame.add(ageLabel);
        ageLabel.setBounds(30, 90, 100, 30);

        ageField = new JTextField();
        myFrame.add(ageField);
        ageField.setBounds(130, 90, 200, 30);

        JLabel departmentLabel = new JLabel("Department:");
        myFrame.add(departmentLabel);
        departmentLabel.setBounds(30, 130, 100, 30);

        String[] departments = {"FE", "SE", "TE"};
        departmentComboBox = new JComboBox<>(departments);
        myFrame.add(departmentComboBox);
        departmentComboBox.setBounds(130, 130, 100, 30);

         rb=new JRadioButton("male");

         rb1=new JRadioButton("female");
    bg=new ButtonGroup();
    
        myFrame.add(rb);
        myFrame.add(rb1);
        rb.setBounds(200,300,80,50);
        rb1.setBounds(300,300,100,50);
        rb.setSelected(true);
        bg.add(rb);
        bg.add(rb1);
        // myFrame.add(bg);
        rb.addActionListener(this);
        rb1.addActionListener(this);


        btnSubmit = new JButton("Submit");
        myFrame.add(btnSubmit);
        btnSubmit.setBounds(100, 200, 100, 30);
        btnSubmit.addActionListener(this);

        btnCancel = new JButton("Cancel");
        myFrame.add(btnCancel);
        btnCancel.setBounds(220, 200, 100, 30);
        btnCancel.addActionListener(this);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Personal());
    }

    public void actionPerformed(ActionEvent e)
     { if (e.getSource()==rb)
        {
            System.out.println("male button selected");
            System.out.println(rb.isSelected());
        }
        else 
        {
            System.out.println("female button selected ");
        }
        // if (e.getSource() == btnSubmit) {
        //     String name = nameField.getText();
        //     String age = ageField.getText();
        //     String department = (String) departmentComboBox.getSelectedItem();

        //     if (name.equalsIgnoreCase("shivtej") && age.equals("20") && department.equalsIgnoreCase("TYBCS")) {
        //         JOptionPane.showMessageDialog(null, "Correct Information. Form Submitted");
        //     } else {
        //         JOptionPane.showMessageDialog(null, "Wrong Information");
        //         nameField.setText("");
        //         ageField.setText("");
        //         departmentComboBox.setSelectedIndex(0);
        //     }
//         } else if (e.getSource() == btnCancel) {
//             myFrame.dispose();
// }

}
}
