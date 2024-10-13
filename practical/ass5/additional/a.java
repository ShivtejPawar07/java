/*a) Write Java program to design three text boxes and two buttons using swing . Enter
different strings in first and second textbox. On clicking the First command button,
concatenation of two strings should be displayed in third text box and on clicking
second command button , reverse of string should display in third text box.
*/
import java.awt.*;
import java.awt.event.*;
class DemoFrame extends Frame implements ActionListener{
Button btnadd1,btnadd2;
TextField textno1,textno2,textno3;
static public void main(String args[])
{
 DemoFrame df=new DemoFrame();
}
DemoFrame()
{
 setTitle("String program");
setSize(400,300);
setLayout(new GridLayout(4,2));
Label l1=new Label("enter 1st string");
add(l1);
textno1=new TextField(20);
add(textno1);

Label l2=new Label("enter 2nd string");
add(l2);
textno2=new TextField(20);
add(textno2);

Label l3=new Label("string");
add(l3);
textno3=new TextField(20);
add(textno3);

btnadd1=new Button("Concat");
add(btnadd1);
btnadd1.addActionListener(this);
btnadd2=new Button("reverse");
add(btnadd2);
btnadd2.addActionListener(this);
setVisible(true);


}
public void actionPerformed(ActionEvent ae)
{
 if(ae.getSource()==btnadd1)
 {
String s1=textno1.getText();
String s2=textno2.getText();
String s3=s1+s2;
 
textno3.setText(s3+" ");
}
if(ae.getSource()==btnadd2)
 {
StringBuffer sb=new StringBuffer(textno3.getText());
String a=sb.reverse().toString();
textno3.setText(a+" ");
  }

}
}
