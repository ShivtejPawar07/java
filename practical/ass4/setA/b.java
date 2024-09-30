/*b) Write a program to read a text file “sample.txt” and display the contents of a file in
reverse order and also original contents change the case (display in upper case) */
import java.io.*;
class demo {
    public static void main(String[] args) {
        try {
            
            FileInputStream fin = new FileInputStream(args[0]);
            int ch;
            String content="";
            while ((ch = fin.read()) != -1) {
                content += (char) ch;
            }

            fin.close();
            System.out.println("Original content:");
            System.out.println(content);

            
            System.out.println("Original content in UPPERCASE:");
            System.out.println(content.toUpperCase());

           
            System.out.println("Content in reverse order:");
            // for (int i = content.length() - 1; i >= 0; i--) {
            //     System.out.print(content.charAt(i));
            // }
            StringBuffer sb=new StringBuffer(content);
            System.out.println(sb.reverse());
          

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
