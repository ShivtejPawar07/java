import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

 class MenuExample extends JFrame implements ActionListener {

    JMenu fileMenu, saveAsMenu;
    JMenuItem newItem, openItem, saveItem, saveAsPptItem, saveAsDocItem, saveAsPdfItem;
    JMenuBar menuBar;

    public MenuExample() {
        // Create a menu bar
        menuBar = new JMenuBar();

        // Create a "File" menu
        fileMenu = new JMenu("File");

        // Create "New", "Open", and "Save" menu items
        newItem = new JMenuItem("New");
        openItem = new JMenuItem("Open");
        saveItem = new JMenuItem("Save");

        // Add the menu items to the "File" menu
        fileMenu.add(newItem);
        fileMenu.add(openItem);
        fileMenu.add(saveItem);

        // Create "Save As" submenu
        saveAsMenu = new JMenu("Save As");
        saveAsPptItem = new JMenuItem(".ppt");
        saveAsDocItem = new JMenuItem(".doc");
        saveAsPdfItem = new JMenuItem(".pdf");

        // Add items to the "Save As" submenu
        saveAsMenu.add(saveAsPptItem);
        saveAsMenu.add(saveAsDocItem);
        saveAsMenu.add(saveAsPdfItem);

        // Add the "Save As" submenu to the "File" menu
        fileMenu.add(saveAsMenu);

        // Add "File" menu to the menu bar
        menuBar.add(fileMenu);

        // Add the menu bar to the frame
        setJMenuBar(menuBar);

        // Register action listeners for menu items
        newItem.addActionListener(this);
        openItem.addActionListener(this);
        saveItem.addActionListener(this);
        saveAsPptItem.addActionListener(this);
        saveAsDocItem.addActionListener(this);
        saveAsPdfItem.addActionListener(this);

        // Frame settings
        setTitle("Menu Example");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == newItem) {
            JOptionPane.showMessageDialog(this, "New File created");
        } else if (e.getSource() == openItem) {
            JOptionPane.showMessageDialog(this, "File Opened");
        } else if (e.getSource() == saveItem) {
            JOptionPane.showMessageDialog(this, "File Saved");
        } else if (e.getSource() == saveAsPptItem) {
            JOptionPane.showMessageDialog(this, "File Saved as .ppt");
        } else if (e.getSource() == saveAsDocItem) {
            JOptionPane.showMessageDialog(this, "File Saved as .doc");
        } else if (e.getSource() == saveAsPdfItem) {
            JOptionPane.showMessageDialog(this, "File Saved as .pdf");
        }
    }

    public static void main(String[] args) {
        new MenuExample();
    }
}


