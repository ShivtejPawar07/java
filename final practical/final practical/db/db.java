import java.sql.*;
import java.util.*;
class mobile{
  public static void main(String args[]){
  try{
   
    Connection con=DriverManager.getConnection("jdbc:postgresql:assignment3","postgres","");
    
   
       PreparedStatement ps=con.prepareStatement("create table stud(id int,name varchar(10))");
       ps.executeQuery();
       System.out.println("ss");
       }catch(Exception e){}
       }
       }
