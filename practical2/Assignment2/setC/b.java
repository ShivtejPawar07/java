import javax.swing.*;
import java.awt.*;

 class MovingBall extends JPanel implements Runnable {
    private int y = 50;  // Initial Y position

    public MovingBall() {
        setPreferredSize(new Dimension(400, 300));
        JButton startButton = new JButton("Start");
        startButton.addActionListener(e -> new Thread(this).start());

        JFrame frame = new JFrame("Moving Ball");
        frame.add(this, BorderLayout.CENTER);
        frame.add(startButton, BorderLayout.SOUTH);
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.RED);
        g.fillOval(180, y, 30, 30);
    }

    @Override
    public void run() {
        while (y < getHeight()) {
            y += 5;
            SwingUtilities.invokeLater(this::repaint);
            try {
                Thread.sleep(50);
            } catch (InterruptedException ignored) {}
        }
        y = 50; // Reset ball position after reaching bottom
    }

    public static void main(String[] args) {
        new MovingBall();
}
}