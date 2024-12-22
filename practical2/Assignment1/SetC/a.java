import java.awt.event.*;
import javax.swing.*;
import java.util.*;
import java.awt.*;

class Demo extends JFrame implements ActionListener 
{
   JLabel lbl1,lbl2;
   JTextField txt1,txt2;
   JButton btn1,btn2,btn3;
   JTextArea area;
   HashMap <String,String> hs=new HashMap<>();
  Demo()
  {
    setSize(400,200);
    setLayout(new FlowLayout());
    setTitle("GUI");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    lbl1=new JLabel("enter city");
    add(lbl1);
    txt1=new JTextField(10);
    add(txt1);
    
    lbl2=new JLabel("enter STD");
    add(lbl2);
    txt2=new JTextField(10);
    add(txt2);
    
    btn1=new JButton("addCity");
     btn2=new JButton("removeCity");
      btn3=new JButton("searchCity");
      
      add(btn1);
      add(btn2);
      add(btn3);
      
      btn1.addActionListener(this);
      btn2.addActionListener(this);
      btn3.addActionListener(this);
      
      area=new JTextArea(10,40);
      
      add(area);
    
    
    
    
    setVisible(true);
  
  }

 public void actionPerformed(ActionEvent ae)
 { if(ae.getSource()==btn1)
     {
      addcity();
     }
   else if(ae.getSource()==btn2){
      removecity();
   }
   else if(ae.getSource()==btn3)
   {
      search();
   }
     
 
 }
 
 void addcity()
 {
 String city=txt1.getText();
 String code=txt2.getText();
   if(!city.isEmpty() && !code.isEmpty())
   {
     if(!hs.containsKey(city))
     {
        hs.put(city,code);
        JOptionPane.showMessageDialog(this,city+"-"+code+"added success");
        area.append(city+"-"+code+"added success");
     }else
     {
     JOptionPane.showMessageDialog(this,"you are adding duplicate city");
      }
   }else
   {
   JOptionPane.showMessageDialog(this,"please fill all information!!!");
   }
   
   txt1.setText("");
   txt2.setText("");
 }
 void removecity()
 { String city=txt1.getText();
   if(!city.isEmpty())
   {
       if(hs.containsKey(city))
       {
         hs.remove(city);
        JOptionPane.showMessageDialog(this,city+"removed successfully");
           area.append(city+"removed success");
       }else{
       JOptionPane.showMessageDialog(this,city+"does not exists");
       }
   }else
   {
   JOptionPane.showMessageDialog(this,"please fill all information!!!");
   }
   
   txt1.setText("");
        txt2.setText("");
 }
 
 void search()
 {  
 String city = txt1.getText();

        if (hs.containsKey(city)) {
            String code = hs.get(city);
            JOptionPane.showMessageDialog(this, city + " STD Code: " + code+" city found");
        } else {
            JOptionPane.showMessageDialog(this, "City not found!");
        }
        txt1.setText("");
        txt2.setText("");
 
 }
 

public static void main(String[] args)
{
 new Demo();
}

}
