import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Demo extends JFrame implements ActionListener, Runnable {
    private JRadioButton red, yellow, green;
    private JLabel message;
    private ButtonGroup group;

    public Demo() {
        setTitle("Traffic Light Simulation");
        setSize(400, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        // Creating radio buttons
        red = new JRadioButton("Red");
        yellow = new JRadioButton("Yellow");
        green = new JRadioButton("Green");

        // Grouping buttons
        group = new ButtonGroup();
        group.add(red);
        group.add(yellow);
        group.add(green);

        // Label to display message
        message = new JLabel("Select a traffic light");
        message.setFont(new Font("Arial", Font.BOLD, 16));

        // Adding Action Listeners
        red.addActionListener(this);
        yellow.addActionListener(this);
        green.addActionListener(this);

        // Adding components to frame
        add(red);
        add(yellow);
        add(green);
        add(message);

        setVisible(true);

        // Start the automatic traffic light change in a separate thread
        Thread t = new Thread(this);
        t.start();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        updateLight();
    }

    private void updateLight() {
        if (red.isSelected()) {
            message.setText("Stop");
            message.setForeground(Color.RED);
        } else if (yellow.isSelected()) {
            message.setText("Ready");
            message.setForeground(Color.ORANGE);
        } else if (green.isSelected()) {
            message.setText("Go");
            message.setForeground(Color.GREEN);
        }
    }

    @Override
    public void run() {
        try {
            while (true) {
                red.setSelected(true);
                updateLight();
                Thread.sleep(2000);

                yellow.setSelected(true);
                updateLight();
                Thread.sleep(2000);

                green.setSelected(true);
                updateLight();
                Thread.sleep(2000);
            }
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted!");
        }
    }

    public static void main(String[] args) {
        new b();
  }
}