import javax.swing.*;
import javax.swing.table.*;
import java.sql.*;
class Demo{
  JTable table;
  JFrame frame;
  DefaultTableModel model;


Demo(){
  frame=new JFrame("project table");
  frame.setSize(400,400);
   model=new DefaultTableModel();
  model=new DefaultTableModel();
  
  table=new JTable(model);
  
  model.addColumn("project id");
   model.addColumn("project name");
    model.addColumn("project des");
     model.addColumn("project staus");
     
     fetchdata();
     
     JScrollPane sp=new JScrollPane(table);
     frame.add(sp);
     frame.setVisible(true);    
}//demo method
void  fetchdata(){
try{
  Connection con=DriverManager.getConnection("jdbc:postgresql:assignment3","postgres","");
  PreparedStatement ps=con.prepareStatement("select * from project");
  ResultSet rs=ps.executeQuery();
  while(rs.next()){
  model.addRow(new Object[]{
    rs.getInt("pid"),
    rs.getString("pname"),
    rs.getString("pdes"),
    rs.getString("pstatus")
  });
  }//while
}//try 
catch(Exception e){
 }
}
public static void main(String args[]){
  new Demo();
}
}

