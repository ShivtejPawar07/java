/*b) Design a screen to handle the Mouse Events such as MOUSE_MOVED and
MOUSE_CLICK and display the position of the Mouse_Click in a TextField. */
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
class DemoFrame1 extends JFrame implements MouseListener{
 JTextField textno1;
 static public void main(String args[])
{
   DemoFrame1 df=new DemoFrame1();
}
DemoFrame1()
{
  setTitle("Mouse Event program..!");
  setSize(400,300);
  setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  setLayout(new GridLayout(4,2));
  
  textno1=new JTextField(20);
  add(textno1);
  addMouseListener(this);
  setVisible(true);
  
}
public void mouseClicked(MouseEvent me)
{
textno1.setText("Mouse clicked"+me.getX()+""+me.getY());

}
public void mouseExited(MouseEvent me)
{
textno1.setBackground(Color.red);
}
public void mousePressed(MouseEvent me){}
public void mouseReleased(MouseEvent me){}
public void mouseEntered(MouseEvent me){
textno1.setBackground(Color.green);
}
}
