import java.io.*;
class demo
{
  
  public static void main(String[] args)
  {
    try{
        Class.forName("sample");
    }
    catch(ClassNotFoundException cnf)
    {
       cnf.printStackTrace();
    }
   
}

}

