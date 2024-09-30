import java.io.*;
import java.util.*;
class demo {
    static public void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        try{
        String dirname ="D:/java/practical/xyz";

        File f1 = new File(dirname); 
       
        if (f1.isDirectory()) 
        {
            int cnt=0;
            String[] s = f1.list();     
            for (int i = 0; i < s.length; i++) 
            {
                File f = new File(dirname + "/" + s[i]);       
                if (f.isDirectory())
                 {
                    System.out.println(s[i] + " is a directory"); 
                } 
                if (!f.isDirectory())
                {
                   System.out.println(s[i] + " is a file"); 
               } 
                System.out.println("enter 1 if you want delete file"+s[i]+"file");
                int n=sc.nextInt();

                if(n==1)
                {
                    if (s[i].endsWith(".txt")) 
                    {
                        f.delete();
                        cnt++;
                        System.out.println("File is deleted");
                    }
                }
            }
            System.out.println("Total number of .txt files deleted: " + cnt);
        } 
    }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
