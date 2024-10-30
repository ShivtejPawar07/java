//import java.io.*;
class demo
{
  
  public static void main(String[] args)
  {
    try{
        Class.forName("demo");
    }
    catch(ClassNotFoundException cnf)
    {
       cnf.printStackTrace();
    }
   
}

}

