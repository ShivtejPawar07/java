/*a) Write a java program to create the following GUI for user registration form */
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

 class CoWINRegistrationForm extends JFrame implements ActionListener {

    JTextField adharField, yearField, mobileField;
    JRadioButton age18Above, age45Above;
    JComboBox<String> hospitalBox;
    JCheckBox covishield, covaxin, sputnikV;
    JRadioButton morningSlot, afternoonSlot, eveningSlot;
    ButtonGroup ageGroup, timeSlotGroup;
    JButton submitButton;
    JLabel messageLabel;

    public CoWINRegistrationForm() {
        // Frame setup
        setTitle("Co-WIN Registration");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        // AdharCard No.
        JLabel adharLabel = new JLabel("AdharCard No.:");
        adharLabel.setBounds(30, 30, 120, 25);
        add(adharLabel);
        adharField = new JTextField();
        adharField.setBounds(150, 30, 150, 25);
        add(adharField);

        // Birth Year
        JLabel yearLabel = new JLabel("Birth Year:");
        yearLabel.setBounds(30, 70, 120, 25);
        add(yearLabel);
        yearField = new JTextField();
        yearField.setBounds(150, 70, 150, 25);
        add(yearField);

        // Mobile No.
        JLabel mobileLabel = new JLabel("Mobile No.:");
        mobileLabel.setBounds(30, 110, 120, 25);
        add(mobileLabel);
        mobileField = new JTextField();
        mobileField.setBounds(150, 110, 150, 25);
        add(mobileField);

        // Age Group
        JLabel ageLabel = new JLabel("Age Group:");
        ageLabel.setBounds(30, 150, 120, 25);
        add(ageLabel);
        age18Above = new JRadioButton("18 & above");
        age18Above.setBounds(150, 150, 100, 25);
        age45Above = new JRadioButton("45 & above");
        age45Above.setBounds(250, 150, 100, 25);

        ageGroup = new ButtonGroup();
        ageGroup.add(age18Above);
        ageGroup.add(age45Above);
        add(age18Above);
        add(age45Above);

        // Select Hospital
        JLabel hospitalLabel = new JLabel("Select Hospital:");
        hospitalLabel.setBounds(30, 190, 120, 25);
        add(hospitalLabel);
        String[] hospitals = {"Apollo", "Fortis", "AIIMS", "Max"};
        hospitalBox = new JComboBox<>(hospitals);
        hospitalBox.setBounds(150, 190, 150, 25);
        add(hospitalBox);

        // Vaccines
        JLabel vaccineLabel = new JLabel("Vaccines:");
        vaccineLabel.setBounds(30, 230, 120, 25);
        add(vaccineLabel);
        covishield = new JCheckBox("Covishield");
        covishield.setBounds(150, 230, 100, 25);
        covaxin = new JCheckBox("Covaxin");
        covaxin.setBounds(250, 230, 100, 25);
        sputnikV = new JCheckBox("Sputnik V");
        sputnikV.setBounds(150, 260, 100, 25);
        add(covishield);
        add(covaxin);
        add(sputnikV);

        // Time Slot
        JLabel timeSlotLabel = new JLabel("Time Slot:");
        timeSlotLabel.setBounds(30, 300, 120, 25);
        add(timeSlotLabel);
        morningSlot = new JRadioButton("Morning");
        morningSlot.setBounds(150, 300, 100, 25);
        afternoonSlot = new JRadioButton("Afternoon");
        afternoonSlot.setBounds(250, 300, 100, 25);
        eveningSlot = new JRadioButton("Evening");
        eveningSlot.setBounds(150, 330, 100, 25);

        timeSlotGroup = new ButtonGroup();
        timeSlotGroup.add(morningSlot);
        timeSlotGroup.add(afternoonSlot);
        timeSlotGroup.add(eveningSlot);
        add(morningSlot);
        add(afternoonSlot);
        add(eveningSlot);

        // Submit Button
        submitButton = new JButton("Submit");
        submitButton.setBounds(150, 370, 100, 25);
        submitButton.addActionListener(this);
        add(submitButton);

        // Message Label
        messageLabel = new JLabel();
        messageLabel.setBounds(30, 400, 300, 25);
        add(messageLabel);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // Form validation
        if (adharField.getText().isEmpty() || yearField.getText().isEmpty() || mobileField.getText().isEmpty() ||
                (!age18Above.isSelected() && !age45Above.isSelected()) || hospitalBox.getSelectedItem() == null ||
                (!covishield.isSelected() && !covaxin.isSelected() && !sputnikV.isSelected()) ||
                (!morningSlot.isSelected() && !afternoonSlot.isSelected() && !eveningSlot.isSelected())) {
            messageLabel.setText("Registration Failed!");
            messageLabel.setForeground(Color.RED);
        } else {
            messageLabel.setText("Registration Successful!");
            messageLabel.setForeground(Color.GREEN);
        }
    }

    public static void main(String[] args) {
        new CoWINRegistrationForm();
    }
}
