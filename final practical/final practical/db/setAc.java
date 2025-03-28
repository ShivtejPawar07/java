import java.sql.*;
class Demo
{
public static void main(String[] args ){
 try{
Connection con=DriverManager.getConnection("jdbc:postgresql:assignment3","postgres","");

PreparedStatement pstmt=con.prepareStatement("select * from donor");
pstmt.executeQuery();

ResultSetMetaData rsdmd=pstmt.getMetaData();

System.out.println("total no of colums in the table"+rsdmd.getColumnCount());
System.out.println("column name"+rsdmd.getColumnName(1));
System.out.println("column type"+rsdmd.getColumnType(1));
System.out.println("table name"+rsdmd.getTableName(1));
System.out.println("schema nmae"+rsdmd.getSchemaName(1));

}catch(Exception e)
{
System.out.println(e.getMessage());
}

}
}
