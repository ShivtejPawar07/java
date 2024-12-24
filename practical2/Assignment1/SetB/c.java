import java.util.*; 
import java.io.*; 
class Demo  
{
  public static void main(String[] args)
  {  Scanner sc=new Scanner(System.in);
     File f=new File(args[0]);
    try(BufferedReader bf=new BufferedReader(new FileReader(f)))
    {
      Hashtable <String,String> hs=new Hashtable<>();
      String name;
      String mobile;
      String ch;
      
      while((ch=bf.readLine())!=null)
      {
         name=ch.substring(0,ch.indexOf(" "));
         mobile=ch.substring(ch.indexOf(" "),ch.length());
         
         hs.put(name,mobile);
         
      }
      bf.close();
      
      System.out.println(hs);
    
    }
    catch(Exception e)
    {
     System.out.println(e);
    }
  }

}
