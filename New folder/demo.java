import java.sql.*;

class demo
{
    public static void main(String[] arg)throws ClassNotFoundException,SQLException
    {
      
        Class.forName("com.mysql.jdbc.Driver");
        Connection con=null;
        con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydatabase","root","Shivtej@07");
        if(con!=null)
        System.out.println("connection success");
        else
        System.out.println("not");
       
      
    }
}