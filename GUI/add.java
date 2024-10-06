import java.awt.*;  
import java.awt.event.*;  // For ActionListener and ActionEvent

class DemoFrame extends Frame implements ActionListener {
    Button btnadd, btnclear;
    TextField text1, text2, textadd;

    public static void main(String[] args) {
        DemoFrame df = new DemoFrame();
    }

    DemoFrame() {
        setTitle("Demo Frame Program");
        setSize(400, 400);
        setLayout(new GridLayout(4, 2));  // Adjust layout to accommodate extra button

        // Adding components
        Label l1 = new Label("Enter 1st no=");
        add(l1);
        text1 = new TextField(20);
        add(text1);

        Label l2 = new Label("Enter 2nd no=");
        add(l2);
        text2 = new TextField(20);
        add(text2);

        btnadd = new Button("ADD");
        add(btnadd);
        btnadd.addActionListener(this);  // Adding action listener to the ADD button

        textadd = new TextField(20);  // For result
        textadd.setEditable(false);   // Make result text field read-only
        add(textadd);

        btnclear = new Button("CLEAR");  // Adding a clear button
        add(btnclear);
        btnclear.addActionListener(this);  // Adding action listener to the CLEAR button

        setVisible(true);  // Make the frame visible
    }

    // Implementing the action listener
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == btnadd) {  // Handling the ADD button
            try {
                // Retrieving numbers from the text fields and performing addition
                int a = Integer.parseInt(text1.getText());
                int b = Integer.parseInt(text2.getText());
                int c = a + b;
                textadd.setText(String.valueOf(c));  // Displaying the result
            } catch (NumberFormatException e) {
                textadd.setText("Invalid input");  // Handle invalid number inputs
            }
        } else if (ae.getSource() == btnclear) {  // Handling the CLEAR button
            text1.setText("");  // Clearing text1
            text2.setText("");  // Clearing text2
            textadd.setText("");  // Clearing result field
        }
    }
}
