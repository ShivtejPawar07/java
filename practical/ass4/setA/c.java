import java.io.*;


class demo {
    public static void main(String[] args) {
     


        try {
            // Open the first file for reading
            FileInputStream fin = new FileInputStream(args[0]);
            // Open the second file for writing (or creating if it doesn't exist)
            FileOutputStream fout = new FileOutputStream(args[1]);

            int ch;

            // Read content from the first file and write it to the second file
            while ((ch = fin.read()) != -1) {
                fout.write(ch);
            }

            // Add the "end of file" comment to the second file
            String Comment = "\nend of file";
            fout.write(Comment.getBytes());

            // Close both file streams
            fin.close();
            fout.close();

           

        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
