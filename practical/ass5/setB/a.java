/*a) Create the following GUI screen using appropriate layout managers. Accept the name,
class , hobbies of the user and apply the changes and display the selected options in a
text box.
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

 class UserInfoForm extends JFrame implements ActionListener {

    JTextField nameField;
    JTextField hobbiesField;
    JComboBox<String> fontBox;
    JComboBox<Integer> fontSizeBox;
    JCheckBox boldCheck, italicCheck, underlineCheck;
    JRadioButton fyRadio, syRadio, tyRadio;
    ButtonGroup classGroup;
    JButton submitButton, clearButton;
    JTextArea displayArea;

    public UserInfoForm() {
        setTitle("User Info Form");
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        JLabel nameLabel = new JLabel("Your Name:");
        nameLabel.setBounds(30, 30, 100, 25);
        add(nameLabel);

        nameField = new JTextField();
        nameField.setBounds(140, 30, 150, 25);
        add(nameField);

        JLabel hobbiesLabel = new JLabel("Your Hobbies:");
        hobbiesLabel.setBounds(30, 70, 100, 25);
        add(hobbiesLabel);

        hobbiesField = new JTextField();
        hobbiesField.setBounds(140, 70, 150, 25);
        add(hobbiesField);

        JLabel classLabel = new JLabel("Your Class:");
        classLabel.setBounds(30, 110, 100, 25);
        add(classLabel);

        fyRadio = new JRadioButton("FY");
        syRadio = new JRadioButton("SY");
        tyRadio = new JRadioButton("TY");

        fyRadio.setBounds(140, 110, 50, 25);
        syRadio.setBounds(200, 110, 50, 25);
        tyRadio.setBounds(260, 110, 50, 25);

        classGroup = new ButtonGroup();
        classGroup.add(fyRadio);
        classGroup.add(syRadio);
        classGroup.add(tyRadio);

        add(fyRadio);
        add(syRadio);
        add(tyRadio);

        JLabel styleLabel = new JLabel("Style:");
        styleLabel.setBounds(30, 150, 100, 25);
        add(styleLabel);

        boldCheck = new JCheckBox("Bold");
        italicCheck = new JCheckBox("Italic");
        underlineCheck = new JCheckBox("Underline");

        boldCheck.setBounds(140, 150, 70, 25);
        italicCheck.setBounds(220, 150, 70, 25);
        underlineCheck.setBounds(300, 150, 100, 25);

        add(boldCheck);
        add(italicCheck);
        add(underlineCheck);

        JLabel fontLabel = new JLabel("Font:");
        fontLabel.setBounds(30, 190, 100, 25);
        add(fontLabel);

        String[] fonts = {"Arial", "Times New Roman", "Courier New"};
        fontBox = new JComboBox<>(fonts);
        fontBox.setBounds(140, 190, 150, 25);
        add(fontBox);

        JLabel fontSizeLabel = new JLabel("Size:");
        fontSizeLabel.setBounds(30, 230, 100, 25);
        add(fontSizeLabel);

        Integer[] sizes = {8, 10, 12, 14, 16, 18, 20, 24};
        fontSizeBox = new JComboBox<>(sizes);
        fontSizeBox.setBounds(140, 230, 150, 25);
        add(fontSizeBox);

        submitButton = new JButton("Submit");
        submitButton.setBounds(80, 280, 100, 25);
        submitButton.addActionListener(this);
        add(submitButton);

        clearButton = new JButton("Clear");
        clearButton.setBounds(200, 280, 100, 25);
        clearButton.addActionListener(this);
        add(clearButton);

        displayArea = new JTextArea();
        displayArea.setBounds(30, 320, 400, 100);
        displayArea.setEditable(false);
        add(displayArea);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == submitButton) {
            String name = nameField.getText();
            String hobbies = hobbiesField.getText();
            String font = fontBox.getSelectedItem().toString();
            int fontSize = (int) fontSizeBox.getSelectedItem();

            String classSelected = fyRadio.isSelected() ? "FY" : syRadio.isSelected() ? "SY" : "TY";
            StringBuilder style = new StringBuilder();

            if (boldCheck.isSelected()) style.append("Bold ");
            if (italicCheck.isSelected()) style.append("Italic ");
            if (underlineCheck.isSelected()) style.append("Underline ");

            // Display selected information in the text area
            displayArea.setText("Name: " + name + "\nClass: " + classSelected + "\nHobbies: " + hobbies +
                    "\nFont: " + font + "\nSize: " + fontSize + "\nStyle: " + style.toString());
        }

        if (e.getSource() == clearButton) {
            nameField.setText("");
            hobbiesField.setText("");
            classGroup.clearSelection();
            boldCheck.setSelected(false);
            italicCheck.setSelected(false);
            underlineCheck.setSelected(false);
            fontBox.setSelectedIndex(0);
            fontSizeBox.setSelectedIndex(0);
            displayArea.setText("");
        }
    }

    public static void main(String[] args) {
        new UserInfoForm();
    }
}

