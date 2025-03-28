import java.sql.*;
import java.util.*;
class mobile{
  public static void main(String args[]){
  try{
    Scanner sc=new Scanner(System.in);
    Connection con=DriverManager.getConnection("jdbc:postgresql:assignment3","postgres","");
    
    int ch;
    do{
      System.out.println("1.Insert");
      System.out.println("2.delete");
      System.out.println("3.update");
      System.out.println("4.search");
       System.out.println("5.viewall");
      System.out.println("6.exit");
      System.out.println("enter your choice");
      ch=sc.nextInt();
      
      switch(ch){
       case 1:
       PreparedStatement ps=con.prepareStatement("insert into mobile(id,name,color) values(?,?,?);");
          
           int id=Integer.parseInt(args[0]);
          
           String name=args[1];
           String color=args[2];
           ps.setInt(1,id);
           ps.setString(2,name);
           ps.setString(3,color);
           ps.executeUpdate();
           System.out.println("insert successfully");
           break;
           
           case 2:
             System.out.println("enter id deleted");
              id=sc.nextInt();
             PreparedStatement ps2=con.prepareStatement("delete from mobile where id=?");
             ps2.setInt(1,id);
             ps2.executeUpdate();
               System.out.println("delete successfully");
           break;
           
                case 3: // UPDATE
                        System.out.print("Enter mobile ID to update: ");
                        int updateId = sc.nextInt();
                        sc.nextLine(); // Consume newline

                        System.out.print("Enter new name: ");
                        String newName = sc.nextLine();
                        System.out.print("Enter new color: ");
                        String newColor = sc.nextLine();

                        PreparedStatement psUpdate = con.prepareStatement("UPDATE mobile SET name = ?, color = ? WHERE id = ?");
                        psUpdate.setString(1, newName);
                        psUpdate.setString(2, newColor);
                        psUpdate.setInt(3, updateId);
                        int rowsUpdated = psUpdate.executeUpdate();
                        if (rowsUpdated > 0) {
                            System.out.println("Record updated successfully!");
                        } else {
                            System.out.println("No record found with ID: " + updateId);
                        }
                        break;

                    case 4: // SEARCH
                        System.out.print("Enter mobile ID to search: ");
                        int searchId = sc.nextInt();
                        PreparedStatement psSearch = con.prepareStatement("SELECT * FROM mobile WHERE id = ?");
                        psSearch.setInt(1, searchId);
                        ResultSet rs = psSearch.executeQuery();
                        if (rs.next()) {
                            System.out.println("\nMobile Details:");
                            System.out.println("ID: " + rs.getInt("id"));
                            System.out.println("Name: " + rs.getString("name"));
                            System.out.println("Color: " + rs.getString("color"));
                        } else {
                            System.out.println("No record found with ID: " + searchId);
                        }
                        break;
           case 5:
            PreparedStatement ps3=con.prepareStatement("select * from mobile");
            
             ResultSet rs1=ps3.executeQuery();
                System.out.println("id name color");
             while(rs1.next()){
            System.out.println( rs1.getInt(1)+
              rs1.getString(2)+
              rs1.getString(3));
             }
               System.out.println("vie allsuccessfully");
           break;
            
      }
    }while(ch!=6);
  }catch(Exception e){}
}
}
