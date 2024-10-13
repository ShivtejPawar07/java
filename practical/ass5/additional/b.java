import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

 class MouseEventApplet extends Applet implements MouseListener, MouseMotionListener {
    private String message = "Mouse Events will be displayed here.";
    
    @Override
    public void init() {
        // Set the background color
        setBackground(Color.WHITE);
        
        // Register the mouse listeners
        addMouseListener(this);
        addMouseMotionListener(this);
    }

    @Override
    public void paint(Graphics g) {
        // Draw the message in the center of the applet
        g.setColor(Color.BLACK);
        g.drawString(message, getWidth() / 2 - g.getFontMetrics().stringWidth(message) / 2, getHeight() / 2);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        message = "Mouse Clicked at (" + e.getX() + ", " + e.getY() + ")";
        repaint();
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        message = "Mouse Moved at (" + e.getX() + ", " + e.getY() + ")";
        repaint();
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        message = "Mouse Dragged at (" + e.getX() + ", " + e.getY() + ")";
        repaint();
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        // Optional: You can handle mouse entering the applet area if needed
    }

    @Override
    public void mouseExited(MouseEvent e) {
        // Optional: You can handle mouse exiting the applet area if needed
    }

    @Override
    public void mousePressed(MouseEvent e) {
        // Optional: Handle mouse pressed if needed
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        // Optional: Handle mouse released if needed
    }

    // @Override
    // public void mouseClicked(MouseEvent e) {
    //     // Optional: Handle mouse clicked if needed
    // }
}

