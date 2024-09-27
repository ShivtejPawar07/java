import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ChatInputBar extends JFrame {
    
    public ChatInputBar() {
        setTitle("Chat Input Bar");
        setSize(500, 100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Creating a panel for the bottom chat input bar
        JPanel chatPanel = new JPanel(new BorderLayout());
        chatPanel.setBackground(new Color(50, 50, 50)); // dark background
        
        // Creating a text field for message input
        JTextField messageField = new JTextField();
        messageField.setForeground(Color.LIGHT_GRAY);
        messageField.setBackground(new Color(30, 30, 30));
        messageField.setCaretColor(Color.GREEN);
        messageField.setFont(new Font("Arial", Font.PLAIN, 16));
        
        // Icons on the right side
        JPanel iconsPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT, 10, 0));
        iconsPanel.setBackground(new Color(50, 50, 50)); // dark background
        
        // Creating and adding icons to the panel
        JLabel emojiIcon = new JLabel(new ImageIcon("emoji.png"));
        JLabel attachmentIcon = new JLabel(new ImageIcon("attachment.png"));
        JLabel paymentIcon = new JLabel(new ImageIcon("payment.png"));
        JLabel cameraIcon = new JLabel(new ImageIcon("camera.png"));
        JButton micButton = new JButton(new ImageIcon("mic.png"));
        micButton.setBackground(new Color(50, 50, 50));
        
        // Add icons to the icons panel
        iconsPanel.add(emojiIcon);
        iconsPanel.add(attachmentIcon);
        iconsPanel.add(paymentIcon);
        iconsPanel.add(cameraIcon);
        iconsPanel.add(micButton);
        
        // Add components to the chat panel
        chatPanel.add(messageField, BorderLayout.CENTER);
        chatPanel.add(iconsPanel, BorderLayout.EAST);
        
        // Add chat panel to the frame
        add(chatPanel, BorderLayout.SOUTH);
        
        setVisible(true);
    }
    
    public static void main(String[] args) {
        // Set the look and feel to the system's default
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        new ChatInputBar();
    }
}
