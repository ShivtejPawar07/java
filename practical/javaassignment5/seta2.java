import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class MouseEventHandler extends JFrame implements MouseMotionListener, MouseListener {

    JTextField textField;

    public MouseEventHandler() {
        setTitle("Mouse Event Handler");
        setSize(400, 300);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create the TextField to display mouse click position
        textField = new JTextField();
        textField.setBounds(50, 200, 300, 30);
        textField.setEditable(false);
        add(textField);

        // Add MouseMotionListener and MouseListener to the frame
        addMouseMotionListener(this);
        addMouseListener(this);

        setVisible(true);
    }

    // Handle mouse moved event
    @Override
    public void mouseMoved(MouseEvent e) {
        textField.setText("Mouse Moved to: X=" + e.getX() + ", Y=" + e.getY());
    }

    // Handle mouse clicked event
    @Override
    public void mouseClicked(MouseEvent e) {
        textField.setText("Mouse Clicked at: X=" + e.getX() + ", Y=" + e.getY());
    }

    // Other MouseListener and MouseMotionListener methods (not used in this case)
    @Override
    public void mousePressed(MouseEvent e) {}

    @Override
    public void mouseReleased(MouseEvent e) {}

    @Override
    public void mouseEntered(MouseEvent e) {}

    @Override
    public void mouseExited(MouseEvent e) {}

    @Override
    public void mouseDragged(MouseEvent e) {}

    public static void main(String[] args) {
        new MouseEventHandler();
    }
}
