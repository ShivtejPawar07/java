import javax.swing.JFrame;

import java.awt.ActiveEvent;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;


class MyFrame implements ActionListener
{   
   private  JButton btn_login=null; 
   private JButton btn_login1=null;
   private JTextField jd=null;
   private JTextField jd1=null;

   MyFrame()
   {
    JFrame myframe=new JFrame(); 
     myframe.setVisible(true);  
     myframe.setSize(500,500);
     myframe.setTitle("LoginFrame");
     myframe.setBackground(Color.BLUE);
     myframe.getContentPane().setBackground(Color.BLUE);
     myframe.setLocation(500,300);
     myframe.setLayout(null);
     
     JLabel lbl_user=new JLabel("User Name");
     lbl_user.setFont(new Font("bold",10,10));
     myframe.add(lbl_user);
     lbl_user.setBounds(100,100,80,80);

     jd=new JTextField();
    myframe.add(jd);
    jd.setBounds(100,150,80,20);
     

      btn_login=new JButton("submit");
     myframe.add(btn_login);
     btn_login.setBounds(100,180,80,50);

     btn_login1=new JButton("Cancle");
     myframe.add(btn_login1);
     btn_login1.setBounds(200,180,80,50);

     JLabel lbl=new JLabel("Password");
     myframe.add(lbl);
     lbl.setBounds(200,100,80,80);

      jd1=new JTextField();
     myframe.add(jd1);
     jd1.setBounds(200,150,80,20);


     btn_login.addActionListener(this);
     btn_login1.addActionListener(this);

    
     
   }
    public static void main(String[] args) 
    {
     
     MyFrame myframe=new MyFrame();
    }
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getActionCommand()=="Login")
        {
            String user=jd.getText();
            String password=jd1.getText();

            if(user.equalsIgnoreCase("shivtej")  &&  password.equals("12345"))
            {
                JOptionPane.showMessageDialog(null,"Login succesfull");
            }

        }
        else if(ae.getActionCommand()=="cancle")
        {
            JOptionPane.showMessageDialog(null,"Login failuer");
           }
}
}


