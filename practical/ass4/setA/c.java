/*c) Accept the names of two files and copy the contents of the first to the second.
First file having Book name and Author name in file. Second file having the contents
of First file and also add the comment ‘end of file’ at the end. */
import java.io.*;
class demo {
    public static void main(String[] args) {
        try {       
            FileInputStream fin = new FileInputStream(args[0]);
            FileOutputStream fout = new FileOutputStream(args[1]);

            int ch;
            while ((ch = fin.read()) != -1) {
                fout.write(ch);
            }
            String Comment = "\nend of file";
            fout.write(Comment.getBytes());
            fin.close();
            fout.close();  

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
