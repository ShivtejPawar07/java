/*addition of two numbers */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class DemoFrame extends JFrame implements ActionListener {
    JButton btnAdd, btnClear;
    JTextField textNo1, textNo2, textAdd;

     static public void main(String[] args) {
        DemoFrame df = new DemoFrame();
    }

    DemoFrame() {
        setTitle("Addition of Two Numbers");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(4, 2));

        JLabel l1 = new JLabel("Enter No1:");
        add(l1);
        textNo1 = new JTextField(20);
        add(textNo1);

        JLabel l2 = new JLabel("Enter No2:");
        add(l2);
        textNo2 = new JTextField(20);
        add(textNo2);

        btnAdd = new JButton("ADD");
        add(btnAdd);
        btnAdd.addActionListener(this);

        textAdd = new JTextField(20);
        textAdd.setEditable(false);
        add(textAdd);

        btnClear = new JButton("CLEAR");
        add(btnClear);
        btnClear.addActionListener(this);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == btnAdd) {
           
                int a = Integer.parseInt(textNo1.getText());
                int b = Integer.parseInt(textNo2.getText());
                int c = a + b;
                textAdd.setText(String.valueOf(c));
           
        } else if (ae.getSource() == btnClear) {
            textNo1.setText("");
            textNo2.setText("");
            textAdd.setText("");
        }
    }
}
